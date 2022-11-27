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
import javax.swing.ImageIcon;

public class PaginaEditarUser extends javax.swing.JFrame {

    private PesqUser DAO;
    private Table table;
    private boolean atividade;
    private static Usuario user;

    public PaginaEditarUser(Usuario u) {
        this.user = u;
        initComponents();
        try {
            DAO = new PesqUser(u);
            table = new Table();
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
        lbl_NomeUser = new javax.swing.JLabel();
        btn_SairLogout = new javax.swing.JButton();
        btn_EditarPerfil = new javax.swing.JButton();
        btn_Ajuda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_CadastrarCanal = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        lbl_idUserStatic = new javax.swing.JLabel();
        lbl_Filtros = new javax.swing.JLabel();
        lbl_idUser = new javax.swing.JLabel();
        lbl_Pesquisar = new javax.swing.JLabel();
        txt_Busca = new javax.swing.JFormattedTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        txt_Usuario = new javax.swing.JTextField();
        lbl_User = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        lbl_Senha = new javax.swing.JLabel();
        txt_Senha = new javax.swing.JTextField();
        btn_Limpar = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Contas = new javax.swing.JTable();
        lbl_userInfoUs2 = new javax.swing.JLabel();
        chb_Ativar = new javax.swing.JCheckBox();
        chb_Desativar = new javax.swing.JCheckBox();
        lbl_Perfil = new javax.swing.JLabel();
        cbx_Perfil = new javax.swing.JComboBox<>();
        btn_AtualizarDados = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        btn_CarregarCampos = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        cbx_pag = new javax.swing.JComboBox<>();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edição de Usuário");
        setIconImage(new ImageIcon(getClass().getResource("/View/imagens/4Desk_Gigante.png")).getImage());
        setMinimumSize(new java.awt.Dimension(800, 730));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 100, 67));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 100, 67));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 100));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_NomeUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_NomeUser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lbl_NomeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 5, 330, 30));

        btn_SairLogout.setBackground(new java.awt.Color(255, 62, 21));
        btn_SairLogout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_SairLogout.setForeground(new java.awt.Color(255, 255, 255));
        btn_SairLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Sair.png"))); // NOI18N
        btn_SairLogout.setText("Sair");
        btn_SairLogout.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_SairLogout.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_SairLogout.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_SairLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SairLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SairLogoutMouseExited(evt);
            }
        });
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
        jPanel2.add(btn_SairLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 40, 144, -1));

        btn_EditarPerfil.setBackground(new java.awt.Color(255, 62, 21));
        btn_EditarPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_EditarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/editar_perfil.png"))); // NOI18N
        btn_EditarPerfil.setText("Editar Perfil");
        btn_EditarPerfil.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_EditarPerfil.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_EditarPerfil.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_EditarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditarPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditarPerfilMouseExited(evt);
            }
        });
        btn_EditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarPerfilActionPerformed(evt);
            }
        });
        btn_EditarPerfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_EditarPerfilKeyPressed(evt);
            }
        });
        jPanel2.add(btn_EditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 40, 144, -1));

        btn_Ajuda.setBackground(new java.awt.Color(255, 62, 21));
        btn_Ajuda.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Ajuda.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ajuda.png"))); // NOI18N
        btn_Ajuda.setText("Ajuda");
        btn_Ajuda.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_Ajuda.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_Ajuda.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_Ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AjudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AjudaMouseExited(evt);
            }
        });
        btn_Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AjudaActionPerformed(evt);
            }
        });
        btn_Ajuda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_AjudaKeyPressed(evt);
            }
        });
        jPanel2.add(btn_Ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 40, 144, -1));

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 100, 67));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/4d__4_-removebg-preview peq.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 30, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" 4D Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 210);
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 30, 0, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(132, 132, 132));
        jPanel5.setPreferredSize(new java.awt.Dimension(1200, 80));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(132, 132, 132));
        jPanel6.setMinimumSize(new java.awt.Dimension(270, 100));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 270));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 18, 75));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Edicao_de_Usuario_2D124B.png"))); // NOI18N
        jLabel6.setText("    Edição de Usuário");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 34;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 60);
        jPanel6.add(jLabel6, gridBagConstraints);

        jPanel5.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(132, 132, 132));
        jPanel7.setMinimumSize(new java.awt.Dimension(700, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(700, 100));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        btn_CadastrarCanal.setBackground(new java.awt.Color(51, 51, 51));
        btn_CadastrarCanal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_CadastrarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Voltar_FFFFFF_pequeno.png"))); // NOI18N
        btn_CadastrarCanal.setText("Voltar");
        btn_CadastrarCanal.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_CadastrarCanal.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_CadastrarCanal.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_CadastrarCanal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CadastrarCanalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CadastrarCanalMouseExited(evt);
            }
        });
        btn_CadastrarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanalActionPerformed(evt);
            }
        });
        btn_CadastrarCanal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_CadastrarCanalKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 530, 10, 20);
        jPanel7.add(btn_CadastrarCanal, gridBagConstraints);

        jPanel5.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(87, 65, 111));
        jPanel9.setPreferredSize(new java.awt.Dimension(0, 80));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SUPORTE, FALE CONOSCO: apifatec2@gmail.com");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 435, 0, 0);
        jPanel9.add(jLabel3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Copyright 2022 - 4Desk Group Company® - Versão 4.0.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 410, 20, 410);
        jPanel9.add(jLabel5, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setPreferredSize(new java.awt.Dimension(960, 105));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setMinimumSize(new java.awt.Dimension(1200, 160));
        jPanel11.setPreferredSize(new java.awt.Dimension(1200, 160));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Edição de Usuário"));
        jPanel12.setMinimumSize(new java.awt.Dimension(1200, 165));
        jPanel12.setPreferredSize(new java.awt.Dimension(1200, 165));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setMinimumSize(new java.awt.Dimension(1200, 60));
        jPanel13.setPreferredSize(new java.awt.Dimension(1200, 60));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(241, 241, 241));
        jPanel14.setMinimumSize(new java.awt.Dimension(1200, 100));
        jPanel14.setLayout(new java.awt.GridBagLayout());

        lbl_idUserStatic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_idUserStatic.setForeground(new java.awt.Color(45, 18, 75));
        lbl_idUserStatic.setText("ID User");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 210, 0, 0);
        jPanel14.add(lbl_idUserStatic, gridBagConstraints);

        lbl_Filtros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Filtros.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Filtros.setText("Filtros");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 240, 0, 0);
        jPanel14.add(lbl_Filtros, gridBagConstraints);

        lbl_idUser.setBackground(new java.awt.Color(204, 204, 204));
        lbl_idUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_idUser.setForeground(new java.awt.Color(45, 18, 75));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 210, 0, 0);
        jPanel14.add(lbl_idUser, gridBagConstraints);

        lbl_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons8-pesquisar-30.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 195);
        jPanel14.add(lbl_Pesquisar, gridBagConstraints);

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
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 206;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 240, 5, 0);
        jPanel14.add(txt_Busca, gridBagConstraints);

        jPanel13.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel15.setMinimumSize(new java.awt.Dimension(1200, 100));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setMinimumSize(new java.awt.Dimension(1200, 65));
        jPanel16.setPreferredSize(new java.awt.Dimension(1200, 65));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(241, 241, 241));
        jPanel17.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel17.setLayout(new java.awt.GridBagLayout());

        txt_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 145, 25, 0);
        jPanel17.add(txt_Usuario, gridBagConstraints);

        lbl_User.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_User.setForeground(new java.awt.Color(45, 18, 75));
        lbl_User.setText("Usuário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 145, 0, 0);
        jPanel17.add(lbl_User, gridBagConstraints);

        lbl_Email.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_Email.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Email.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel17.add(lbl_Email, gridBagConstraints);

        txt_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 20, 25, 0);
        jPanel17.add(txt_Email, gridBagConstraints);

        lbl_Senha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_Senha.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Senha.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel17.add(lbl_Senha, gridBagConstraints);

        txt_Senha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Senha.setToolTipText("");
        txt_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SenhaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 25, 0);
        jPanel17.add(txt_Senha, gridBagConstraints);

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
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 20, 25, 155);
        jPanel17.add(btn_Limpar, gridBagConstraints);

        jPanel16.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel15.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel12.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel21.setBackground(new java.awt.Color(241, 241, 241));
        jPanel21.setPreferredSize(new java.awt.Dimension(960, 105));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel22.setMinimumSize(new java.awt.Dimension(1200, 275));
        jPanel22.setPreferredSize(new java.awt.Dimension(1200, 275));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários"));
        jPanel23.setMinimumSize(new java.awt.Dimension(1200, 160));
        jPanel23.setPreferredSize(new java.awt.Dimension(1200, 160));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel24.setMinimumSize(new java.awt.Dimension(1200, 200));
        jPanel24.setPreferredSize(new java.awt.Dimension(1200, 200));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jPanel25.setBackground(new java.awt.Color(241, 241, 241));
        jPanel25.setMinimumSize(new java.awt.Dimension(1200, 100));
        jPanel25.setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 984;
        gridBagConstraints.ipady = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        jPanel25.add(jScrollPane2, gridBagConstraints);

        lbl_userInfoUs2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_userInfoUs2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_userInfoUs2.setText("Atividade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        jPanel25.add(lbl_userInfoUs2, gridBagConstraints);

        chb_Ativar.setText("Ativar");
        chb_Ativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_AtivarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        jPanel25.add(chb_Ativar, gridBagConstraints);

        chb_Desativar.setText("Desativar");
        chb_Desativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_DesativarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        jPanel25.add(chb_Desativar, gridBagConstraints);

        lbl_Perfil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Perfil.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Perfil.setText("Perfil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 25, 0, 0);
        jPanel25.add(lbl_Perfil, gridBagConstraints);

        cbx_Perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Admin" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 0, 0);
        jPanel25.add(cbx_Perfil, gridBagConstraints);

        btn_AtualizarDados.setText("Atualizar informações");
        btn_AtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarDadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 15, 0, 20);
        jPanel25.add(btn_AtualizarDados, gridBagConstraints);

        jPanel24.add(jPanel25, java.awt.BorderLayout.CENTER);

        jPanel23.add(jPanel24, java.awt.BorderLayout.PAGE_START);

        jPanel26.setMinimumSize(new java.awt.Dimension(1200, 80));
        jPanel26.setPreferredSize(new java.awt.Dimension(1200, 80));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel27.setMinimumSize(new java.awt.Dimension(1200, 60));
        jPanel27.setPreferredSize(new java.awt.Dimension(1200, 60));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jPanel28.setBackground(new java.awt.Color(241, 241, 241));
        jPanel28.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel28.setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 320, 50, 0);
        jPanel28.add(btn_CarregarCampos, gridBagConstraints);

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
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 50, 310);
        jPanel28.add(btn_Excluir, gridBagConstraints);

        prev.setText("<");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 50, 0);
        jPanel28.add(prev, gridBagConstraints);

        cbx_pag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_pagMouseClicked(evt);
            }
        });
        cbx_pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_pagActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 50, 0);
        jPanel28.add(cbx_pag, gridBagConstraints);

        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 50, 0);
        jPanel28.add(next, gridBagConstraints);

        jPanel27.add(jPanel28, java.awt.BorderLayout.PAGE_START);

        jPanel26.add(jPanel27, java.awt.BorderLayout.PAGE_START);

        jPanel23.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jPanel10.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.table.updateCBX(tbl_Contas, user, cbx_pag);
        btn_AtualizarDados.setEnabled(false);

        lbl_NomeUser.setText("Olá, " + user.getNome());


    }//GEN-LAST:event_formWindowOpened

    private void btn_SairLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SairLogoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SairLogoutMouseEntered

    private void btn_SairLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SairLogoutMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SairLogoutMouseExited

    private void btn_SairLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairLogoutActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_btn_SairLogoutActionPerformed

    private void btn_SairLogoutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_SairLogoutKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SairLogoutKeyPressed

    private void btn_EditarPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditarPerfilMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarPerfilMouseEntered

    private void btn_EditarPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditarPerfilMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarPerfilMouseExited

    private void btn_EditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarPerfilActionPerformed
        // TODO add your handling code here:
        PaginaEditarUserProprio paginaEditarUserProprio = new PaginaEditarUserProprio(user);
        paginaEditarUserProprio.setVisible(true);
    }//GEN-LAST:event_btn_EditarPerfilActionPerformed

    private void btn_EditarPerfilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_EditarPerfilKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarPerfilKeyPressed

    private void btn_AjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AjudaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AjudaMouseEntered

    private void btn_AjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AjudaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AjudaMouseExited

    private void btn_AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AjudaActionPerformed
        // TODO add your handling code here:
        PaginaAjuda paginaajuda = new PaginaAjuda();
        paginaajuda.setVisible(true);

    }//GEN-LAST:event_btn_AjudaActionPerformed

    private void btn_AjudaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_AjudaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AjudaKeyPressed

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2KeyPressed

    private void btn_CadastrarCanalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CadastrarCanalMouseEntered

    private void btn_CadastrarCanalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CadastrarCanalMouseExited

    private void btn_CadastrarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalActionPerformed
        // TODO add your handling code here:
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            PaginaUsuariosCadas paginaUsuarioCadas = new PaginaUsuariosCadas(user);
            paginaUsuarioCadas.setExtendedState(Frame.MAXIMIZED_BOTH);
            paginaUsuarioCadas.setVisible(true);
            this.dispose();
        } else {
            PaginaUsuariosCadas paginaUsuarioCadas = new PaginaUsuariosCadas(user);
            paginaUsuarioCadas.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_CadastrarCanalActionPerformed

    private void btn_CadastrarCanalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CadastrarCanalKeyPressed

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

        this.table.excluirConta(tbl_Contas, user, cbx_pag);
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed

        int cbxSelected = Integer.parseInt(cbx_pag.getSelectedItem().toString());
        if (cbxSelected >= 1) {
            this.table.back(tbl_Contas, user, cbxSelected, cbx_pag);
        }
    }//GEN-LAST:event_prevActionPerformed

    private void cbx_pagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_pagMouseClicked

    }//GEN-LAST:event_cbx_pagMouseClicked

    private void cbx_pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_pagActionPerformed

        int cbxSelected = Integer.parseInt(cbx_pag.getSelectedItem().toString());
        this.table.setCBX(tbl_Contas, user, cbxSelected, cbx_pag);
    }//GEN-LAST:event_cbx_pagActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        int cbxSelected = Integer.parseInt(cbx_pag.getSelectedItem().toString());
        if (cbxSelected <= this.table.getTotalPag()) {
            this.table.next(tbl_Contas, user, cbxSelected, cbx_pag);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void txt_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SenhaActionPerformed

        if (!txt_Usuario.getText().equals("Token")) {
            txt_Senha.setEditable(false);
        }
    }//GEN-LAST:event_txt_SenhaActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed

        LimparCampos();
    }//GEN-LAST:event_btn_LimparActionPerformed

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
                this.table.setPag(tbl_Contas, user);
            } else {
                JOptionPane.showMessageDialog(null, "Não pode deixar nenhum campo vazio!");
            }
        }
    }//GEN-LAST:event_btn_AtualizarDadosActionPerformed

    private void txt_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscaActionPerformed

    }//GEN-LAST:event_txt_BuscaActionPerformed

    private void txt_BuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscaKeyReleased

        String busca = txt_Busca.getText();
        String campo = "Usuario";
        String ordem = "asc";

        this.table.filtroBuscaConta(tbl_Contas, busca, campo, ordem, DAO, user);

    }//GEN-LAST:event_txt_BuscaKeyReleased

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
        txt_Email.setText(tbl_Contas.getModel().getValueAt(linha, 5).toString());

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
        txt_Email.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ajuda;
    private javax.swing.JButton btn_AtualizarDados;
    private javax.swing.JButton btn_CadastrarCanal;
    private javax.swing.JButton btn_CarregarCampos;
    private javax.swing.JButton btn_EditarPerfil;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_SairLogout;
    private javax.swing.JComboBox<String> cbx_Perfil;
    private javax.swing.JComboBox<String> cbx_pag;
    private javax.swing.JCheckBox chb_Ativar;
    private javax.swing.JCheckBox chb_Desativar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Filtros;
    private javax.swing.JLabel lbl_NomeUser;
    private javax.swing.JLabel lbl_Perfil;
    private javax.swing.JLabel lbl_Pesquisar;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lbl_User;
    private javax.swing.JLabel lbl_idUser;
    private javax.swing.JLabel lbl_idUserStatic;
    private javax.swing.JLabel lbl_userInfoUs2;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JTable tbl_Contas;
    private javax.swing.JFormattedTextField txt_Busca;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Senha;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
