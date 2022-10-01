package model.DTO;

import model.bean.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CanalDTO extends CanalConfigDTO{
    
    private int idCanal;
    private String usuario;
    private String login;
    private String senha;
    private String token;
    
    public int getIdCanal() {
        return this.idCanal;
    }

    public void setIdCanal(int idCanais) {
        this.idCanal = idCanais;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
