package Controller;

import connection.ConnectionFactory;
import connection.PesqCanal;
import connection.PesqUser;
import connection.PesquCanalADM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.bean.Usuario;

public class Table {

    private String table;
    private int totalPag;
    private int offset;
    private int limite = 10;

    private DefaultTableModel CarregarTabelaConfig(DefaultTableModel modelo) {

        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;

            stmt = con.prepareStatement("SELECT * FROM tbl_Config LIMIT 10 OFFSET " + this.offset + ";");
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
                    + "tbl_Canal.Usuario_pertencente = " + '"' + user.getId() + '"' + " AND  id_Config = Config_pertencente LIMIT 10 OFFSET " + this.offset + ";");
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

    private DefaultTableModel CarregarTabelaUser(DefaultTableModel modelo) {

        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;

            stmt = con.prepareStatement("SELECT * FROM tbl_Usuario LIMIT 10 OFFSET " + this.offset + ";");
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

    public void excluirCanal(JTable modelTable, Usuario user, JComboBox cbx) {

        if (modelTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um canal para excluir!");
        } else {
            Object indice = modelTable.getValueAt(modelTable.getSelectedRow(), 0);
            String indiceS = indice.toString();
            Dados.deleteCanal(indiceS);
            updateCBX(modelTable, user, cbx);
        }
    }

    public void excluirConfig(JTable modelTable, Usuario user, JComboBox cbx) {

        if (modelTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma config para excluir!");
        } else {
            Object indice = modelTable.getValueAt(modelTable.getSelectedRow(), 1);
            String indiceS = indice.toString();
            Dados.deleteConfig(indiceS);
            updateCBX(modelTable, user, cbx);
        }

    }

    public void excluirConta(JTable modelTable, Usuario user, JComboBox cbx) {

        if (modelTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um usuario para excluir!");
        } else {
            Object indice = modelTable.getValueAt(modelTable.getSelectedRow(), 0);
            int indiceS = Integer.parseInt(indice.toString());
            Dados.deleteUser(indiceS);
            updateCBX(modelTable, user, cbx);
        }

    }

    public void filtroBuscaCanal(JTable modelTable, String busca, String campo, String ordem, PesqCanal DAO, Usuario user) {
        if (!busca.equals("")) {
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
        } else {
            setPag(modelTable, user);
        }

    }

    public void filtroBuscaConfig(JTable modelTable, String busca, String campo, String ordem, PesquCanalADM DAO, Usuario user) {
        if (!busca.equals("")) {
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
        } else {
            setPag(modelTable, user);
        }
    }

    public void filtroBuscaConta(JTable modelTable, String busca, String campo, String ordem, PesqUser DAO, Usuario user) {
        if (!busca.equals("")) {
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

        } else {
            setPag(modelTable, user);
        }
    }

    /*
    
        Paginação
        Void ou Static Void (Sem Retorno)
    
     */
    
    public int countPag(String tbl) throws SQLException {

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM " + tbl + ";");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int total_registros = rs.getInt(1);
                int total_pag;
                if (total_registros % 10 != 0) {
                    total_pag = (total_registros / 10) + 1;
                } else {
                    total_pag = total_registros / 10;
                }
                return total_pag;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar paginacao!");
        }
        return 0;
    }

    public void back(JTable modelTable, Usuario user, int pag, JComboBox cbx) {
        if(pag-- > 1){
            cbx.setSelectedItem(pag);
            this.offset = (pag * 10) - 10;
        }else{
            this.offset = 0;
        }
        setPag(modelTable, user);
    }

    public void next(JTable modelTable, Usuario user, int pag, JComboBox cbx) {
        if(pag++ < this.totalPag){
            cbx.setSelectedItem(pag);
            this.offset = (pag * 10) - 10;
        }
        setPag(modelTable, user);
    }

    public void setCBX(JTable modelTable, Usuario user, int pag, JComboBox cbx) {
        this.offset = 0;
        if (pag != 1) {
            this.offset = (pag * 10) - 10;
        }
        cbx.setSelectedItem(pag);
        setPag(modelTable, user);
    }

    public void setPag(JTable modelTable, Usuario user) {
        DefaultTableModel modelo = (DefaultTableModel) modelTable.getModel();
        switch (this.table) {
            case "tbl_Canal":
                DefaultTableModel modeloCanal = CarregarTabelaCanal(modelo, user);
                modelo = modeloCanal;
                break;
            case "tbl_Config":
                DefaultTableModel modeloConfig = CarregarTabelaConfig(modelo);
                modelo = modeloConfig;
                break;
            default:
                DefaultTableModel modeloUser = CarregarTabelaUser(modelo);
                modelo = modeloUser;
                break;
        }
    }

    public void updateCBX(JTable modelTable, Usuario user, JComboBox cbx) {
        try {
            if (modelTable.getRowCount() > 0) {
                String tbl = modelTable.getColumnName(0);
                switch (tbl) {
                    case "idConfig":
                        this.table = "tbl_Config";
                        break;
                    case "Empresa":
                        this.table = "tbl_Canal";
                        break;
                    default:
                        this.table = "tbl_Usuario";
                        break;
                }
                cbx.removeAllItems();
                this.totalPag = countPag(this.table);
                for (int itemCBX = 1; itemCBX <= this.totalPag; itemCBX++) {
                    cbx.addItem(itemCBX);
                }
                this.offset = 0;
                setPag(modelTable, user);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar ComboBox Page!\n" + ex);
        }
    }

    public int getTotalPag() {
        return this.totalPag;
    }
}
