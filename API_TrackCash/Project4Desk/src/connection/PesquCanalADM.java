package connection;

import static connection.ConnectionFactory.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class PesquCanalADM {
    
    public PesquCanalADM() throws Exception{
        
    }
    
    public Vector PesquisarADM(String pesqadm, String filtro) throws Exception{
            
        String filtroString = "can_" + filtro.toLowerCase();
            
        Vector tb = new Vector ();
        String url = "select * from cadastro_canal where " + filtroString + " like '" + pesqadm + "%'";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("can_id"));
            nl.add(rs.getString("can_empresa"));
            nl.add(rs.getString("can_plataforma"));
            nl.add(rs.getString("can_autentificacao"));
            tb.add(nl);
        }
        return tb;
    }
}
