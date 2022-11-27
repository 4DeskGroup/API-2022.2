package GUI;

import Controller.Dados;
import model.dao.UsuarioDAO;
import model.bean.Usuario;
import View.TelaPrincipal;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class CadastroGUI extends javax.swing.JFrame {

    public CadastroGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        lbl_companyTelaPrincipal10 = new javax.swing.JLabel();
        lbl_companyTelaPrincipal11 = new javax.swing.JLabel();
        lbl_companyTelaPrincipal12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Sobrenome = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_User = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_Pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txt_RPass = new javax.swing.JPasswordField();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        cb_visualizar = new javax.swing.JCheckBox();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        cb_TermUso = new javax.swing.JCheckBox();
        cb_PolPrivacidade = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        btn_cadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setIconImage(new ImageIcon(getClass().getResource("/View/imagens/4Desk_Gigante.png")).getImage());
        setMinimumSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 550));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setMinimumSize(new java.awt.Dimension(790, 490));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 62, 21));
        jPanel6.setPreferredSize(new java.awt.Dimension(220, 490));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 62, 21));
        jPanel8.setPreferredSize(new java.awt.Dimension(220, 170));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/4Desk_grande.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -3;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 45, 25, 45);
        jPanel8.add(jLabel9, gridBagConstraints);

        jPanel6.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setBackground(new java.awt.Color(255, 62, 21));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 62, 21));
        jPanel10.setPreferredSize(new java.awt.Dimension(220, 55));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 241, 241));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Já tem Conta?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 30);
        jPanel10.add(jLabel3, gridBagConstraints);

        jPanel9.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel11.setBackground(new java.awt.Color(255, 62, 21));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(255, 62, 21));
        jPanel12.setPreferredSize(new java.awt.Dimension(220, 160));
        jPanel12.setLayout(new java.awt.GridBagLayout());

        btn_login.setBackground(new java.awt.Color(45, 18, 75));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Clique Aqui");
        btn_login.setBorder(null);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        btn_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_loginKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 0, 0);
        jPanel12.add(btn_login, gridBagConstraints);

        lbl_companyTelaPrincipal10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_companyTelaPrincipal10.setForeground(new java.awt.Color(45, 18, 75));
        lbl_companyTelaPrincipal10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/seta-para-cima.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 100, 0, 0);
        jPanel12.add(lbl_companyTelaPrincipal10, gridBagConstraints);

        lbl_companyTelaPrincipal11.setForeground(new java.awt.Color(255, 255, 255));
        lbl_companyTelaPrincipal11.setText("Tecla F7 para Computador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 40, 0, 41);
        jPanel12.add(lbl_companyTelaPrincipal11, gridBagConstraints);

        lbl_companyTelaPrincipal12.setForeground(new java.awt.Color(255, 255, 255));
        lbl_companyTelaPrincipal12.setText("e 7 para Notebook");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 60, 34, 0);
        jPanel12.add(lbl_companyTelaPrincipal12, gridBagConstraints);

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel9.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setPreferredSize(new java.awt.Dimension(570, 490));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(241, 241, 241));
        jPanel13.setPreferredSize(new java.awt.Dimension(570, 80));
        jPanel13.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Cadastro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 210, 15, 210);
        jPanel13.add(jLabel6, gridBagConstraints);

        jPanel7.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBackground(new java.awt.Color(241, 241, 241));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(241, 241, 241));
        jPanel15.setPreferredSize(new java.awt.Dimension(570, 70));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Nome (Opcional)");

        txt_Nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Nome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeActionPerformed(evt);
            }
        });
        txt_Nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_NomeKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("Sobrenome (Opcional)");

        txt_Sobrenome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Sobrenome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Sobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SobrenomeActionPerformed(evt);
            }
        });
        txt_Sobrenome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_SobrenomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(txt_Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel14.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel16.setBackground(new java.awt.Color(241, 241, 241));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(241, 241, 241));
        jPanel17.setPreferredSize(new java.awt.Dimension(570, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Usuário (*)");

        txt_User.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_User.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UserActionPerformed(evt);
            }
        });
        txt_User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_UserKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Email (*)");

        txt_Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });
        txt_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_EmailKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txt_User, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_User, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel16.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel18.setBackground(new java.awt.Color(241, 241, 241));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel19.setBackground(new java.awt.Color(241, 241, 241));
        jPanel19.setPreferredSize(new java.awt.Dimension(570, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Senha (*)");

        txt_Pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Pass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PassActionPerformed(evt);
            }
        });
        txt_Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_PassKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Repetir senha (*)");

        txt_RPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_RPass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_RPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RPassActionPerformed(evt);
            }
        });
        txt_RPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_RPassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel4)
                .addGap(190, 190, 190)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(txt_RPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_RPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        txt_RPass.getAccessibleContext().setAccessibleName("");

        jPanel18.add(jPanel19, java.awt.BorderLayout.PAGE_START);

        jPanel20.setBackground(new java.awt.Color(241, 241, 241));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel21.setBackground(new java.awt.Color(241, 241, 241));
        jPanel21.setPreferredSize(new java.awt.Dimension(570, 40));
        jPanel21.setLayout(new java.awt.GridBagLayout());

        cb_visualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_visualizar.setForeground(new java.awt.Color(102, 0, 102));
        cb_visualizar.setText("Visualizar senha");
        cb_visualizar.setFocusPainted(false);
        cb_visualizar.setFocusable(false);
        cb_visualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cb_visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_visualizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 220, 10, 220);
        jPanel21.add(cb_visualizar, gridBagConstraints);

        jPanel20.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        jPanel22.setBackground(new java.awt.Color(241, 241, 241));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel23.setBackground(new java.awt.Color(241, 241, 241));
        jPanel23.setPreferredSize(new java.awt.Dimension(570, 60));
        jPanel23.setLayout(new java.awt.GridBagLayout());

        cb_TermUso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_TermUso.setForeground(new java.awt.Color(102, 0, 102));
        cb_TermUso.setText("Li e Aceito os Termos de Uso");
        cb_TermUso.setFocusPainted(false);
        cb_TermUso.setFocusable(false);
        cb_TermUso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cb_TermUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TermUsoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 60, 0, 0);
        jPanel23.add(cb_TermUso, gridBagConstraints);

        cb_PolPrivacidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_PolPrivacidade.setForeground(new java.awt.Color(102, 0, 102));
        cb_PolPrivacidade.setText("Li e Aceito a Política de Privacidade ");
        cb_PolPrivacidade.setFocusPainted(false);
        cb_PolPrivacidade.setFocusable(false);
        cb_PolPrivacidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cb_PolPrivacidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_PolPrivacidadeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 55, 0, 0);
        jPanel23.add(cb_PolPrivacidade, gridBagConstraints);

        jButton1.setText("Clique Aqui");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 55, 0, 60);
        jPanel23.add(jButton1, gridBagConstraints);

        jButton2.setText("Clique Aqui");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 55, 5, 60);
        jPanel23.add(jButton2, gridBagConstraints);

        jPanel22.add(jPanel23, java.awt.BorderLayout.PAGE_START);

        jPanel24.setBackground(new java.awt.Color(241, 241, 241));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jPanel25.setBackground(new java.awt.Color(241, 241, 241));
        jPanel25.setPreferredSize(new java.awt.Dimension(0, 100));
        jPanel25.setLayout(new java.awt.GridBagLayout());

        btn_cadastrar.setBackground(new java.awt.Color(255, 62, 21));
        btn_cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.setBorder(null);
        btn_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 0);
        jPanel25.add(btn_cadastrar, gridBagConstraints);

        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Campos com (*) são obrigatorios");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 140, 4, 15);
        jPanel25.add(jLabel8, gridBagConstraints);

        btn_limpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_limpar.setForeground(new java.awt.Color(255, 62, 21));
        btn_limpar.setText("Limpar");
        btn_limpar.setBorder(null);
        btn_limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 110, 0, 0);
        jPanel25.add(btn_limpar, gridBagConstraints);

        jPanel24.add(jPanel25, java.awt.BorderLayout.PAGE_START);

        jPanel22.add(jPanel24, java.awt.BorderLayout.CENTER);

        jPanel20.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 28, 28);
        jPanel3.add(jPanel4, gridBagConstraints);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setExtendedState(Frame.MAXIMIZED_BOTH);
            loginGUI.setVisible(true);
            this.dispose();
        } else {
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setVisible(true);
            this.dispose();
        }
        //new LoginGUI().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_loginKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_F7) || (evt.getKeyCode() == KeyEvent.VK_7)) {
            Dimension telaOriginal = getPreferredSize();
            Dimension telaRecente = getSize();

            int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
            int tamanhoTelaRecente = (int) telaRecente.getWidth();

            if (tamanhoTelaOriginal < tamanhoTelaRecente) {
                LoginGUI loginGUI = new LoginGUI();
                loginGUI.setExtendedState(Frame.MAXIMIZED_BOTH);
                loginGUI.setVisible(true);
                this.dispose();
            } else {
                LoginGUI loginGUI = new LoginGUI();
                loginGUI.setVisible(true);
                this.dispose();
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_Nome.requestFocus();
        }
    }//GEN-LAST:event_btn_loginKeyPressed

    private void txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeActionPerformed

    }//GEN-LAST:event_txt_NomeActionPerformed

    private void txt_NomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NomeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_Sobrenome.requestFocus();
        }
    }//GEN-LAST:event_txt_NomeKeyPressed

    private void txt_SobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SobrenomeActionPerformed

    private void txt_SobrenomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SobrenomeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_User.requestFocus();
        }
    }//GEN-LAST:event_txt_SobrenomeKeyPressed

    private void txt_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UserActionPerformed

    }//GEN-LAST:event_txt_UserActionPerformed

    private void txt_UserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_Email.requestFocus();
        }
    }//GEN-LAST:event_txt_UserKeyPressed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed

    }//GEN-LAST:event_txt_EmailActionPerformed

    private void txt_EmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EmailKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_Pass.requestFocus();
        }
    }//GEN-LAST:event_txt_EmailKeyPressed

    private void txt_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PassActionPerformed

    }//GEN-LAST:event_txt_PassActionPerformed

    private void txt_PassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PassKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_RPass.requestFocus();
        }
    }//GEN-LAST:event_txt_PassKeyPressed

    private void txt_RPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RPassActionPerformed

    }//GEN-LAST:event_txt_RPassActionPerformed

    private void txt_RPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RPassKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String strPass = new String(txt_Pass.getPassword());
            String strRPass = new String(txt_RPass.getPassword());

            if ((txt_User.getText().equals("") || txt_User.getText().equals(" ")) || (txt_Email.getText().equals("") || txt_Email.getText().equals(" ")) || strPass.equals("") || strRPass.equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios! (*)");
                txt_User.requestFocus();
            } else if (txt_Pass.getPassword().length < 3) {
                JOptionPane.showMessageDialog(null, "Senha tem que ter mais de 3 caracters");
            } else if (strPass.equals(strRPass) == false) {
                JOptionPane.showMessageDialog(null, "Repetir senha e Senha devem ser iguais!");
            } else {
                Usuario cliente = new Usuario(txt_Nome.getText(), txt_Sobrenome.getText(), txt_User.getText(), txt_Email.getText(), strPass);
                Dados.addConta(cliente);
            }
            strPass = null;
            strRPass = null;

        }
    }//GEN-LAST:event_txt_RPassKeyPressed

    private void cb_visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_visualizarActionPerformed

        if (txt_Pass.getEchoChar() == '*') {
            txt_Pass.setEchoChar((char) 0);
            txt_RPass.setEchoChar((char) 0);
        } else {
            txt_Pass.setEchoChar('*');
            txt_RPass.setEchoChar('*');
        }
    }//GEN-LAST:event_cb_visualizarActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed

        String strPass = new String(txt_Pass.getPassword());
        String strRPass = new String(txt_RPass.getPassword());

        if ((txt_User.getText().equals("") || txt_User.getText().equals(" ")) || (txt_Email.getText().equals("") || txt_Email.getText().equals(" ")) || strPass.equals("") || strRPass.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios! (*)");
        } else if (txt_Pass.getPassword().length < 3) {
            JOptionPane.showMessageDialog(null, "Senha tem que ter mais de 3 caracters");
        } else if (strPass.equals(strRPass) == false) {
            JOptionPane.showMessageDialog(null, "Repetir senha e Senha devem ser iguais!");
        } 
          
        else {
            if (Email_Validation() == true){
            Usuario cliente = new Usuario(txt_Nome.getText(), txt_Sobrenome.getText(), txt_User.getText(), txt_Email.getText(), strPass);
            Dados.addConta(cliente);
            }
            
            
        }
        strPass = null;
        strRPass = null;
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void cb_TermUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TermUsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_TermUsoActionPerformed

    private void cb_PolPrivacidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_PolPrivacidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_PolPrivacidadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            URI link = new URI("https://drive.google.com/file/d/1LJwB3C0FBLlrqbzFSFoNR-GPI-wzqgx7/view?usp=share_link");
            
            if(link.equals(link)){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().browse(link);
                }else{
                    JOptionPane.showMessageDialog(this, "Not Supported");
                }   
            }else{
                JOptionPane.showMessageDialog(this, "File Not Exist");
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            URI link = new URI("https://drive.google.com/file/d/1uWcRtT2pvh9KkIILEPnnbrOlX6do4MXa/view?usp=share_link");
            
            if(link.equals(link)){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().browse(link);
                }else{
                    JOptionPane.showMessageDialog(this, "Not Supported");
                }   
            }else{
                JOptionPane.showMessageDialog(this, "File Not Exist");
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // TODO add your handling code here:
        txt_Nome.setText("");
        txt_Sobrenome.setText("");
        txt_User.setText("");
        txt_Email.setText("");
        txt_Pass.setText("");
        txt_RPass.setText("");
    }//GEN-LAST:event_btn_limparActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_login;
    private javax.swing.JCheckBox cb_PolPrivacidade;
    private javax.swing.JCheckBox cb_TermUso;
    private javax.swing.JCheckBox cb_visualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_companyTelaPrincipal10;
    private javax.swing.JLabel lbl_companyTelaPrincipal11;
    private javax.swing.JLabel lbl_companyTelaPrincipal12;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JPasswordField txt_RPass;
    private javax.swing.JTextField txt_Sobrenome;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables
public boolean Email_Validation(){
    {
        ArrayList<String> email = new ArrayList<String>();
        email.add(txt_Email.getText());

        //Regular Expression   
        String regx = "^(.+)@(.+)$";
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regx);
        //Iterate emails array list  
        for(String email1 : email){
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email1);
            //System.out.println(email1 +" : "+ matcher.matches()+"\n");
         if (matcher.matches() == false){
              JOptionPane.showMessageDialog(null, "E-mail inválido! ");
         
         return matcher.matches();
         } 
        }
        
        return true;
    }}
}
