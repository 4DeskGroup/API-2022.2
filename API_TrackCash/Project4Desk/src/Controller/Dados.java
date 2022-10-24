package Controller;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.DTO.CanalDTO;
import model.bean.Usuario;
import model.dao.CanalDAO;

public class Dados {
    
    public static void AlterarDadosCanal(String empresa, String conta_id, String login, String senha, String token){

        CanalDTO objcanalinfo = new CanalDTO();

        int i = new CanalDAO().searchIdCanal(empresa);

        objcanalinfo.setContaid(conta_id);
        objcanalinfo.setLogin(login);
        objcanalinfo.setSenha(senha);
        objcanalinfo.setToken(token);

        CanalDAO objcanaldao = new CanalDAO();
        objcanaldao.alterarDados(objcanalinfo, i);
        
    }
    
    public static void listarDados(JTable modelTable, Usuario user) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) modelTable.getModel();
        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;

            stmt = con.prepareStatement("SELECT tbl_Config.Empresa_Config, tbl_Canal.Contaid_Canal, tbl_Canal.Login_Canal, tbl_Canal.Senha_Canal, tbl_Canal.Token_Canal FROM tbl_Canal JOIN tbl_Config WHERE Usuario_pertencente = " + '"' + user.getId() + '"' + " AND  id_Config = Config_pertencente");
            rs = stmt.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                });
            }
            ConnectionFactory.closeConnection(con, stmt, rs);

        } catch (SQLException ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
