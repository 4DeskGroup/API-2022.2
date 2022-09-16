package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.CanalInfo;
import java.sql.ResultSet;
import java.util.ArrayList;




public class CanalDAO {
    
    public void create(CanalInfo p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO canais (contaid, empresa, plataforma, usuario, senha, token)VALUES(?,?,?,?,?,?)");
            stmt.setString(1,p.getContaid());
            stmt.setString(2,p.getEmpresa());
            stmt.setString(3,p.getPlataforma());
            stmt.setString(4,p.getUsuario());
            stmt.setString(5,p.getSenha());
            stmt.setString(6,p.getToken());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
        
    }
    //Tabela
    public List<CanalInfo> reads(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<CanalInfo> canais = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM canais");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                CanalInfo canal = new CanalInfo();
                
                canal.setId(rs.getInt("idCanais"));
                canal.setContaid(rs.getString("contaid"));
                canal.setEmpresa(rs.getString("emrpresa"));
                canal.setPlataforma(rs.getString("plataforma"));
                canal.setUsuario(rs.getString("usuario"));
                canal.setSenha(rs.getString("senha"));
                canal.setToken(rs.getString("token"));
                canais.add(canal);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CanalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return canais;
        
        
        
        
    }
    Connection conn;
    public ResultSet listarEmpresa(){
        conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM cadastro_canal ORDER BY can_empresa;";
        
            try {
                
                PreparedStatement pstm = conn.prepareStatement(sql);
                return pstm.executeQuery();
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());
                return null;
            }
}
    
    
    
    
    public ResultSet listarEmpresa2(){
        conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM cadastro_canal ORDER BY can_plataforma;";
        
            try {
                
                PreparedStatement pstm = conn.prepareStatement(sql);
                return pstm.executeQuery();
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());
                return null;
            }
}
    
        public ResultSet listarEmpresa3(){
        conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM cadastro_canal ORDER BY can_autentificacao;";
        
            try {
                
                PreparedStatement pstm = conn.prepareStatement(sql);
                return pstm.executeQuery();
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());
                return null;
            }
}
    
}

    
    
    

