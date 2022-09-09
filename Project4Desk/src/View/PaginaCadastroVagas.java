package View;

public class PaginaCadastroVagas extends javax.swing.JFrame {

    public PaginaCadastroVagas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel_quadLarCadas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_logoCadas = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbl_4dGroupCadas = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_companyCadas = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_cadasCanaisCadas = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbl_canalCadas = new javax.swing.JLabel();
        txt_canalCadas = new javax.swing.JTextField();
        cmb_TipoCanalCadas = new javax.swing.JComboBox<>();
        lbl_TipoCanalCadas = new javax.swing.JLabel();
        lbl_padAutCadas = new javax.swing.JLabel();
        cmb_padAutCadas = new javax.swing.JComboBox<>();
        btn_salvarCadas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(1200, 630));

        panel_quadLarCadas.setBackground(new java.awt.Color(255, 62, 21));
        panel_quadLarCadas.setPreferredSize(new java.awt.Dimension(250, 630));
        panel_quadLarCadas.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panel_quadLarCadas, java.awt.BorderLayout.LINE_END);

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

        lbl_logoCadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Untitled-removebg-preview.png"))); // NOI18N
        jPanel4.add(lbl_logoCadas);

        jPanel3.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setMinimumSize(new java.awt.Dimension(850, 150));
        jPanel5.setPreferredSize(new java.awt.Dimension(850, 100));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lbl_4dGroupCadas.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        lbl_4dGroupCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_4dGroupCadas.setText("4D Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 170, 26, 213);
        jPanel5.add(lbl_4dGroupCadas, gridBagConstraints);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        lbl_companyCadas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_companyCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_companyCadas.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 430, 8, 368);
        jPanel7.add(lbl_companyCadas, gridBagConstraints);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        lbl_cadasCanaisCadas.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_cadasCanaisCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_cadasCanaisCadas.setText("Cadastro de Canais ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 260, 0, 199);
        jPanel9.add(lbl_cadasCanaisCadas, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setPreferredSize(new java.awt.Dimension(1100, 100));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        lbl_canalCadas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canalCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_canalCadas.setText("Canal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 190, 0, 0);
        jPanel10.add(lbl_canalCadas, gridBagConstraints);

        txt_canalCadas.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_canalCadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_canalCadasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 196;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 190, 0, 0);
        jPanel10.add(txt_canalCadas, gridBagConstraints);

        cmb_TipoCanalCadas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmb_TipoCanalCadas.setForeground(new java.awt.Color(45, 18, 75));
        cmb_TipoCanalCadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MarketPlace", "Plataforma/ERP", "Meio de Pagamento" }));
        cmb_TipoCanalCadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_TipoCanalCadasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = -17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 190, 0, 0);
        jPanel10.add(cmb_TipoCanalCadas, gridBagConstraints);

        lbl_TipoCanalCadas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_TipoCanalCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_TipoCanalCadas.setText("Tipo de Canal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 190, 0, 0);
        jPanel10.add(lbl_TipoCanalCadas, gridBagConstraints);

        lbl_padAutCadas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_padAutCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_padAutCadas.setText("Padrão de Autenticação");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 80, 0, 0);
        jPanel10.add(lbl_padAutCadas, gridBagConstraints);

        cmb_padAutCadas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmb_padAutCadas.setForeground(new java.awt.Color(45, 18, 75));
        cmb_padAutCadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário e Senha", "Token", " " }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 80, 0, 197);
        jPanel10.add(cmb_padAutCadas, gridBagConstraints);

        btn_salvarCadas.setBackground(new java.awt.Color(255, 62, 21));
        btn_salvarCadas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_salvarCadas.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvarCadas.setText("Salvar");
        btn_salvarCadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarCadasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 84, 96, 0);
        jPanel10.add(btn_salvarCadas, gridBagConstraints);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_canalCadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_canalCadasActionPerformed

    }//GEN-LAST:event_txt_canalCadasActionPerformed

    private void btn_salvarCadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarCadasActionPerformed

    }//GEN-LAST:event_btn_salvarCadasActionPerformed

    private void cmb_TipoCanalCadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_TipoCanalCadasActionPerformed

    }//GEN-LAST:event_cmb_TipoCanalCadasActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaCadastroVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaCadastroVagas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salvarCadas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_TipoCanalCadas;
    private javax.swing.JComboBox<String> cmb_padAutCadas;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_4dGroupCadas;
    private javax.swing.JLabel lbl_TipoCanalCadas;
    private javax.swing.JLabel lbl_cadasCanaisCadas;
    private javax.swing.JLabel lbl_canalCadas;
    private javax.swing.JLabel lbl_companyCadas;
    private javax.swing.JLabel lbl_logoCadas;
    private javax.swing.JLabel lbl_padAutCadas;
    private javax.swing.JPanel panel_quadLarCadas;
    private javax.swing.JTextField txt_canalCadas;
    // End of variables declaration//GEN-END:variables
}