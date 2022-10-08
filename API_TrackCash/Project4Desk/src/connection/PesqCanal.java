package connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.Vector;
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class PesqCanal extends ConnectionFactory{
    
    private static Usuario user;
    
    public PesqCanal(Usuario user) throws Exception{
        this.user = user;
    }
    
    public Vector Pesquisar() throws Exception{
        Vector tb = new Vector ();
        String url = "SELECT * FROM tbl_Canal JOIN tbl_Config WHERE "
                    + "tbl_Canal.Usuario_pertencente = " + '"' + user.getId()+ '"' + " AND  id_Config = Config_pertencente";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getString("tbl_Config.Empresa_Config"));
            nl.add(rs.getString("tbl_Canal.Login_Canal"));
            nl.add(rs.getString("tbl_Canal.Senha_Canal"));
            nl.add(rs.getString("tbl_Canal.Token_Canal"));
            nl.add(rs.getInt("tbl_Canal.id_Canal"));
            tb.add(nl);
        }
        return tb;
    }
    
    public Vector Pesquisar(String pesq) throws Exception{
        Vector tb = new Vector ();
        String url = "SELECT * FROM tbl_Canal JOIN tbl_Config WHERE tbl_Canal.id_Canal like '%" + pesq + "%' and tbl_Canal.Usuario_pertencente = " + '"' + this.user.getId() + '"' + " AND  id_Config = Config_pertencente";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getString("tbl_Config.Empresa_Config"));
            nl.add(rs.getString("tbl_Canal.Login_Canal"));
            nl.add(rs.getString("tbl_Canal.Senha_Canal"));
            nl.add(rs.getString("tbl_Canal.Token_Canal"));
            nl.add(rs.getInt("tbl_Canal.id_Canal"));
            tb.add(nl);
        }
        return tb;
    }
    public Vector Pesquisar(String campo, String ordem) throws Exception{
        Vector tb = new Vector ();
        String url = "SELECT * FROM tbl_Canal JOIN tbl_Config WHERE tbl_Canal.Usuario_pertencente = " + '"' + this.user.getId() + '"' + " AND  id_Config = Config_pertencente ORDER BY " + campo + " " + ordem;
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getString("tbl_Config.Empresa_Config"));
            nl.add(rs.getString("tbl_Canal.Login_Canal"));
            nl.add(rs.getString("tbl_Canal.Senha_Canal"));
            nl.add(rs.getString("tbl_Canal.Token_Canal"));
            nl.add(rs.getInt("tbl_Canal.id_Canal"));
            tb.add(nl);
        }
        return tb;
    }

    public Vector Pesquisar(String pesq, String campo, String ordem) throws Exception{
        
        String campoString = campo.toLowerCase();
        String campoString2 = campoString;
        
        Vector tb = new Vector ();
        String sql = "SELECT * FROM tbl_Canal JOIN tbl_Config WHERE "+ campoString +" LIKE '%" + pesq + "%' AND Usuario_pertencente = " + '"' + this.user.getId() + '"' + " AND  id_Config = Config_pertencente ORDER BY "+ campoString2 + " " + ordem;
        PreparedStatement stmt = getConnection().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getString("tbl_Config.Empresa_Config"));
            nl.add(rs.getString("tbl_Canal.Login_Canal"));
            nl.add(rs.getString("tbl_Canal.Senha_Canal"));
            nl.add(rs.getString("tbl_Canal.Token_Canal"));
            nl.add(rs.getInt("tbl_Canal.id_Canal"));
            tb.add(nl);
        }
        return tb;
    }
}
