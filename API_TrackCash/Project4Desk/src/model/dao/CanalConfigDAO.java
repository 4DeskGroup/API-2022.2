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
import model.bean.Usuario;

public class CanalConfigDAO {
    
    private Connection conn;
    
    public void cadastro(Canal c, Usuario u) {
        
        conn = ConnectionFactory.getConnection();
        System.out.println(conn);
        PreparedStatement stmt = null;
         
        try {
            stmt = conn.prepareStatement("INSERT INTO tbl_Config VALUE(DEFAULT, " + '"' + c.getEmpresa() + '"' + ", " + '"' + c.getPlataforma()+ '"' + ", " + '"' + c.getAutenticacao()+ '"' + ", " + u.getId() + ")");
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastro de Configuração Canal feito com sucesso!"); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Canal já Cadastrado!");
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
    
    public void delete(String i){

        conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            stmt = conn.prepareStatement("DELETE FROM tbl_Config WHERE id_Config = ?");
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
            
            String sql = "SELECT * FROM tbl_Config WHERE Empresa_Config = " + '"' + empresa + '"';
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
    
    public int buscarConfigReturnId(String empresa){
        
        conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            
            String sql = "SELECT * FROM tbl_Config WHERE Empresa_Config = " + '"' + empresa + '"';
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                return id;
            }
            
        }catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null, "Erro ao buscar canal: " + erro);
            
        }finally{
            
            ConnectionFactory.closeConnection(conn, stmt);
            
        }
        return -1;
    }
     public String buscarConfigReturnEmpresa(int pk){
        
        conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            
            String sql = "SELECT Empresa_Config FROM tbl_Config WHERE id_Config = " + '"' + pk + '"';
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String empresa = rs.getString(1);
                return empresa;
            }
            
        }catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null, "Erro ao buscar canal: " + erro);
            
        }finally{
            
            ConnectionFactory.closeConnection(conn, stmt);
            
        }
        return null;
    }
    
    public String buscarConfigForFK(int fk_Config){
        
        conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            
            String sql = "SELECT * FROM tbl_Config WHERE id_Config = " + '"' + fk_Config + '"';
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            String busca = rs.getString("Empresa_Config");
            return busca;
            
        }catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null, "Erro ao buscar canal: " + erro);
            
        }finally{
            
            ConnectionFactory.closeConnection(conn, stmt);
            
        }
        return null;
    }
    
    public Canal buscarCanal(String empresa){
        
        conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            
            String sql = "SELECT * FROM tbl_Config WHERE Empresa_Config = " + '"' + empresa + '"';
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
