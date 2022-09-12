package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import javax.swing.JOptionPane;

public class Logar{
    String pk = "admin";
    public Logar(String pk){
        Cliente clienteLogado = new ClienteDAO().searchCliente(pk);

    }
}
