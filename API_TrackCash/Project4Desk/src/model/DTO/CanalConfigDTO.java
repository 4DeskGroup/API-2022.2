package model.DTO;

import model.bean.*;

public class CanalConfigDTO {
    
    protected String empresa;
    protected String plataforma;
    protected String autenticacao;

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String e) {
        this.empresa = e;
    }

    public String getPlataforma() {
        return this.plataforma;
    }

    public void setPlataforma(String p) {
        this.plataforma = p;
    }

    public String getAutenticacao() {
        return this.autenticacao;
    }

    public void setAutenticacao(String a) {
        this.autenticacao = a;
    }
    
}
