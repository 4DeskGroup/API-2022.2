package View;

import Controller.VerificarAcesso;
import GUI.LoginGUI;
import javax.swing.table.DefaultTableModel;
import connection.ConnectionFactory;
import connection.PesquCanalADM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Vector;
import model.bean.CadastroCanal;
import model.bean.Cliente;
import model.dao.CadastroCanalDAO;


public class PaginaCadastrosAtivosAdm extends javax.swing.JFrame {

    PesquCanalADM DAO;
    
    private Cliente cliente;
    
    public PaginaCadastrosAtivosAdm() {
        initComponents();
        try{
            DAO = new PesquCanalADM();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_LogoTelaPrincipal = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btn_CadastrarCanal = new javax.swing.JButton();
        btn_SairLogout = new javax.swing.JButton();
        btn_CadastrarCanal1 = new javax.swing.JButton();
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
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_canaisAtivosADM = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_ExcluirCInfo = new javax.swing.JToggleButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel_filtros = new javax.swing.JLabel();
        txt_busca = new javax.swing.JFormattedTextField();
        lbl_filtros = new javax.swing.JLabel();
        cmb_filtros = new javax.swing.JComboBox<>();
        lbl_filtros1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurações Ativas");
        setMinimumSize(new java.awt.Dimension(850, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 62, 21));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

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

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel16.setBackground(new java.awt.Color(255, 62, 21));
        jPanel16.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel16.setLayout(null);

        btn_CadastrarCanal.setBackground(new java.awt.Color(45, 18, 75));
        btn_CadastrarCanal.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_CadastrarCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal.setText("Configuração");
        btn_CadastrarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanalActionPerformed(evt);
            }
        });
        jPanel16.add(btn_CadastrarCanal);
        btn_CadastrarCanal.setBounds(20, 20, 210, 45);

        btn_SairLogout.setBackground(new java.awt.Color(204, 204, 204));
        btn_SairLogout.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_SairLogout.setText("Sair");
        btn_SairLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairLogoutActionPerformed(evt);
            }
        });
        jPanel16.add(btn_SairLogout);
        btn_SairLogout.setBounds(40, 140, 170, 48);

        btn_CadastrarCanal1.setBackground(new java.awt.Color(45, 18, 75));
        btn_CadastrarCanal1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_CadastrarCanal1.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastrarCanal1.setText("Cadastro");
        btn_CadastrarCanal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarCanal1ActionPerformed(evt);
            }
        });
        jPanel16.add(btn_CadastrarCanal1);
        btn_CadastrarCanal1.setBounds(20, 80, 210, 45);

        jPanel1.add(jPanel16, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
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
        gridBagConstraints.insets = new java.awt.Insets(10, 330, 0, 303);
        jPanel4.add(lbl_4dGroupCadas, gridBagConstraints);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        lbl_companyCadas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_companyCadas.setForeground(new java.awt.Color(45, 18, 75));
        lbl_companyCadas.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 420, 0, 428);
        jPanel6.add(lbl_companyCadas, gridBagConstraints);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        lbl_confAtivas1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbl_confAtivas1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_confAtivas1.setText("Canais Ativos");
        jPanel8.add(lbl_confAtivas1, new java.awt.GridBagConstraints());

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(241, 241, 241));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(241, 241, 241));
        jPanel13.setLayout(null);

        jPanel14.setBackground(new java.awt.Color(241, 241, 241));
        jPanel14.setPreferredSize(new java.awt.Dimension(100, 250));
        jPanel14.setLayout(new java.awt.GridBagLayout());

        jTable_canaisAtivosADM.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Empresa", "Plataforma", "Autenticação"
            }
        ));
        jScrollPane2.setViewportView(jTable_canaisAtivosADM);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 714;
        gridBagConstraints.ipady = 180;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 60, 30, 160);
        jPanel14.add(jScrollPane2, gridBagConstraints);

        jPanel13.add(jPanel14);
        jPanel14.setBounds(0, 0, 950, 250);

        jPanel15.setBackground(new java.awt.Color(241, 241, 241));
        jPanel15.setMinimumSize(new java.awt.Dimension(400, 200));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Atualizar Tabela");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton1);

        btn_ExcluirCInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ExcluirCInfo.setText("Excluir");
        btn_ExcluirCInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirCInfoActionPerformed(evt);
            }
        });
        jPanel15.add(btn_ExcluirCInfo);

        jPanel13.add(jPanel15);
        jPanel15.setBounds(0, 242, 950, 60);

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setPreferredSize(new java.awt.Dimension(100, 80));

        jLabel_filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons8-pesquisar-30.png"))); // NOI18N

        txt_busca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscaActionPerformed(evt);
            }
        });
        txt_busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscaKeyReleased(evt);
            }
        });

        lbl_filtros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_filtros.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros.setText("Filtros");

        cmb_filtros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_filtros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Empresa", "Plataforma", "Autentificacao" }));
        cmb_filtros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_filtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_filtrosActionPerformed(evt);
            }
        });

        lbl_filtros1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_filtros1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros1.setText("Busca");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_filtros)
                    .addComponent(cmb_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel_filtros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_filtros1)))
                .addGap(60, 60, 60))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_filtros, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_filtros1)
                        .addComponent(jLabel_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_busca)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmb_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel9.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Mostrar na Tabela
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
        if(cliente != null){
            boolean a = new VerificarAcesso().acessADM(cliente);
            if(a == false){
                JOptionPane.showMessageDialog(null, "Não tem permissão para acessar nessa página");
                this.dispose();
                new LoginGUI().setVisible(true);
            }
        }   

        DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivosADM.getModel();
        modelo.setNumRows(0);
        
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            
            stmt = con.prepareStatement("SELECT * FROM cadastro_canal;");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                modelo.addRow(new Object[]{
                    
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                   // rs.getString(5),
                   // rs.getString(6),
                    //rs.getString(7)
                });
                
            }
            ConnectionFactory.closeConnection(con, stmt, rs);
            
            
        } 
        catch(Exception ErroSql){
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: "+ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_CadastrarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanalActionPerformed

        this.dispose();
        new PaginaCadastroInfoUs().setVisible(true);
        
    }//GEN-LAST:event_btn_CadastrarCanalActionPerformed

    private void btn_SairLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairLogoutActionPerformed

        this.dispose();
        new TelaPrincipal().setVisible(true);
        
    }//GEN-LAST:event_btn_SairLogoutActionPerformed

    private void btn_CadastrarCanal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarCanal1ActionPerformed
        
        this.dispose();
        new PaginaCadastroVagas().setVisible(true);
        
    }//GEN-LAST:event_btn_CadastrarCanal1ActionPerformed

    private void btn_ExcluirCInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirCInfoActionPerformed

        Object indice = jTable_canaisAtivosADM.getValueAt(jTable_canaisAtivosADM.getSelectedRow(), 0);
        String indiceS = indice.toString();
        if(jTable_canaisAtivosADM.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um canal para excluir!");
        }else{

            CadastroCanal p = new CadastroCanal();
            CadastroCanalDAO dao = new CadastroCanalDAO();

            dao.delete(indiceS);

            DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivosADM.getModel();
            modelo.removeRow(jTable_canaisAtivosADM.getSelectedRow());
        }

    }//GEN-LAST:event_btn_ExcluirCInfoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivosADM.getModel();
        modelo.setNumRows(0);

        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;

            stmt = con.prepareStatement("SELECT * FROM cadastro_canal;");
            rs = stmt.executeQuery();

            while(rs.next()){
                modelo.addRow(new Object[]{

                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                });

            }
            ConnectionFactory.closeConnection(con, stmt, rs);

        }
        catch(Exception ErroSql){
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: "+ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscaActionPerformed

    private void txt_buscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscaKeyReleased

        String filtro = cmb_filtros.getSelectedItem().toString();

        try{
            Vector cabecalho = new Vector();
            cabecalho.add("ID");
            cabecalho.add("Empresa");
            cabecalho.add("Plataforma");
            cabecalho.add("Autenticação");

            if(!txt_busca.getText().equals("")){

                DefaultTableModel nv = new DefaultTableModel(DAO.PesquisarADM(txt_busca.getText(), filtro),cabecalho);
                jTable_canaisAtivosADM.setModel(nv);

            }else{
                DefaultTableModel modelo = (DefaultTableModel) jTable_canaisAtivosADM.getModel();
                modelo.setNumRows(0);

                try{
                    Connection con = ConnectionFactory.getConnection();
                    PreparedStatement stmt;
                    ResultSet rs;

                    stmt = con.prepareStatement("SELECT * FROM cadastro_canal;");
                    rs = stmt.executeQuery();

                    while(rs.next()){
                        modelo.addRow(new Object[]{
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                        });

                    }
                    ConnectionFactory.closeConnection(con, stmt, rs);

                }
                catch(Exception ErroSql){
                    JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela de dados: "+ErroSql, "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Erro ao Pesquisar: "+ex.getMessage());
        }
    }//GEN-LAST:event_txt_buscaKeyReleased

    private void cmb_filtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_filtrosActionPerformed

    }//GEN-LAST:event_cmb_filtrosActionPerformed

    public Cliente getCliente(){
            return cliente;
       }
       
    public void setCliente(Cliente c){
        cliente = c;
        setVisible(true);
    }
    
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
                new PaginaCadastrosAtivosAdm().setVisible(true);
            }
        });
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CadastrarCanal;
    private javax.swing.JButton btn_CadastrarCanal1;
    private javax.swing.JToggleButton btn_ExcluirCInfo;
    private javax.swing.JButton btn_SairLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_filtros;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_LogoTelaPrincipal;
    private javax.swing.JLabel jLabel_filtros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_canaisAtivosADM;
    private javax.swing.JLabel lbl_4dGroupCadas;
    private javax.swing.JLabel lbl_companyCadas;
    private javax.swing.JLabel lbl_confAtivas1;
    private javax.swing.JLabel lbl_filtros;
    private javax.swing.JLabel lbl_filtros1;
    private javax.swing.JFormattedTextField txt_busca;
    // End of variables declaration//GEN-END:variables
}
