package connection;

import static connection.ConnectionFactory.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class PesquCanalADM {
    
    public Vector PesquisarADM() throws Exception{
        Vector tb = new Vector ();
        String url = "select * from canalConfig";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("idConfig"));
            nl.add(rs.getString("empresa"));
            nl.add(rs.getString("plataforma"));
            nl.add(rs.getString("autentificacao"));
            tb.add(nl);
        }
        return tb;
    }
    
    public Vector PesquisarADM(String campo, String ordem) throws Exception{
        Vector tb = new Vector ();
        String url = "select * from canalConfig order by " + campo + " " + ordem;
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("idConfig"));
            nl.add(rs.getString("empresa"));
            nl.add(rs.getString("plataforma"));
            nl.add(rs.getString("autentificacao"));
            tb.add(nl);
        }
        return tb;
    }
    
    public Vector PesquisarADM(String pesq) throws Exception{
        Vector tb = new Vector ();
        String url = "select * from canalConfig where idConfig like '%" + pesq + "%'";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("idConfig"));
            nl.add(rs.getString("empresa"));
            nl.add(rs.getString("plataforma"));
            nl.add(rs.getString("autentificacao"));
            tb.add(nl);
        }
        return tb;
    }
    
    public Vector PesquisarADM(String pesqadm, String campo, String ordem) throws Exception{
            
        String campoString = campo.toLowerCase();
        String campoString2 = campoString;
            
        Vector tb = new Vector ();
        String url = "select * from canalConfig where " + campoString + " like '%" + pesqadm + "%' order by " + campoString2 + " " + ordem;
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("idConfig"));
            nl.add(rs.getString("empresa"));
            nl.add(rs.getString("plataforma"));
            nl.add(rs.getString("autentificacao"));
            tb.add(nl);
        }
        return tb;
    }
    
}
