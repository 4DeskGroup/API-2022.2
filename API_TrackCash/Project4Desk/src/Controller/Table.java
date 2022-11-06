package Controller;

import connection.ConnectionFactory;
import connection.PesqCanal;
import connection.PesqUser;
import connection.PesquCanalADM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.bean.Usuario;

public class Table {

    private DefaultTableModel CarregarTabelaConfig(DefaultTableModel modelo, Usuario user) {

        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;

            stmt = con.prepareStatement("SELECT * FROM tbl_Config");
            rs = stmt.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                });
            }
            ConnectionFactory.closeConnection(con, stmt, rs);
            return modelo;

        } catch (SQLException ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    private DefaultTableModel CarregarTabelaCanal(DefaultTableModel modelo, Usuario user) {

        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;

            stmt = con.prepareStatement("SELECT * FROM tbl_Canal JOIN tbl_Config WHERE "
                    + "tbl_Canal.Usuario_pertencente = " + '"' + user.getId() + '"' + " AND  id_Config = Config_pertencente");
            rs = stmt.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("tbl_Config.Empresa_Config"),
                    rs.getString("tbl_Canal.Contaid_Canal"),
                    rs.getString("tbl_Canal.Login_Canal"),
                    rs.getString("tbl_Canal.Senha_Canal"),
                    rs.getString("tbl_Canal.Token_Canal")
                });

            }
            ConnectionFactory.closeConnection(con, stmt, rs);
            return modelo;

        } catch (SQLException ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    private DefaultTableModel CarregarTabelaUser(DefaultTableModel modelo, Usuario user) {

        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;

            stmt = con.prepareStatement("SELECT * FROM tbl_usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                String ativo, perfil;

                if (rs.getBoolean(7) == true) {
                    ativo = "Ativo";
                } else {
                    ativo = "Inativo";
                }

                if (rs.getString(8).equals("0")) {
                    perfil = "Master";
                } else if (rs.getString(8).equals("1")) {
                    perfil = "ADM";
                } else {
                    perfil = "Comum";
                }

                modelo.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    ativo,
                    perfil
                });

            }
            ConnectionFactory.closeConnection(con, stmt, rs);
            return modelo;

        } catch (SQLException ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    private DefaultTableModel filtroBuscaADM(String campo, String ordem, String pesq, PesquCanalADM DAO, DefaultTableModel modelo) {

        modelo.setNumRows(0);

        try {
            Vector cabecalho = new Vector();
            cabecalho.add("id_Config");
            cabecalho.add("Empresa");
            cabecalho.add("Plataforma");
            cabecalho.add("Autenticacao");
            if (!pesq.equals("")) {
                DefaultTableModel tabela = new DefaultTableModel(DAO.PesquisarADM(pesq, campo, ordem), cabecalho);
                return tabela;
            } else {
                DefaultTableModel tabela = new DefaultTableModel(DAO.PesquisarADM(campo, ordem), cabecalho);
                return tabela;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar o Canal: " + ex.getMessage());
            return null;
        }
    }

    private DefaultTableModel filtroBuscaCanal(String campo, String ordem, String pesq, PesqCanal DAO, DefaultTableModel modelo) {

        modelo.setNumRows(0);

        try {
            Vector cabecalho = new Vector();
            cabecalho.add("Empresa");
            cabecalho.add("ContaID");
            cabecalho.add("Login");
            cabecalho.add("Senha");
            cabecalho.add("Token");
            if (!pesq.equals("")) {
                DefaultTableModel tabela = new DefaultTableModel(DAO.Pesquisar(pesq, campo, ordem), cabecalho);
                return tabela;
            } else {
                DefaultTableModel tabela = new DefaultTableModel(DAO.Pesquisar(campo, ordem), cabecalho);
                return tabela;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar Canal: " + ex.getMessage());
        }
        return null;
    }

    private DefaultTableModel filtroBuscaUser(String campo, String ordem, String pesq, PesqUser DAO, DefaultTableModel modelo) {

        modelo.setNumRows(0);

        try {
            Vector cabecalho = new Vector();
            cabecalho.add("Usuario");
            cabecalho.add("Nome");
            cabecalho.add("Sobrenome");
            cabecalho.add("Email");
            cabecalho.add("Senha");
            cabecalho.add("Status");
            cabecalho.add("Perfil");
            if (!pesq.equals("")) {
                DefaultTableModel tabela = new DefaultTableModel(DAO.PesquisarUser(pesq, campo, ordem), cabecalho);
                return tabela;
            } else {
                DefaultTableModel tabela = new DefaultTableModel(DAO.PesquisarUser(campo, ordem), cabecalho);
                return tabela;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar Canal: " + ex.getMessage());
        }
        return null;
    }

    /* 
    
        Metodos sem Retorno (Static void || void)
        
     */
    
    public static void carregarTableCanal(JTable modelTable, Usuario user) {

        DefaultTableModel modelo = (DefaultTableModel) modelTable.getModel();
        DefaultTableModel modeloBD = new Table().CarregarTabelaCanal(modelo, user);

        modelo = modeloBD;

    }

    public static void carregarTableConfig(JTable modelTable, Usuario user) {

        DefaultTableModel modelo = (DefaultTableModel) modelTable.getModel();
        DefaultTableModel modeloBD = new Table().CarregarTabelaConfig(modelo, user);

        modelo = modeloBD;

    }

    public static void carregarTableConta(JTable modelTable, Usuario user) {

        DefaultTableModel modelo = (DefaultTableModel) modelTable.getModel();
        DefaultTableModel modeloBD = new Table().CarregarTabelaUser(modelo, user);

        modelo = modeloBD;

    }

    public static void excluirCanal(JTable modelTable, Usuario user) {

        if (modelTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um canal para excluir!");
        } else {
            Object indice = modelTable.getValueAt(modelTable.getSelectedRow(), 0);
            String indiceS = indice.toString();
            Dados.deleteCanal(indiceS);
            carregarTableCanal(modelTable, user);
        }
    }

    public static void excluirConfig(JTable modelTable, Usuario user) {

        if (modelTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma config para excluir!");
        } else {
            Object indice = modelTable.getValueAt(modelTable.getSelectedRow(), 1);
            String indiceS = indice.toString();
            Dados.deleteConfig(indiceS);
            carregarTableConfig(modelTable, user);
        }

    }

    public static void excluirConta(JTable modelTable, Usuario user) {
        
        if (modelTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um usuario para excluir!");
        } else {
            Object indice = modelTable.getValueAt(modelTable.getSelectedRow(), 0);
            int indiceS = Integer.parseInt(indice.toString());
            Dados.deleteUser(indiceS);
            carregarTableConta(modelTable, user);
        }
        
    }

    public static void filtroBuscaCanal(JTable modelTable, String busca, String campo, String ordem, PesqCanal DAO) {

        if (campo.equals("Usuario")) {
            campo = campo + "_Config";
        } else {
            campo = campo + "_Canal";
        }
        if (ordem.equals("Crescente")) {
            ordem = "asc";
        } else {
            ordem = "desc";
        }

        DefaultTableModel table = (DefaultTableModel) modelTable.getModel();
        table = new Table().filtroBuscaCanal(campo, ordem, busca, DAO, table);
        modelTable.setModel(table);

    }

    public static void filtroBuscaConfig(JTable modelTable, String busca, String campo, String ordem, PesquCanalADM DAO) {

        if (!campo.equals("id_Config")) {
            campo = campo + "_Config";
        }

        if (ordem.equals("Crescente")) {
            ordem = "asc";
        } else {
            ordem = "desc";
        }

        DefaultTableModel table = (DefaultTableModel) modelTable.getModel();
        table = new Table().filtroBuscaADM(campo, ordem, busca, DAO, table);

        modelTable.setModel(table);
    }

    public static void filtroBuscaConta(JTable modelTable, String busca, String campo, String ordem, PesqUser DAO) {

        if (!campo.equals("Usuario")) {
            campo = campo + "_Usuario";
        }

        if (ordem.equals("Crescente")) {
            ordem = "asc";
        } else {
            ordem = "desc";
        }

        DefaultTableModel table = (DefaultTableModel) modelTable.getModel();
        table = new Table().filtroBuscaUser(campo, ordem, busca, DAO, table);

        modelTable.setModel(table);
    }
}
