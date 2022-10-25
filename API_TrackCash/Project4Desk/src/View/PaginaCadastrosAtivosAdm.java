package View;

import Controller.Dados;
import Controller.Table;
import Controller.VerificarAcesso;
import javax.swing.table.DefaultTableModel;
import connection.PesquCanalADM;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JOptionPane;
import model.bean.Canal;
import model.bean.Usuario;
import model.dao.CanalConfigDAO;
import model.dao.CanalDAO;


public class PaginaCadastrosAtivosAdm extends javax.swing.JFrame {

    private PesquCanalADM DAO;
    private static Usuario user;
    
    public PaginaCadastrosAtivosAdm(Usuario u) {
        this.user = u;
        try{
            DAO = new PesquCanalADM();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar Canal");
        }
        initComponents();
    }

    public void readJTable(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel_Menu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_LogoTelaPrincipal = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btn_CadastrarCanal = new javax.swing.JButton();
        btn_SairLogout = new javax.swing.JButton();
        btn_CadastrarCanal1 = new javax.swing.JButton();
        btn_CadastrarCanal2 = new javax.swing.JButton();
        btn_CadastrarCanal3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_4dGroupCadas = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbl_companyCadas = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbl_confAtivas1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lbl_filtros2 = new javax.swing.JLabel();
        cmb_campo = new javax.swing.JComboBox<>();
        lbl_filtros3 = new javax.swing.JLabel();
        cmb_ordem = new javax.swing.JComboBox<>();
        lbl_filtros1 = new javax.swing.JLabel();
        jLabel_filtros = new javax.swing.JLabel();
        txt_Busca = new javax.swing.JFormattedTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lbl_canaisAtivo = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_CanaisAtivosADM = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        btn_Atualizar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurações Ativas");
        setMinimumSize(new java.awt.Dimension(850, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_Menu.setBackground(new java.awt.Color(255, 62, 21));
        jPanel_Menu.setPreferredSize(new java.awt.Dimension(250, 100));
        jPanel_Menu.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 62, 21));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 200));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel_LogoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Untitled-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 50, 27, 67);
        jPanel3.add(jLabel_LogoTelaPrincipal, gridBagConstraints);

        jPanel_Menu.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel16.setBackground(new java.awt.Color(255, 62, 21));
        jPanel16.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel16.setLayout(new java.awt.GridBagLayout());

        btn_CadastrarCanal.setBackground(new java.awt.Color(45, 18, 75));
        btn_CadastrarCanal.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_CadastrarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal.setText("Master");
        btn_CadastrarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 89;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 20, 0, 20);
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
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 40, 13, 0);
        jPanel16.add(btn_SairLogout, gridBagConstraints);

        btn_CadastrarCanal1.setBackground(new java.awt.Color(45, 18, 75));
        btn_CadastrarCanal1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_CadastrarCanal1.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal1.setText("Config. Canal");
        btn_CadastrarCanal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanal1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 0, 20);
        jPanel16.add(btn_CadastrarCanal1, gridBagConstraints);

        btn_CadastrarCanal2.setBackground(new java.awt.Color(45, 18, 75));
        btn_CadastrarCanal2.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_CadastrarCanal2.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal2.setText("Config. Canal");
        btn_CadastrarCanal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanal2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 0, 20);
        jPanel16.add(btn_CadastrarCanal2, gridBagConstraints);

        btn_CadastrarCanal3.setBackground(new java.awt.Color(45, 18, 75));
        btn_CadastrarCanal3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_CadastrarCanal3.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal3.setText("Config. Canal");
        btn_CadastrarCanal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanal3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 0, 20);
        jPanel16.add(btn_CadastrarCanal3, gridBagConstraints);

        jPanel_Menu.add(jPanel16, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel_Menu, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setMinimumSize(new java.awt.Dimension(948, 120));
        jPanel2.setPreferredSize(new java.awt.Dimension(950, 630));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        lbl_4dGroupCadas.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        lbl_4dGroupCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_4dGroupCadas.setText("4D Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 316, 13, 317);
        jPanel4.add(lbl_4dGroupCadas, gridBagConstraints);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setPreferredSize(new java.awt.Dimension(950, 50));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        lbl_companyCadas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_companyCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_companyCadas.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 424, 10, 424);
        jPanel6.add(lbl_companyCadas, gridBagConstraints);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setPreferredSize(new java.awt.Dimension(950, 50));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        lbl_confAtivas1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbl_confAtivas1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_confAtivas1.setText("Canais Ativos ADM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 341, 5, 341);
        jPanel8.add(lbl_confAtivas1, gridBagConstraints);

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setPreferredSize(new java.awt.Dimension(950, 80));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        lbl_filtros2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_filtros2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros2.setText("Campo de busca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 72, 0, 0);
        jPanel10.add(lbl_filtros2, gridBagConstraints);

        cmb_campo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_campo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_Config", "Empresa", "Plataforma", "Autenticacao" }));
        cmb_campo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmb_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_campoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 72, 6, 0);
        jPanel10.add(cmb_campo, gridBagConstraints);

        lbl_filtros3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_filtros3.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros3.setText("Ordem");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 38, 0, 0);
        jPanel10.add(lbl_filtros3, gridBagConstraints);

        cmb_ordem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_ordem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crescente", "Decrescente" }));
        cmb_ordem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmb_ordem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ordemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 38, 0, 0);
        jPanel10.add(cmb_ordem, gridBagConstraints);

        lbl_filtros1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_filtros1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros1.setText("Busca");
        lbl_filtros1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_filtros1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel10.add(lbl_filtros1, gridBagConstraints);

        jLabel_filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons8-pesquisar-30.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 98, 0, 0);
        jPanel10.add(jLabel_filtros, gridBagConstraints);

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
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.ipadx = 286;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 100, 0, 70);
        jPanel10.add(txt_Busca, gridBagConstraints);

        jPanel9.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel11.setBackground(new java.awt.Color(241, 241, 241));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(241, 241, 241));
        jPanel12.setPreferredSize(new java.awt.Dimension(950, 40));
        jPanel12.setLayout(new java.awt.GridBagLayout());

        lbl_canaisAtivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canaisAtivo.setForeground(new java.awt.Color(45, 18, 75));
        lbl_canaisAtivo.setText("Canais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 75, 9, 820);
        jPanel12.add(lbl_canaisAtivo, gridBagConstraints);

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(241, 241, 241));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(241, 241, 241));
        jPanel14.setPreferredSize(new java.awt.Dimension(950, 200));
        jPanel14.setLayout(new java.awt.GridBagLayout());

        tbl_CanaisAtivosADM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idConfig", "Empresa", "Plataforma", "Autenticação"
            }
        ));
        jScrollPane2.setViewportView(tbl_CanaisAtivosADM);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 762;
        gridBagConstraints.ipady = 159;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 86, 15, 86);
        jPanel14.add(jScrollPane2, gridBagConstraints);

        jPanel13.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jPanel15.setBackground(new java.awt.Color(241, 241, 241));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(241, 241, 241));
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 229, 41, 0);
        jPanel17.add(btn_Atualizar, gridBagConstraints);

        btn_Excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 270, 41, 213);
        jPanel17.add(btn_Excluir, gridBagConstraints);

        jPanel15.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel13.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Mostrar na Tabela
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        boolean vf = new VerificarAcesso().isADM(user);
        
        if(vf == false){
            JOptionPane.showMessageDialog(null, "Não tem permissão para acessar nessa página");
            this.dispose();
            new PaginaCadastrosAtivos(user).setVisible(true);
        }else{
            Table.carregarTableConfig(tbl_CanaisAtivosADM, user);
        }

    }//GEN-LAST:event_formWindowOpened

    private void btn_CadastrarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalActionPerformed
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal= (int) telaOriginal.getWidth();
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

        //this.dispose();
        //new PaginaCadastroConfig(user).setVisible(true);
        
        
    }//GEN-LAST:event_btn_CadastrarCanalActionPerformed

    private void btn_SairLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairLogoutActionPerformed
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal= (int) telaOriginal.getWidth();
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
        //this.dispose();
        //new TelaPrincipal().setVisible(true);
        
    }//GEN-LAST:event_btn_SairLogoutActionPerformed

    private void cmb_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_campoActionPerformed

        filtroBusca();
        
    }//GEN-LAST:event_cmb_campoActionPerformed

    private void cmb_ordemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ordemActionPerformed

        filtroBusca();
        
    }//GEN-LAST:event_cmb_ordemActionPerformed

    private void txt_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscaActionPerformed
        
    // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_BuscaActionPerformed

    private void txt_BuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscaKeyReleased

        filtroBusca();
        
    }//GEN-LAST:event_txt_BuscaKeyReleased

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed
        
        DefaultTableModel modelo = (DefaultTableModel) tbl_CanaisAtivosADM.getModel();
        
        DefaultTableModel modeloBD = new Table().CarregarTabelaCadastroAtivos(modelo, user);
        
        modelo = modeloBD;
        
    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed

        if(tbl_CanaisAtivosADM.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um canal para excluir!");
        }else{

            Table.excluirCanal(tbl_CanaisAtivosADM, user);

            DefaultTableModel modelo = (DefaultTableModel) tbl_CanaisAtivosADM.getModel();
            modelo.removeRow(tbl_CanaisAtivosADM.getSelectedRow());
        }
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void lbl_filtros1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_filtros1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_filtros1AncestorAdded

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowIconified

    private void btn_CadastrarCanal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CadastrarCanal1ActionPerformed

    private void btn_CadastrarCanal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CadastrarCanal2ActionPerformed

    private void btn_CadastrarCanal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CadastrarCanal3ActionPerformed

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivosAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivosAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivosAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivosAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaCadastrosAtivosAdm(user).setVisible(true);
            }
        });
    }
    
    public void filtroBusca() {

        String campo = cmb_campo.getSelectedItem().toString();
        String ordem = cmb_ordem.getSelectedItem().toString();

        if (!campo.equals("id_Config")) {
            campo = campo + "_Config";
        }

        if (ordem.equals("Crescente")) {
            ordem = "asc";
        } else if (ordem.equals("Decrescente")) {
            ordem = "desc";
        }

        DefaultTableModel table = (DefaultTableModel) tbl_CanaisAtivosADM.getModel();
        table = new Table().filtroBuscaADM(campo, ordem, txt_Busca.getText(), DAO, table);

        tbl_CanaisAtivosADM.setModel(table);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atualizar;
    private javax.swing.JButton btn_CadastrarCanal;
    private javax.swing.JButton btn_CadastrarCanal1;
    private javax.swing.JButton btn_CadastrarCanal2;
    private javax.swing.JButton btn_CadastrarCanal3;
    private javax.swing.JToggleButton btn_Excluir;
    private javax.swing.JButton btn_SairLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_campo;
    private javax.swing.JComboBox<String> cmb_ordem;
    private javax.swing.JLabel jLabel_LogoTelaPrincipal;
    private javax.swing.JLabel jLabel_filtros;
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
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_4dGroupCadas;
    private javax.swing.JLabel lbl_canaisAtivo;
    private javax.swing.JLabel lbl_companyCadas;
    private javax.swing.JLabel lbl_confAtivas1;
    private javax.swing.JLabel lbl_filtros1;
    private javax.swing.JLabel lbl_filtros2;
    private javax.swing.JLabel lbl_filtros3;
    private javax.swing.JTable tbl_CanaisAtivosADM;
    private javax.swing.JFormattedTextField txt_Busca;
    // End of variables declaration//GEN-END:variables
}


