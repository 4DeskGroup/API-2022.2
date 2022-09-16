/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.CadastroCanal;

/**
 *
 * @author Rodrigo
 */
public class CadastroCanalDAO {
    
        public void cradastro(CadastroCanal c) {
        
        Connection con = ConnectionFactory.getConnection();
        System.out.println(con);
        PreparedStatement stmt = null;
        
         
        try {
            stmt = con.prepareStatement("INSERT INTO cadastro_canal (can_empresa, can_plataforma, can_autentificacao) VALUE(?,?,?)");
            stmt.setString(1,c.getCan_empresa());
            stmt.setString(2,c.getCan_plataforma());
            stmt.setString(3,c.getCan_autentificacao());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadstro de canal feito com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o canal!"+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
}
