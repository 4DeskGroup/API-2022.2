package Controller;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.DTO.CanalDTO;
import model.DTO.UsuarioDTO;
import model.bean.Canal;
import model.bean.Usuario;
import model.dao.CanalConfigDAO;
import model.dao.CanalDAO;
import model.dao.UsuarioDAO;

public class Dados {

    private Connection conn;

    public static void addCanal(CanalDTO p, Connection conn) {

        PreparedStatement stmtInsert = null;

        try {
            PreparedStatement stmtSelectVerificar = null;
            stmtSelectVerificar = conn.prepareStatement("SELECT count(*) FROM tbl_Config JOIN tbl_Canal ON tbl_Config.id_Config = tbl_Canal.Config_pertencente"
                    + " WHERE Usuario_pertencente = " + '"' + p.getFkUsuario() + '"' + " AND Config_pertencente = " + p.getFkConfig());

            ResultSet rsVerificar = stmtSelectVerificar.executeQuery();
            while (rsVerificar.next()) {
                int qtdeRs = rsVerificar.getInt("count(*)");
                if (qtdeRs == 0) {
                    if (p.getAutenticacao().equals("Token")) {
                        stmtInsert = conn.prepareStatement("INSERT INTO tbl_Canal VALUES(DEFAULT, ?, " + '"' + p.getToken() + '"' + ", "
                                + '"' + p.getLogin() + '"' + ", " + '"' + p.getSenha() + '"' + ", ?, ? )");
                        stmtInsert.setString(1, p.getContaid());
                        stmtInsert.setInt(2, p.getFkUsuario());
                        stmtInsert.setInt(3, p.getFkConfig());
                        stmtInsert.execute();

                        JOptionPane.showMessageDialog(null, "Token salvo com sucesso!");
                    } else {
                        stmtInsert = conn.prepareStatement("INSERT INTO tbl_Canal VALUES(DEFAULT, ?, " + '"' + p.getToken() + '"' + ", "
                                + '"' + p.getLogin() + '"' + ", " + '"' + p.getSenha() + '"' + ", ?, ? )");
                        stmtInsert.setString(1, p.getContaid());
                        stmtInsert.setInt(2, p.getFkUsuario());
                        stmtInsert.setInt(3, p.getFkConfig());
                        stmtInsert.execute();

                        JOptionPane.showMessageDialog(null, "Login salvo com sucesso!");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao cadastrar Canal!"
                            + "\nCanal já esta cadastrado em sua conta!"
                            + "\nEvite duplicar dados!");
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn);
        }

    }

    public static void addConta(Usuario cadastro) {
        UsuarioDAO dao = new UsuarioDAO();
        dao.addCliente(cadastro);
    }

    public static void alterarDadosCanal(String empresa, String conta_id, String login, String senha, String token) {

        CanalDTO objcanalinfo = new CanalDTO();

        int id = new CanalDAO().searchIdCanal(empresa);

        objcanalinfo.setContaid(conta_id);
        objcanalinfo.setLogin(login);
        objcanalinfo.setSenha(senha);
        objcanalinfo.setToken(token);

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbl_Canal SET Login_Canal = " + '"' + objcanalinfo.getLogin() + '"' + ", "
                    + "Senha_Canal = " + '"' + objcanalinfo.getSenha() + '"' + ", "
                    + "Token_Canal = " + '"' + objcanalinfo.getToken() + '"' + ", "
                    + "Contaid_Canal = " + '"' + objcanalinfo.getContaid() + '"'
                    + " WHERE id_Canal = " + id);

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static void alterarDadosConta(int id, String user, String email, String senha, boolean status, String perfil) {
        
        int perfilI;
        
        switch (perfil) {
            case "Comum":
                perfilI = 2;
                break;
            case "Admin":
                perfilI = 1;
                break;
            default:
                perfilI = 0;
                break;
        }
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbl_Usuario SET Usuario = " + '"' + user + '"' + ", "
                    + "Email_Usuario = " + '"' + email + '"' + ", "
                    + "Senha_Usuario = " + '"' + senha + '"' + ", "
                    + "Status_Usuario = " + status + ", "
                    + "Perfil_Usuario = " + '"' + perfilI + '"'
                    + " WHERE id_User = " + id);
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static void delete(String indiceS) {

        int idCanal = new CanalDAO().searchIdCanal(indiceS);
        int fkConfig = new CanalConfigDAO().buscarConfigReturnId(indiceS);

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement("DELETE FROM tbl_Canal WHERE (id_Canal = " + idCanal + " AND Config_pertencente = " + fkConfig + ")");
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Canal excluído com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir canal: " + ex);
        }

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

    public static void listarEmpresas(JComboBox modeloTabela) {
        try {
            CanalDAO objcanaldao = new CanalDAO();
            ResultSet rs = objcanaldao.listarEmpresa();

            while (rs.next()) {
                modeloTabela.addItem(rs.getString("tbl_Config.Empresa_Config"));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO ao carregar ComboBox" + erro);
        }
    }
    
    /*
    
        Metodo de retorno (Return ou Static return)
    
    */

    public static Usuario loginConta(String pk, String pass, Usuario usuarioLogado) throws SQLException {
        UsuarioDTO clienteDTO = new UsuarioDTO(pk, pass);
        ResultSet busca = new UsuarioDAO().loginCliente(clienteDTO);
        if(busca.isBeforeFirst()) {
            while(busca.next()) {
                int id = busca.getInt("id_User");
                String u = busca.getString("Usuario");
                if (u == null) {
                    break;
                }
                
                String nome = null;
                nome = busca.getString("Nome_Usuario");
                String sobrenome = busca.getString("Sobrenome_Usuario");
                String e = busca.getString("Email_Usuario");
                String p = busca.getString("Senha_Usuario");
                boolean ati = busca.getBoolean("Status_Usuario");
                int tp = busca.getInt("Perfil_Usuario");
                return usuarioLogado = new Usuario(id, nome, sobrenome, u, e, p, ati, tp);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
            return null;
        }
        return null;
    }
}
