package View;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import model.DTO.CanalDTO;
import model.bean.Canal;
import model.bean.CanalConfig;
import model.bean.Usuario;
import model.dao.CanalConfigDAO;
import model.dao.CanalDAO;

public class PaginaCadastroInfoUs extends javax.swing.JFrame {
    
    private static Usuario user;
    
    public PaginaCadastroInfoUs() {
        initComponents();
    }
     
    public PaginaCadastroInfoUs(Usuario u) {
        user = u;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btn_VoltarCadAtivo = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel_LogoTelaPrincipal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_4dGroupInfoUs = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_CompInfoUs = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_cadasCanaInfoUs = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbl_canalInfoUs = new javax.swing.JLabel();
        txt_userInfoUs = new javax.swing.JTextField();
        lbl_senhaInfoUs = new javax.swing.JLabel();
        txt_senhaInfoUs = new javax.swing.JTextField();
        btn_limparInfo = new javax.swing.JButton();
        txt_tokenCanalInfo = new javax.swing.JTextField();
        lbl_userInfoUs = new javax.swing.JLabel();
        lbl_Token = new javax.swing.JLabel();
        cbxCanal = new javax.swing.JComboBox<>();
        lbl_idContaInfoUs2 = new javax.swing.JLabel();
        btn_cadastrarInfoUs1 = new javax.swing.JButton();
        lbl_idContaInfoUs3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lbl_Autentificacao = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lbl_Plataforma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Informações");
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(850, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 62, 21));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 630));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(255, 62, 21));
        jPanel11.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        btn_VoltarCadAtivo.setBackground(new java.awt.Color(45, 18, 75));
        btn_VoltarCadAtivo.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_VoltarCadAtivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_VoltarCadAtivo.setText("Voltar");
        btn_VoltarCadAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarCadAtivoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 40, 93, 30);
        jPanel11.add(btn_VoltarCadAtivo, gridBagConstraints);

        jPanel1.add(jPanel11, java.awt.BorderLayout.PAGE_END);

        jPanel12.setBackground(new java.awt.Color(255, 62, 21));
        jPanel12.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel12.setLayout(new java.awt.GridBagLayout());

        jLabel_LogoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Untitled-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 60, 27, 57);
        jPanel12.add(jLabel_LogoTelaPrincipal, gridBagConstraints);

        jPanel1.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setPreferredSize(new java.awt.Dimension(1020, 630));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setMinimumSize(new java.awt.Dimension(993, 120));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 120));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setMinimumSize(new java.awt.Dimension(143, 120));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 100));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));
        jPanel3.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setMinimumSize(new java.awt.Dimension(850, 150));
        jPanel5.setPreferredSize(new java.awt.Dimension(850, 100));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lbl_4dGroupInfoUs.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        lbl_4dGroupInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_4dGroupInfoUs.setText("4D Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 170, 26, 213);
        jPanel5.add(lbl_4dGroupInfoUs, gridBagConstraints);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        lbl_CompInfoUs.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_CompInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_CompInfoUs.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 430, 8, 368);
        jPanel7.add(lbl_CompInfoUs, gridBagConstraints);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        lbl_cadasCanaInfoUs.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_cadasCanaInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_cadasCanaInfoUs.setText("Cadastro de Informações ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 260, 0, 199);
        jPanel9.add(lbl_cadasCanaInfoUs, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setPreferredSize(new java.awt.Dimension(1100, 100));
        jPanel10.setLayout(null);

        lbl_canalInfoUs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canalInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_canalInfoUs.setText("Canais:");
        jPanel10.add(lbl_canalInfoUs);
        lbl_canalInfoUs.setBounds(92, 51, 70, 25);

        txt_userInfoUs.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_userInfoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userInfoUsActionPerformed(evt);
            }
        });
        jPanel10.add(txt_userInfoUs);
        txt_userInfoUs.setBounds(152, 237, 250, 40);

        lbl_senhaInfoUs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_senhaInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_senhaInfoUs.setText("Senha");
        jPanel10.add(lbl_senhaInfoUs);
        lbl_senhaInfoUs.setBounds(540, 207, 52, 25);

        txt_senhaInfoUs.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_senhaInfoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senhaInfoUsActionPerformed(evt);
            }
        });
        jPanel10.add(txt_senhaInfoUs);
        txt_senhaInfoUs.setBounds(540, 237, 250, 40);

        btn_limparInfo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_limparInfo.setForeground(new java.awt.Color(255, 62, 21));
        btn_limparInfo.setText("Limpar");
        btn_limparInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparInfoActionPerformed(evt);
            }
        });
        jPanel10.add(btn_limparInfo);
        btn_limparInfo.setBounds(222, 327, 238, 55);

        txt_tokenCanalInfo.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_tokenCanalInfo.setToolTipText("");
        txt_tokenCanalInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tokenCanalInfoActionPerformed(evt);
            }
        });
        jPanel10.add(txt_tokenCanalInfo);
        txt_tokenCanalInfo.setBounds(152, 161, 250, 36);

        lbl_userInfoUs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_userInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_userInfoUs.setText("Usuário");
        jPanel10.add(lbl_userInfoUs);
        lbl_userInfoUs.setBounds(152, 207, 79, 25);

        lbl_Token.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Token.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Token.setText("Token");
        jPanel10.add(lbl_Token);
        lbl_Token.setBounds(152, 131, 60, 30);

        cbxCanal.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        cbxCanal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        cbxCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCanalActionPerformed(evt);
            }
        });
        jPanel10.add(cbxCanal);
        cbxCanal.setBounds(92, 81, 218, 40);

        lbl_idContaInfoUs2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_idContaInfoUs2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_idContaInfoUs2.setText("Padrão Autentificação:");
        jPanel10.add(lbl_idContaInfoUs2);
        lbl_idContaInfoUs2.setBounds(660, 50, 195, 25);

        btn_cadastrarInfoUs1.setBackground(new java.awt.Color(255, 62, 21));
        btn_cadastrarInfoUs1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_cadastrarInfoUs1.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastrarInfoUs1.setText("Salvar");
        btn_cadastrarInfoUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarInfoUs1ActionPerformed(evt);
            }
        });
        jPanel10.add(btn_cadastrarInfoUs1);
        btn_cadastrarInfoUs1.setBounds(530, 327, 240, 55);

        lbl_idContaInfoUs3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_idContaInfoUs3.setForeground(new java.awt.Color(45, 18, 75));
        lbl_idContaInfoUs3.setText("Plataformas:");
        jPanel10.add(lbl_idContaInfoUs3);
        lbl_idContaInfoUs3.setBounds(360, 51, 120, 25);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        lbl_Autentificacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Autentificacao.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Autentificacao.setText("Autentificação");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Autentificacao, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lbl_Autentificacao)
                .addContainerGap())
        );

        jPanel10.add(jPanel13);
        jPanel13.setBounds(660, 80, 190, 40);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));

        lbl_Plataforma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Plataforma.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Plataforma.setText("Plataforma");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Plataforma, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lbl_Plataforma)
                .addContainerGap())
        );

        jPanel10.add(jPanel15);
        jPanel15.setBounds(360, 80, 180, 40);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userInfoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userInfoUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userInfoUsActionPerformed

    private void txt_senhaInfoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaInfoUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senhaInfoUsActionPerformed

    private void btn_limparInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparInfoActionPerformed
        
        txt_tokenCanalInfo.setText("");
        txt_userInfoUs.setText("");
        txt_senhaInfoUs.setText("");
        
    }//GEN-LAST:event_btn_limparInfoActionPerformed

    private void txt_tokenCanalInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tokenCanalInfoActionPerformed
        
    }//GEN-LAST:event_txt_tokenCanalInfoActionPerformed

    private void btn_VoltarCadAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarCadAtivoActionPerformed

        new PaginaCadastrosAtivos(user).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_VoltarCadAtivoActionPerformed

    private void cbxCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCanalActionPerformed
    
        String conteudo = cbxCanal.getSelectedItem().toString();
        
        if(conteudo == null || conteudo.equals("Selecionar")){
            lbl_Autentificacao.setEnabled(false);
            lbl_Plataforma.setEnabled(false);
            lbl_Autentificacao.setText("Autentificacao");
            lbl_Plataforma.setText("Plataforma");
            
            lbl_Token.setEnabled(false);
            txt_tokenCanalInfo.setEnabled(false);
            lbl_userInfoUs.setEnabled(false);
            lbl_senhaInfoUs.setEnabled(false);
            txt_userInfoUs.setEnabled(false);
            txt_senhaInfoUs.setEnabled(false);
            
        }else{
            lbl_Autentificacao.setEnabled(true);
            lbl_Plataforma.setEnabled(true);
            
            Canal canal = new CanalConfigDAO().buscarConfig(conteudo);
            
            lbl_Plataforma.setText(canal.getPlataforma());
            lbl_Autentificacao.setText(canal.getAutentificacao());
            
            if(canal.getAutentificacao().equals("Token")){
                lbl_Token.setEnabled(true);
                txt_tokenCanalInfo.setEnabled(true);
                lbl_userInfoUs.setEnabled(false);
                lbl_senhaInfoUs.setEnabled(false);
                txt_userInfoUs.setEnabled(false);
                txt_senhaInfoUs.setEnabled(false);
            }else{
                lbl_Token.setEnabled(false);
                txt_tokenCanalInfo.setEnabled(false);
                lbl_userInfoUs.setEnabled(true);
                lbl_senhaInfoUs.setEnabled(true);
                txt_userInfoUs.setEnabled(true);
                txt_senhaInfoUs.setEnabled(true);
            }
            
        }
        
    }//GEN-LAST:event_cbxCanalActionPerformed

    private void btn_cadastrarInfoUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarInfoUs1ActionPerformed
        
        CanalDTO p = new CanalDTO();
        
        p.setUsuario(txt_userInfoUs.getText());
        p.setEmpresa(cbxCanal.getSelectedItem().toString());
        p.setPlataforma(lbl_Plataforma.getText());
        p.setAutentificacao(lbl_Autentificacao.getText());
        if(lbl_Autentificacao.getText().equals("Token")){
            p.setLogin("vazio");
            p.setSenha("vazio");
            p.setToken(txt_tokenCanalInfo.getText());
        }else{
            p.setLogin(txt_userInfoUs.getText());
            p.setSenha(txt_senhaInfoUs.getText());
            p.setToken("vazio");
        }
        
        if((txt_userInfoUs.getText() == null || txt_senhaInfoUs.getText() == null) && lbl_Autentificacao.equals("Login")){
            JOptionPane.showMessageDialog(null, "Preencha os campos necessarios!");
        }else{
            JOptionPane.showMessageDialog(null, user.getUser());
            CanalDAO dao = new CanalDAO();
            dao.addCanal(p, user);
            
            int resp = JOptionPane.showConfirmDialog(null, "Deseja apagar as caixas de entrada?");
            if(resp == JOptionPane.YES_OPTION){
                txt_tokenCanalInfo.setText("");
                txt_userInfoUs.setText("");
                txt_senhaInfoUs.setText("");
            }
        }
        
    }//GEN-LAST:event_btn_cadastrarInfoUs1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        lbl_Autentificacao.setEnabled(false);
        lbl_Plataforma.setEnabled(false);
        lbl_Token.setEnabled(false);
        txt_tokenCanalInfo.setEnabled(false);
        lbl_userInfoUs.setEnabled(false);
        lbl_senhaInfoUs.setEnabled(false);
        txt_userInfoUs.setEnabled(false);
        txt_senhaInfoUs.setEnabled(false);
        
        try{
            CanalDAO objcanaldao = new CanalDAO();
            ResultSet rs = objcanaldao.listarEmpresa();
            
            while (rs.next()){
                idCanais.addElement(rs.getInt(1));
                cbxCanal.addItem(rs.getString(2));
            }
            
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Carregar ComboBox" + erro);
        }
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroInfoUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroInfoUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroInfoUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroInfoUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaCadastroInfoUs(user).setVisible(true);
            }
        });
    }
    
    Vector<Integer> idCanais = new Vector<Integer>();
    
    public void restaurarDadosComboBoxCargo(){
        
        
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_VoltarCadAtivo;
    private javax.swing.JButton btn_cadastrarInfoUs1;
    private javax.swing.JButton btn_limparInfo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCanal;
    private javax.swing.JLabel jLabel_LogoTelaPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_4dGroupInfoUs;
    public static javax.swing.JLabel lbl_Autentificacao;
    private javax.swing.JLabel lbl_CompInfoUs;
    public static javax.swing.JLabel lbl_Plataforma;
    public static javax.swing.JLabel lbl_Token;
    private javax.swing.JLabel lbl_cadasCanaInfoUs;
    private javax.swing.JLabel lbl_canalInfoUs;
    private javax.swing.JLabel lbl_idContaInfoUs2;
    private javax.swing.JLabel lbl_idContaInfoUs3;
    private javax.swing.JLabel lbl_senhaInfoUs;
    private javax.swing.JLabel lbl_userInfoUs;
    private javax.swing.JTextField txt_senhaInfoUs;
    private javax.swing.JTextField txt_tokenCanalInfo;
    private javax.swing.JTextField txt_userInfoUs;
    // End of variables declaration//GEN-END:variables
}
