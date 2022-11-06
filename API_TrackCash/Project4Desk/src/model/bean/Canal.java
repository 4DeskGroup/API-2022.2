package model.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Canal extends CanalConfig {

    private int pk_idCanal;
    private int fk_usuario;
    private int fk_config;
    private String login;
    private String senha;
    private String token;
    private String contaid;

    public Canal() {
//        
    }

    public Canal(ResultSet rs) {
        try {
            while (rs.next()) {
                this.empresa = rs.getString("tbl_Config.Empresa_Config");
                this.plataforma = rs.getString("tbl_Config.Plataforma_Config");
                this.autenticacao = rs.getString("tbl_Config.Autenticacao_Config");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }

    public Canal(ResultSet rs, int config) {

        switch (config) {
            case 1:
                try {
                    while (rs.next()) {
                        this.empresa = rs.getString("tbl_Config.Empresa_Config");
                        this.plataforma = rs.getString("tbl_Config.Plataforma_Config");
                        this.autenticacao = rs.getString("tbl_Config.Autentificacao_Config");
                    }
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
                }
            break;

            case 2:
                try {
                    while (rs.next()) {
                        this.pk_idCanal = rs.getInt("tbl_Canal.id_Canal");
                        this.contaid = rs.getString("tbl_Canal.Contaid_Canal");
                        this.token = rs.getString("tbl_Canal.Token_Canal");
                        this.login = rs.getString("tbl_Canal.Login_Canal");
                        this.senha = rs.getString("tbl_Canal.Senha_Canal");
                        this.fk_usuario = rs.getInt("tbl_Canal.Usuario_pertencente");
                        this.fk_config = rs.getInt("tbl_Canal.Config_pertencente");
                    }
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
                }
            break;

            case 3:
                try {
                    while (rs.next()) {
                        this.empresa = rs.getString("tbl_Config.Empresa_Config");
                        this.plataforma = rs.getString("tbl_Config.Plataforma_Config");
                        this.autenticacao = rs.getString("tbl_Config.Autentificacao_Config");
                        this.pk_idCanal = rs.getInt("tbl_Canal.id_Canal");
                        this.contaid = rs.getString("tbl_Canal.Contaid_Canal");
                        this.token = rs.getString("tbl_Canal.Token_Canal");
                        this.login = rs.getString("tbl_Canal.Login_Canal");
                        this.senha = rs.getString("tbl_Canal.Senha_Canal");
                        this.fk_usuario = rs.getInt("tbl_Canal.Usuario_pertencente");
                        this.fk_config = rs.getInt("tbl_Canal.Config_pertencente");

                    }
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
                }
            break;

            default:
                JOptionPane.showMessageDialog(null, "ERRO config");
                break;
        }

    }

    public String getContaid() {
        return contaid;
    }

    public void setContaid(String contaid) {
        this.contaid = contaid;
    }

    public int getIdCanal() {
        return this.pk_idCanal;
    }

    public void setIdCanal(int pk_idCanais) {
        this.pk_idCanal = pk_idCanais;
    }

    public int getFkUsuario() {
        return this.fk_usuario;
    }

    public void setFkUsuario(int fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public int getFkConfig() {
        return this.fk_config;
    }

    public void setFkConfig(int fk_config) {
        this.fk_config = fk_config;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
