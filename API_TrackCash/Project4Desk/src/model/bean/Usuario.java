package model.bean;

public class Usuario{
    
    private int id;             // Pega o ID do usuario
    private String nome;        // Pega o user do nome
    private String sobrenome;    // Pega o sobrenome
    private String user;        // Pega o user do usuario
    private String email;       // Pega o email do usuario
    private String pass;        // Pega a senha do usuario
    
    private boolean status;     // Saber se a conta esta ativa ou não
    
    private int perfil;         /*
    
                                    Utilizadas para distinguir as permissões de user | perfil = 0 é a conta master e não 
                                    pode ter outra com o mesmo valor; perfil = 1 é a conta ADM e pode haver varios ADMs;
                                    perfil = 2 é o cliente tentando ver suas informações;
                                   
                                */
    
    /*
        Metodos "Constructor"
    */

    public Usuario(){
        this.nome = "";
        this.sobrenome = "";
        this.user = "";
        this.email = "";
        this.pass = "";
        this.status = true;
        this.perfil = 2;
    }
    
    public Usuario(String n, String sn, String u, String e, String p){
        
        /*
            ! IMPORTANTE !
          Aqui não tem o id, pq esta sendo usado somente no CadastroGUI e
        quem insere o id é o proprio banco de dados com o auto_increment
        
        */
        
        if(n.equals("") || n.equals(" ")){
            this.nome = null;
            this.sobrenome = null;
        }else{
            this.nome = n;
            this.sobrenome = sn;
        }
        this.user = u;
        this.email = e;
        this.pass = p;
        this.status = true;
        this.perfil = 2;
    }
    
    public Usuario(int id, String n, String sn, String u, String e, String p){
        if(n.equals("") || n.equals(" ")){
            this.nome = null;
            this.sobrenome = null;
        }else{
            this.nome = n;
            this.sobrenome = sn;
        }
        this.id = id;
        this.user = u;
        this.email = e;
        this.pass = p;
        this.status = true;
        this.perfil = 2;
    }
    
    public Usuario(int id, String n, String sn, String u, String e, String p, boolean sts, int tpAc){
        if(n == null || n.equals("")){
            this.nome = null;
            this.sobrenome = null;
        }else{
            this.nome = n;
            this.sobrenome = sn;
        }
        this.id = id;
        this.user = u;
        this.email = e;
        this.pass = p;
        this.status = sts;
        this.perfil = tpAc;
    }
    
    /*
        Metodos "Setters"
    */

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void setId(int i){
        this.id = i;
    }
    public void setUser(String u){
        this.user = u;
    }
    
    public void setEmail(String e){
        this.email = e;
    }
    
    public void setPass(String p){
        this.pass = p;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public void setPerfil(int type){
        this.perfil = type;
    }
    
    /*
        Metodos "Getters"
    */
    public int getId(){
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public String getUser(){
        return this.user;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPass(){
        return this.pass;
    }
    
    public int getPerfil(){
        return this.perfil;
    } 
    
    public boolean getStatus(){
        return this.status;
    }
}
