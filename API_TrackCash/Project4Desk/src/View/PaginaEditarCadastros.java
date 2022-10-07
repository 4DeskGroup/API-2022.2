package View;

import javax.swing.table.DefaultTableModel;
import connection.ConnectionFactory;
import connection.PesqCanal;
import java.awt.Dimension;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DTO.CanalDTO;

import model.bean.Canal;
import model.bean.Usuario;
import model.dao.CanalConfigDAO;
import model.dao.CanalDAO;

public class PaginaEditarCadastros extends javax.swing.JFrame {

    PesqCanal DAO;

    private static Usuario user;

    public PaginaEditarCadastros(Usuario u) {
        this.user = u;
        initComponents();
        try {
            DAO = new PesqCanal(u);
        } catch (Exception e) {

        }
        //restaurarDadosComboBoxCargo();
        //restaurarDadosComboBoxCargo2();
    }

    public void readJTable() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_LogoTelaPrincipal = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btn_CadastrarCanal = new javax.swing.JButton();
        btn_SairLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_confAtivas1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbl_canalInfoUs1 = new javax.swing.JLabel();
        lbl_canalE = new javax.swing.JLabel();
        lbl_idContaInfoUs2 = new javax.swing.JLabel();
        txt_idCadasInfoUs = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        txt_userInfoUs = new javax.swing.JTextField();
        lbl_userInfoUs1 = new javax.swing.JLabel();
        lbl_senhaInfoUs = new javax.swing.JLabel();
        txt_senhaInfoUs = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_tokenCanalInfo = new javax.swing.JTextField();
        btnAtualizarDados = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_idContaInfoUs1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lbl_canaisAtivo = new javax.swing.JLabel();
        lbl_filtros = new javax.swing.JLabel();
        txt_filtros = new javax.swing.JFormattedTextField();
        jLabel_filtros = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_canaisAtivos1 = new javax.swing.JTable();
        btn_excluir2 = new javax.swing.JButton();
        btnCarregarCampos = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurações Ativas");
        setMinimumSize(new java.awt.Dimension(850, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 62, 21));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 62, 21));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel_LogoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Untitled-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 50, 27, 67);
        jPanel3.add(jLabel_LogoTelaPrincipal, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel16.setBackground(new java.awt.Color(255, 62, 21));
        jPanel16.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel16.setLayout(new java.awt.GridBagLayout());

        btn_CadastrarCanal.setBackground(new java.awt.Color(45, 18, 75));
        btn_CadastrarCanal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_CadastrarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal.setText("Canais Ativos");
        btn_CadastrarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 40, 0, 30);
        jPanel16.add(btn_CadastrarCanal, gridBagConstraints);

        btn_SairLogout.setBackground(new java.awt.Color(204, 204, 204));
        btn_SairLogout.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_SairLogout.setText("Sair");
        btn_SairLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairLogoutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 40, 52, 30);
        jPanel16.add(btn_SairLogout, gridBagConstraints);

        jPanel1.add(jPanel16, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setMinimumSize(new java.awt.Dimension(850, 630));
        jPanel2.setPreferredSize(new java.awt.Dimension(950, 630));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        lbl_confAtivas1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbl_confAtivas1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_confAtivas1.setText("Edição de Configurações de Canais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 230, 9, 233);
        jPanel4.add(lbl_confAtivas1, gridBagConstraints);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        lbl_canalInfoUs1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canalInfoUs1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_canalInfoUs1.setText("Canal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 0);
        jPanel6.add(lbl_canalInfoUs1, gridBagConstraints);

        lbl_canalE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canalE.setForeground(new java.awt.Color(45, 18, 75));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 70, 0, 0);
        jPanel6.add(lbl_canalE, gridBagConstraints);

        lbl_idContaInfoUs2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_idContaInfoUs2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_idContaInfoUs2.setText("ID da Conta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 0, 0);
        jPanel6.add(lbl_idContaInfoUs2, gridBagConstraints);

        txt_idCadasInfoUs.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_idCadasInfoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idCadasInfoUsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 240, 14, 240);
        jPanel6.add(txt_idCadasInfoUs, gridBagConstraints);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(241, 241, 241));
        jPanel18.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel18.setLayout(new java.awt.GridBagLayout());

        txt_userInfoUs.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_userInfoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userInfoUsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 186;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        jPanel18.add(txt_userInfoUs, gridBagConstraints);

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

        txt_senhaInfoUs.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_senhaInfoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senhaInfoUsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel18.add(txt_senhaInfoUs, gridBagConstraints);

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

        txt_tokenCanalInfo.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_tokenCanalInfo.setToolTipText("");
        txt_tokenCanalInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tokenCanalInfoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel18.add(txt_tokenCanalInfo, gridBagConstraints);

        btnAtualizarDados.setText("Atualizar informações");
        btnAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarDadosActionPerformed(evt);
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
        jPanel18.add(btnAtualizarDados, gridBagConstraints);

        jPanel8.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        lbl_idContaInfoUs1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_idContaInfoUs1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_idContaInfoUs1.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 0, 0);
        jPanel9.add(lbl_idContaInfoUs1, gridBagConstraints);

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 91, 10, 640);
        jPanel9.add(txtCodigo, gridBagConstraints);

        jPanel7.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(241, 241, 241));
        jPanel11.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        lbl_canaisAtivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canaisAtivo.setForeground(new java.awt.Color(45, 18, 75));
        lbl_canaisAtivo.setText("Canais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 90, 0, 0);
        jPanel11.add(lbl_canaisAtivo, gridBagConstraints);

        lbl_filtros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_filtros.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros.setText("Filtros");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 305, 0, 0);
        jPanel11.add(lbl_filtros, gridBagConstraints);

        txt_filtros.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_filtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtrosActionPerformed(evt);
            }
        });
        txt_filtros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtrosKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 18, 4, 0);
        jPanel11.add(txt_filtros, gridBagConstraints);

        jLabel_filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons8-pesquisar-30.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 90);
        jPanel11.add(jLabel_filtros, gridBagConstraints);

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(241, 241, 241));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel22.setBackground(new java.awt.Color(241, 241, 241));
        jPanel22.setMinimumSize(new java.awt.Dimension(950, 200));
        jPanel22.setPreferredSize(new java.awt.Dimension(100, 250));
        jPanel22.setLayout(new java.awt.GridBagLayout());

        jTable_canaisAtivos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Empresa", "ContaID", "Login", "Senha", "Token"
            }
        ));
        jScrollPane2.setViewportView(jTable_canaisAtivos1);

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

        btn_excluir2.setText("Excluir");
        btn_excluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 30, 0, 30);
        jPanel22.add(btn_excluir2, gridBagConstraints);

        btnCarregarCampos.setText("Carregar Campos");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 30, 0, 30);
        jPanel22.add(btnCarregarCampos, gridBagConstraints);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 30, 0, 30);
        jPanel22.add(btnLimpar, gridBagConstraints);

        jPanel12.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jPanel10.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivos1.getModel();
        modelo.setNumRows(0);

        try {

            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;

            stmt = con.prepareStatement("SELECT id_Canal, Empresa_Config, Contaid_Canal, Login_Canal, Senha_Canal, Token_Canal FROM tbl_Canal JOIN tbl_Config "
                    + "WHERE tbl_Canal.Usuario_pertencente = " + user.getId() + " AND  id_Config = Config_pertencente GROUP BY id_Canal");
            rs = stmt.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
                });

            }
            ConnectionFactory.closeConnection(con, stmt, rs);

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_formWindowOpened

    private void btn_CadastrarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalActionPerformed
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
        //new PaginaCadastrosAtivos(user).setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btn_CadastrarCanalActionPerformed

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
        // new TelaPrincipal().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btn_SairLogoutActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txt_userInfoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userInfoUsActionPerformed
        // TODO add your handling code here:
        if (txt_tokenCanalInfo.getText() != "") {
            txt_userInfoUs.setEditable(false);
        }
    }//GEN-LAST:event_txt_userInfoUsActionPerformed

    private void txt_senhaInfoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaInfoUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senhaInfoUsActionPerformed

    private void txt_tokenCanalInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tokenCanalInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tokenCanalInfoActionPerformed

    private void btnAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarDadosActionPerformed
        AlterarDados();
        try {
            listarDados();
        } catch (SQLException ex) {
            Logger.getLogger(PaginaEditarCadastros.class.getName()).log(Level.SEVERE, null, ex);
        }
        LimparCampos();
        try {
            listarDados();
        } catch (SQLException ex) {
            Logger.getLogger(PaginaEditarCadastros.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_userInfoUs.setEditable(true);
        txt_senhaInfoUs.setEditable(true);
        txt_tokenCanalInfo.setEditable(true);
    }//GEN-LAST:event_btnAtualizarDadosActionPerformed

    private void txt_filtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtrosActionPerformed

    private void txt_filtrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtrosKeyReleased

        try {
            Vector cabecalho = new Vector();
            cabecalho.add("id_Canal");
            cabecalho.add("Empresa");
            cabecalho.add("Contaid");
            cabecalho.add("Login");
            cabecalho.add("Senha");
            cabecalho.add("Token");
            if (!txt_filtros.getText().equals("")) {

                DefaultTableModel nv = new DefaultTableModel(DAO.Pesquisar(txt_filtros.getText(), user.getUser()), cabecalho);
                jTable_canaisAtivos1.setModel(nv);

            } else {
                DefaultTableModel nv = new DefaultTableModel(new Vector(), cabecalho);
                jTable_canaisAtivos1.setModel(nv);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao Pesquisar: " + ex.getMessage());
        }
    }//GEN-LAST:event_txt_filtrosKeyReleased

    private void btn_excluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir2ActionPerformed

        Object indice = jTable_canaisAtivos1.getValueAt(jTable_canaisAtivos1.getSelectedRow(), 0);
        String indiceS = indice.toString();
        if (jTable_canaisAtivos1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um canal para excluir!");
        } else {

            DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivos1.getModel();
            modelo.removeRow(jTable_canaisAtivos1.getSelectedRow());

            Canal p = new Canal();
            CanalDAO dao = new CanalDAO();

            int i = new CanalDAO().searchIdCanal(indiceS);
            JOptionPane.showMessageDialog(null, i);
            int fk = new CanalConfigDAO().buscarConfigReturnId(indiceS);

            dao.delete(i, fk);

        }
    }//GEN-LAST:event_btn_excluir2ActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        
        int setar = jTable_canaisAtivos1.getSelectedRow();
        
        carregarCampos(setar);
        
        if (!txt_userInfoUs.getText().equals("")) {
            txt_tokenCanalInfo.setEditable(false);
        } else if (!txt_tokenCanalInfo.getText().equals("")) {
            txt_userInfoUs.setEditable(false);
            txt_senhaInfoUs.setEditable(false);
        }
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txt_idCadasInfoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idCadasInfoUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idCadasInfoUsActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaEditarCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaEditarCadastros(user).setVisible(true);
            }
        });
    }
    Vector<Integer> idCanais = new Vector<Integer>();

    private void carregarCampos(int linha) {
        
        if(jTable_canaisAtivos1.getModel().getValueAt(linha, 5).toString().equals("Sem Token")){
            txt_tokenCanalInfo.setText("Sem Token");
            txt_userInfoUs.setText(jTable_canaisAtivos1.getModel().getValueAt(linha, 3).toString());
            txt_senhaInfoUs.setText(jTable_canaisAtivos1.getModel().getValueAt(linha, 4).toString());
            txt_tokenCanalInfo.setEnabled(false);
            txt_userInfoUs.setEnabled(true);
            txt_senhaInfoUs.setEnabled(true);
        }else{
            txt_tokenCanalInfo.setText(jTable_canaisAtivos1.getModel().getValueAt(linha, 5).toString());
            txt_userInfoUs.setText("Sem Usuario");
            txt_senhaInfoUs.setText("Sem Senha");
            txt_tokenCanalInfo.setEnabled(true);
            txt_userInfoUs.setEnabled(false);
            txt_senhaInfoUs.setEnabled(false);
        }
        txtCodigo.setText(jTable_canaisAtivos1.getModel().getValueAt(linha, 0).toString());
        txt_idCadasInfoUs.setText(jTable_canaisAtivos1.getModel().getValueAt(linha, 2).toString());
        lbl_canalE.setText(jTable_canaisAtivos1.getModel().getValueAt(linha, 1).toString());
        txt_tokenCanalInfo.setText(jTable_canaisAtivos1.getModel().getValueAt(linha, 5).toString());

    }

    private void listarDados() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivos1.getModel();
        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;

            stmt = con.prepareStatement("SELECT tbl_Canal.id_Canal, tbl_Config.Empresa_Config, tbl_Canal.Contaid_Canal, tbl_Canal.Login_Canal, tbl_Canal.Senha_Canal, tbl_Canal.Token_Canal FROM tbl_Canal JOIN tbl_Config WHERE Usuario_pertencente = " + '"' + user.getId() + '"' + " AND  id_Config = Config_pertencente");
            rs = stmt.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
                });
            }
            ConnectionFactory.closeConnection(con, stmt, rs);

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LimparCampos() {
        
        txtCodigo.setText("");
        lbl_canalE.setText("");
        txt_idCadasInfoUs.setText("");
        txt_userInfoUs.setText("");
        txt_senhaInfoUs.setText("");
        txt_tokenCanalInfo.setText("");

    }

    private void AlterarDados() {

        CanalDTO objcanalinfo = new CanalDTO();

        int id_canal;
        String login, senha, token, conta_id, empresa;

        conta_id = txt_idCadasInfoUs.getText();
        login = txt_userInfoUs.getText();
        senha = txt_senhaInfoUs.getText();
        token = txt_tokenCanalInfo.getText();
        empresa = lbl_canalE.getText();
        
        int i = new CanalDAO().searchIdCanal(empresa);
        
        objcanalinfo.setContaid(conta_id);
        objcanalinfo.setLogin(login);
        objcanalinfo.setSenha(senha);
        objcanalinfo.setToken(token);


        CanalDAO objcanaldao = new CanalDAO();
        objcanaldao.alterarDados(objcanalinfo, i);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarDados;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btn_CadastrarCanal;
    private javax.swing.JButton btn_SairLogout;
    private javax.swing.JButton btn_excluir2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_LogoTelaPrincipal;
    private javax.swing.JLabel jLabel_filtros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel16;
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
    private javax.swing.JTable jTable_canaisAtivos1;
    private javax.swing.JLabel lbl_canaisAtivo;
    private javax.swing.JLabel lbl_canalE;
    private javax.swing.JLabel lbl_canalInfoUs1;
    private javax.swing.JLabel lbl_confAtivas1;
    private javax.swing.JLabel lbl_filtros;
    private javax.swing.JLabel lbl_idContaInfoUs1;
    private javax.swing.JLabel lbl_idContaInfoUs2;
    private javax.swing.JLabel lbl_senhaInfoUs;
    private javax.swing.JLabel lbl_userInfoUs1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txt_filtros;
    private javax.swing.JTextField txt_idCadasInfoUs;
    private javax.swing.JTextField txt_senhaInfoUs;
    private javax.swing.JTextField txt_tokenCanalInfo;
    private javax.swing.JTextField txt_userInfoUs;
    // End of variables declaration//GEN-END:variables
}
