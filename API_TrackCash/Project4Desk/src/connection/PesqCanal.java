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

public class PesqCanal extends ConnectionFactory{
    
    public PesqCanal() throws Exception{
        
    }
    
    public Vector Pesquisar(String pesq) throws Exception{
        Vector tb = new Vector ();
        String url = "select * from canais where contaid like '" + pesq + "%'";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("idCanais"));
            nl.add(rs.getString("empresa"));
            nl.add(rs.getString("contaid"));
            nl.add(rs.getString("plataforma"));
            nl.add(rs.getString("usuario"));
            nl.add(rs.getString("senha"));
            nl.add(rs.getString("token"));
            tb.add(nl);
        }
        return tb;
    }
    
    public Vector Pesquisar(String pesq, String filtro) throws Exception{
        
        String filtroString = filtro.toLowerCase();
        
        Vector tb = new Vector ();
        String url = "select * from canais where "+ filtroString +" like '" + pesq + "%'";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("idCanais"));
            nl.add(rs.getString("empresa"));
            nl.add(rs.getString("contaid"));
            nl.add(rs.getString("plataforma"));
            nl.add(rs.getString("usuario"));
            nl.add(rs.getString("senha"));
            nl.add(rs.getString("token"));
            tb.add(nl);
        }
        return tb;
    }
}
