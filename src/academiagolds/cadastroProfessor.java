/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiagolds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class cadastroProfessor extends javax.swing.JDialog {

    private Connection con;
    private boolean Up = false;
    private String id = "";

    /**
     * Creates new form NewJFrame
     */
    public cadastroProfessor(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);

        comboCarrega();
        Btedit.setVisible(false);
    }

    cadastroProfessor(java.awt.Frame parent, boolean modal, String id) {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
        this.id = id;
        preencheCampos();
        carregaTable();
        comboCarrega();
        habilitarCampos(Up);
        Up = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JRB = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Lrg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Lnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Lctps = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Lend = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Lcidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Lcpf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Lbairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Lcep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Lnum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JRBfem = new javax.swing.JRadioButton();
        JRBmasc = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        Lbanco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Lag = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Lconta = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablefunc = new javax.swing.JTable();
        JCfunc = new javax.swing.JComboBox<>();
        Btenviar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Ltel = new javax.swing.JTextField();
        Btedit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        LCREF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setText("Cadastro de Professor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Nome:");

        jLabel2.setText("RG:");

        Lnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnomeActionPerformed(evt);
            }
        });

        jLabel3.setText("CTPS");

        jLabel4.setText("End:");

        jLabel5.setText("Cidade:");

        jLabel7.setText("CPF:");

        jLabel8.setText("Bairro:");

        jLabel9.setText("CEP:");

        jLabel10.setText("Nº:");

        jLabel11.setText("Sexo:");

        JRB.add(JRBfem);
        JRBfem.setText("F");
        JRBfem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBfemActionPerformed(evt);
            }
        });

        JRB.add(JRBmasc);
        JRBmasc.setSelected(true);
        JRBmasc.setText("M");
        JRBmasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBmascActionPerformed(evt);
            }
        });

        jLabel13.setText("Banco:");

        jLabel14.setText("Ag:");

        jLabel15.setText("Nº conta:");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel7.setToolTipText("");

        jTablefunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Funções"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablefunc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTablefunc.setShowHorizontalLines(false);
        jTablefunc.setSurrendersFocusOnKeystroke(true);
        jTablefunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablefuncMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablefunc);
        if (jTablefunc.getColumnModel().getColumnCount() > 0) {
            jTablefunc.getColumnModel().getColumn(0).setResizable(false);
        }
        jTablefunc.getAccessibleContext().setAccessibleDescription("");

        JCfunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>" }));
        JCfunc.setToolTipText("");
        JCfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCfuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(JCfunc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JCfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Btenviar.setText("Enviar");
        Btenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtenviarActionPerformed(evt);
            }
        });

        jLabel16.setText("Tel:");

        Btedit.setText("Editar");
        Btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BteditActionPerformed(evt);
            }
        });

        jLabel6.setText("CREF");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(Lcpf))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lnome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JRBmasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JRBfem))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lrg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lctps, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LCREF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Ltel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lend, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lcep, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lnum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Btedit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btenviar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(Lbanco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addGap(7, 7, 7)
                        .addComponent(Lag, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel15)
                        .addGap(13, 13, 13)
                        .addComponent(Lconta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Lnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JRBfem)
                        .addComponent(JRBmasc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Lrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Lcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Lctps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ltel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(LCREF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Lend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Lbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Lcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Lcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Lnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Lbanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Lag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(Lconta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btedit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Btedit, Btenviar});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnomeActionPerformed

    private void JRBfemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBfemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBfemActionPerformed

    private void JRBmascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBmascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBmascActionPerformed

    private void BtenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtenviarActionPerformed
        Envia();
    }//GEN-LAST:event_BtenviarActionPerformed

    private void JCfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCfuncActionPerformed
        popTable();
    }//GEN-LAST:event_JCfuncActionPerformed

    private void jTablefuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablefuncMouseClicked
        if (jTablefunc.isEnabled()) {
            remove();
        }
    }//GEN-LAST:event_jTablefuncMouseClicked

    private void BteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BteditActionPerformed
        habilitarCampos(Up);
        Btedit.setEnabled(!Up);
    }//GEN-LAST:event_BteditActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cadastroProfessor dialog = new cadastroProfessor(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btedit;
    private javax.swing.JButton Btenviar;
    private javax.swing.JComboBox<String> JCfunc;
    private javax.swing.ButtonGroup JRB;
    private javax.swing.JRadioButton JRBfem;
    private javax.swing.JRadioButton JRBmasc;
    private javax.swing.JTextField LCREF;
    private javax.swing.JTextField Lag;
    private javax.swing.JTextField Lbairro;
    private javax.swing.JTextField Lbanco;
    private javax.swing.JTextField Lcep;
    private javax.swing.JTextField Lcidade;
    private javax.swing.JTextField Lconta;
    private javax.swing.JTextField Lcpf;
    private javax.swing.JTextField Lctps;
    private javax.swing.JTextField Lend;
    private javax.swing.JTextField Lnome;
    private javax.swing.JTextField Lnum;
    private javax.swing.JTextField Lrg;
    private javax.swing.JTextField Ltel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablefunc;
    // End of variables declaration//GEN-END:variables

    private void comboCarrega() {

        try {
            con = BancoDeDados.getConexao();
            //cria a string para inserir no banco
            String query = "SELECT * FROM funcao";

            PreparedStatement cmd;
            cmd = con.prepareStatement(query);
            ResultSet rs;

            rs = cmd.executeQuery();

            while (rs.next()) {
                boolean existe = false;
                for (int i = 0; i < jTablefunc.getRowCount(); i++) {
                    String aux = rs.getString("id") + "-" + rs.getString("especialidade");
                    if (aux.equals((String) jTablefunc.getValueAt(i, 0))) {
                        existe = true;
                    }
                }
                if (existe == false) {
                    JCfunc.addItem(rs.getString("id") + "-" + rs.getString("especialidade"));
                }

            }

        } catch (SQLException ex) {
            System.out.println("Erro de SQL " + ex.getMessage());
        }
    }

    private void popTable() {
        if (JCfunc.getSelectedIndex() != 0) {
            DefaultTableModel model = (DefaultTableModel) jTablefunc.getModel();
            model.addRow(JCfunc.getSelectedObjects());
            JCfunc.removeItemAt(JCfunc.getSelectedIndex());
        }
    }

    private void remove() {
        DefaultTableModel model = (DefaultTableModel) jTablefunc.getModel();
        JCfunc.addItem((String) jTablefunc.getValueAt(jTablefunc.getSelectedRow(), 0));
        model.removeRow(jTablefunc.getSelectedRow());
    }

    private void Envia() {
        String requisicao = null;
        String teste = null;
        int ultId = -1;
        if (Up) {
            requisicao = "UPDATE professor SET Nome = ?, CPF = ?, RG  = ?, CTPS  = ?, Sexo  = ?, cidade  = ? ,CEP = ?, bairro  = ?, rua  = ?, numero = ?, banco = ?, agencia = ?, num = ?, tel = ?, cref = ? WHERE cod = ?";
            teste = "SELECT * from professor WHERE cpf = ? and cod <> ?";
        } else {
            requisicao = "INSERT INTO professor (Nome,CPF,RG,CTPS,Sexo,cidade,CEP,bairro,rua,numero,banco,agencia,num,tel,cref) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            teste = "SELECT * from professor WHERE cpf = ? ";
        }
        try {
            con = BancoDeDados.getConexao();
            //cria a string para inserir no banco
            String queryV = teste;

            // Cria o comando
            PreparedStatement verif = con.prepareStatement(queryV);
            verif.setString(1, Lcpf.getText());

            if (Up) {
                verif.setString(2, id);
            }
            ResultSet rs = verif.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Ja cadastrado");
            } else {
                //cria a string para inserir no banco
                String query = requisicao;

                // Cria o comando
                PreparedStatement stmt = con.prepareStatement(query);

                //seta os valores inseridos no banco
                stmt.setString(1, Lnome.getText());
                stmt.setString(2, Lcpf.getText());
                stmt.setString(3, Lrg.getText());
                stmt.setString(4, Lctps.getText());

                String aux;
                if (JRBmasc.isSelected()) {
                    aux = "M";
                } else {
                    aux = "F";
                }
                stmt.setString(5, aux);
                stmt.setString(6, Lcidade.getText());
                stmt.setString(7, Lcep.getText());
                stmt.setString(8, Lbairro.getText());
                stmt.setString(9, Lend.getText());
                stmt.setString(10, Lnum.getText());
                stmt.setString(11, Lbanco.getText());
                stmt.setString(12, Lag.getText());
                stmt.setString(13, Lconta.getText());
                stmt.setString(14, Ltel.getText());
                stmt.setString(15, LCREF.getText());

                if (Up) {
                    stmt.setString(16, id);
                }

                //executa o comando no banco de dados
                stmt.executeUpdate();
                if (Up) {
                    ultId = Integer.parseInt(id);
                } else {
                    String pegaid = "SELECT LAST_INSERT_ID()";

                    PreparedStatement cmd;
                    cmd = con.prepareStatement(pegaid);
                    ResultSet lastid;

                    lastid = cmd.executeQuery();

                    if (lastid.next()) {
                        ultId = lastid.getInt("LAST_INSERT_ID()");
                    }
                }
                //fecha os comandos de conexão
                stmt.close();
                this.dispose();
            }
            verif.close();
            Enviafunc(ultId);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados(s) Invalidos(s)");
            System.out.println(ex);
        }
    }

    private void Enviafunc(int ultId) {
        try {
            con = BancoDeDados.getConexao();
            //cria a string para inserir no banco
            String query = "DELETE FROM professor_funcao WHERE fk_professor_cod = ?";

            PreparedStatement cmd;
            cmd = con.prepareStatement(query);
            cmd.setInt(1, ultId);
            cmd.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL " + ex.getMessage());
        }

        for (int i = 0; i < jTablefunc.getRowCount(); i++) {
            try {
                con = BancoDeDados.getConexao();
                //cria a string para inserir no banco
                String query = "INSERT INTO professor_funcao (fk_funcao_id, fk_professor_cod) VALUES(?,?)";

                // Cria o comando
                PreparedStatement stmt = con.prepareStatement(query);

                //seta os valores inseridos no banco
                String aux = (String) jTablefunc.getValueAt(i, 0);
                aux = aux.substring(0, aux.indexOf("-"));
                stmt.setString(1, aux);
                stmt.setInt(2, ultId);

                //executa o comando no banco de dados
                stmt.executeUpdate();

                //fecha os comandos de conexão
                stmt.close();
                this.dispose();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Dados(s) Invalidos(s)");
                System.out.println(ex);
            }
        }

    }

    private void habilitarCampos(boolean x) {
        Lnome.setEditable(x);
        Lcpf.setEditable(x);
        Lrg.setEditable(x);
        Lcidade.setEditable(x);
        Lbairro.setEditable(x);
        Lend.setEditable(x);
        Lnum.setEditable(x);
        Lcep.setEditable(x);
        JRBfem.setEnabled(x);
        JRBmasc.setEnabled(x);
        Btenviar.setEnabled(x);
        Lbanco.setEditable(x);
        Lag.setEditable(x);
        Lconta.setEditable(x);
        Ltel.setEditable(x);
        LCREF.setEditable(x);
        Lctps.setEditable(x);
        JCfunc.setEnabled(x);
        jTablefunc.setEnabled(x);
    }

    private void preencheCampos() {
        try {
            con = BancoDeDados.getConexao();
            //cria a string para inserir no banco
            String query = "SELECT * FROM professor WHERE cod = ?";

            PreparedStatement cmd;
            cmd = con.prepareStatement(query);
            cmd.setString(1, id);

            ResultSet rs;

            rs = cmd.executeQuery();
            while (rs.next()) {
                Lnome.setText(rs.getString("nome"));
                Lcpf.setText(rs.getString("CPF"));
                Lrg.setText(rs.getString("RG"));
                Lcidade.setText(rs.getString("cidade"));
                Lbairro.setText(rs.getString("bairro"));
                Lend.setText(rs.getString("rua"));
                Lnum.setText(rs.getString("numero"));
                Lcep.setText(rs.getString("cep"));
                Lbanco.setText(rs.getString("cep"));
                Lag.setText(rs.getString("agencia"));
                Lconta.setText(rs.getString("num"));
                Ltel.setText(rs.getString("tel"));
                LCREF.setText(rs.getString("cref"));
                Lctps.setText(rs.getString("ctps"));
                if (rs.getString("sexo").equals("F")) {
                    JRBfem.setSelected(true);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL " + ex.getMessage());
        }
    }

    public void carregaTable() {
        try {
            con = BancoDeDados.getConexao();
            //cria a string para inserir no banco
            String query = "SELECT * FROM funcao JOIN professor_funcao ON fk_funcao_id = id WHERE fk_professor_cod = ?";

            PreparedStatement cmd;
            cmd = con.prepareStatement(query);
            cmd.setString(1, id);
            ResultSet rs;

            rs = cmd.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTablefunc.getModel();
            model.setNumRows(0);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("id") + "-" + rs.getString("especialidade")});
            }

        } catch (SQLException ex) {
            System.out.println("Erro de SQL " + ex.getMessage());
        }

    }
}