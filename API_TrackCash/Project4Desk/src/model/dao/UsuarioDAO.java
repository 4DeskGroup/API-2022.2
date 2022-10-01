package model.dao;


import connection.ConnectionFactory;
import model.bean.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.lang.String;
import model.DTO.UsuarioDTO;

public class UsuarioDAO extends ConnectionFactory{
    private Connection conection;
    
    public UsuarioDAO(){
        conection = ConnectionFactory.getConnection();
    }
    
    public void addCliente(Usuario cliente){
        /*
            Aqui ele esta inserindo os valores na tabela Usuarios do banco de dados!
        */
        String sql = "INSERT INTO usuario VALUES(DEFAULT, ?, ?, ?, ?, ?, ?)";
        
        try{
            
            PreparedStatement stmt = conection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getUser());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getPass());
            stmt.setBoolean(5, cliente.getActive());
            stmt.setInt(6, 2);
            stmt.execute();
            stmt.close();

        }catch(SQLException ex){
            
            throw new RuntimeException(ex);
            
        }finally{
            connection.ConnectionFactory.closeConnection(conection);
        }
        
    }
    public ResultSet loginCliente(UsuarioDTO clientedto){                           // 'pk' é Primary Key
        
        String sql = "select * from usuario where usuario = binary " + '"' + clientedto.getUser() + '"' + 
                " and senha = binary " + '"' + clientedto.getPass() + '"';

        try{
            PreparedStatement stmt = this.conection.prepareStatement(sql);
            ResultSet rs =  stmt.executeQuery(sql);
            return rs;
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }finally{
            
        }
    }
    
    public boolean existCliente(String pk, String p){
        String sql = "SELECT * FROM usuario WHERE usuario = ?";
        try{
            
            PreparedStatement stmt = this.conection.prepareStatement(sql);
            stmt.setString(1, pk);
            ResultSet rs =  stmt.executeQuery();
            JOptionPane.showMessageDialog(null, rs);
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
            }else{
                return true;
            }
            
            stmt.close();
        }catch(SQLException ex){
            
            throw new RuntimeException(ex);
            
        }finally{
            connection.ConnectionFactory.closeConnection(conection);
        }
        return false;
    }
    
    public int searchClienteID(String user){
        String sql = "SELECT * FROM usuario WHERE usuario = ?";
        try{
            
            PreparedStatement stmt = this.conection.prepareStatement(sql);
            stmt.setString(1, user);
            ResultSet rs =  stmt.executeQuery();
            JOptionPane.showMessageDialog(null, rs);
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null, "ID de usuario não encontrado!");
            }else{
                return rs.getInt("id");
            }
            
            stmt.close();
        }catch(SQLException ex){
            
            throw new RuntimeException(ex);
            
        }finally{
            connection.ConnectionFactory.closeConnection(conection);
        }
        return -1;
    }
    
}
