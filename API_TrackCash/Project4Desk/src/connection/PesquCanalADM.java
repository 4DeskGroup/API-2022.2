/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import static connection.ConnectionFactory.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Rodrigo
 */
public class PesquCanalADM {
    
    public PesquCanalADM() throws Exception{
        
    }
    
    public Vector PesquisarADM(String pesqADM) throws Exception{
        Vector tb = new Vector ();
        String url = "select * from cadastro_canal where can_id OR can_empresa like '" + pesqADM + "%'";
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
