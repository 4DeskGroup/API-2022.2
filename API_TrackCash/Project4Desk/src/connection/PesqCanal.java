<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes
package connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.Vector;
<<<<<<< Updated upstream
import javax.swing.JOptionPane;
import model.bean.Usuario;
=======
<<<<<<< Updated upstream
>>>>>>> Stashed changes

public class PesqCanal extends ConnectionFactory{
    
    private static Usuario user;
    
    public PesqCanal(Usuario user) throws Exception{
        this.user = user;
    }
    
    public Vector Pesquisar() throws Exception{
        Vector tb = new Vector ();
<<<<<<< Updated upstream
        String url = "SELECT * FROM tbl_Canal JOIN tbl_Config WHERE "
                    + "tbl_Canal.Usuario_pertencente = " + '"' + user.getId()+ '"' + " AND  id_Config = Config_pertencente";
=======
        String url = "select * from canais where contaid like '" + pesq + "%'";
=======
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
>>>>>>> Stashed changes
>>>>>>> Stashed changes
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream
            nl.add(rs.getInt("idCanais"));
            nl.add(rs.getString("empresa"));
            nl.add(rs.getString("contaid"));
            nl.add(rs.getString("plataforma"));
            nl.add(rs.getString("usuario"));
            nl.add(rs.getString("senha"));
            nl.add(rs.getString("token"));
=======
>>>>>>> Stashed changes
            nl.add(rs.getString("tbl_Config.Empresa_Config"));
            nl.add(rs.getString("tbl_Canal.Login_Canal"));
            nl.add(rs.getString("tbl_Canal.Senha_Canal"));
            nl.add(rs.getString("tbl_Canal.Token_Canal"));
            nl.add(rs.getInt("tbl_Canal.id_Canal"));
<<<<<<< Updated upstream
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes
            tb.add(nl);
        }
        return tb;
    }
    
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream
=======
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes
}
