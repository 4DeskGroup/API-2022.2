package View;

import Controller.Dados;
import Controller.Table;
import javax.swing.table.DefaultTableModel;
import connection.PesqUser;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.bean.Usuario;
import javax.swing.ImageIcon;

public class PaginaEditarUserProprio extends javax.swing.JFrame {

    private PesqUser DAO;
    private boolean atividade;
    private static Usuario user;

    public PaginaEditarUserProprio(Usuario u) {
        this.user = u;
        initComponents();
        try {
            DAO = new PesqUser(u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco!\n" + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_NomeUser = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        lbl_idUserStatic = new javax.swing.JLabel();
        lbl_idUserProprio = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        txt_UsuarioProprio = new javax.swing.JTextField();
        lbl_User = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        txt_EmailProprio = new javax.swing.JTextField();
        lbl_Senha = new javax.swing.JLabel();
        txt_SenhaProprio = new javax.swing.JTextField();
        btn_AtualizarDados = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        btn_Excluir = new javax.swing.JButton();
        btn_Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Perfil");
        setIconImage(new ImageIcon(getClass().getResource("/View/imagens/4Desk_Gigante.png")).getImage());
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 100, 67));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 100, 67));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 100));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lbl_NomeUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_NomeUser.setForeground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 219;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 65, 277);
        jPanel2.add(lbl_NomeUser, gridBagConstraints);

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 100, 67));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/4d__4_-removebg-preview peq.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 30, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" 4D Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 210);
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 30, 0, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(132, 132, 132));
        jPanel5.setPreferredSize(new java.awt.Dimension(1200, 80));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(132, 132, 132));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 18, 75));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Editar_Perfil_2D124B.png"))); // NOI18N
        jLabel6.setText("          Editar Perfil");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 375, 10, 375);
        jPanel6.add(jLabel6, gridBagConstraints);

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(87, 65, 111));
        jPanel9.setPreferredSize(new java.awt.Dimension(0, 80));
        jPanel9.setLayout(new java.awt.GridBagLayout());
        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setPreferredSize(new java.awt.Dimension(960, 105));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setMinimumSize(new java.awt.Dimension(1200, 300));
        jPanel11.setPreferredSize(new java.awt.Dimension(1200, 300));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar Perfil"));
        jPanel12.setMinimumSize(new java.awt.Dimension(1200, 165));
        jPanel12.setPreferredSize(new java.awt.Dimension(1200, 165));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setMinimumSize(new java.awt.Dimension(1000, 70));
        jPanel13.setPreferredSize(new java.awt.Dimension(1000, 70));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(241, 241, 241));
        jPanel14.setMinimumSize(new java.awt.Dimension(1200, 100));
        jPanel14.setLayout(new java.awt.GridBagLayout());

        lbl_idUserStatic.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_idUserStatic.setForeground(new java.awt.Color(45, 18, 75));
        lbl_idUserStatic.setText("ID User");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 150, 0, 0);
        jPanel14.add(lbl_idUserStatic, gridBagConstraints);

        lbl_idUserProprio.setBackground(new java.awt.Color(204, 204, 204));
        lbl_idUserProprio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_idUserProprio.setForeground(new java.awt.Color(45, 18, 75));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 150, 0, 600);
        jPanel14.add(lbl_idUserProprio, gridBagConstraints);

        jPanel13.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel15.setMinimumSize(new java.awt.Dimension(1200, 100));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setMinimumSize(new java.awt.Dimension(1200, 80));
        jPanel16.setPreferredSize(new java.awt.Dimension(1200, 80));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(241, 241, 241));
        jPanel17.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel17.setLayout(new java.awt.GridBagLayout());

        txt_UsuarioProprio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_UsuarioProprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioProprioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 45, 0, 0);
        jPanel17.add(txt_UsuarioProprio, gridBagConstraints);

        lbl_User.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_User.setForeground(new java.awt.Color(45, 18, 75));
        lbl_User.setText("Usuário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 45, 0, 0);
        jPanel17.add(lbl_User, gridBagConstraints);

        lbl_Email.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_Email.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Email.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel17.add(lbl_Email, gridBagConstraints);

        txt_EmailProprio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_EmailProprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailProprioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 0, 0);
        jPanel17.add(txt_EmailProprio, gridBagConstraints);

        lbl_Senha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_Senha.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Senha.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel17.add(lbl_Senha, gridBagConstraints);

        txt_SenhaProprio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_SenhaProprio.setToolTipText("");
        txt_SenhaProprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SenhaProprioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 0, 0);
        jPanel17.add(txt_SenhaProprio, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 45);
        jPanel17.add(btn_AtualizarDados, gridBagConstraints);

        jPanel16.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel15.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel19.setMinimumSize(new java.awt.Dimension(1200, 80));
        jPanel19.setPreferredSize(new java.awt.Dimension(1200, 80));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel20.setBackground(new java.awt.Color(241, 241, 241));
        jPanel20.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel20.setLayout(new java.awt.GridBagLayout());

        btn_Excluir.setBackground(new java.awt.Color(41, 12, 74));
        btn_Excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Excluir.setForeground(new java.awt.Color(239, 239, 239));
        btn_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Excluir_FFFFFF.png"))); // NOI18N
        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 290, 20, 170);
        jPanel20.add(btn_Excluir, gridBagConstraints);

        btn_Voltar.setBackground(new java.awt.Color(255, 62, 21));
        btn_Voltar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_Voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Voltar_FFFFFF_pequeno.png"))); // NOI18N
        btn_Voltar.setText("Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 190, 20, 0);
        jPanel20.add(btn_Voltar, gridBagConstraints);

        jPanel19.add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel18.add(jPanel19, java.awt.BorderLayout.PAGE_START);

        jPanel15.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        lbl_NomeUser.setText("Olá, " + user.getNome());
        String idUser = Integer.toString(user.getId());
        lbl_idUserProprio.setText(idUser);
        txt_UsuarioProprio.setText(user.getUser());
        txt_EmailProprio.setText(user.getEmail());
        txt_SenhaProprio.setText(user.getPass());


    }//GEN-LAST:event_formWindowOpened

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2KeyPressed

    private void txt_UsuarioProprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioProprioActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsuarioProprioActionPerformed

    private void txt_EmailProprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailProprioActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailProprioActionPerformed

    private void txt_SenhaProprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SenhaProprioActionPerformed

        if (!txt_UsuarioProprio.getText().equals("Token")) {
            txt_SenhaProprio.setEditable(false);
        }
    }//GEN-LAST:event_txt_SenhaProprioActionPerformed

    private void btn_AtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarDadosActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar os dados?", "ATENÇÃO", 1);

        int id;
        boolean atv = this.atividade;
        String usuario, email, senha;

        id = Integer.parseInt(lbl_idUserProprio.getText());
        usuario = txt_UsuarioProprio.getText();
        email = txt_EmailProprio.getText();
        senha = txt_SenhaProprio.getText();

        if (!usuario.equals("") && !email.equals("") && !senha.equals("")) {

            Dados.alterarDadosContaProprio(id, usuario, email, senha);
            user.setUser(txt_UsuarioProprio.getText());
            user.setEmail(txt_EmailProprio.getText());
            user.setPass(txt_SenhaProprio.getText());
            id = Integer.parseInt(lbl_idUserProprio.getText());
            usuario = txt_UsuarioProprio.getText();
            email = txt_EmailProprio.getText();
            senha = txt_SenhaProprio.getText();
        } else {
            JOptionPane.showMessageDialog(null, "Não pode deixar nenhum campo vazio!");
        }

    }//GEN-LAST:event_btn_AtualizarDadosActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir sua conta?", "ATENÇÃO", 1);

        if (resp == JOptionPane.YES_OPTION) {
            int deletar = user.getId();
            Dados.deleteUser(deletar);

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

    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed

       this.dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaEditarUserProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarUserProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarUserProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarUserProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaEditarUserProprio(user).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AtualizarDados;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_NomeUser;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lbl_User;
    private javax.swing.JLabel lbl_idUserProprio;
    private javax.swing.JLabel lbl_idUserStatic;
    private javax.swing.JTextField txt_EmailProprio;
    private javax.swing.JTextField txt_SenhaProprio;
    private javax.swing.JTextField txt_UsuarioProprio;
    // End of variables declaration//GEN-END:variables
}
