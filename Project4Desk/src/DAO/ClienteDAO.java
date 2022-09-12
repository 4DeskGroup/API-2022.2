package DAO;

import Model.Cliente;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ClienteDAO {
    private Connection conection;
    
    public ClienteDAO(){
        this.conection = new Conexao().getConnection();
    }
    
    public void addCliente(Cliente cliente){
        
        String sql = "INSERT INTO usuarios VALUES(DEFAULT, ?, ?, ?, TRUE, 2)";
        
        try{
            
            PreparedStatement stmt = conection.prepareStatement(sql);
            stmt.setString(1, cliente.getUser());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(1, cliente.getPass());
            stmt.executeQuery();
            stmt.close();
            
        }catch(SQLException ex){
            
            throw new RuntimeException(ex);
            
        }
        
    }
    public Cliente searchCliente(String pk){                    // 'pk' é Primary Key
        
        String sql = "SELECT * FROM usuarios WHERE usuario = ?";
        try{
            
            PreparedStatement stmt = conection.prepareStatement(sql);
            stmt.setString(1, pk);
            ResultSet rs =  stmt.executeQuery();
            JOptionPane.showMessageDialog(null, rs);
            stmt.close();
            
        }catch(SQLException ex){
            
            throw new RuntimeException(ex);
            
        }
        return null;
    }
}
