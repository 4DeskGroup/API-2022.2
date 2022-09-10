package Model;

import javax.swing.JOptionPane;

public class ADM extends Usuario implements Gerenciamento{
    
    public ADM(String u, String e, String p){
        this.setAcess(0, 0);
        
    }
    
    protected void setAcess(int typeA, int perm){
        
        if(this.getPermission() == true && typeA != 0 && typeA > 0){
            this.typeAcess = perm;
        }else if(typeA > 3){
            JOptionPane.showMessageDialog(null, "Permissão não existente!"
                + "1 para ADM"
                + "2 para operacional");
        }else{
            JOptionPane.showMessageDialog(null, "Sem permissão para realizar tal ação!");
        }
        
    }
    protected void setActive(boolean act){
        this.active = act;
    }

    /*
        Metodos Abstratos
    */
    @Override
    public void admin() {
        
    }
    
}
