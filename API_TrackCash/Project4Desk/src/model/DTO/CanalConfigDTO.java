package model.DTO;

import model.bean.*;

public class CanalConfigDTO {
    
    private int id;
    protected String empresa;
    protected String plataforma;
    protected String autentificacao;

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

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

    public String getAutentificacao() {
        return this.autentificacao;
    }

    public void setAutentificacao(String a) {
        this.autentificacao = a;
    }
    
}
