package View;

import Controller.Dados;
import Controller.Table;
import javax.swing.table.DefaultTableModel;
import connection.PesqUser;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class PaginaEditarUser extends javax.swing.JFrame {

    private PesqUser DAO;
    private boolean atividade;
    private static Usuario user;

    public PaginaEditarUser(Usuario u) {
        this.user = u;
        initComponents();
        try {
            DAO = new PesqUser(u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco!\n" + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_SairLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_NomeUser = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_confAtivas1 = new javax.swing.JLabel();
        btn_CadastrarCanal = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_User = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        lbl_Email = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        lbl_Senha = new javax.swing.JLabel();
        txt_Senha = new javax.swing.JTextField();
        btn_Limpar = new javax.swing.JButton();
        lbl_idUserStatic = new javax.swing.JLabel();
        lbl_idUser = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_Perfil = new javax.swing.JLabel();
        btn_AtualizarDados = new javax.swing.JButton();
        lbl_userInfoUs2 = new javax.swing.JLabel();
        cbx_Perfil = new javax.swing.JComboBox<>();
        chb_Ativar = new javax.swing.JCheckBox();
        chb_Desativar = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lbl_Contas = new javax.swing.JLabel();
        lbl_Filtros = new javax.swing.JLabel();
        txt_Busca = new javax.swing.JFormattedTextField();
        lbl_Pesquisar = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Contas = new javax.swing.JTable();
        btn_CarregarCampos = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edição de Usuário");
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 62, 21));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 62, 21));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 80));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btn_SairLogout.setBackground(new java.awt.Color(204, 204, 204));
        btn_SairLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_SairLogout.setText("Sair");
        btn_SairLogout.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_SairLogout.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_SairLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairLogoutActionPerformed(evt);
            }
        });
        btn_SairLogout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_SairLogoutKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 450, 20, 50);
        jPanel2.add(btn_SairLogout, gridBagConstraints);

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 62, 21));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/4d__4_-removebg-preview peq.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 12, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        lbl_NomeUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 260);
        jPanel3.add(lbl_NomeUser, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lbl_confAtivas1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbl_confAtivas1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_confAtivas1.setText("Edição de Usuário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 320, 0, 459);
        jPanel5.add(lbl_confAtivas1, gridBagConstraints);

        btn_CadastrarCanal.setBackground(new java.awt.Color(255, 62, 21));
        btn_CadastrarCanal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_CadastrarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal.setText("Voltar");
        btn_CadastrarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 20, 0);
        jPanel5.add(btn_CadastrarCanal, gridBagConstraints);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        lbl_User.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_User.setForeground(new java.awt.Color(45, 18, 75));
        lbl_User.setText("Usuário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel7.add(lbl_User, gridBagConstraints);

        txt_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 186;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 10, 0);
        jPanel7.add(txt_Usuario, gridBagConstraints);

        lbl_Email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Email.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Email.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel7.add(lbl_Email, gridBagConstraints);

        txt_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 0);
        jPanel7.add(txt_Email, gridBagConstraints);

        lbl_Senha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Senha.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Senha.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel7.add(lbl_Senha, gridBagConstraints);

        txt_Senha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Senha.setToolTipText("");
        txt_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SenhaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 0);
        jPanel7.add(txt_Senha, gridBagConstraints);

        btn_Limpar.setBackground(new java.awt.Color(45, 18, 75));
        btn_Limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Limpar.setForeground(new java.awt.Color(236, 236, 236));
        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 120, 0, 140);
        jPanel7.add(btn_Limpar, gridBagConstraints);

        lbl_idUserStatic.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_idUserStatic.setForeground(new java.awt.Color(45, 18, 75));
        lbl_idUserStatic.setText("ID User");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 150, 0, 0);
        jPanel7.add(lbl_idUserStatic, gridBagConstraints);

        lbl_idUser.setBackground(new java.awt.Color(204, 204, 204));
        lbl_idUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_idUser.setForeground(new java.awt.Color(45, 18, 75));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(lbl_idUser, gridBagConstraints);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        lbl_Perfil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Perfil.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Perfil.setText("Perfil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 110, 0, 0);
        jPanel9.add(lbl_Perfil, gridBagConstraints);

        btn_AtualizarDados.setText("Atualizar informações");
        btn_AtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarDadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 280, 10, 70);
        jPanel9.add(btn_AtualizarDados, gridBagConstraints);

        lbl_userInfoUs2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_userInfoUs2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_userInfoUs2.setText("Atividade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        jPanel9.add(lbl_userInfoUs2, gridBagConstraints);

        cbx_Perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Admin" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 110, 0, 0);
        jPanel9.add(cbx_Perfil, gridBagConstraints);

        chb_Ativar.setText("Ativar");
        chb_Ativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_AtivarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 0, 0);
        jPanel9.add(chb_Ativar, gridBagConstraints);

        chb_Desativar.setText("Desativar");
        chb_Desativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_DesativarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 10, 0);
        jPanel9.add(chb_Desativar, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(241, 241, 241));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(241, 241, 241));
        jPanel12.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel12.setLayout(new java.awt.GridBagLayout());

        lbl_Contas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Contas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Contas.setText("Contas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 90, 0, 0);
        jPanel12.add(lbl_Contas, gridBagConstraints);

        lbl_Filtros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Filtros.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Filtros.setText("Filtros");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 300, 0, 0);
        jPanel12.add(lbl_Filtros, gridBagConstraints);

        txt_Busca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscaActionPerformed(evt);
            }
        });
        txt_Busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscaKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 18, 20, 0);
        jPanel12.add(txt_Busca, gridBagConstraints);

        lbl_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons8-pesquisar-30.png"))); // NOI18N
        lbl_Pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_PesquisarMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 60);
        jPanel12.add(lbl_Pesquisar, gridBagConstraints);

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(241, 241, 241));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(241, 241, 241));
        jPanel14.setMinimumSize(new java.awt.Dimension(950, 200));
        jPanel14.setPreferredSize(new java.awt.Dimension(100, 250));
        jPanel14.setLayout(new java.awt.GridBagLayout());

        tbl_Contas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Usuario", "Nome", "Sobrenome", "Email", "Senha", "Atividade", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Contas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ContasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_Contas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 804;
        gridBagConstraints.ipady = 190;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 190, 0, 190);
        jPanel14.add(jScrollPane2, gridBagConstraints);

        btn_CarregarCampos.setBackground(new java.awt.Color(239, 239, 239));
        btn_CarregarCampos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_CarregarCampos.setForeground(new java.awt.Color(45, 18, 75));
        btn_CarregarCampos.setText("Carregar Campos");
        btn_CarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CarregarCamposActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 290, 30, 0);
        jPanel14.add(btn_CarregarCampos, gridBagConstraints);

        btn_Excluir.setBackground(new java.awt.Color(41, 12, 74));
        btn_Excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Excluir.setForeground(new java.awt.Color(239, 239, 239));
        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 396, 30, 0);
        jPanel14.add(btn_Excluir, gridBagConstraints);

        jPanel13.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Table.carregarTableConta(tbl_Contas, user);
        btn_AtualizarDados.setEnabled(false);

        lbl_NomeUser.setText("Olá, " + user.getNome());


    }//GEN-LAST:event_formWindowOpened

    private void btn_SairLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairLogoutActionPerformed
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setExtendedState(Frame.MAXIMIZED_BOTH);
            telaPrincipal.setVisible(true);
            this.dispose();
        } else {
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
            this.dispose();
        }
        //new TelaPrincipal().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btn_SairLogoutActionPerformed

    private void btn_CadastrarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalActionPerformed

        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            PaginaCadastrosAtivos paginaCadastroAtivos = new PaginaCadastrosAtivos(user);
            paginaCadastroAtivos.setExtendedState(Frame.MAXIMIZED_BOTH);
            paginaCadastroAtivos.setVisible(true);
            this.dispose();
        } else {
            PaginaCadastrosAtivos paginaCadastroAtivos = new PaginaCadastrosAtivos(user);
            paginaCadastroAtivos.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_CadastrarCanalActionPerformed

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed

    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed

    }//GEN-LAST:event_txt_EmailActionPerformed

    private void txt_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SenhaActionPerformed

    }//GEN-LAST:event_txt_SenhaActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed

        LimparCampos();
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_AtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarDadosActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar os dados?", "ATENÇÃO", 1);

        if (resp == JOptionPane.YES_OPTION) {
            int id;
            boolean atv = this.atividade;
            String usuario, email, senha, perfil;

            id = Integer.parseInt(lbl_idUser.getText());
            usuario = txt_Usuario.getText();
            email = txt_Email.getText();
            senha = txt_Senha.getText();
            perfil = cbx_Perfil.getSelectedItem().toString();

            if (!usuario.equals("") && !email.equals("") && !senha.equals("")) {

                Dados.alterarDadosConta(id, usuario, email, senha, atv, perfil);

                Table.carregarTableConta(tbl_Contas, user);
            } else {
                JOptionPane.showMessageDialog(null, "Não pode deixar nenhum campo vazio!");
            }
        }
    }//GEN-LAST:event_btn_AtualizarDadosActionPerformed

    private void chb_AtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_AtivarActionPerformed

        this.atividade = true;
        chb_Ativar.setSelected(true);
        chb_Desativar.setSelected(false);
    }//GEN-LAST:event_chb_AtivarActionPerformed

    private void chb_DesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_DesativarActionPerformed

        this.atividade = false;
        chb_Ativar.setSelected(false);
        chb_Desativar.setSelected(true);
    }//GEN-LAST:event_chb_DesativarActionPerformed

    private void txt_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscaActionPerformed

    }//GEN-LAST:event_txt_BuscaActionPerformed

    private void txt_BuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscaKeyReleased

        String busca = txt_Busca.getText();
        String campo = "Usuario";
        String ordem = "asc";

        Table.filtroBuscaConta(tbl_Contas, busca, campo, ordem, DAO);
    }//GEN-LAST:event_txt_BuscaKeyReleased

    private void lbl_PesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_PesquisarMouseClicked

    }//GEN-LAST:event_lbl_PesquisarMouseClicked

    private void tbl_ContasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ContasMouseClicked

        btn_AtualizarDados.setEnabled(true);

        int setar = tbl_Contas.getSelectedRow();

        carregarCampos(setar);
    }//GEN-LAST:event_tbl_ContasMouseClicked

    private void btn_CarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CarregarCamposActionPerformed

        if (tbl_Contas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um usuario para carrega!");
        } else {
            btn_AtualizarDados.setEnabled(true);

            int setar = tbl_Contas.getSelectedRow();

            carregarCampos(setar);
        }

    }//GEN-LAST:event_btn_CarregarCamposActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed

        Table.excluirConta(tbl_Contas, user);

    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void btn_SairLogoutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_SairLogoutKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_F10) || (evt.getKeyCode() == KeyEvent.VK_0)) {
            Dimension telaOriginal = getPreferredSize();
            Dimension telaRecente = getSize();

            int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
            int tamanhoTelaRecente = (int) telaRecente.getWidth();

            if (tamanhoTelaOriginal < tamanhoTelaRecente) {
                TelaPrincipal telaPrincipal = new TelaPrincipal();
                telaPrincipal.setExtendedState(Frame.MAXIMIZED_BOTH);
                telaPrincipal.setVisible(true);
                this.dispose();
            } else {
                TelaPrincipal telaPrincipal = new TelaPrincipal();
                telaPrincipal.setVisible(true);
                this.dispose();
            }

        }
    }//GEN-LAST:event_btn_SairLogoutKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaEditarUser(user).setVisible(true);
            }
        });
    }

    private void carregarCampos(int linha) {

        String a = tbl_Contas.getModel().getValueAt(linha, 6).toString();
        String p = tbl_Contas.getModel().getValueAt(linha, 7).toString();

        lbl_idUser.setText(tbl_Contas.getModel().getValueAt(linha, 0).toString());
        txt_Usuario.setText(tbl_Contas.getModel().getValueAt(linha, 1).toString());
        txt_Email.setText(tbl_Contas.getModel().getValueAt(linha, 4).toString());
        txt_Senha.setText(tbl_Contas.getModel().getValueAt(linha, 5).toString());

        if (a.equals("Ativo")) {
            this.atividade = true;
            chb_Ativar.setSelected(true);
            chb_Desativar.setSelected(false);
        } else {
            this.atividade = false;
            chb_Ativar.setSelected(false);
            chb_Desativar.setSelected(true);
        }

        switch (p) {
            case "Comum":
                cbx_Perfil.setSelectedIndex(1);
                break;
            case "Admin":
                cbx_Perfil.setSelectedIndex(2);
                break;
            case "Master":
                cbx_Perfil.setSelectedIndex(1);
                break;
        }

    }

    private void LimparCampos() {

        txt_Usuario.setText("");
        txt_Email.setText("");
        txt_Senha.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AtualizarDados;
    private javax.swing.JButton btn_CadastrarCanal;
    private javax.swing.JButton btn_CarregarCampos;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_SairLogout;
    private javax.swing.JComboBox<String> cbx_Perfil;
    private javax.swing.JCheckBox chb_Ativar;
    private javax.swing.JCheckBox chb_Desativar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Contas;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Filtros;
    private javax.swing.JLabel lbl_NomeUser;
    private javax.swing.JLabel lbl_Perfil;
    private javax.swing.JLabel lbl_Pesquisar;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lbl_User;
    private javax.swing.JLabel lbl_confAtivas1;
    private javax.swing.JLabel lbl_idUser;
    private javax.swing.JLabel lbl_idUserStatic;
    private javax.swing.JLabel lbl_userInfoUs2;
    private javax.swing.JTable tbl_Contas;
    private javax.swing.JFormattedTextField txt_Busca;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Senha;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
