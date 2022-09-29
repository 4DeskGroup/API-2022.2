package model.bean;

import javax.swing.JOptionPane;

public abstract class Usuario {
    
    private int id;             // Pega o ID do usuario
    private String nome;        // Pega o user do nome
    private String user;        // Pega o user do usuario
    private String email;       // Pega o email do usuario
    private String pass;        // Pega a senha do usuario
    
    private boolean active;     // Saber se a conta esta ativa ou não
    
    private int typeAcess;        /*
                                    Utilizadas para distinguir as permissões de user | typeAcess = 0 é a conta master e não 
                                    pode ter outra com o mesmo valor; typeAcess = 1 é a conta ADM e pode haver varios ADMs;
                                    typeAcess = 2 é o cliente tentando ver suas informações;
                                   */
    
    /*
        Metodos "Setters"
    */

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void set(int i){
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
    
    public void setActive(boolean act){
        this.active = act;
    }
    
    public void setTypeAcess(int type){
        this.typeAcess = type;
    }
    
    /*
        Metodos "Getters"
    */
    public int getId(){
        return this.id;
    }

    public String getNome() {
        return nome;
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
    
    public int getTypeAcess(){
        return this.typeAcess;
    } 
    
    public boolean getActive(){
        return this.active;
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
        
    }
}
