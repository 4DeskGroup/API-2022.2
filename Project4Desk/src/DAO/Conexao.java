package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/FourDesk", "root", "");
        }catch(SQLException excecao){
            throw new RuntimeException(excecao);
        }
    }
}
