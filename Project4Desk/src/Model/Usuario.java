package Model;

import javax.swing.JOptionPane;

public abstract class Usuario {
    
    private int id;             // Pega o ID do usuario
    private String user;        // Pega o user do usuario
    private String email;       // Pega o email do usuario
    private String pass;        // Pega a senha do usuario
    
    private boolean active;     // Saber se a conta esta ativa ou não
    
    private boolean permission; // Utilizadas para distinguir as permissões de user | O usuario pode ter a conta dasativada,
                                // essa variavel faz  ele não conseguir toma nenhuma ação. É apeanas um exemplo de varias
                                // outras funcionalidades...
    
    private int typeAcess;        /*
                                    Utilizadas para distinguir as permissões de user | typeAcess = 0 é a conta master e não 
                                    pode ter outra com o mesmo valor; typeAcess = 1 é a conta ADM e pode haver varios ADMs;
                                    typeAcess = 2 é o cliente tentando ver suas informações;
                                   */
    
    /*
        Metodos "Setters"
    */
    public void setUser(String u){
        if(this.getPermission() == true){
            this.user = u;
        }else{
            JOptionPane.showMessageDialog(null, "Sem permissão para mudar o nome de usuário");
        }
    }
    
    public void setEmail(String e){
        if(this.getPermission() == true){
            this.email = e;
        }else{
            JOptionPane.showMessageDialog(null, "Sem permissão para mudar o email");
        }
    }
    
    public void setPass(String p){
        if(this.getPermission() == true){
            this.pass = p;
        }else{
            JOptionPane.showMessageDialog(null, "Sem permissão para mudar a senha");
        }
    }
    
    /*
        Metodos "Getters"
    */
    public int getId(){
        return this.id;
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
    
    public boolean getPermission(){
        return this.permission;
    }
    
    public int getTypeAcess(){
        return this.typeAcess;
    } 
    
    public boolean getActive(){
        return this.active;
    }
    
}
