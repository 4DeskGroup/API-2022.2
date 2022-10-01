package model.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Canal extends CanalConfig{
    
    private int idCanal;
    private String usuario;
    private String login;
    private String senha;
    private String token;
    
    public Canal(){
//        
    }
    
    public Canal(ResultSet rs){
        try{
            while(rs.next()){
                this.empresa = rs.getString("empresa");
                this.plataforma = rs.getString("plataforma");
                this.autentificacao = rs.getString("autentificacao");
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }
    
    public Canal(ResultSet rs, int config){
        
        switch(config){
            case 1 -> {
                try{
                    while(rs.next()){
                        this.empresa = rs.getString("empresa");
                        this.plataforma = rs.getString("plataforma");
                        this.autentificacao = rs.getString("autentificacao");
                    }
                }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
                }
            }
                
            case 2 -> {
                try{
                    while(rs.next()){
                        this.idCanal = rs.getInt("idCanal");
                        this.usuario = rs.getString("usuario");
                        this.login = rs.getString("login");
                        this.senha = rs.getString("senha");
                        this.token = rs.getString("usuario");

                    }
                }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
                }
            }
            
            case 3 -> {
                try{
                    while(rs.next()){
                        this.empresa = rs.getString("empresa");
                        this.plataforma = rs.getString("plataforma");
                        this.autentificacao = rs.getString("autentificacao");
                        this.idCanal = rs.getInt("idCanal");
                        this.usuario = rs.getString("usuario");
                        this.login = rs.getString("login");
                        this.senha = rs.getString("senha");
                        this.token = rs.getString("usuario");

                    }
                }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
                }
            }
                
            default -> JOptionPane.showMessageDialog(null, "ERRO config");
        }
        
        
    }
    
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
