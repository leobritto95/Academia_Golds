/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiagolds;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo
 */
public class Mensalidades extends javax.swing.JDialog {

    private Connection con;
    private String id = "";
    double valorT = 0;
    ArrayList<String> idMat = new ArrayList<>();

    /**
     * Creates new form Main
     */
    public Mensalidades(java.awt.Frame parent, boolean modal, String id) {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
        this.id = id;
        comboCarrega();

        carregaTable(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTmens = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        JCBpagas = new javax.swing.JCheckBox();
        jDateIni = new com.toedter.calendar.JDateChooser("dd/MM/yyyy","##/##/####",'_');
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateFim = new com.toedter.calendar.JDateChooser("dd/MM/yyyy","##/##/####",'_');
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        JCservico = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JBpagar = new javax.swing.JButton();
        JBpagar1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        JCpag = new javax.swing.JComboBox<>();
        JBreg = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Lvalor = new javax.swing.JLabel();
        Ltipo = new javax.swing.JLabel();
        JSperiodo = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        JTmens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data Vencimento", "ID", "Servico", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTmens.setEnabled(false);
        JTmens.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JTmens.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTmens);
        if (JTmens.getColumnModel().getColumnCount() > 0) {
            JTmens.getColumnModel().getColumn(1).setMinWidth(50);
            JTmens.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JCBpagas.setText("Exibir Mens. Pagas");
        JCBpagas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JCBpagasStateChanged(evt);
            }
        });
        JCBpagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBpagasActionPerformed(evt);
            }
        });

        jDateIni.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jDateIni.setMaxSelectableDate(new java.util.Date(253370779260000L));
        jDateIni.setMinSelectableDate(new java.util.Date(-62135755095000L));

        jLabel2.setText("Vecimento Entre:");

        jLabel3.setText("e");

        jDateFim.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jDateFim.setMaxSelectableDate(new java.util.Date(253370779260000L));

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        JCservico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Todos os Servicos>" }));
        JCservico.setToolTipText("");
        JCservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCservicoActionPerformed(evt);
            }
        });

        jButton4.setText("Limpar Filtros");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateIni, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateFim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JCservico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(JCBpagas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDateFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JCservico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JCBpagas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setText("Mensalidades");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("No periodo de:");

        jLabel4.setText("Mês(es) (inclui vencidas)");

        jLabel5.setText("Apenas Mensalidades Vencidas");

        JBpagar.setText("Gerar");
        JBpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpagarActionPerformed(evt);
            }
        });

        JBpagar1.setText("Gerar");
        JBpagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpagar1ActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JCpag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Forma de Pagamento>", "A vista", "Cartao", "Outro" }));
        JCpag.setToolTipText("");
        JCpag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCpagActionPerformed(evt);
            }
        });

        JBreg.setText("Registrar Pagamentos");
        JBreg.setEnabled(false);
        JBreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBregActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JCpag, 0, 183, Short.MAX_VALUE)
                    .addComponent(JBreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JCpag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(JBreg)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Valor Total");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("R$");

        Lvalor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lvalor.setText("0.0");

        Ltipo.setText("Tipo:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Ltipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lvalor))
                            .addComponent(jLabel6))
                        .addGap(81, 81, 81)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Lvalor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ltipo))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        JSperiodo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Gerar Pagamento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBpagar1))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JSperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBpagar))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBpagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JSperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpagarActionPerformed
        geraQuant();
    }//GEN-LAST:event_JBpagarActionPerformed

    private void JCBpagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBpagasActionPerformed
        carregaTable(id);
    }//GEN-LAST:event_JCBpagasActionPerformed

    private void JCBpagasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JCBpagasStateChanged

    }//GEN-LAST:event_JCBpagasStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        procurarData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JCservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCservicoActionPerformed
        carregaTable(id);
    }//GEN-LAST:event_JCservicoActionPerformed

    private void JBpagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpagar1ActionPerformed
        gerarVenc();
    }//GEN-LAST:event_JBpagar1ActionPerformed

    private void JCpagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCpagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCpagActionPerformed

    private void JBregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBregActionPerformed
        regPagamento();
        carregaTable(id);
    }//GEN-LAST:event_JBregActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpar();
        carregaTable(id);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Mensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                Mensalidades dialog = new Mensalidades(new javax.swing.JFrame(), true, "");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void carregaTable(String proc) {
        if (jDateIni.getDate() == null || jDateFim.getDate() == null) {
            carregaTable(proc, "0001-01-01", "9999-01-01");
        } else {
            procurarData();
        }
    }

    public void carregaTable(String proc, String dataIni, String dataFim) {
        String combo = "";
        String comboServico = "";
        if (JCservico.getSelectedIndex() != 0) {
            comboServico = " AND (fk_Servico_Id = ?)";
            JBreg.setEnabled(false);
        }

        if (!JCBpagas.isSelected()) {
            combo = "(mensalidade.id NOT IN (SELECT fk_Mensalidade_Id FROM pagamento)) AND";
        } else {
            JBreg.setEnabled(false);
        }
        try {
            con = BancoDeDados.getConexao();
            //cria a string para inserir no banco
            String query = "SELECT * FROM mensalidade JOIN servico ON fk_Servico_Id = servico.Id WHERE " + combo + " (fk_Aluno_Nmatricula = ?) AND (dataVencimento BETWEEN ? AND ?)" + comboServico + "ORDER BY dataVencimento";

            PreparedStatement cmd;
            cmd = con.prepareStatement(query);
            cmd.setString(1, proc);
            cmd.setString(2, dataIni);
            cmd.setString(3, dataFim);
            if (JCservico.getSelectedIndex() != 0) {
                String aux = JCservico.getSelectedItem().toString();
                aux = aux.substring(0, aux.indexOf("-"));
                cmd.setString(4, aux);
            }

            ResultSet rs;

            rs = cmd.executeQuery();
            DefaultTableModel model = (DefaultTableModel) JTmens.getModel();
            model.setNumRows(0);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("dataVencimento"), rs.getString("mensalidade.id"), rs.getString("modalidade"), rs.getString("mensalidade.valor")});
            }

        } catch (SQLException ex) {
            System.out.println("Erro de SQL " + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBpagar;
    private javax.swing.JButton JBpagar1;
    private javax.swing.JButton JBreg;
    private javax.swing.JCheckBox JCBpagas;
    private javax.swing.JComboBox<String> JCpag;
    private javax.swing.JComboBox<String> JCservico;
    private javax.swing.JSpinner JSperiodo;
    private javax.swing.JTable JTmens;
    private javax.swing.JLabel Ltipo;
    private javax.swing.JLabel Lvalor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateFim;
    private com.toedter.calendar.JDateChooser jDateIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    private void procurarData() {
        if (jDateIni.getDate() != null && jDateFim.getDate() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String data = sdf.format(jDateIni.getDate());
            String data2 = sdf.format(jDateFim.getDate());
            carregaTable(id, data, data2);
            JBreg.setEnabled(false);
        }
    }

    // End of variables declaration                   
    private void comboCarrega() {

        try {
            con = BancoDeDados.getConexao();
            //cria a string para inserir no banco
            String query = "SELECT * FROM servico";

            PreparedStatement cmd;
            cmd = con.prepareStatement(query);
            ResultSet rs;

            rs = cmd.executeQuery();

            while (rs.next()) {
                JCservico.addItem(rs.getString("id") + "-" + rs.getString("modalidade"));
            }

        } catch (SQLException ex) {
            System.out.println("Erro de SQL " + ex.getMessage());
        }
    }

    private void geraQuant() {
        int periodo = Integer.parseInt(JSperiodo.getValue().toString());
        Ltipo.setText("Tipo: Periodo de " + periodo + " mes(es)");
        long dataMS = System.currentTimeMillis();
        Date data = new Date(dataMS);
        int mes = data.getMonth();
        data.setMonth(mes + periodo);
        geraPag(data);
    }

    private void gerarVenc() {
        Ltipo.setText("Tipo: Apenas Vencidas");
        long dataMS = System.currentTimeMillis();
        Date data = new Date(dataMS);
        geraPag(data);
    }

    private void geraPag(Date data) {
        valorT = 0;
        try {
            con = BancoDeDados.getConexao();

            //cria a string para inserir no banco
            String query = "SELECT * FROM mensalidade WHERE (mensalidade.id NOT IN (SELECT fk_Mensalidade_Id FROM pagamento)) AND (fk_Aluno_Nmatricula = ?) AND (dataVencimento <= ?)";

            // Cria o comando
            PreparedStatement stmt = con.prepareStatement(query);

            //seta os valores inseridos no banco
            stmt.setString(1, id);
            stmt.setDate(2, data);
            ResultSet rs;

            rs = stmt.executeQuery();
            idMat.clear();
            while (rs.next()) {
                idMat.add(rs.getString("Id"));
                valorT += rs.getDouble("valor");
            }
            //fecha os comandos de conexão
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados(s) Invalidos(s)");
            System.out.println(ex);
        }
        Lvalor.setText(valorT + "");
        if (valorT > 0) {
            limpar();
            JBreg.setEnabled(true);
            carregaTable(id, "0001-01-01", data.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma Mensalidade Encontrada");
            JBreg.setEnabled(false);
        }
    }

    private void regPagamento() {

        try {
            con = BancoDeDados.getConexao();

            //cria a string para inserir no banco
            String query = "INSERT INTO pagamento (fk_Recepcionista_Cod,fk_Mensalidade_Id,data_hora,forma) VALUES(?,?,?,?)";
            for (int i = 0; i < idMat.size(); i++) {
                // Cria o comando
                PreparedStatement stmt = con.prepareStatement(query);

                //seta os valores inseridos no banco
                stmt.setString(1, Login.getId());
                stmt.setString(2, idMat.get(i));
                Timestamp data = new Timestamp(System.currentTimeMillis());
                stmt.setTimestamp(3, data);
                String aux = JCpag.getSelectedItem().toString();
                stmt.setString(4, aux);

                //executa o comando no banco de dados
                stmt.executeUpdate();

                //fecha os comandos de conexão
                stmt.close();
            }
            JOptionPane.showMessageDialog(this, "Pagamentos Efetuados com Exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados(s) Invalidos(s)");
            System.out.println(ex);
        }
    }

    private void limpar() {
        jDateFim.setDate(null);
        jDateIni.setDate(null);
        JCBpagas.setSelected(false);
        JCservico.setSelectedIndex(0);
        JBreg.setEnabled(false);
    }
}