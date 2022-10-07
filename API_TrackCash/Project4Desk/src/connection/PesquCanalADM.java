package connection;

import static connection.ConnectionFactory.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class PesquCanalADM {
    
    public Vector PesquisarADM() throws Exception{
        Vector tb = new Vector ();
        String url = "SELECT * FROM tbl_Config";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("id_Config"));
            nl.add(rs.getString("Empresa_Config"));
            nl.add(rs.getString("Plataforma_Config"));
            nl.add(rs.getString("Autenticacao_Config"));
            tb.add(nl);
        }
        return tb;
    }
    
    public Vector PesquisarADM(String campo, String ordem) throws Exception{
        Vector tb = new Vector ();
        String url = "SELECT * FROM tbl_Config ORDER BY " + campo + " " + ordem;
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("id_Config"));
            nl.add(rs.getString("Empresa_Config"));
            nl.add(rs.getString("Plataforma_Config"));
            nl.add(rs.getString("Autenticacao_Config"));
            tb.add(nl);
        }
        return tb;
    }
    
    public Vector PesquisarADM(String pesq) throws Exception{
        Vector tb = new Vector ();
        String url = "SELECT * FROM tbl_Config WHERE id_Config like '%" + pesq + "%'";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("id_Config"));
            nl.add(rs.getString("Empresa_Config"));
            nl.add(rs.getString("Plataforma_Config"));
            nl.add(rs.getString("Autenticacao_Config"));
            tb.add(nl);
        }
        return tb;
    }
    
    public Vector PesquisarADM(String pesqadm, String campo, String ordem) throws Exception{
            
        String campoString = campo.toLowerCase();
        String campoString2 = campoString;
            
        Vector tb = new Vector ();
        String url = "sSELECT * FROM tbl_Config where " + campoString + " like '%" + pesqadm + "%' ORDER BY " + campoString2 + " " + ordem;
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("id_Config"));
            nl.add(rs.getString("Empresa_Config"));
            nl.add(rs.getString("Plataforma_Config"));
            nl.add(rs.getString("Autenticacao_Config"));
            tb.add(nl);
        }
        return tb;
    }
    
}
