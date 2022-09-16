package model.bean;

import model.bean.Usuario;

public class Cliente extends Usuario {
    private boolean per;
    
    public Cliente(String u, String e, String p){
        this.setUser(u);
        this.setEmail(e);
        this.setPass(p);
        this.setActive(true);
        this.per = true;
        this.setTypeAcess(2, per);
        this.per = false;
    }
    
    public Cliente(){
        this.setUser("");
        this.setEmail("");
        this.setPass("");
        this.setActive(true);
        this.per = true;
        this.setTypeAcess(2, per);
        this.per = false;
    }
    
    public Cliente(String u, String e, String p, boolean act, int tpAc){
        this.setUser(u);
        this.setEmail(e);
        this.setPass(p);
        this.setActive(act);
        this.per = true;
        this.setTypeAcess(tpAc, per);
        this.per = false;
    }
}
