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

}
