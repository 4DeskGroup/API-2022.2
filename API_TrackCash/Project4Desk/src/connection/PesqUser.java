package connection;

import static connection.ConnectionFactory.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class PesqUser {

    private static Usuario user;

    public PesqUser(Usuario user) {
        this.user = user;
    }

    
    //Mudar os nomes 
    
    public Vector PesquisarUser() throws Exception {
        Vector tb = new Vector();
        String url = "SELECT * FROM tbl_usuario";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Vector nl = new Vector();
            nl.add(rs.getString(2));
            nl.add(rs.getString(3));
            nl.add(rs.getString(4));
            nl.add(rs.getString(5));
            nl.add(rs.getString(6));
            nl.add(rs.getBoolean(7));
            nl.add(rs.getInt(8));
            tb.add(nl);
        }
        return tb;
    }

    public Vector PesquisarUser(String pesq) throws Exception {
        Vector tb = new Vector();
        String url = "SELECT * FROM tbl_usuario WHERE Usuario LIKE '%" + pesq + "%'";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Vector nl = new Vector();
            nl.add(rs.getString(2));
            nl.add(rs.getString(3));
            nl.add(rs.getString(4));
            nl.add(rs.getString(5));
            nl.add(rs.getString(6));
            nl.add(rs.getBoolean(7));
            nl.add(rs.getInt(8));
            tb.add(nl);
        }
        return tb;
    }

    public Vector PesquisarUser(String campo, String ordem) throws Exception {
        Vector tb = new Vector();
        String url = "SELECT * FROM tbl_usuario ORDER BY " + campo + " " + ordem;
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Vector nl = new Vector();
            nl.add(rs.getString(2));
            nl.add(rs.getString(3));
            nl.add(rs.getString(4));
            nl.add(rs.getString(5));
            nl.add(rs.getString(6));
            nl.add(rs.getBoolean(7));
            nl.add(rs.getInt(8));
            tb.add(nl);
        }
        return tb;
    }

    public Vector PesquisarUser(String pesq, String campo, String ordem) throws Exception {

        String campoString = campo;

        Vector tb = new Vector();
        String sql = "SELECT * FROM tbl_usuario WHERE " + campo + " LIKE '%" + pesq + "%' ORDER BY " + campoString + " " + ordem;
        PreparedStatement stmt = getConnection().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Vector nl = new Vector();
            nl.add(rs.getString(2));
            nl.add(rs.getString(3));
            nl.add(rs.getString(4));
            nl.add(rs.getString(5));
            nl.add(rs.getString(6));
            nl.add(rs.getBoolean(7));
            nl.add(rs.getInt(8));
            tb.add(nl);
        }
        return tb;
    }

}
