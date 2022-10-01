package model.DTO;

public class UsuarioDTO {
    private String user;
    private String pass;
    
    public UsuarioDTO(String u, String p){
        this.user = u;
        this.pass = p;
    }

    public String getUser() {
        return this.user;
    }

    public String getPass() {
        return this.pass;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
