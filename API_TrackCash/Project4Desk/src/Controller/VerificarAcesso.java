package Controller;

import View.PaginaCadastrosAtivos;
import model.bean.Usuario;

public class VerificarAcesso {
    
    public boolean isADM(Usuario user){
        
        int perfil = user.getPerfil();
        boolean actived = user.getStatus();
        
        return !((perfil == 2 || user.getUser() == null) || actived == false);
    }
    
    public boolean verifyExist(Usuario user){
        return user != null;
    }
    
}
