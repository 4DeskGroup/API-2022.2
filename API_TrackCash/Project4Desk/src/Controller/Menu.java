package Controller;

import javax.swing.JPanel;
import model.bean.Usuario;

public class Menu {
    
    private static Usuario user;
    
    public Menu(Usuario user){
        this.user = user;
    }
    
    public void abrirMenu(JPanel menu){
        if(menu.isVisible() == true){
            menu.setVisible(false);
        }else{
            menu.setVisible(true);
        }
    }
}
