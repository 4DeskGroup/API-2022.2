/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class LoginUser extends javax.swing.JFrame {
    
    public LoginUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        lbl_SubTitleLogin1 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        lbl_SubTitleLogin2 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        lbl_SubTitleLogin3 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        lbl_SubTitleLogin4 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        lbl_SubTitleLogin5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_LoginTitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_TipoUsuarioLogin = new javax.swing.JLabel();
        txt_usuarioLogin = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_TipoSenhaLogin = new javax.swing.JLabel();
        txt_senhaLogin = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        cb_viewPass = new javax.swing.JCheckBox();
        lbl_EsqueceuSenha = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btn_Entrar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lbl_NaoTemConta = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        btn_cadastreUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(1200, 630));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 62, 21));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 630));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(255, 62, 21));
        jPanel16.setPreferredSize(new java.awt.Dimension(350, 200));
        jPanel16.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Untitled-removebg-preview.png"))); // NOI18N
        jPanel16.add(jLabel1, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel16, java.awt.BorderLayout.LINE_START);

        jPanel17.setBackground(new java.awt.Color(255, 62, 21));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(255, 62, 21));
        jPanel18.setPreferredSize(new java.awt.Dimension(350, 50));
        jPanel18.setLayout(new java.awt.GridBagLayout());

        lbl_SubTitleLogin1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_SubTitleLogin1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SubTitleLogin1.setText("Coloque seus dados já");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 81, 13, 81);
        jPanel18.add(lbl_SubTitleLogin1, gridBagConstraints);

        jPanel17.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel19.setBackground(new java.awt.Color(255, 62, 21));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel21.setBackground(new java.awt.Color(255, 62, 21));
        jPanel21.setPreferredSize(new java.awt.Dimension(350, 50));
        jPanel21.setLayout(new java.awt.GridBagLayout());

        lbl_SubTitleLogin2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_SubTitleLogin2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SubTitleLogin2.setText("cadastrados no nosso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 83, 13, 84);
        jPanel21.add(lbl_SubTitleLogin2, gridBagConstraints);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel24, new java.awt.GridBagConstraints());

        jPanel19.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        jPanel20.setBackground(new java.awt.Color(255, 62, 21));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel22.setBackground(new java.awt.Color(255, 62, 21));
        jPanel22.setPreferredSize(new java.awt.Dimension(350, 50));
        jPanel22.setLayout(new java.awt.GridBagLayout());

        lbl_SubTitleLogin3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_SubTitleLogin3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SubTitleLogin3.setText("aplicativo, caso não haja");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 70, 13, 71);
        jPanel22.add(lbl_SubTitleLogin3, gridBagConstraints);

        jPanel20.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jPanel23.setBackground(new java.awt.Color(255, 62, 21));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel25.setBackground(new java.awt.Color(255, 62, 21));
        jPanel25.setPreferredSize(new java.awt.Dimension(350, 50));
        jPanel25.setLayout(new java.awt.GridBagLayout());

        lbl_SubTitleLogin4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_SubTitleLogin4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SubTitleLogin4.setText("cadastro, clique no botão ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 64, 13, 65);
        jPanel25.add(lbl_SubTitleLogin4, gridBagConstraints);

        jPanel23.add(jPanel25, java.awt.BorderLayout.PAGE_START);

        jPanel26.setBackground(new java.awt.Color(255, 62, 21));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel27.setBackground(new java.awt.Color(255, 62, 21));
        jPanel27.setPreferredSize(new java.awt.Dimension(350, 50));
        jPanel27.setLayout(new java.awt.GridBagLayout());

        lbl_SubTitleLogin5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_SubTitleLogin5.setForeground(new java.awt.Color(191, 191, 191));
        lbl_SubTitleLogin5.setText("Cadastre-se");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 125, 13, 126);
        jPanel27.add(lbl_SubTitleLogin5, gridBagConstraints);

        jPanel26.add(jPanel27, java.awt.BorderLayout.PAGE_START);

        jPanel23.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel20.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel19.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel17, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setPreferredSize(new java.awt.Dimension(1020, 630));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        lbl_LoginTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_LoginTitle.setForeground(new java.awt.Color(45, 18, 75));
        lbl_LoginTitle.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 361, 18, 362);
        jPanel3.add(lbl_LoginTitle, gridBagConstraints);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lbl_TipoUsuarioLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_TipoUsuarioLogin.setForeground(new java.awt.Color(45, 18, 75));
        lbl_TipoUsuarioLogin.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 180, 0, 0);
        jPanel5.add(lbl_TipoUsuarioLogin, gridBagConstraints);

        txt_usuarioLogin.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_usuarioLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usuarioLoginFocusLost(evt);
            }
        });
        txt_usuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 436;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 180, 24, 170);
        jPanel5.add(txt_usuarioLogin, gridBagConstraints);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setPreferredSize(new java.awt.Dimension(850, 80));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        lbl_TipoSenhaLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_TipoSenhaLogin.setForeground(new java.awt.Color(45, 18, 75));
        lbl_TipoSenhaLogin.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 179, 0, 0);
        jPanel7.add(lbl_TipoSenhaLogin, gridBagConstraints);

        txt_senhaLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_senhaLogin.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 436;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 179, 10, 171);
        jPanel7.add(txt_senhaLogin, gridBagConstraints);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setPreferredSize(new java.awt.Dimension(850, 50));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        cb_viewPass.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        cb_viewPass.setForeground(new java.awt.Color(45, 18, 75));
        cb_viewPass.setText("Visualizar a Senha");
        cb_viewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_viewPassActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 180, 15, 0);
        jPanel9.add(cb_viewPass, gridBagConstraints);

        lbl_EsqueceuSenha.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lbl_EsqueceuSenha.setForeground(new java.awt.Color(45, 18, 75));
        lbl_EsqueceuSenha.setText("Esqueceu sua Senha?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 139, 0, 175);
        jPanel9.add(lbl_EsqueceuSenha, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(241, 241, 241));
        jPanel11.setMinimumSize(new java.awt.Dimension(100, 80));
        jPanel11.setPreferredSize(new java.awt.Dimension(850, 60));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        btn_Entrar.setBackground(new java.awt.Color(204, 204, 204));
        btn_Entrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_Entrar.setText("Entrar");
        btn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 68;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 320, 26, 330);
        jPanel11.add(btn_Entrar, gridBagConstraints);

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(241, 241, 241));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(241, 241, 241));
        jPanel13.setPreferredSize(new java.awt.Dimension(850, 50));
        jPanel13.setLayout(new java.awt.GridBagLayout());

        lbl_NaoTemConta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_NaoTemConta.setForeground(new java.awt.Color(45, 18, 75));
        lbl_NaoTemConta.setText("Não tem conta?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 327, 6, 343);
        jPanel13.add(lbl_NaoTemConta, gridBagConstraints);

        jPanel12.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBackground(new java.awt.Color(241, 241, 241));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(241, 241, 241));
        jPanel15.setLayout(new java.awt.GridBagLayout());

        btn_cadastreUser.setBackground(new java.awt.Color(255, 62, 21));
        btn_cadastreUser.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_cadastreUser.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastreUser.setText("Cadastre-se");
        btn_cadastreUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastreUserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 319, 21, 331);
        jPanel15.add(btn_cadastreUser, gridBagConstraints);

        jPanel14.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel12.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioLoginActionPerformed

    }//GEN-LAST:event_txt_usuarioLoginActionPerformed

    private void cb_viewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_viewPassActionPerformed
        if(txt_senhaLogin.getEchoChar() == '*'){
            txt_senhaLogin.setEchoChar((char) 0);
        }else{
            txt_senhaLogin.setEchoChar('*');
        }
    }//GEN-LAST:event_cb_viewPassActionPerformed

    private void btn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntrarActionPerformed
        
        String strPass = new String(txt_senhaLogin.getPassword()).trim();
        
        if(txt_usuarioLogin.getText().equals("4Desk") && strPass.equals("1234")){ 
            
            strPass = null;      // Para não ficar salvo a senha na String
            
            /*
                Só precisa ter uma tela inicial para o cliente
            */
            
            new HomeCliente().setVisible(true);
            this.dispose();
            
        }else if(txt_usuarioLogin.getText().equals("admin") && strPass.equals("admin")){
            
           strPass = null;       // Para não ficar salvo a senha na String
            /*
                Só precisa ter uma tela inicial para o ADM
            */
            
           new HomeADM().setVisible(true);
           this.dispose();
           
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
        }
        
        strPass = null;      // Para não ficar salvo a senha na String
        
    }//GEN-LAST:event_btn_EntrarActionPerformed

    private void btn_cadastreUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastreUserActionPerformed
        
        new CadastroUsuario().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_cadastreUserActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void txt_usuarioLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usuarioLoginFocusLost
      
    }//GEN-LAST:event_txt_usuarioLoginFocusLost

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
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JButton btn_cadastreUser;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_viewPass;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_EsqueceuSenha;
    private javax.swing.JLabel lbl_LoginTitle;
    private javax.swing.JLabel lbl_NaoTemConta;
    private javax.swing.JLabel lbl_SubTitleLogin1;
    private javax.swing.JLabel lbl_SubTitleLogin2;
    private javax.swing.JLabel lbl_SubTitleLogin3;
    private javax.swing.JLabel lbl_SubTitleLogin4;
    private javax.swing.JLabel lbl_SubTitleLogin5;
    private javax.swing.JLabel lbl_TipoSenhaLogin;
    private javax.swing.JLabel lbl_TipoUsuarioLogin;
    private javax.swing.JPasswordField txt_senhaLogin;
    private javax.swing.JTextField txt_usuarioLogin;
    // End of variables declaration//GEN-END:variables
}
