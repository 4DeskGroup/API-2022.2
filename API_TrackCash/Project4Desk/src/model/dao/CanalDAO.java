package model.dao;

import static View.PaginaConfiguracaoCanal.lbl_Autenticacao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Canal;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import model.DTO.CanalDTO;

public class CanalDAO {

    private Connection conn;

    public int searchIdCanal(String empresa) {
        conn = ConnectionFactory.getConnection();
        try {
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("SELECT tbl_Canal.id_Canal FROM tbl_Canal JOIN tbl_Config WHERE tbl_Config.Empresa_Config = ? AND tbl_Config.id_Config = tbl_Canal.Config_pertencente");
            stmt.setString(1, empresa);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
            return rs.getInt(1);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: " + erro);
            return -1;
        }
    }

    public ResultSet searchCanalForUser(Canal c) {
        // group by " + '"' + usuario + '"'
        conn = ConnectionFactory.getConnection();
        try {
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("SELECT tbl_Config.Empresa_Config, tbl_Canal.Login_Canal, tbl_Canal.Senha_Canal, tbl_Canal.Token_Canal FROM tbl_Config JOIN tbl_Canal ON tbl_Config.id_Config = tbl_Canal.Config_pertencente"
                    + " WHERE Usuario_pertencente = " + '"' + c.getFkUsuario() + '"');
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: " + erro);
        }
        return null;
    }

    public List<Canal> reads() {

        conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Canal> canais = new ArrayList<>();

        try {
            stmt = conn.prepareStatement("SELECT * FROM tbl_Canal JOIN tbl_Config");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Canal canal = new Canal();

                canal.setIdCanal(rs.getInt("tbl_Canal.id_Canal"));
                canal.setEmpresa(rs.getString("tbl_Config.Empresa_Config"));
                canal.setPlataforma(rs.getString("tbl_Config.Plataforma_Config"));
                canal.setToken(rs.getString("tbl_Config_Autenticacao_Config"));
                canais.add(canal);

            }

        } catch (SQLException ex) {
            Logger.getLogger(CanalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return canais;

    }

    public ResultSet listarPlataforma() {
        conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM tbl_Config ORDER BY Plataforma_Config";

        try {

            PreparedStatement pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());
            return null;
        }
    }

    public ResultSet listarAutentificacao(String empresa) {
        conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM tbl_Config ORDER BY Autenticacao_Config";

        try {

            PreparedStatement pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());
            return null;
        }
    }

    public ResultSet listarEmpresa() {
        conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM tbl_Config ORDER BY id_Config";

        try {

            PreparedStatement pstm = conn.prepareStatement(sql);
            return pstm.executeQuery(sql);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());
            return null;
        }
    }

    public ResultSet listarId() {
        List<Canal> canais2 = new ArrayList<>();
        conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.prepareStatement("SELECT id_Canal FROM tbl_Canal");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Canal canal = new Canal();
                canal.setIdCanal(rs.getInt(1));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());
            return null;
        }

        return (ResultSet) canais2;
        
    }

    
    /*
    
        Metodos sem Retorno (Void ou Static void)
    
     */

    public void addCanal(CanalDTO p) {

        conn = ConnectionFactory.getConnection();

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

    public static void alterarDados(CanalDTO objcanalinfo, int id) {
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

    public static void delete(int idCanal, int fkConfig) {

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
}
