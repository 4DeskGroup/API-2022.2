package model.bean;

import javax.swing.JOptionPane;

<<<<<<< Updated upstream
public class Usuario {
    
    private int id;             // Pega o ID do usuario
    private String nome;        // Pega o user do nome
    private String sobrenome;    // Pega o sobrenome
=======
<<<<<<< Updated upstream
public abstract class Usuario {
    
    private int id;             // Pega o ID do usuario
=======
public class Usuario {
    
    private int id;             // Pega o ID do usuario
    private String nome;        // Pega o user do nome
    private String sobrenome;    // Pega o sobrenome
>>>>>>> Stashed changes
>>>>>>> Stashed changes
    private String user;        // Pega o user do usuario
    private String email;       // Pega o email do usuario
    private String pass;        // Pega a senha do usuario
    
<<<<<<< Updated upstream
    private boolean status;     // Saber se a conta esta ativa ou não
=======
<<<<<<< Updated upstream
    private boolean active;     // Saber se a conta esta ativa ou não
>>>>>>> Stashed changes
    
    private int perfil;        /*
                                    Utilizadas para distinguir as permissões de user | perfil = 0 é a conta master e não 
                                    pode ter outra com o mesmo valor; perfil = 1 é a conta ADM e pode haver varios ADMs;
                                    perfil = 2 é o cliente tentando ver suas informações;
                                   */
    
    /*
        Metodos "Constructor"
    */

    public Usuario(){
        this.nome = "";
        this.user = "";
        this.email = "";
        this.pass = "";
        this.status = true;
        this.perfil = 2;
    }
    
    public Usuario(String n, String u, String e, String p){
        
        /*
            ! IMPORTANTE !
          Aqui não tem o id, pq esta sendo usado somente no CadastroGUI e
        quem insere o id é o proprio banco de dados com o auto_increment
        
        */
        
        if(n.equals("") || n.equals(" ")){
            this.nome = null;
        }else{
            this.nome = n;
        }
        this.user = u;
        this.email = e;
        this.pass = p;
        this.status = true;
        this.perfil = 2;
    }
    
    public Usuario(int id, String n, String u, String e, String p){
        if(n.equals("") || n.equals(" ")){
            this.nome = null;
        }else{
            this.nome = n;
        }
        this.id = id;
        this.user = u;
        this.email = e;
        this.pass = p;
        this.status = true;
        this.perfil = 2;
    }
    
    public Usuario(int id, String n, String u, String e, String p, boolean sts, int tpAc){
        if(n == null || n.equals("")){
            this.nome = "Sem Nome";
        }else{
            this.nome = n;
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
<<<<<<< Updated upstream
=======
    public void set(int i){
=======
    private boolean status;     // Saber se a conta esta ativa ou não
    
    private int perfil;        /*
                                    Utilizadas para distinguir as permissões de user | perfil = 0 é a conta master e não 
                                    pode ter outra com o mesmo valor; perfil = 1 é a conta ADM e pode haver varios ADMs;
                                    perfil = 2 é o cliente tentando ver suas informações;
                                   */
    
    /*
        Metodos "Constructor"
    */

    public Usuario(){
        this.nome = "";
        this.user = "";
        this.email = "";
        this.pass = "";
        this.status = true;
        this.perfil = 2;
    }
    
    public Usuario(String n, String u, String e, String p){
        
        /*
            ! IMPORTANTE !
          Aqui não tem o id, pq esta sendo usado somente no CadastroGUI e
        quem insere o id é o proprio banco de dados com o auto_increment
        
        */
        
        if(n.equals("") || n.equals(" ")){
            this.nome = null;
        }else{
            this.nome = n;
        }
        this.user = u;
        this.email = e;
        this.pass = p;
        this.status = true;
        this.perfil = 2;
    }
    
    public Usuario(int id, String n, String u, String e, String p){
        if(n.equals("") || n.equals(" ")){
            this.nome = null;
        }else{
            this.nome = n;
        }
        this.id = id;
        this.user = u;
        this.email = e;
        this.pass = p;
        this.status = true;
        this.perfil = 2;
    }
    
    public Usuario(int id, String n, String u, String e, String p, boolean sts, int tpAc){
        if(n == null || n.equals("")){
            this.nome = "Sem Nome";
        }else{
            this.nome = n;
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
>>>>>>> Stashed changes

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void setId(int i){
<<<<<<< Updated upstream
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes
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
    
<<<<<<< Updated upstream
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public void setPerfil(int type){
        this.perfil = type;
=======
<<<<<<< Updated upstream
    public void setActive(boolean act){
        this.active = act;
    }
    
    public void setTypeAcess(int type, boolean p){
        if(p == true){
            this.typeAcess = type;
        }else{
            JOptionPane.showMessageDialog(null, "Sem permissão para continuar a ação");
        }
=======
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public void setPerfil(int type){
        this.perfil = type;
>>>>>>> Stashed changes
>>>>>>> Stashed changes
    }
    
    /*
        Metodos "Getters"
    */
    public int getId(){
<<<<<<< Updated upstream
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
=======
<<<<<<< Updated upstream
        return id;
>>>>>>> Stashed changes
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
    
<<<<<<< Updated upstream
    public boolean getStatus(){
        return this.status;
=======
    public boolean getActive(){
        return active;
    }
    
    /*
        Metodo Status
    */
    public void statusU(){
        
        // Ver o status da conta...
        
        JOptionPane.showMessageDialog(null, "ID: " + this.getId() +
            "\nUsuario: " + this.getUser()  +
            "\nE-mail: "  + this.getEmail() +
            "\nSenha: "   + this.getPass()  +
            "\nAtiva? "   + this.getActive()+
            "\nTipo de acesso: " + this.getTypeAcess()
        );
        
=======
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
>>>>>>> Stashed changes
>>>>>>> Stashed changes
    }
}
