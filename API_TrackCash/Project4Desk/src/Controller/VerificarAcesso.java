package Controller;

import javax.swing.JOptionPane;
import model.bean.Usuario;

public class VerificarAcesso {
    
    public boolean acess(Usuario user){
        
        int perfil = user.getPerfil();
        boolean actived = user.getStatus();
        
        if(perfil == 2 || actived == false){
            return false;
        }else{
            return true;
        }
    }
}
