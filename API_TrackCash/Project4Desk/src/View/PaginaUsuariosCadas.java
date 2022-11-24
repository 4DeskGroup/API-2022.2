package View;

import Controller.Table;
import Controller.VerificarAcesso;
import connection.PesqUser;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import model.bean.Usuario;

public class PaginaUsuariosCadas extends javax.swing.JFrame {

    private PesqUser DAO;
    private Table table;
    private static Usuario user;

    public PaginaUsuariosCadas(Usuario u) {
        this.user = u;
        initComponents();
        try {
            DAO = new PesqUser(u);
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
        btn_ConfigADM = new javax.swing.JButton();
        btn_CadastrarCanal = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        cmb_Campo = new javax.swing.JComboBox<>();
        lbl_filtros2 = new javax.swing.JLabel();
        lbl_filtros3 = new javax.swing.JLabel();
        cmb_Ordem = new javax.swing.JComboBox<>();
        jLabel_filtros = new javax.swing.JLabel();
        lbl_filtros1 = new javax.swing.JLabel();
        txt_Busca = new javax.swing.JFormattedTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_user = new javax.swing.JTable();
        btn_EditarUsuario = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        btn_Atualizar = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        cbx_pag = new javax.swing.JComboBox<>();
        next = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Canal");
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
        jPanel2.setLayout(null);

        lbl_NomeUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_NomeUser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lbl_NomeUser);
        lbl_NomeUser.setBounds(4, 5, 219, 30);

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
        jPanel2.add(btn_SairLogout);
        btn_SairLogout.setBounds(332, 40, 144, 40);

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
        jPanel2.add(btn_EditarPerfil);
        btn_EditarPerfil.setBounds(24, 40, 144, 40);

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
        jPanel2.add(btn_Ajuda);
        btn_Ajuda.setBounds(178, 40, 144, 40);

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
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Cadastro_de_Usuario_2D124B.png"))); // NOI18N
        jLabel6.setText("  Cadastro de Usuário");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 60);
        jPanel6.add(jLabel6, gridBagConstraints);

