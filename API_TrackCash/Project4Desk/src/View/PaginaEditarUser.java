package View;

import Controller.Dados;
import Controller.Table;
import javax.swing.table.DefaultTableModel;
import connection.PesqUser;
import java.awt.Dimension;
import java.awt.Frame;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class PaginaEditarUser extends javax.swing.JFrame {

    private PesqUser DAO;
    private boolean atividade;
    private static Usuario user;

    public PaginaEditarUser(Usuario u) {
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

        jPanel_Menu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_LogoTelaPrincipal = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btn_SairLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_confAtivas1 = new javax.swing.JLabel();
        btn_CadastrarCanal = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbl_User = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        lbl_Email = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        lbl_Senha = new javax.swing.JLabel();
        txt_Senha = new javax.swing.JTextField();
        btn_Limpar = new javax.swing.JButton();
        lbl_idUserStatic = new javax.swing.JLabel();
        lbl_idUser = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        lbl_Perfil = new javax.swing.JLabel();
        btn_AtualizarDados = new javax.swing.JButton();
        lbl_userInfoUs2 = new javax.swing.JLabel();
        cbx_Perfil = new javax.swing.JComboBox<>();
        chb_Ativar = new javax.swing.JCheckBox();
        chb_Desativar = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Contas = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        lbl_Contas = new javax.swing.JLabel();
        lbl_Filtros = new javax.swing.JLabel();
        txt_Busca = new javax.swing.JFormattedTextField();
        lbl_Pesquisar = new javax.swing.JLabel();
        btn_Excluir = new javax.swing.JButton();
        btn_CarregarCampos = new javax.swing.JButton();

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
        jPanel16.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel16.setLayout(null);

        btn_SairLogout.setBackground(new java.awt.Color(204, 204, 204));
        btn_SairLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_SairLogout.setText("Sair");
        btn_SairLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairLogoutActionPerformed(evt);
            }
        });
        jPanel16.add(btn_SairLogout);
        btn_SairLogout.setBounds(60, 140, 120, 40);

        jPanel_Menu.add(jPanel16, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel_Menu, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setMinimumSize(new java.awt.Dimension(850, 630));
        jPanel2.setPreferredSize(new java.awt.Dimension(950, 630));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel4.setLayout(null);

        lbl_confAtivas1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbl_confAtivas1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_confAtivas1.setText("Edição de Usuário");
        jPanel4.add(lbl_confAtivas1);
        lbl_confAtivas1.setBounds(350, 10, 251, 41);

        btn_CadastrarCanal.setBackground(new java.awt.Color(255, 62, 21));
        btn_CadastrarCanal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_CadastrarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal.setText("Voltar");
        btn_CadastrarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanalActionPerformed(evt);
            }
        });
        jPanel4.add(btn_CadastrarCanal);
        btn_CadastrarCanal.setBounds(10, 20, 88, 32);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(null);

        lbl_User.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_User.setForeground(new java.awt.Color(45, 18, 75));
        lbl_User.setText("Usuário");
        jPanel6.add(lbl_User);
        lbl_User.setBounds(100, 30, 65, 25);

        txt_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });
        jPanel6.add(txt_Usuario);
        txt_Usuario.setBounds(100, 60, 250, 30);

        lbl_Email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Email.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Email.setText("Email");
        jPanel6.add(lbl_Email);
        lbl_Email.setBounds(360, 30, 60, 25);

        txt_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });
        jPanel6.add(txt_Email);
        txt_Email.setBounds(360, 60, 240, 30);

        lbl_Senha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Senha.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Senha.setText("Senha");
        jPanel6.add(lbl_Senha);
        lbl_Senha.setBounds(610, 30, 70, 25);

        txt_Senha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Senha.setToolTipText("");
        txt_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SenhaActionPerformed(evt);
            }
        });
        jPanel6.add(txt_Senha);
        txt_Senha.setBounds(610, 60, 240, 30);

        btn_Limpar.setBackground(new java.awt.Color(45, 18, 75));
        btn_Limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Limpar.setForeground(new java.awt.Color(236, 236, 236));
        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });
        jPanel6.add(btn_Limpar);
        btn_Limpar.setBounds(750, 10, 130, 23);

        lbl_idUserStatic.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_idUserStatic.setForeground(new java.awt.Color(45, 18, 75));
        lbl_idUserStatic.setText("ID User");
        jPanel6.add(lbl_idUserStatic);
        lbl_idUserStatic.setBounds(10, 10, 70, 20);

        lbl_idUser.setBackground(new java.awt.Color(204, 204, 204));
        lbl_idUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_idUser.setForeground(new java.awt.Color(45, 18, 75));
        jPanel6.add(lbl_idUser);
        lbl_idUser.setBounds(80, 10, 160, 20);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(241, 241, 241));
        jPanel18.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel18.setLayout(null);

        lbl_Perfil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Perfil.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Perfil.setText("Perfil");
        jPanel18.add(lbl_Perfil);
        lbl_Perfil.setBounds(300, 0, 50, 25);

        btn_AtualizarDados.setText("Atualizar informações");
        btn_AtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarDadosActionPerformed(evt);
            }
        });
        jPanel18.add(btn_AtualizarDados);
        btn_AtualizarDados.setBounds(700, 20, 150, 50);

        lbl_userInfoUs2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_userInfoUs2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_userInfoUs2.setText("Atividade");
        jPanel18.add(lbl_userInfoUs2);
        lbl_userInfoUs2.setBounds(100, 0, 90, 25);

        cbx_Perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Admin" }));
        jPanel18.add(cbx_Perfil);
        cbx_Perfil.setBounds(300, 30, 120, 22);

        chb_Ativar.setText("Ativar");
        chb_Ativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_AtivarActionPerformed(evt);
            }
        });
        jPanel18.add(chb_Ativar);
        chb_Ativar.setBounds(100, 30, 54, 20);

        chb_Desativar.setText("Desativar");
        chb_Desativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_DesativarActionPerformed(evt);
            }
        });
        jPanel18.add(chb_Desativar);
        chb_Desativar.setBounds(100, 50, 71, 20);

        jPanel8.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(241, 241, 241));
        jPanel12.setLayout(new java.awt.GridBagLayout());

        jPanel22.setBackground(new java.awt.Color(241, 241, 241));
        jPanel22.setMinimumSize(new java.awt.Dimension(950, 200));
        jPanel22.setPreferredSize(new java.awt.Dimension(100, 250));
        jPanel22.setLayout(null);

        tbl_Contas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Usuario", "Nome", "Sobrenome", "Email", "Senha", "Atividade", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Contas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ContasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_Contas);

        jPanel22.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 900, 270);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel12.add(jPanel22, gridBagConstraints);

        jPanel11.setBackground(new java.awt.Color(241, 241, 241));
        jPanel11.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel11.setLayout(null);

        lbl_Contas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Contas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Contas.setText("Contas");
        jPanel11.add(lbl_Contas);
        lbl_Contas.setBounds(90, 0, 60, 25);

        lbl_Filtros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Filtros.setForeground(new java.awt.Color(45, 18, 75));
        lbl_Filtros.setText("Filtros");
        jPanel11.add(lbl_Filtros);
        lbl_Filtros.setBounds(450, 0, 52, 25);

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
        jPanel11.add(txt_Busca);
        txt_Busca.setBounds(520, 0, 300, 30);

        lbl_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons8-pesquisar-30.png"))); // NOI18N
        lbl_Pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_PesquisarMouseClicked(evt);
            }
        });
        jPanel11.add(lbl_Pesquisar);
        lbl_Pesquisar.setBounds(830, 0, 30, 30);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 909;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel12.add(jPanel11, gridBagConstraints);

        btn_Excluir.setBackground(new java.awt.Color(41, 12, 74));
        btn_Excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Excluir.setForeground(new java.awt.Color(239, 239, 239));
        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 620, 5, 0);
        jPanel12.add(btn_Excluir, gridBagConstraints);

        btn_CarregarCampos.setBackground(new java.awt.Color(239, 239, 239));
        btn_CarregarCampos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_CarregarCampos.setForeground(new java.awt.Color(45, 18, 75));
        btn_CarregarCampos.setText("Carregar Campos");
        btn_CarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CarregarCamposActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 5, 0);
        jPanel12.add(btn_CarregarCampos, gridBagConstraints);

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

        Table.carregarTableConta(tbl_Contas, user);
        btn_AtualizarDados.setEnabled(false);

    }//GEN-LAST:event_formWindowOpened

    private void btn_CadastrarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalActionPerformed

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

    }//GEN-LAST:event_btn_SairLogoutActionPerformed

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed

    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed

    }//GEN-LAST:event_txt_EmailActionPerformed

    private void txt_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SenhaActionPerformed

    }//GEN-LAST:event_txt_SenhaActionPerformed

    private void btn_AtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarDadosActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar os dados?", "ATENÇÃO", 1);

        if (resp == JOptionPane.YES_OPTION) {
            int id;
            boolean atv = this.atividade;
            String usuario, email, senha, perfil;

            id = Integer.parseInt(lbl_idUser.getText());
            usuario = txt_Usuario.getText();
            email = txt_Email.getText();
            senha = txt_Senha.getText();
            perfil = cbx_Perfil.getSelectedItem().toString();

            if (!usuario.equals("") && !email.equals("") && !senha.equals("")) {

                Dados.alterarDadosConta(id, usuario, email, senha, atv, perfil);

                Table.carregarTableConta(tbl_Contas, user);
            } else {
                JOptionPane.showMessageDialog(null, "Não pode deixar nenhum campo vazio!");
            }
        }

    }//GEN-LAST:event_btn_AtualizarDadosActionPerformed

    private void txt_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscaActionPerformed

    }//GEN-LAST:event_txt_BuscaActionPerformed

    private void txt_BuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscaKeyReleased

        String busca = txt_Busca.getText();
        String campo = "Usuario";
        String ordem = "asc";

        Table.filtroBuscaConta(tbl_Contas, busca, campo, ordem, DAO);

    }//GEN-LAST:event_txt_BuscaKeyReleased

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed

        if (tbl_Contas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um canal para excluir!");
        } else {

            Table.excluirCanal(tbl_Contas, user);

            DefaultTableModel modelo = (DefaultTableModel) tbl_Contas.getModel();
            modelo.removeRow(tbl_Contas.getSelectedRow());

        }

    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void btn_CarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CarregarCamposActionPerformed

        btn_AtualizarDados.setEnabled(true);

        int setar = tbl_Contas.getSelectedRow();

        carregarCampos(setar);

    }//GEN-LAST:event_btn_CarregarCamposActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed

        LimparCampos();

    }//GEN-LAST:event_btn_LimparActionPerformed

    private void lbl_PesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_PesquisarMouseClicked

    }//GEN-LAST:event_lbl_PesquisarMouseClicked

    private void chb_AtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_AtivarActionPerformed

        this.atividade = true;
        chb_Ativar.setSelected(true);
        chb_Desativar.setSelected(false);

    }//GEN-LAST:event_chb_AtivarActionPerformed

    private void chb_DesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_DesativarActionPerformed

        this.atividade = false;
        chb_Ativar.setSelected(false);
        chb_Desativar.setSelected(true);

    }//GEN-LAST:event_chb_DesativarActionPerformed

    private void tbl_ContasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ContasMouseClicked

        btn_AtualizarDados.setEnabled(true);

        int setar = tbl_Contas.getSelectedRow();

        carregarCampos(setar);

    }//GEN-LAST:event_tbl_ContasMouseClicked

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
            java.util.logging.Logger.getLogger(PaginaEditarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaEditarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaEditarUser(user).setVisible(true);
            }
        });
    }

    private void carregarCampos(int linha) {

        String a = tbl_Contas.getModel().getValueAt(linha, 6).toString();
        String p = tbl_Contas.getModel().getValueAt(linha, 7).toString();

        lbl_idUser.setText(tbl_Contas.getModel().getValueAt(linha, 0).toString());
        txt_Usuario.setText(tbl_Contas.getModel().getValueAt(linha, 1).toString());
        txt_Email.setText(tbl_Contas.getModel().getValueAt(linha, 4).toString());
        txt_Senha.setText(tbl_Contas.getModel().getValueAt(linha, 5).toString());

        if (a.equals("Ativo")) {
            this.atividade = true;
            chb_Ativar.setSelected(true);
            chb_Desativar.setSelected(false);
        } else {
            this.atividade = false;
            chb_Ativar.setSelected(false);
            chb_Desativar.setSelected(true);
        }

        switch (p) {
            case "Comum":
                cbx_Perfil.setSelectedIndex(1);
                break;
            case "Admin":
                cbx_Perfil.setSelectedIndex(2);
                break;
            case "Master":
                cbx_Perfil.setSelectedIndex(1);
                break;
        }

    }

    private void LimparCampos() {

        txt_Usuario.setText("");
        txt_Email.setText("");
        txt_Senha.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AtualizarDados;
    private javax.swing.JButton btn_CadastrarCanal;
    private javax.swing.JButton btn_CarregarCampos;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_SairLogout;
    private javax.swing.JComboBox<String> cbx_Perfil;
    private javax.swing.JCheckBox chb_Ativar;
    private javax.swing.JCheckBox chb_Desativar;
    private javax.swing.JLabel jLabel_LogoTelaPrincipal;
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
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Contas;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Filtros;
    private javax.swing.JLabel lbl_Perfil;
    private javax.swing.JLabel lbl_Pesquisar;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lbl_User;
    private javax.swing.JLabel lbl_confAtivas1;
    private javax.swing.JLabel lbl_idUser;
    private javax.swing.JLabel lbl_idUserStatic;
    private javax.swing.JLabel lbl_userInfoUs2;
    private javax.swing.JTable tbl_Contas;
    private javax.swing.JFormattedTextField txt_Busca;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Senha;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
