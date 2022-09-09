package View;

public class CadastroUsuario extends javax.swing.JFrame {

    public CadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_cadasCanaisCadas = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_logoCadas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_crieSuaConta = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbl_noneCad = new javax.swing.JLabel();
        txt_nomeCad = new javax.swing.JTextField();
        lbl_usuarioCad = new javax.swing.JLabel();
        txt_usuarioCad = new javax.swing.JTextField();
        lbl_senhaCad = new javax.swing.JLabel();
        txt_senhaCad = new javax.swing.JPasswordField();
        lbl_emailCad = new javax.swing.JLabel();
        txt_emailCad = new javax.swing.JTextField();
        lbl_confSenhaCad = new javax.swing.JLabel();
        txt_confSenhaCad = new javax.swing.JPasswordField();
        jCheckBox_VisualSenhaCad = new javax.swing.JCheckBox();
        btn_VoltarCad = new javax.swing.JButton();
        btn_salvarCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(1200, 630));

        jPanel1.setBackground(new java.awt.Color(255, 62, 21));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 150));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 62, 21));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lbl_cadasCanaisCadas.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_cadasCanaisCadas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cadasCanaisCadas.setText("Cadastro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 100, 43, 100);
        jPanel2.add(lbl_cadasCanaisCadas, gridBagConstraints);

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 62, 21));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 150));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        lbl_logoCadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Untitled-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 196, 15, 64);
        jPanel3.add(lbl_logoCadas, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lbl_crieSuaConta.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_crieSuaConta.setForeground(new java.awt.Color(45, 18, 75));
        lbl_crieSuaConta.setText("Crie sua conta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 441, 18, 442);
        jPanel5.add(lbl_crieSuaConta, gridBagConstraints);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        lbl_noneCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_noneCad.setForeground(new java.awt.Color(45, 18, 75));
        lbl_noneCad.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 150, 0, 0);
        jPanel6.add(lbl_noneCad, gridBagConstraints);

        txt_nomeCad.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_nomeCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeCadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 356;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 150, 0, 0);
        jPanel6.add(txt_nomeCad, gridBagConstraints);

        lbl_usuarioCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_usuarioCad.setForeground(new java.awt.Color(45, 18, 75));
        lbl_usuarioCad.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 150, 0, 0);
        jPanel6.add(lbl_usuarioCad, gridBagConstraints);

        txt_usuarioCad.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_usuarioCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioCadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 356;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 150, 0, 0);
        jPanel6.add(txt_usuarioCad, gridBagConstraints);

        lbl_senhaCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_senhaCad.setForeground(new java.awt.Color(45, 18, 75));
        lbl_senhaCad.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 150, 0, 0);
        jPanel6.add(lbl_senhaCad, gridBagConstraints);

        txt_senhaCad.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 356;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 150, 0, 0);
        jPanel6.add(txt_senhaCad, gridBagConstraints);

        lbl_emailCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_emailCad.setForeground(new java.awt.Color(45, 18, 75));
        lbl_emailCad.setText("E-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 60, 0, 0);
        jPanel6.add(lbl_emailCad, gridBagConstraints);

        txt_emailCad.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_emailCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailCadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.ipadx = 356;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 60, 0, 150);
        jPanel6.add(txt_emailCad, gridBagConstraints);

        lbl_confSenhaCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_confSenhaCad.setForeground(new java.awt.Color(45, 18, 75));
        lbl_confSenhaCad.setText("Confirmar Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 60, 0, 0);
        jPanel6.add(lbl_confSenhaCad, gridBagConstraints);

        txt_confSenhaCad.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.ipadx = 356;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 60, 0, 150);
        jPanel6.add(txt_confSenhaCad, gridBagConstraints);

        jCheckBox_VisualSenhaCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCheckBox_VisualSenhaCad.setForeground(new java.awt.Color(45, 18, 75));
        jCheckBox_VisualSenhaCad.setText("Visualizar a Senha");
        jCheckBox_VisualSenhaCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_VisualSenhaCadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 40, 0, 0);
        jPanel6.add(jCheckBox_VisualSenhaCad, gridBagConstraints);

        btn_VoltarCad.setBackground(new java.awt.Color(204, 204, 204));
        btn_VoltarCad.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_VoltarCad.setText("Voltar");
        btn_VoltarCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarCadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 67;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 25, 50, 0);
        jPanel6.add(btn_VoltarCad, gridBagConstraints);

        btn_salvarCad.setBackground(new java.awt.Color(255, 62, 21));
        btn_salvarCad.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_salvarCad.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvarCad.setText("Cadastrar");
        btn_salvarCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarCadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 7, 50, 0);
        jPanel6.add(btn_salvarCad, gridBagConstraints);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeCadActionPerformed

    private void txt_usuarioCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioCadActionPerformed

    private void txt_emailCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailCadActionPerformed

    private void jCheckBox_VisualSenhaCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_VisualSenhaCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_VisualSenhaCadActionPerformed

    private void btn_VoltarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarCadActionPerformed
        // TODO add your handling code here:
        new LoginUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VoltarCadActionPerformed

    private void btn_salvarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarCadActionPerformed
        // TODO add your handling code here:
        new CadastroSucesso().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salvarCadActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_VoltarCad;
    private javax.swing.JButton btn_salvarCad;
    private javax.swing.JCheckBox jCheckBox_VisualSenhaCad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbl_cadasCanaisCadas;
    private javax.swing.JLabel lbl_confSenhaCad;
    private javax.swing.JLabel lbl_crieSuaConta;
    private javax.swing.JLabel lbl_emailCad;
    private javax.swing.JLabel lbl_logoCadas;
    private javax.swing.JLabel lbl_noneCad;
    private javax.swing.JLabel lbl_senhaCad;
    private javax.swing.JLabel lbl_usuarioCad;
    private javax.swing.JPasswordField txt_confSenhaCad;
    private javax.swing.JTextField txt_emailCad;
    private javax.swing.JTextField txt_nomeCad;
    private javax.swing.JPasswordField txt_senhaCad;
    private javax.swing.JTextField txt_usuarioCad;
    // End of variables declaration//GEN-END:variables
}
