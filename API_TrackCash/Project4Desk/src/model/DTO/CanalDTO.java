package model.DTO;

import model.bean.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CanalDTO extends CanalConfigDTO{
    
    private int pk_idCanal;
    private int fk_usuario;
    private int fk_config;
    private String login;
    private String senha;
    private String token;
    private String contaid;

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

    public void setLogin(String login){
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
