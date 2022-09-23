/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author justx
 */
public class CanalInfo {
    
    public int getIdCanais() {
        return idCanais;
    }

    public void setIdCanais(int idCanais) {
        this.idCanais = idCanais;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    public String getContaid(){
        return contaid;
    }
    
    public void setContaid(String contaid){
        this.contaid = contaid;
    }
   
 
    private int idCanais;
    private String contaid;
    private String empresa;
    private String plataforma;
    private String usuario;
    private String senha;
    private String token;
    
}
