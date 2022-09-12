package Model;

public class Cliente extends Usuario {
    private boolean per;
    
    public Cliente(String u, String e, String p, boolean at, int tpA){
        this.setUser(u);
        this.setEmail(e);
        this.setPass(p);
        this.setActive(at);
        this.per = true;
        this.setTypeAcess(tpA, per);
        this.per = false;
    }
}
