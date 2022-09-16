package model.dao;


import connection.ConnectionFactory;
import model.bean.Cliente;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.lang.String;

public class ClienteDAO extends ConnectionFactory{
    private Connection conection;
    
    public ClienteDAO(){
        conection = ConnectionFactory.getConnection();
    }
    
    public void addCliente(Cliente cliente){
        /*
            Aqui ele esta inserindo os valores na tabela Usuarios do banco de dados!
        */
        String sql = "INSERT INTO usuarios VALUES(?, ?, ?, ?, ?)";
        
        try{
            
            PreparedStatement stmt = conection.prepareStatement(sql);
            stmt.setString(1, cliente.getUser());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getPass());
            stmt.setBoolean(4, cliente.getActive());
            stmt.setInt(5, 2);
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

        }
        
    }
    public Cliente loginCliente(String pk, String p){                           // 'pk' é Primary Key
        
        String sql = "SELECT * FROM usuarios WHERE usuario = ? and senha = ?";
        try{
            
            PreparedStatement stmt = this.conection.prepareStatement(sql);
            stmt.setString(1, pk);
            stmt.setString(2, p);
            ResultSet rs =  stmt.executeQuery();
            JOptionPane.showMessageDialog(null, rs);
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
            }else{
                ResultSetMetaData rsMD = rs.getMetaData();
                int columns = rsMD.getColumnCount();
                String user = rs.getString("usuario");
                String email;
                String pass;
                boolean act;
                int tpAc;

                Cliente verificado = new Cliente();
                return verificado;
            }
            
            stmt.close();
        }catch(SQLException ex){
            
            throw new RuntimeException(ex);
            
        }
        return null;
    }
}
