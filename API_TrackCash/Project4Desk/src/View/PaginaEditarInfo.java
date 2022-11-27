package View;

import Controller.Dados;
import Controller.Table;
import connection.PesqCanal;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.bean.Usuario;
import javax.swing.ImageIcon;

public class PaginaEditarInfo extends javax.swing.JFrame {

    private PesqCanal DAO;
    private Table table;
    private static Usuario user;

    public PaginaEditarInfo(Usuario u) {
        this.user = u;
        initComponents();
        try {
            DAO = new PesqCanal(u);
            table = new Table();
        } catch (Exception e) {

        }
    }

    public void readJTable() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        btn_EditarCanal = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        lbl_canalInfoUs1 = new javax.swing.JLabel();
        lbl_idContaInfoUs2 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        lbl_filtros = new javax.swing.JLabel();
        txt_Busca = new javax.swing.JTextField();
        lbl_canalE = new javax.swing.JLabel();
        jLabel_filtros = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        txt_Usuario = new javax.swing.JTextField();
        lbl_userInfoUs1 = new javax.swing.JLabel();
        lbl_senhaInfoUs = new javax.swing.JLabel();
        txt_Senha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Token = new javax.swing.JTextField();
        btn_AtualizarDados = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_CanaisAtivos = new javax.swing.JTable();
        btn_Excluir = new javax.swing.JButton();
        btn_CarregarCampos = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        prev = new javax.swing.JButton();
        cbx_pag = new javax.swing.JComboBox<>();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edição de Informações");
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
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Edicao_de_Informacoes_2D124B.png"))); // NOI18N
        jLabel6.setText("Edição de Informações");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 60);
        jPanel6.add(jLabel6, gridBagConstraints);

        jPanel5.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(132, 132, 132));
        jPanel7.setMinimumSize(new java.awt.Dimension(700, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(700, 100));
        jPanel7.setLayout(null);

        btn_EditarCanal.setBackground(new java.awt.Color(51, 51, 51));
        btn_EditarCanal.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        btn_EditarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditarCanal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Configuracoes_Ativas_FFFFFF.png"))); // NOI18N
        btn_EditarCanal.setText("Configurações Ativas");
        btn_EditarCanal.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_EditarCanal.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_EditarCanal.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_EditarCanal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditarCanalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditarCanalMouseExited(evt);
            }
        });
        btn_EditarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarCanalActionPerformed(evt);
            }
        });
        btn_EditarCanal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_EditarCanalKeyPressed(evt);
            }
        });
        jPanel7.add(btn_EditarCanal);
        btn_EditarCanal.setBounds(530, 10, 150, 60);

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Copyright 2022 - 4Desk Group Company® - Versão 4.0.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 410, 20, 410);
        jPanel9.add(jLabel7, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setPreferredSize(new java.awt.Dimension(960, 105));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setMinimumSize(new java.awt.Dimension(1200, 160));
        jPanel11.setPreferredSize(new java.awt.Dimension(1200, 160));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Edição de Informações"));
        jPanel12.setMinimumSize(new java.awt.Dimension(1200, 165));
        jPanel12.setPreferredSize(new java.awt.Dimension(1200, 165));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setMinimumSize(new java.awt.Dimension(1200, 60));
        jPanel13.setPreferredSize(new java.awt.Dimension(1200, 60));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(241, 241, 241));
        jPanel14.setMinimumSize(new java.awt.Dimension(1200, 100));
        jPanel14.setLayout(new java.awt.GridBagLayout());

        lbl_canalInfoUs1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_canalInfoUs1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_canalInfoUs1.setText("Canal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 175, 0, 0);
        jPanel14.add(lbl_canalInfoUs1, gridBagConstraints);

        lbl_idContaInfoUs2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_idContaInfoUs2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_idContaInfoUs2.setText("ID da Conta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel14.add(lbl_idContaInfoUs2, gridBagConstraints);

        txt_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 20, 5, 0);
        jPanel14.add(txt_ID, gridBagConstraints);

        lbl_filtros.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_filtros.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros.setText("Filtros");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel14.add(lbl_filtros, gridBagConstraints);

        txt_Busca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Busca.setToolTipText("");
        txt_Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 15, 5, 0);
        jPanel14.add(txt_Busca, gridBagConstraints);

        lbl_canalE.setBackground(new java.awt.Color(204, 204, 204));
        lbl_canalE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canalE.setForeground(new java.awt.Color(45, 18, 75));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 175, 5, 0);
        jPanel14.add(lbl_canalE, gridBagConstraints);

        jLabel_filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons8-pesquisar-30.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 5, 220);
        jPanel14.add(jLabel_filtros, gridBagConstraints);

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

        txt_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
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

        lbl_userInfoUs1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_userInfoUs1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_userInfoUs1.setText("Usuário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 145, 0, 0);
        jPanel17.add(lbl_userInfoUs1, gridBagConstraints);

        lbl_senhaInfoUs.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_senhaInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_senhaInfoUs.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel17.add(lbl_senhaInfoUs, gridBagConstraints);

        txt_Senha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SenhaActionPerformed(evt);
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
        jPanel17.add(txt_Senha, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 18, 75));
        jLabel5.setText("Token");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel17.add(jLabel5, gridBagConstraints);

        txt_Token.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Token.setToolTipText("");
        txt_Token.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TokenActionPerformed(evt);
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
        jPanel17.add(txt_Token, gridBagConstraints);

        btn_AtualizarDados.setText("Atualizar informações");
        btn_AtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarDadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 25, 135);
        jPanel17.add(btn_AtualizarDados, gridBagConstraints);

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

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Canais"));
        jPanel23.setMinimumSize(new java.awt.Dimension(1200, 160));
        jPanel23.setPreferredSize(new java.awt.Dimension(1200, 160));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel24.setMinimumSize(new java.awt.Dimension(1200, 200));
        jPanel24.setPreferredSize(new java.awt.Dimension(1200, 200));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jPanel25.setBackground(new java.awt.Color(241, 241, 241));
        jPanel25.setMinimumSize(new java.awt.Dimension(1200, 100));
        jPanel25.setLayout(new java.awt.GridBagLayout());

        tbl_CanaisAtivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Empresa", "ContaID", "Login", "Senha", "Token"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_CanaisAtivos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 984;
        gridBagConstraints.ipady = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        jPanel25.add(jScrollPane2, gridBagConstraints);

        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 35, 0, 20);
        jPanel25.add(btn_Excluir, gridBagConstraints);

        btn_CarregarCampos.setText("Carregar Campos");
        btn_CarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CarregarCamposActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 35, 0, 20);
        jPanel25.add(btn_CarregarCampos, gridBagConstraints);

        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 35, 0, 20);
        jPanel25.add(btn_Limpar, gridBagConstraints);

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

        prev.setText("<");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 440, 52, 0);
        jPanel28.add(prev, gridBagConstraints);

        cbx_pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_pagActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 17, 0, 0);
        jPanel28.add(cbx_pag, gridBagConstraints);

        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 18, 52, 597);
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

        this.table.updateCBX(tbl_CanaisAtivos, user, cbx_pag);

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

    private void btn_EditarCanalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditarCanalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarCanalMouseEntered

    private void btn_EditarCanalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditarCanalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarCanalMouseExited

    private void btn_EditarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarCanalActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_btn_EditarCanalActionPerformed

    private void btn_EditarCanalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_EditarCanalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarCanalKeyPressed

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void txt_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SenhaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SenhaActionPerformed

    private void txt_TokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TokenActionPerformed

        if (!txt_Usuario.getText().equals("Token")) {
            txt_Token.setEditable(false);
        }
    }//GEN-LAST:event_txt_TokenActionPerformed

    private void btn_AtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarDadosActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar os dados?", "ATENÇÃO", 1);

        if (resp == JOptionPane.YES_OPTION) {
            String login, senha, token, conta_id, empresa;

            conta_id = txt_ID.getText();
            login = txt_Usuario.getText();
            senha = txt_Senha.getText();
            token = txt_Token.getText();
            empresa = lbl_canalE.getText();

            Dados.alterarDadosCanal(empresa, conta_id, login, senha, token);

            try {
                Dados.listarDados(tbl_CanaisAtivos, user);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar! " + ex);
            }

            txt_Usuario.setEditable(true);
            txt_Senha.setEditable(true);
            txt_Token.setEditable(true);
        }
    }//GEN-LAST:event_btn_AtualizarDadosActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed

        this.table.excluirCanal(tbl_CanaisAtivos, user, cbx_pag);
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void btn_CarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CarregarCamposActionPerformed

        if (tbl_CanaisAtivos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um usuario para excluir!");
        } else {
            int setar = tbl_CanaisAtivos.getSelectedRow();

            carregarCampos(setar);
        }
    }//GEN-LAST:event_btn_CarregarCamposActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed

        LimparCampos();
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed

    }//GEN-LAST:event_prevActionPerformed

    private void cbx_pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_pagActionPerformed

    }//GEN-LAST:event_cbx_pagActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

    }//GEN-LAST:event_nextActionPerformed

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void txt_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscaActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaEditarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaEditarInfo(user).setVisible(true);
            }
        });
    }

    private void carregarCampos(int linha) {

        if (tbl_CanaisAtivos.getModel().getValueAt(linha, 4).toString().equals("Sem Token")) {
            txt_Usuario.setText(tbl_CanaisAtivos.getModel().getValueAt(linha, 2).toString());
            txt_Senha.setText(tbl_CanaisAtivos.getModel().getValueAt(linha, 3).toString());
            txt_Token.setText("Sem Token");
            txt_Usuario.setEnabled(true);
            txt_Senha.setEnabled(true);
            txt_Token.setEnabled(false);
        } else {
            txt_Usuario.setText("Sem Usuario");
            txt_Senha.setText("Sem Senha");
            txt_Token.setText(tbl_CanaisAtivos.getModel().getValueAt(linha, 4).toString());
            txt_Usuario.setEnabled(false);
            txt_Senha.setEnabled(false);
            txt_Token.setEnabled(true);

        }
        lbl_canalE.setText(tbl_CanaisAtivos.getModel().getValueAt(linha, 0).toString());
        txt_ID.setText(tbl_CanaisAtivos.getModel().getValueAt(linha, 1).toString());
    }

    private void LimparCampos() {

        lbl_canalE.setText("");
        txt_ID.setText("");
        txt_Usuario.setText("");
        txt_Senha.setText("");
        txt_Token.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ajuda;
    private javax.swing.JButton btn_AtualizarDados;
    private javax.swing.JButton btn_CarregarCampos;
    private javax.swing.JButton btn_EditarCanal;
    private javax.swing.JButton btn_EditarPerfil;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_SairLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_pag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_filtros;
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
    private javax.swing.JLabel lbl_NomeUser;
    private javax.swing.JLabel lbl_canalE;
    private javax.swing.JLabel lbl_canalInfoUs1;
    private javax.swing.JLabel lbl_filtros;
    private javax.swing.JLabel lbl_idContaInfoUs2;
    private javax.swing.JLabel lbl_senhaInfoUs;
    private javax.swing.JLabel lbl_userInfoUs1;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JTable tbl_CanaisAtivos;
    private javax.swing.JTextField txt_Busca;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Senha;
    private javax.swing.JTextField txt_Token;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
