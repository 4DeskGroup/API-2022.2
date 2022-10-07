package View;

import Controller.VerificarAcesso;
import GUI.LoginGUI;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JOptionPane;
import model.bean.Canal;
import model.bean.Usuario;
import model.dao.CanalConfigDAO;

public class PaginaCadastroConfig extends javax.swing.JFrame {
    
    private Usuario cliente;
     
    private static Usuario user;
    
    public PaginaCadastroConfig(Usuario u) {
        this.user = u;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel_quadLarCadas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_ConfigAtivasADM = new javax.swing.JButton();
        btn_SairLogoutAdm = new javax.swing.JButton();
        btn_ConfigAtivas1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_4dGroupCadas = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbl_logoCadas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_companyCadas = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_cadasCanaisCadas = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        txt_canalCadas = new javax.swing.JTextField();
        cmb_TipoCanalCadas = new javax.swing.JComboBox<>();
        lbl_TipoCanalCadas = new javax.swing.JLabel();
        lbl_padAutCadas = new javax.swing.JLabel();
        cmb_padAutCadas = new javax.swing.JComboBox<>();
        btn_salvarCadas = new javax.swing.JButton();
        btn_limparCadCanal = new javax.swing.JButton();
        lbl_canalCadas1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Canais");
        setMinimumSize(new java.awt.Dimension(850, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel_quadLarCadas.setBackground(new java.awt.Color(255, 62, 21));
        panel_quadLarCadas.setPreferredSize(new java.awt.Dimension(250, 630));
        panel_quadLarCadas.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 62, 21));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel1.setLayout(null);

        btn_ConfigAtivasADM.setBackground(new java.awt.Color(45, 18, 75));
        btn_ConfigAtivasADM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_ConfigAtivasADM.setForeground(new java.awt.Color(255, 255, 255));
        btn_ConfigAtivasADM.setText("Canais Ativos");
        btn_ConfigAtivasADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfigAtivasADMActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ConfigAtivasADM);
        btn_ConfigAtivasADM.setBounds(20, 40, 210, 60);

