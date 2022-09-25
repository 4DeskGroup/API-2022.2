package model.dao;


import connection.ConnectionFactory;
import model.bean.Cliente;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.lang.String;
import model.bean.ClienteDTO;

public class ClienteDAO extends ConnectionFactory{
    private Connection conection;
    
    public ClienteDAO(){
        conection = ConnectionFactory.getConnection();
    }
    
    public void addCliente(Cliente cliente){
        /*
            Aqui ele esta inserindo os valores na tabela Usuarios do banco de dados!
        */
        String sql = "INSERT INTO usuarios VALUES(?, ?, ?, ?, ?, ?)";
        
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
            
        }
        /*
                Aqui ele esta inserindo os valores na tabela id_user do banco de dados!
        */
        sql = "INSERT INTO id_user VALUES(DEFAULT, ?)";
        try{
            PreparedStatement stmt = conection.prepareStatement(sql);
            stmt = conection.prepareStatement(sql);
            stmt.setString(1, cliente.getUser());
            stmt.execute();
            stmt.close();

        }catch(SQLException ex){

            throw new RuntimeException(ex);

        }finally{
            connection.ConnectionFactory.closeConnection(conection);
        }
        
    }
    public ResultSet loginCliente(ClienteDTO clientedto){                           // 'pk' é Primary Key
        
        String sql = "select * from usuarios where usuario = binary " + '"' + clientedto.getUser() + '"' + 
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
    
    public boolean searchCliente(String pk, String p){
        String sql = "SELECT * FROM usuarios WHERE usuario = ?";
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
        String sql = "SELECT * FROM id_user WHERE usuario = ?";
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
