package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Canal;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.DTO.CanalDTO;
import model.bean.Usuario;




public class CanalDAO {
    private Connection conn;
    
    public void addCanal(CanalDTO p, Usuario u){
        
        conn = ConnectionFactory.getConnection();
        PreparedStatement stmtSelect = null;
        PreparedStatement stmtInsert = null;
        
        try {

            stmtInsert = conn.prepareStatement("INSERT INTO canal VALUES(DEFAULT, ?, ?, ?, ?, ?, ?, ?)");
            stmtInsert.setString(1, u.getUser());
            stmtInsert.setString(2, p.getEmpresa());
            stmtInsert.setString(3, p.getPlataforma());
            stmtInsert.setString(4, p.getUsuario());
            stmtInsert.setString(5, p.getSenha());
            stmtInsert.setString(6, p.getToken());
            stmtInsert.setString(7, p.getAutentificacao());
            
            if(p.getAutentificacao().equals("login")){
                
                stmtInsert.execute();
                JOptionPane.showMessageDialog(null, "Login salvo com sucesso!");
                
            }else{
                
                stmtInsert.execute();
                JOptionPane.showMessageDialog(null, "Token salvo com sucesso!");
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: "+ex);
        }
        
    }
    
    public ResultSet searchCanalForUser(Canal c){
        // group by " + '"' + usuario + '"'
        conn = ConnectionFactory.getConnection();
        try{
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("SELECT * FROM canal where usuario = " + '"' + c.getUsuario() + '"');
            ResultSet rs = stmt.executeQuery();
            return rs;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "ERRO: " + erro);
        }
        return null;
    }
    
    //Tabela
    public List<Canal> reads(){
        
        conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Canal> canais = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM canal");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Canal canal = new Canal();
                
                canal.setIdCanal(rs.getInt("idConfig"));
                canal.setEmpresa(rs.getString("empresa"));
                canal.setPlataforma(rs.getString("plataforma"));
                canal.setToken(rs.getString("autentificacao"));
                canais.add(canal);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CanalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
        
        return canais;
        
    }
    
    public ResultSet listarPlataforma(){
        conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM `canalConfig` ORDER BY `plataforma`";
        
            try {
                
                PreparedStatement pstm = conn.prepareStatement(sql);
                return pstm.executeQuery();
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());
                return null;
            }
    }
    
    public ResultSet listarAutentificacao(String empresa){
        conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM `canalConfig` ORDER BY autentificacao";
        
            try {
                
                PreparedStatement pstm = conn.prepareStatement(sql);
                return pstm.executeQuery();
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());
                return null;
            }
    }
    
    public ResultSet listarEmpresa(){
        conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM `canalConfig`";
        
            try {
                
                PreparedStatement pstm = conn.prepareStatement(sql);
                return pstm.executeQuery(sql);
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());
                return null;
            }
    }
    
    public ResultSet listarId(){
        List<Canal> canais2 = new ArrayList<>();
        conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.prepareStatement("select idCanal from `canal`;");
            rs = stmt.executeQuery();

            while(rs.next()){
                Canal canal = new Canal();
                canal.setIdCanal(rs.getInt(1));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());
            return null;
        }
        
        return (ResultSet) canais2;
    
    }
    
    public void delete(String i){
            
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{

            stmt = con.prepareStatement("DELETE FROM `canal` WHERE idCanal = ?;");
            stmt.setString(1, i);

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Canal excluído com sucesso!");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir canal: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
        
}

    
    
    

