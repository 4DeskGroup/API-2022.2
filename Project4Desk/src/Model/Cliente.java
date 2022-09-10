package Model;

public class Cliente extends Usuario {
    private boolean per = false;
    
    public Cliente(String u, String e, String p){
        this.setUser(u);
        this.setEmail(e);
        this.setPass(p);
        this.setActive(true);
        this.per = true;
        this.setTypeAcess(2, per);
        this.per = false;
    }
}
