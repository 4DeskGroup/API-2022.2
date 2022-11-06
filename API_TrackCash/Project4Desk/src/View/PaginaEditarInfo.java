package View;

import Controller.Dados;
import Controller.Table;
import connection.PesqCanal;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class PaginaEditarInfo extends javax.swing.JFrame {

    private PesqCanal DAO;
    private static Usuario user;

    public PaginaEditarInfo(Usuario u) {
        this.user = u;
        initComponents();
        try {
            DAO = new PesqCanal(u);
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
        btn_CadastrarCanal = new javax.swing.JButton();
        btn_SairLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_NomeUser = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_confAtivas1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_canalInfoUs1 = new javax.swing.JLabel();
        lbl_canalE = new javax.swing.JLabel();
        lbl_idContaInfoUs2 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        txt_Usuario = new javax.swing.JTextField();
        lbl_userInfoUs1 = new javax.swing.JLabel();
        lbl_senhaInfoUs = new javax.swing.JLabel();
        txt_Senha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_Token = new javax.swing.JTextField();
        btn_AtualizarDados = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lbl_canaisAtivo = new javax.swing.JLabel();
        lbl_filtros = new javax.swing.JLabel();
        txt_Busca = new javax.swing.JFormattedTextField();
        jLabel_filtros = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_CanaisAtivos = new javax.swing.JTable();
        btn_Excluir = new javax.swing.JButton();
        btn_CarregarCampos = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edição de Informações");
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

        btn_CadastrarCanal.setBackground(new java.awt.Color(45, 18, 75));
        btn_CadastrarCanal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_CadastrarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal.setText("Canais Ativos");
        btn_CadastrarCanal.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_CadastrarCanal.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_CadastrarCanal.setPreferredSize(new java.awt.Dimension(144, 31));
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
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 270, 20, 0);
        jPanel2.add(btn_CadastrarCanal, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 20, 50);
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
        lbl_confAtivas1.setText("Edição de Informações");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 230, 9, 233);
        jPanel5.add(lbl_confAtivas1, gridBagConstraints);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel7.setLayout(null);

        lbl_canalInfoUs1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canalInfoUs1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_canalInfoUs1.setText("Canal");
        jPanel7.add(lbl_canalInfoUs1);
        lbl_canalInfoUs1.setBounds(70, 10, 47, 25);

        lbl_canalE.setBackground(new java.awt.Color(204, 204, 204));
        lbl_canalE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canalE.setForeground(new java.awt.Color(45, 18, 75));
        jPanel7.add(lbl_canalE);
        lbl_canalE.setBounds(140, 10, 160, 20);

        lbl_idContaInfoUs2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_idContaInfoUs2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_idContaInfoUs2.setText("ID da Conta");
        jPanel7.add(lbl_idContaInfoUs2);
        lbl_idContaInfoUs2.setBounds(470, 10, 100, 25);

        txt_ID.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });
        jPanel7.add(txt_ID);
        txt_ID.setBounds(470, 50, 240, 36);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(241, 241, 241));
        jPanel18.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel18.setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.ipadx = 186;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        jPanel18.add(txt_Usuario, gridBagConstraints);

        lbl_userInfoUs1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_userInfoUs1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_userInfoUs1.setText("Usuário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel18.add(lbl_userInfoUs1, gridBagConstraints);

        lbl_senhaInfoUs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_senhaInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_senhaInfoUs.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel18.add(lbl_senhaInfoUs, gridBagConstraints);

        txt_Senha.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel18.add(txt_Senha, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 18, 75));
        jLabel1.setText("Token");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel18.add(jLabel1, gridBagConstraints);

        txt_Token.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel18.add(txt_Token, gridBagConstraints);

        btn_AtualizarDados.setText("Atualizar informações");
        btn_AtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarDadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 10, 20);
        jPanel18.add(btn_AtualizarDados, gridBagConstraints);

        jPanel8.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(241, 241, 241));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(241, 241, 241));
        jPanel12.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel12.setLayout(new java.awt.GridBagLayout());

        lbl_canaisAtivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canaisAtivo.setForeground(new java.awt.Color(45, 18, 75));
        lbl_canaisAtivo.setText("Canais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 90, 0, 0);
        jPanel12.add(lbl_canaisAtivo, gridBagConstraints);

        lbl_filtros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_filtros.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros.setText("Filtros");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 305, 0, 0);
        jPanel12.add(lbl_filtros, gridBagConstraints);

        txt_Busca.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
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
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 18, 4, 0);
        jPanel12.add(txt_Busca, gridBagConstraints);

        jLabel_filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons8-pesquisar-30.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 90);
        jPanel12.add(jLabel_filtros, gridBagConstraints);

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(241, 241, 241));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel22.setBackground(new java.awt.Color(241, 241, 241));
        jPanel22.setMinimumSize(new java.awt.Dimension(950, 200));
        jPanel22.setPreferredSize(new java.awt.Dimension(100, 250));
        jPanel22.setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.ipadx = 714;
        gridBagConstraints.ipady = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 50, 0);
        jPanel22.add(jScrollPane2, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(40, 30, 0, 30);
        jPanel22.add(btn_Excluir, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(17, 30, 0, 30);
        jPanel22.add(btn_CarregarCampos, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(17, 30, 0, 30);
        jPanel22.add(btn_Limpar, gridBagConstraints);

        jPanel13.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Table.carregarTableCanal(tbl_CanaisAtivos, user);

        lbl_NomeUser.setText("Olá, " + user.getNome());

    }//GEN-LAST:event_formWindowOpened

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

    }//GEN-LAST:event_btn_SairLogoutActionPerformed

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

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

    private void txt_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscaActionPerformed

    private void txt_BuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscaKeyReleased

        String busca = txt_Busca.getText();
        String campo = "Empresa";
        String ordem = "asc";

        Table.filtroBuscaCanal(tbl_CanaisAtivos, busca, campo, ordem, DAO);

    }//GEN-LAST:event_txt_BuscaKeyReleased

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed

        Table.excluirCanal(tbl_CanaisAtivos, user);

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

    private void btn_CadastrarCanalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_F6) || (evt.getKeyCode() == KeyEvent.VK_6)) {
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

        }

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
    }//GEN-LAST:event_btn_CadastrarCanalKeyPressed

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
    private javax.swing.JButton btn_AtualizarDados;
    private javax.swing.JButton btn_CadastrarCanal;
    private javax.swing.JButton btn_CarregarCampos;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_SairLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_filtros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_NomeUser;
    private javax.swing.JLabel lbl_canaisAtivo;
    private javax.swing.JLabel lbl_canalE;
    private javax.swing.JLabel lbl_canalInfoUs1;
    private javax.swing.JLabel lbl_confAtivas1;
    private javax.swing.JLabel lbl_filtros;
    private javax.swing.JLabel lbl_idContaInfoUs2;
    private javax.swing.JLabel lbl_senhaInfoUs;
    private javax.swing.JLabel lbl_userInfoUs1;
    private javax.swing.JTable tbl_CanaisAtivos;
    private javax.swing.JFormattedTextField txt_Busca;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Senha;
    private javax.swing.JTextField txt_Token;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
