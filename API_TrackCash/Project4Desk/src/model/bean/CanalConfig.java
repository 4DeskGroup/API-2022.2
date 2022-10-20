package model.bean;

public class CanalConfig {
    
    private int id;
    protected String empresa;
    protected String plataforma;
    protected String autenticacao;

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

    public String getAutenticacao() {
        return this.autenticacao;
    }

    public void setAutenticacao(String a) {
        this.autenticacao = a;
    }
    
}
