package Controller;

import javax.swing.JOptionPane;
import model.bean.Usuario;

public class VerificarAcesso {
    
    public boolean acessADM(Usuario cli){
        
        int perfil = cli.getPerfil();
        boolean actived = cli.getActive();
        
        if(perfil == 2 || actived == false){
            return false;
        }else{
            return true;
        }
    }
}
