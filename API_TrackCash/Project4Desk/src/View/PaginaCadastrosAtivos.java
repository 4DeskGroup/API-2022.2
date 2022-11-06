package View;

import Controller.Table;
import Controller.VerificarAcesso;
import connection.ConnectionFactory;
import javax.swing.table.DefaultTableModel;
import connection.PesqCanal;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class PaginaCadastrosAtivos extends javax.swing.JFrame {

    int numpag = 0; //pagination
    int offset = 0; //pagination
    int limite = 10;//pagination
    int nump = 0;

    private PesqCanal DAO;
    private static Usuario user;

    public PaginaCadastrosAtivos(Usuario u) {
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
        btn_configADM = new javax.swing.JButton();
        btn_CadastrarCanal = new javax.swing.JButton();
        btn_SairLogout = new javax.swing.JButton();
        btn_EditarCanal = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_NomeUser = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_4dGroupCadas = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_companyCadas = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_confAtivas1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        cmb_Campo = new javax.swing.JComboBox<>();
        lbl_filtros2 = new javax.swing.JLabel();
        lbl_filtros3 = new javax.swing.JLabel();
        cmb_Ordem = new javax.swing.JComboBox<>();
        jLabel_filtros = new javax.swing.JLabel();
        lbl_filtros1 = new javax.swing.JLabel();
        txt_Busca = new javax.swing.JFormattedTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lbl_canaisAtivo = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_canaisAtivos1 = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        btn_Atualizar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JToggleButton();
        prev = new javax.swing.JButton();
        cbx_pag = new javax.swing.JComboBox<>();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurações Ativas");
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 62, 21));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 80));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 62, 21));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 80));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btn_configADM.setBackground(new java.awt.Color(45, 18, 75));
        btn_configADM.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_configADM.setForeground(new java.awt.Color(255, 255, 255));
        btn_configADM.setText("Config. ADM");
        btn_configADM.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_configADM.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_configADM.setPreferredSize(new java.awt.Dimension(144, 31));
        btn_configADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configADMActionPerformed(evt);
            }
        });
        btn_configADM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_configADMKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 0);
        jPanel2.add(btn_configADM, gridBagConstraints);

        btn_CadastrarCanal.setBackground(new java.awt.Color(45, 18, 75));
        btn_CadastrarCanal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_CadastrarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal.setText("Cad. Canal");
        btn_CadastrarCanal.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_CadastrarCanal.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_CadastrarCanal.setPreferredSize(new java.awt.Dimension(144, 31));
        btn_CadastrarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 20, 0);
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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 20, 30);
        jPanel2.add(btn_SairLogout, gridBagConstraints);

        btn_EditarCanal.setBackground(new java.awt.Color(45, 18, 75));
        btn_EditarCanal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_EditarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditarCanal.setText("Editar");
        btn_EditarCanal.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_EditarCanal.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_EditarCanal.setPreferredSize(new java.awt.Dimension(144, 31));
        btn_EditarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarCanalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 20, 0);
        jPanel2.add(btn_EditarCanal, gridBagConstraints);

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

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lbl_4dGroupCadas.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        lbl_4dGroupCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_4dGroupCadas.setText("4D Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 316, 13, 317);
        jPanel5.add(lbl_4dGroupCadas, gridBagConstraints);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setPreferredSize(new java.awt.Dimension(950, 30));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        lbl_companyCadas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_companyCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_companyCadas.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 424, 10, 424);
        jPanel7.add(lbl_companyCadas, gridBagConstraints);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setPreferredSize(new java.awt.Dimension(979, 40));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        lbl_confAtivas1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbl_confAtivas1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_confAtivas1.setText("Configurações Ativas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 341, 5, 341);
        jPanel9.add(lbl_confAtivas1, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(241, 241, 241));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        cmb_Campo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_Campo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empresa", "ContaID", "Login", "Senha", "Token" }));
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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 82, 0, 0);
        jPanel11.add(cmb_Campo, gridBagConstraints);

        lbl_filtros2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_filtros2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros2.setText("Campo de busca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 82, 0, 0);
        jPanel11.add(lbl_filtros2, gridBagConstraints);

        lbl_filtros3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_filtros3.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros3.setText("Ordem");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 27, 0, 0);
        jPanel11.add(lbl_filtros3, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 27, 0, 0);
        jPanel11.add(cmb_Ordem, gridBagConstraints);

        jLabel_filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons8-pesquisar-30.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 132, 0, 0);
        jPanel11.add(jLabel_filtros, gridBagConstraints);

        lbl_filtros1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_filtros1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros1.setText("Busca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel11.add(lbl_filtros1, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 286;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 132, 0, 52);
        jPanel11.add(txt_Busca, gridBagConstraints);

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(241, 241, 241));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(241, 241, 241));
        jPanel13.setLayout(new java.awt.GridBagLayout());

        lbl_canaisAtivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canaisAtivo.setForeground(new java.awt.Color(45, 18, 75));
        lbl_canaisAtivo.setText("Canais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 86, 9, 809);
        jPanel13.add(lbl_canaisAtivo, gridBagConstraints);

        jPanel12.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBackground(new java.awt.Color(241, 241, 241));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(241, 241, 241));
        jPanel15.setPreferredSize(new java.awt.Dimension(950, 200));
        jPanel15.setLayout(new java.awt.GridBagLayout());

        jTable_canaisAtivos1.setModel(new javax.swing.table.DefaultTableModel(
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
        ));
        jTable_canaisAtivos1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable_canaisAtivos1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTable_canaisAtivos1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 714;
        gridBagConstraints.ipady = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 110, 10, 110);
        jPanel15.add(jScrollPane2, gridBagConstraints);

        jPanel14.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel16.setBackground(new java.awt.Color(241, 241, 241));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(241, 241, 241));
        jPanel17.setPreferredSize(new java.awt.Dimension(0, 80));
        jPanel17.setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.insets = new java.awt.Insets(20, 320, 80, 0);
        jPanel17.add(btn_Atualizar, gridBagConstraints);

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
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 40, 80, 350);
        jPanel17.add(btn_Excluir, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 80, 0);
        jPanel17.add(prev, gridBagConstraints);

        cbx_pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_pagActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 80, 0);
        jPanel17.add(cbx_pag, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(20, 8, 80, 0);
        jPanel17.add(next, gridBagConstraints);

        jPanel16.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Mostrar na Tabela
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        addcombopag();

        boolean vf = new VerificarAcesso().isADM(user);

        btn_configADM.setVisible(vf);
        btn_CadastrarCanal.setVisible(!vf);

        Table.carregarTableCanal(jTable_canaisAtivos1, user);
        
        lbl_NomeUser.setText("Olá, " + user.getNome());

    }//GEN-LAST:event_formWindowOpened

    private void cmb_CampoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cmb_CampoComponentHidden

        // TODO add your handling code here:

    }//GEN-LAST:event_cmb_CampoComponentHidden

    private void cmb_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CampoActionPerformed

        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();

        Table.filtroBuscaCanal(jTable_canaisAtivos1, busca, campo, ordem, DAO);

    }//GEN-LAST:event_cmb_CampoActionPerformed

    private void cmb_OrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_OrdemActionPerformed

        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();

        Table.filtroBuscaCanal(jTable_canaisAtivos1, busca, campo, ordem, DAO);

    }//GEN-LAST:event_cmb_OrdemActionPerformed

    private void txt_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscaActionPerformed

        /* */

    }//GEN-LAST:event_txt_BuscaActionPerformed

    private void txt_BuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscaKeyReleased

        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();

        Table.filtroBuscaCanal(jTable_canaisAtivos1, busca, campo, ordem, DAO);

    }//GEN-LAST:event_txt_BuscaKeyReleased

    private void jTable_canaisAtivos1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_canaisAtivos1AncestorAdded

        // TODO add your handling code here:

    }//GEN-LAST:event_jTable_canaisAtivos1AncestorAdded

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed

        Table.carregarTableCanal(jTable_canaisAtivos1, user);

    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        Table.excluirCanal(jTable_canaisAtivos1, user);

    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        prevpag();
    }//GEN-LAST:event_prevActionPerformed

    private void cbx_pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_pagActionPerformed

        cbx_pag();
    }//GEN-LAST:event_cbx_pagActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        nextpag();
    }//GEN-LAST:event_nextActionPerformed

    private void btn_configADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configADMActionPerformed
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
    }//GEN-LAST:event_btn_configADMActionPerformed

    private void btn_CadastrarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalActionPerformed

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

        //this.dispose();
        //new PaginaCadastroConfig(user).setVisible(true);
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
        //new TelaPrincipal().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btn_SairLogoutActionPerformed

    private void btn_EditarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarCanalActionPerformed
        // TODO add your handling code here:
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            PaginaEditarInfo paginaEditarCadastros = new PaginaEditarInfo(user);
            paginaEditarCadastros.setExtendedState(Frame.MAXIMIZED_BOTH);
            paginaEditarCadastros.setVisible(true);
            this.dispose();
        } else {
            PaginaEditarInfo paginaEditarCadastros = new PaginaEditarInfo(user);
            paginaEditarCadastros.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_EditarCanalActionPerformed

    private void btn_configADMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_configADMKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_F6) || (evt.getKeyCode() == KeyEvent.VK_6)) {
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

        }

        if ((evt.getKeyCode() == KeyEvent.VK_F8) || (evt.getKeyCode() == KeyEvent.VK_8)) {
            Dimension telaOriginal = getPreferredSize();
            Dimension telaRecente = getSize();

            int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
            int tamanhoTelaRecente = (int) telaRecente.getWidth();

            if (tamanhoTelaOriginal < tamanhoTelaRecente) {
                PaginaEditarInfo paginaEditarCadastros = new PaginaEditarInfo(user);
                paginaEditarCadastros.setExtendedState(Frame.MAXIMIZED_BOTH);
                paginaEditarCadastros.setVisible(true);
                this.dispose();
            } else {
                PaginaEditarInfo paginaEditarCadastros = new PaginaEditarInfo(user);
                paginaEditarCadastros.setVisible(true);
                this.dispose();
            }

        }

        if ((evt.getKeyCode() == KeyEvent.VK_F9) || (evt.getKeyCode() == KeyEvent.VK_9)) {
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
    }//GEN-LAST:event_btn_configADMKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaCadastrosAtivos(user).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atualizar;
    private javax.swing.JButton btn_CadastrarCanal;
    private javax.swing.JButton btn_EditarCanal;
    private javax.swing.JToggleButton btn_Excluir;
    private javax.swing.JButton btn_SairLogout;
    private javax.swing.JButton btn_configADM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_pag;
    private javax.swing.JComboBox<String> cmb_Campo;
    private javax.swing.JComboBox<String> cmb_Ordem;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_canaisAtivos1;
    private javax.swing.JLabel lbl_4dGroupCadas;
    private javax.swing.JLabel lbl_NomeUser;
    private javax.swing.JLabel lbl_canaisAtivo;
    private javax.swing.JLabel lbl_companyCadas;
    private javax.swing.JLabel lbl_confAtivas1;
    private javax.swing.JLabel lbl_filtros1;
    private javax.swing.JLabel lbl_filtros2;
    private javax.swing.JLabel lbl_filtros3;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JFormattedTextField txt_Busca;
    // End of variables declaration//GEN-END:variables

    public void currentpag() {

        if (user.getPerfil() == 2) {
            btn_configADM.setVisible(false);
        } else {
            btn_configADM.setVisible(true);
        }
        DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivos1.getModel();
        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            if (numpag < nump) {
                numpag = numpag;
                offset = (numpag * limite) - limite;
            }

            stmt = con.prepareStatement("SELECT * FROM tbl_Canal JOIN tbl_Config WHERE "
                    + "tbl_Canal.Usuario_pertencente = " + '"' + user.getId() + '"' + " AND  id_Config = Config_pertencente LIMIT 10 OFFSET " + offset + ";");
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

            String stra = Integer.toString(numpag);
            cbx_pag.setSelectedItem(stra);

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void nextpag() {

        if (user.getPerfil() == 2) {
            btn_configADM.setVisible(false);
        } else {
            btn_configADM.setVisible(true);
        }

        DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivos1.getModel();
        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            if (numpag < nump) {
                numpag = numpag + 1;
                offset = (numpag * limite) - limite;
            }

            stmt = con.prepareStatement("SELECT * FROM tbl_Canal JOIN tbl_Config WHERE "
                    + "tbl_Canal.Usuario_pertencente = " + '"' + user.getId() + '"' + " AND  id_Config = Config_pertencente LIMIT 10 OFFSET " + offset + ";");
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

            String stra = Integer.toString(numpag);
            cbx_pag.setSelectedItem(stra);

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void prevpag() {

        if (user.getPerfil() == 2) {
            btn_configADM.setVisible(false);
        } else {
            btn_configADM.setVisible(true);
        }

        DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivos1.getModel();
        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            if (numpag > 1) {
                numpag = numpag - 1;
                offset = (numpag * limite) - limite;
            }

            stmt = con.prepareStatement("SELECT * FROM tbl_Canal JOIN tbl_Config WHERE "
                    + "tbl_Canal.Usuario_pertencente = " + '"' + user.getId() + '"' + " AND  id_Config = Config_pertencente LIMIT 10 OFFSET " + offset + ";");
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
            String stra = Integer.toString(numpag);
            cbx_pag.setSelectedItem(stra);

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cbx_pag() {

        if (user.getPerfil() == 2) {
            btn_configADM.setVisible(false);
        } else {
            btn_configADM.setVisible(true);
        }

        DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivos1.getModel();
        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            numpag = Integer.valueOf((String) cbx_pag.getSelectedItem());
            offset = (numpag * limite) - limite;
            stmt = con.prepareStatement("SELECT * FROM tbl_Canal JOIN tbl_Config WHERE "
                    + "tbl_Canal.Usuario_pertencente = " + '"' + user.getId() + '"' + " AND  id_Config = Config_pertencente LIMIT 10 OFFSET " + offset + ";");
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

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addcombopag() {
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            stmt = con.prepareStatement("SELECT COUNT(*) FROM tbl_Canal JOIN tbl_Config WHERE "
                    + "tbl_Canal.Usuario_pertencente = " + '"' + user.getId() + '"' + " AND  id_Config = Config_pertencente;");
            rs = stmt.executeQuery();
            rs.next();
            int total_registros = rs.getInt("count(*)");
            int total_pag = total_registros / 10;

            if ((total_registros % 10) > 0) {
                total_pag = total_pag + 1;
            }

            if (nump < total_pag) {
                for (int i = 0; i < total_pag; i++) {
                    nump++;
                    cbx_pag.addItem(String.valueOf(nump));
                    System.out.println("nump" + nump);
                    System.out.println("total_pag" + total_pag);

                }
            }
            /*else {
                cbx_pag.removeItem(String.valueOf(nump));

                nump--;
                numpag--;
                System.out.println("remove" + nump);
            }*/

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void atualizarpag() {

        DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivos1.getModel();
        modelo.setNumRows(0);

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            /*if(numpag < nump){
            numpag = numpag;
            offset = (numpag * limite) - limite;}*/

            stmt = con.prepareStatement("SELECT * FROM tbl_Canal JOIN tbl_Config WHERE "
                    + "tbl_Canal.Usuario_pertencente = " + '"' + user.getId() + '"' + " AND id_Config = Config_pertencente");
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
            String stra = Integer.toString(numpag);
            cbx_pag.setSelectedItem(stra);
        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void removecbx() {
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            stmt = con.prepareStatement("SELECT COUNT(*) FROM tbl_Canal JOIN tbl_Config WHERE "
                    + "tbl_Canal.Usuario_pertencente = " + '"' + user.getId() + '"' + " AND  id_Config = Config_pertencente;");
            rs = stmt.executeQuery();
            rs.next();
            int total_registros = rs.getInt("count(*)");
            int total_pag = total_registros / 10;

            if (nump >= total_pag) {
                cbx_pag.removeItem(String.valueOf(nump));
                nump--;
                numpag--;
                System.out.println("remove" + nump);
            }
        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: " + ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
