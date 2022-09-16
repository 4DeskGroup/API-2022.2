package model.bean;

import javax.swing.JOptionPane;

public abstract class Usuario {
    
    private int id;             // Pega o ID do usuario
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
    
    public void setTypeAcess(int type, boolean p){
        if(p == true){
            this.typeAcess = type;
        }else{
            JOptionPane.showMessageDialog(null, "Sem permissão para continuar a ação");
        }
    }
    
    /*
        Metodos "Getters"
    */
    public int getId(){
        return id;
    }
    
    public String getUser(){
        return user;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPass(){
        return pass;
    }
    
    public int getTypeAcess(){
        return typeAcess;
    } 
    
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
        
    }
}
