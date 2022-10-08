package Controller;

<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream
import model.bean.Cliente;
>>>>>>> Stashed changes
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class VerificarAcesso {
    
    public boolean acess(Usuario user){
        
        int perfil = user.getPerfil();
        boolean actived = user.getStatus();
        
<<<<<<< Updated upstream
        if(perfil == 2 || actived == false){
=======
        if(tpAcess == 2 || actived == false){
=======
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class VerificarAcesso {
    
    public boolean acess(Usuario user){
        
        int perfil = user.getPerfil();
        boolean actived = user.getStatus();
        
        if(perfil == 2 || actived == false){
>>>>>>> Stashed changes
>>>>>>> Stashed changes
            return false;
        }else{
            return true;
        }
    }
}
