package model.bean;

import model.bean.Usuario;

public class Cliente extends Usuario {
    
    public Cliente(String n, String u, String e, String p){
        if(n.equals("") || n.equals(" ")){
            this.setNome(null);
        }
        this.setNome(n);
        this.setUser(u);
        this.setEmail(e);
        this.setPass(p);
        this.setActive(true);
        this.setTypeAcess(2);
    }
    
    public Cliente(){
        this.setNome("");
        this.setUser("");
        this.setEmail("");
        this.setPass("");
        this.setActive(true);
        this.setTypeAcess(2);
    }
    
    public Cliente(String n, String u, String e, String p, boolean act, int tpAc){
        if(n == null){
            this.setNome("Sem Nome");
        }else{
            this.setNome(n);
        }
        this.setUser(u);
        this.setEmail(e);
        this.setPass(p);
        this.setActive(act);
        this.setTypeAcess(tpAc);
    }
}
