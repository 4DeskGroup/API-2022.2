package model.dao;

import connection.ConnectionFactory;
import model.bean.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.DTO.UsuarioDTO;

public class UsuarioDAO extends ConnectionFactory {

    private Connection conection;

    public UsuarioDAO() {
        conection = ConnectionFactory.getConnection();
    }

    public void addCliente(Usuario cliente) {
        /*
            Aqui ele esta inserindo os valores na tabela Usuarios do banco de dados!
         */
        String sql = "INSERT INTO tbl_Usuario VALUES(DEFAULT, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = conection.prepareStatement(sql);
            stmt.setString(1, cliente.getUser());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getSobrenome());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getPass());
            stmt.setBoolean(6, cliente.getStatus());
            stmt.setInt(7, 2);
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro Completo!"
                    + "\nO usuario " + cliente.getUser() + " foi cadastrado com sucesso!");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Usuario já cadastrado!\nIndicamos que use outro usuario para processeguir");

        } finally {
            connection.ConnectionFactory.closeConnection(conection);
        }

    }

    public ResultSet loginCliente(UsuarioDTO clientedto) {                           // 'pk' é Primary Key

        String sql = "SELECT * FROM tbl_Usuario WHERE Usuario = BINARY " + '"' + clientedto.getUser() + '"'
                + " AND Senha_Usuario = BINARY " + '"' + clientedto.getPass() + '"';

        try {
            PreparedStatement stmt = this.conection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {

        }
    }

    public boolean existCliente(String pk, String p) {
        String sql = "SELECT * FROM tbl_Usuario WHERE Usuario = ?";
        try {

            PreparedStatement stmt = this.conection.prepareStatement(sql);
            stmt.setString(1, pk);
            ResultSet rs = stmt.executeQuery();
            JOptionPane.showMessageDialog(null, rs);
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
            } else {
                return true;
            }

            stmt.close();
        } catch (SQLException ex) {

            throw new RuntimeException(ex);

        } finally {
            connection.ConnectionFactory.closeConnection(conection);
        }
        return false;
    }

    public int searchIdCliente(String user) {
        String sql = "SELECT * FROM tbl_Usuario WHERE Usuario = ?";
        try {

            PreparedStatement stmt = this.conection.prepareStatement(sql);
            stmt.setString(1, user);
            ResultSet rs = stmt.executeQuery();
            JOptionPane.showMessageDialog(null, rs);
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "ID de usuario não encontrado!");
            } else {
                return rs.getInt("id");
            }

            stmt.close();
        } catch (SQLException ex) {

            throw new RuntimeException(ex);

        } finally {
            connection.ConnectionFactory.closeConnection(conection);
        }
        return -1;
    }

    public Usuario searchCliente(String user) {
        String sql = "SELECT * FROM tbl_Usuario WHERE Usuario = ? limit 1";
        try {
            PreparedStatement stmt = this.conection.prepareStatement(sql);
            stmt.setString(1, user);
            ResultSet rs = stmt.executeQuery();
            JOptionPane.showMessageDialog(null, rs);
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "ID de usuario não encontrado!");
            } else {
                Usuario busca = new Usuario(rs.getInt("id_Usuario"), rs.getString("Nome_Usuario"), rs.getString("Sonbrenome_Usuario"), rs.getString("Usuario"), rs.getString("Email_Usuario"), rs.getString("Senha_Usuario"), rs.getBoolean("Status_Usuario"), rs.getInt("Perfil_Usuario"));
                return busca;
            }

            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Usuario");
            throw new RuntimeException(ex);
        } finally {
            connection.ConnectionFactory.closeConnection(conection);
        }
        return null;
    }
    
    public void deleteUser(String nome) {

        conection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conection.prepareStatement("DELETE FROM tbl_usuario WHERE Usuario = ?");
            stmt.setString(1, nome);

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Canal excluído com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar canal: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conection, stmt);
        }
    }

}
