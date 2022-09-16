package Controller;

import model.dao.ClienteDAO;
import model.bean.Cliente;
import javax.swing.JOptionPane;

public class Login {
    
    public Cliente logar(String user, String pass) throws Exception{
        Cliente busca = new ClienteDAO().loginCliente(user, pass);
        if(busca.getUser().equals("admin") && busca.getPass().equals("admin1234")){
            JOptionPane.showMessageDialog(null, "LOGADO COM SUCESSO!");
            return busca;
        }else{
            JOptionPane.showMessageDialog(null, "Login Inválido!");
            return null;
        }
    }
}
