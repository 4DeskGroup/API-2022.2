package model.DTO;

public class UsuarioDTO {
    private int id;
    private String user;
    private String pass;
    
    public UsuarioDTO(String u, String p){
        this.user = u;
        this.pass = p;
    }

    public int getId(){
        return this.id;
    }
    
    public String getUser() {
        return this.user;
    }

    public String getPass() {
        return this.pass;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
