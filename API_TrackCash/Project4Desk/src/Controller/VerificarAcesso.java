package Controller;

import model.bean.Cliente;
import javax.swing.JOptionPane;

public class VerificarAcesso {
    
    public boolean acessADM(Cliente cli){
        
        int tpAcess = cli.getTypeAcess();
        boolean actived = cli.getActive();
        
        if(tpAcess == 2 || actived == false){
            return false;
        }else{
            return true;
        }
    }
}
