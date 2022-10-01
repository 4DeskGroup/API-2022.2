package model.dao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Canal;

public class CanalConfigDAO {
    
    private Connection conn;
    
    public void cadastro(Canal c) {
        
        conn = ConnectionFactory.getConnection();
        System.out.println(conn);
        PreparedStatement stmt = null;
        
         
        try {
            stmt = conn.prepareStatement("INSERT INTO `canalConfig` VALUE(DEFAULT, ?,?,?) limit 1");
            stmt.setString(1,c.getEmpresa());
            stmt.setString(2,c.getPlataforma());
            if(c.getAutentificacao().equals("Token")){
                stmt.setString(3, c.getAutentificacao());
            }else{
                stmt.setString(3, "Login");
            }
            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastro de canal feito com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o canal: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
    
    public void delete(String i){

        conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            stmt = conn.prepareStatement("DELETE FROM `canalConfig` WHERE idConfig = ? limit 1");
            stmt.setString(1, i);

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Canal excluído com sucesso!");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao deletar canal: " + ex);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public Canal buscarConfig(String empresa){
        
        conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            
            String sql = "select * from canalConfig where empresa = " + '"' + empresa + '"' + " limit 1";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Canal busca = new Canal(rs);
            
            return busca;
            
        }catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null, "Erro ao buscar canal: " + erro);
            
        }finally{
            
            ConnectionFactory.closeConnection(conn, stmt);
            
        }
        return null;
    }
}