        jPanel5.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(132, 132, 132));
        jPanel7.setMinimumSize(new java.awt.Dimension(700, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(700, 100));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        btn_ConfigADM.setBackground(new java.awt.Color(51, 51, 51));
        btn_ConfigADM.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btn_ConfigADM.setForeground(new java.awt.Color(255, 255, 255));
        btn_ConfigADM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Canais_Ativos_ADM_FFFFFF.png"))); // NOI18N
        btn_ConfigADM.setText("Canais Ativos ADM");
        btn_ConfigADM.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_ConfigADM.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_ConfigADM.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_ConfigADM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ConfigADMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ConfigADMMouseExited(evt);
            }
        });
        btn_ConfigADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfigADMActionPerformed(evt);
            }
        });
        btn_ConfigADM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_ConfigADMKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 370, 10, 0);
        jPanel7.add(btn_ConfigADM, gridBagConstraints);

        btn_CadastrarCanal.setBackground(new java.awt.Color(51, 51, 51));
        btn_CadastrarCanal.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        btn_CadastrarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Configuracao_de_Canal_FFFFFF.png"))); // NOI18N
        btn_CadastrarCanal.setText("Configuração de Canal");
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 20);
        jPanel7.add(btn_CadastrarCanal, gridBagConstraints);

        jPanel5.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(87, 65, 111));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Copyright 2022 - 4Desk Group Company® - Versão 4.0.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 410, 30, 410);
        jPanel9.add(jLabel3, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        jPanel10.setPreferredSize(new java.awt.Dimension(960, 105));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setPreferredSize(new java.awt.Dimension(1200, 120));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Usuário"));
        jPanel12.setMinimumSize(new java.awt.Dimension(1200, 120));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(241, 241, 241));
        jPanel13.setPreferredSize(new java.awt.Dimension(0, 100));
        jPanel13.setLayout(new java.awt.GridBagLayout());

        cmb_Campo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_Campo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Nome", "Sobrenome", "Email", "Senha", "Status", "Perfil" }));
        cmb_Campo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmb_Campo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                cmb_CampoComponentHidden(evt);
            }
        });
        cmb_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CampoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 200, 25, 0);
        jPanel13.add(cmb_Campo, gridBagConstraints);

        lbl_filtros2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_filtros2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros2.setText("Campo de busca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 200, 0, 0);
        jPanel13.add(lbl_filtros2, gridBagConstraints);

        lbl_filtros3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_filtros3.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros3.setText("Ordem");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 50, 0, 0);
        jPanel13.add(lbl_filtros3, gridBagConstraints);

        cmb_Ordem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_Ordem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crescente", "Decrescente" }));
        cmb_Ordem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmb_Ordem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_OrdemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 50, 25, 0);
        jPanel13.add(cmb_Ordem, gridBagConstraints);

        jLabel_filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/lupa (4).png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 100, 0, 0);
        jPanel13.add(jLabel_filtros, gridBagConstraints);

        lbl_filtros1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_filtros1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros1.setText("Busca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        jPanel13.add(lbl_filtros1, gridBagConstraints);

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
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 286;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 100, 25, 190);
        jPanel13.add(txt_Busca, gridBagConstraints);

        jPanel12.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel11.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel15.setMinimumSize(new java.awt.Dimension(1200, 310));
        jPanel15.setPreferredSize(new java.awt.Dimension(1200, 310));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Canais"));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel17.setMinimumSize(new java.awt.Dimension(1200, 220));
        jPanel17.setPreferredSize(new java.awt.Dimension(1200, 220));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(241, 241, 241));
        jPanel18.setMinimumSize(new java.awt.Dimension(1200, 223));
        jPanel18.setLayout(new java.awt.GridBagLayout());

        tbl_user.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Usuario", "Nome", "Sobrenome", "Email", "Senha", "Status", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_user.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl_userAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tbl_user);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 984;
        gridBagConstraints.ipady = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 25, 0);
        jPanel18.add(jScrollPane2, gridBagConstraints);

        btn_EditarUsuario.setBackground(new java.awt.Color(45, 18, 75));
        btn_EditarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_EditarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditarUsuario.setText("Editar");
        btn_EditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarUsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 35, 0, 40);
        jPanel18.add(btn_EditarUsuario, gridBagConstraints);

        jPanel17.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel19.setMinimumSize(new java.awt.Dimension(1200, 60));
        jPanel19.setPreferredSize(new java.awt.Dimension(1200, 60));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel20.setBackground(new java.awt.Color(241, 241, 241));
        jPanel20.setLayout(new java.awt.GridBagLayout());

        btn_Atualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Atualizar.setText("Atualizar Tabela");
        btn_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 320, 25, 0);
        jPanel20.add(btn_Atualizar, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(12, 30, 25, 0);
        jPanel20.add(prev, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 25, 0);
        jPanel20.add(cbx_pag, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 25, 0);
        jPanel20.add(next, gridBagConstraints);

        btn_Excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 30, 25, 310);
        jPanel20.add(btn_Excluir, gridBagConstraints);

        jPanel19.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel10.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        boolean vf = new VerificarAcesso().isADM(user);
        btn_ConfigADM.setVisible(vf);
        btn_CadastrarCanal.setVisible(!vf);

        this.table.updateCBX(tbl_user, user, cbx_pag);
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

    private void cmb_CampoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cmb_CampoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_CampoComponentHidden

    private void cmb_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CampoActionPerformed

        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();

        this.table.filtroBuscaConta(tbl_user, busca, campo, ordem, DAO, user);

    }//GEN-LAST:event_cmb_CampoActionPerformed

    private void cmb_OrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_OrdemActionPerformed

        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();

        this.table.filtroBuscaConta(tbl_user, busca, campo, ordem, DAO, user);

    }//GEN-LAST:event_cmb_OrdemActionPerformed

    private void txt_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscaActionPerformed
        /* */
    }//GEN-LAST:event_txt_BuscaActionPerformed

    private void txt_BuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscaKeyReleased

        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();

        this.table.filtroBuscaConta(tbl_user, busca, campo, ordem, DAO, user);
    }//GEN-LAST:event_txt_BuscaKeyReleased

    private void btn_ConfigADMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConfigADMMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ConfigADMMouseEntered

    private void btn_ConfigADMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConfigADMMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ConfigADMMouseExited

    private void btn_ConfigADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfigADMActionPerformed
        // TODO add your handling code here:
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            PaginaCadastrosAtivosAdm paginaCadastrosAtivosAdm = new PaginaCadastrosAtivosAdm(user);
            paginaCadastrosAtivosAdm.setExtendedState(Frame.MAXIMIZED_BOTH);
            paginaCadastrosAtivosAdm.setVisible(true);
            this.dispose();
        } else {
            PaginaCadastrosAtivosAdm paginaCadastrosAtivosAdm = new PaginaCadastrosAtivosAdm(user);
            paginaCadastrosAtivosAdm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_ConfigADMActionPerformed

    private void btn_ConfigADMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_ConfigADMKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ConfigADMKeyPressed

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
            PaginaConfiguracaoCanal paginaCadastroInfo = new PaginaConfiguracaoCanal(user);
            paginaCadastroInfo.setExtendedState(Frame.MAXIMIZED_BOTH);
            paginaCadastroInfo.setVisible(true);
            this.dispose();
        } else {
            PaginaConfiguracaoCanal paginaCadastroInfo = new PaginaConfiguracaoCanal(user);
            paginaCadastroInfo.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_CadastrarCanalActionPerformed

    private void btn_CadastrarCanalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CadastrarCanalKeyPressed

    private void tbl_userAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl_userAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_userAncestorAdded

    private void btn_EditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarUsuarioActionPerformed

        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            PaginaEditarUser paginaAberta = new PaginaEditarUser(user);
            paginaAberta.setExtendedState(Frame.MAXIMIZED_BOTH);
            paginaAberta.setVisible(true);
            this.dispose();
        } else {
            PaginaEditarUser paginaAberta = new PaginaEditarUser(user);
            paginaAberta.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_EditarUsuarioActionPerformed

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed

        this.table.updateCBX(tbl_user, user, cmb_Campo);
    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed

    }//GEN-LAST:event_prevActionPerformed

    private void cbx_pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_pagActionPerformed

    }//GEN-LAST:event_cbx_pagActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

    }//GEN-LAST:event_nextActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed

        this.table.excluirConta(tbl_user, user, cbx_pag);
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaUsuariosCadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaUsuariosCadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaUsuariosCadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaUsuariosCadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaUsuariosCadas(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ajuda;
    private javax.swing.JButton btn_Atualizar;
    private javax.swing.JButton btn_CadastrarCanal;
    private javax.swing.JButton btn_ConfigADM;
    private javax.swing.JButton btn_EditarPerfil;
    private javax.swing.JButton btn_EditarUsuario;
    private javax.swing.JToggleButton btn_Excluir;
    private javax.swing.JButton btn_SairLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_pag;
    private javax.swing.JComboBox<String> cmb_Campo;
    private javax.swing.JComboBox<String> cmb_Ordem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_NomeUser;
    private javax.swing.JLabel lbl_filtros1;
    private javax.swing.JLabel lbl_filtros2;
    private javax.swing.JLabel lbl_filtros3;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JTable tbl_user;
    private javax.swing.JFormattedTextField txt_Busca;
    // End of variables declaration//GEN-END:variables
}