        btn_SairLogoutAdm.setBackground(new java.awt.Color(204, 204, 204));
        btn_SairLogoutAdm.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_SairLogoutAdm.setText("Sair");
        btn_SairLogoutAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairLogoutAdmActionPerformed(evt);
            }
        });
        jPanel1.add(btn_SairLogoutAdm);
        btn_SairLogoutAdm.setBounds(40, 210, 170, 48);

        btn_ConfigAtivas1.setBackground(new java.awt.Color(45, 18, 75));
        btn_ConfigAtivas1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_ConfigAtivas1.setForeground(new java.awt.Color(255, 255, 255));
        btn_ConfigAtivas1.setText("Configurações Ativas");
        btn_ConfigAtivas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfigAtivas1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ConfigAtivas1);
        btn_ConfigAtivas1.setBounds(20, 130, 210, 60);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 249;
        gridBagConstraints.ipady = 279;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(350, 0, 0, 0);
        panel_quadLarCadas.add(jPanel1, gridBagConstraints);

        getContentPane().add(panel_quadLarCadas, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setPreferredSize(new java.awt.Dimension(950, 630));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setMinimumSize(new java.awt.Dimension(950, 120));
        jPanel3.setPreferredSize(new java.awt.Dimension(950, 150));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setMinimumSize(new java.awt.Dimension(850, 150));
        jPanel5.setPreferredSize(new java.awt.Dimension(850, 150));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lbl_4dGroupCadas.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        lbl_4dGroupCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_4dGroupCadas.setText("4D Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 220, 26, 263);
        jPanel5.add(lbl_4dGroupCadas, gridBagConstraints);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        lbl_logoCadas.setBackground(new java.awt.Color(241, 241, 241));
        lbl_logoCadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Untitled-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 13, 7);
        jPanel6.add(lbl_logoCadas, gridBagConstraints);

        jPanel3.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        lbl_companyCadas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_companyCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_companyCadas.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 490, 8, 358);
        jPanel7.add(lbl_companyCadas, gridBagConstraints);

        jPanel4.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 70));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        lbl_cadasCanaisCadas.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_cadasCanaisCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_cadasCanaisCadas.setText("Cadastro de Canal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 320, 6, 223);
        jPanel9.add(lbl_cadasCanaisCadas, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setPreferredSize(new java.awt.Dimension(950, 100));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        txt_canalCadas.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_canalCadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_canalCadasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 196;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 190, 0, 0);
        jPanel10.add(txt_canalCadas, gridBagConstraints);

        cmb_TipoCanalCadas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmb_TipoCanalCadas.setForeground(new java.awt.Color(45, 18, 75));
        cmb_TipoCanalCadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MarketPlace", "Plataforma/ERP", "Meio de Pagamento" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 13;
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
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 60, 0, 0);
        jPanel10.add(lbl_padAutCadas, gridBagConstraints);

        cmb_padAutCadas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmb_padAutCadas.setForeground(new java.awt.Color(45, 18, 75));
        cmb_padAutCadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário e Senha", "Token", " " }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 60, 0, 170);
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
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 90, 65, 0);
        jPanel10.add(btn_salvarCadas, gridBagConstraints);

        btn_limparCadCanal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_limparCadCanal.setForeground(new java.awt.Color(255, 62, 21));
        btn_limparCadCanal.setText("Limpar");
        btn_limparCadCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCadCanalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 230, 65, 0);
        jPanel10.add(btn_limparCadCanal, gridBagConstraints);

        lbl_canalCadas1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canalCadas1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_canalCadas1.setText("Canal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 190, 0, 0);
        jPanel10.add(lbl_canalCadas1, gridBagConstraints);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        if(cliente != null){
            boolean a = new VerificarAcesso().acess(cliente);
            if(a == false){
                JOptionPane.showMessageDialog(null, "Não tem permissão para acessar nessa página");
                this.dispose();
                new LoginGUI().setVisible(true);
            }
        }      
        
    }//GEN-LAST:event_formWindowOpened

    private void btn_SairLogoutAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairLogoutAdmActionPerformed
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
        //new TelaPrincipal().setVisible(true);
        //this.dispose();
        
    }//GEN-LAST:event_btn_SairLogoutAdmActionPerformed

    private void btn_ConfigAtivasADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfigAtivasADMActionPerformed
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal= (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            PaginaCadastrosAtivosAdm paginaCadastroAtivosAdm = new PaginaCadastrosAtivosAdm(user);
            paginaCadastroAtivosAdm.setExtendedState(Frame.MAXIMIZED_BOTH);
            paginaCadastroAtivosAdm.setVisible(true);
            this.dispose();
        } else {
            PaginaCadastrosAtivosAdm paginaCadastroAtivosAdm = new PaginaCadastrosAtivosAdm(user);
            paginaCadastroAtivosAdm.setVisible(true);
            this.dispose();
        }
        //new PaginaCadastrosAtivosAdm(user).setVisible(true);
        //this.dispose();
        
    }//GEN-LAST:event_btn_ConfigAtivasADMActionPerformed

    private void btn_ConfigAtivas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfigAtivas1ActionPerformed
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal= (int) telaOriginal.getWidth();
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
        
    }//GEN-LAST:event_btn_ConfigAtivas1ActionPerformed

    private void txt_canalCadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_canalCadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_canalCadasActionPerformed

    private void btn_salvarCadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarCadasActionPerformed

        Canal c = new Canal();

        c.setEmpresa(txt_canalCadas.getText());
        c.setPlataforma((String) cmb_TipoCanalCadas.getSelectedItem());
        c.setAutenticacao((String) cmb_padAutCadas.getSelectedItem());

        if(!c.getAutenticacao().equals("Token")){
            c.setAutenticacao("Login");
        }

        if((txt_canalCadas.getText().isEmpty())){

            JOptionPane.showMessageDialog(null,"O campo não pode retornar vazio");

        }else{

            CanalConfigDAO dao= new CanalConfigDAO();
            dao.cadastro(c, user);

        }

    }//GEN-LAST:event_btn_salvarCadasActionPerformed

    private void btn_limparCadCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCadCanalActionPerformed

        txt_canalCadas.setText("");

    }//GEN-LAST:event_btn_limparCadCanalActionPerformed

    
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
            java.util.logging.Logger.getLogger(PaginaCadastroConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PaginaCadastroConfig(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ConfigAtivas1;
    private javax.swing.JButton btn_ConfigAtivasADM;
    private javax.swing.JButton btn_SairLogoutAdm;
    private javax.swing.JButton btn_limparCadCanal;
    private javax.swing.JButton btn_salvarCadas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_TipoCanalCadas;
    private javax.swing.JComboBox<String> cmb_padAutCadas;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JLabel lbl_canalCadas1;
    private javax.swing.JLabel lbl_companyCadas;
    private javax.swing.JLabel lbl_logoCadas;
    private javax.swing.JLabel lbl_padAutCadas;
    private javax.swing.JPanel panel_quadLarCadas;
    private javax.swing.JTextField txt_canalCadas;
    // End of variables declaration//GEN-END:variables
}
