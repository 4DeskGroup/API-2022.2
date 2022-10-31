package View;

import Controller.Table;
import Controller.VerificarAcesso;
import javax.swing.table.DefaultTableModel;
import connection.PesqCanal;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JOptionPane;
import model.bean.Usuario;
import model.dao.CanalConfigDAO;
import model.dao.CanalDAO;


public class PaginaCadastrosAtivos extends javax.swing.JFrame {

    private PesqCanal DAO;
    private static Usuario user;

    
    public PaginaCadastrosAtivos(Usuario u) {
        this.user = u;
        initComponents();
        try{
            DAO = new PesqCanal(u);
        }catch(Exception e){
            
        }
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
        btn_configADM = new javax.swing.JButton();
        btn_EditarCanal = new javax.swing.JButton();
        btn_CadastrarCanal = new javax.swing.JButton();
        btn_SairLogout = new javax.swing.JButton();
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
        cmb_Campo = new javax.swing.JComboBox<>();
        lbl_filtros2 = new javax.swing.JLabel();
        lbl_filtros3 = new javax.swing.JLabel();
        cmb_Ordem = new javax.swing.JComboBox<>();
        jLabel_filtros = new javax.swing.JLabel();
        lbl_filtros1 = new javax.swing.JLabel();
        txt_Busca = new javax.swing.JFormattedTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lbl_canaisAtivo = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_CanaisAtivos = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        btn_Atualizar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurações Ativas");
        setMinimumSize(new java.awt.Dimension(850, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_Menu.setBackground(new java.awt.Color(255, 62, 21));
        jPanel_Menu.setPreferredSize(new java.awt.Dimension(250, 100));
        jPanel_Menu.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 62, 21));
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
        jPanel16.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel16.setLayout(new java.awt.GridBagLayout());

        btn_configADM.setBackground(new java.awt.Color(45, 18, 75));
        btn_configADM.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_configADM.setForeground(new java.awt.Color(255, 255, 255));
        btn_configADM.setText("Config. ADM");
        btn_configADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configADMActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 20, 0, 0);
        jPanel16.add(btn_configADM, gridBagConstraints);

        btn_EditarCanal.setBackground(new java.awt.Color(45, 18, 75));
        btn_EditarCanal.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_EditarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditarCanal.setText("Editar");
        btn_EditarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarCanalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 30, 0, 0);
        jPanel16.add(btn_EditarCanal, gridBagConstraints);

        btn_CadastrarCanal.setBackground(new java.awt.Color(45, 18, 75));
        btn_CadastrarCanal.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        btn_CadastrarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal.setText("Cadastro Canal");
        btn_CadastrarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 20, 0, 19);
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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 40, 92, 0);
        jPanel16.add(btn_SairLogout, gridBagConstraints);

        jPanel_Menu.add(jPanel16, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel_Menu, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setPreferredSize(new java.awt.Dimension(950, 630));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setPreferredSize(new java.awt.Dimension(950, 120));
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
        jPanel7.setPreferredSize(new java.awt.Dimension(950, 460));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setPreferredSize(new java.awt.Dimension(950, 50));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        lbl_confAtivas1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbl_confAtivas1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_confAtivas1.setText("Configurações Ativas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 313, 9, 340);
        jPanel8.add(lbl_confAtivas1, gridBagConstraints);

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setLayout(new java.awt.GridBagLayout());

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
        jPanel10.add(cmb_Campo, gridBagConstraints);

        lbl_filtros2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_filtros2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros2.setText("Campo de busca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 82, 0, 0);
        jPanel10.add(lbl_filtros2, gridBagConstraints);

        lbl_filtros3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_filtros3.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros3.setText("Ordem");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 27, 0, 0);
        jPanel10.add(lbl_filtros3, gridBagConstraints);

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
        jPanel10.add(cmb_Ordem, gridBagConstraints);

        jLabel_filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons8-pesquisar-30.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 132, 0, 0);
        jPanel10.add(jLabel_filtros, gridBagConstraints);

        lbl_filtros1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_filtros1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros1.setText("Busca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel10.add(lbl_filtros1, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(6, 86, 9, 809);
        jPanel12.add(lbl_canaisAtivo, gridBagConstraints);

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(241, 241, 241));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(241, 241, 241));
        jPanel14.setPreferredSize(new java.awt.Dimension(950, 200));
        jPanel14.setLayout(new java.awt.GridBagLayout());

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
        ));
        tbl_CanaisAtivos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl_CanaisAtivosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tbl_CanaisAtivos);

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
        jPanel14.add(jScrollPane2, gridBagConstraints);

        jPanel13.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jPanel15.setBackground(new java.awt.Color(241, 241, 241));
        jPanel15.setLayout(new java.awt.BorderLayout());

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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 235, 24, 0);
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
        gridBagConstraints.insets = new java.awt.Insets(33, 248, 24, 229);
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
       
        btn_configADM.setVisible(vf);
        btn_CadastrarCanal.setVisible(!vf);
        
        Table.carregarTableCanal(tbl_CanaisAtivos, user);
    
    }//GEN-LAST:event_formWindowOpened

    private void cmb_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CampoActionPerformed
        
        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();
        
        Table.filtroBuscaCanal(tbl_CanaisAtivos, busca, campo, ordem, DAO);

    }//GEN-LAST:event_cmb_CampoActionPerformed

    private void cmb_OrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_OrdemActionPerformed

        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();
        
        Table.filtroBuscaCanal(tbl_CanaisAtivos, busca, campo, ordem, DAO);

    }//GEN-LAST:event_cmb_OrdemActionPerformed

    private void txt_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscaActionPerformed
        
        /* */
        
    }//GEN-LAST:event_txt_BuscaActionPerformed

    private void txt_BuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscaKeyReleased
        
        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();
        
        Table.filtroBuscaCanal(tbl_CanaisAtivos, busca, campo, ordem, DAO);
        
    }//GEN-LAST:event_txt_BuscaKeyReleased

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed
        
        Table.carregarTableCanal(tbl_CanaisAtivos, user);
        
    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed

        Table.excluirCanal(tbl_CanaisAtivos, user);
        
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void btn_configADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configADMActionPerformed
        
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal= (int) telaOriginal.getWidth();
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

    private void btn_EditarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarCanalActionPerformed
        
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal= (int) telaOriginal.getWidth();
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

    private void btn_CadastrarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalActionPerformed

        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal= (int) telaOriginal.getWidth();
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
        
    }//GEN-LAST:event_btn_SairLogoutActionPerformed

    private void cmb_CampoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cmb_CampoComponentHidden
        
    // TODO add your handling code here:
    
    }//GEN-LAST:event_cmb_CampoComponentHidden

    private void tbl_CanaisAtivosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl_CanaisAtivosAncestorAdded
       
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbl_CanaisAtivosAncestorAdded

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
    private javax.swing.JComboBox<String> cmb_Campo;
    private javax.swing.JComboBox<String> cmb_Ordem;
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
    private javax.swing.JTable tbl_CanaisAtivos;
    private javax.swing.JFormattedTextField txt_Busca;
    // End of variables declaration//GEN-END:variables
}
