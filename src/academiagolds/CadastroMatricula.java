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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class CadastroMatricula extends javax.swing.JDialog {
    
    private Connection con;
    String id = "";
    ArrayList<String> valores = new ArrayList();

    /**
     * Creates new form NewJFrame
     */
    public CadastroMatricula(java.awt.Frame parent, boolean modal, String id) {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
        this.id = id;
        comboCarrega();
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
        Lvalor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JSperiodo = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JCservico = new javax.swing.JComboBox<>();
        jBenviar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("Valor Mens.:");

        jLabel3.setText("R$");

        jLabel4.setText("Periodo:");

        JSperiodo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel5.setText("mês(es)");

        jLabel6.setText("Servico");

        JCservico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o servico>" }));
        JCservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCservicoActionPerformed(evt);
            }
        });

        jBenviar.setText("Enviar");
        jBenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBenviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBenviar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCservico, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JSperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JSperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(JCservico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Lvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBenviar)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setText("Matricula");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBenviarActionPerformed
        int periodo = Integer.parseInt(JSperiodo.getValue().toString());
        if (JCservico.getSelectedIndex() != 0 && (!Lvalor.getText().equals("")) && periodo > 0 ) {
            Envia();
        } else {
            JOptionPane.showMessageDialog(this, "Preencha os campos corretamente");
        }
    }//GEN-LAST:event_jBenviarActionPerformed

    private void JCservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCservicoActionPerformed
        if (JCservico.getSelectedIndex() != 0) {
            int aux = JCservico.getSelectedIndex() - 1;
            Lvalor.setText(valores.get(aux));
        }else{
            Lvalor.setText("");
        }
    }//GEN-LAST:event_JCservicoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                CadastroMatricula dialog = new CadastroMatricula(new javax.swing.JFrame(), true, "");
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
    private javax.swing.JComboBox<String> JCservico;
    private javax.swing.JSpinner JSperiodo;
    private javax.swing.JTextField Lvalor;
    private javax.swing.JButton jBenviar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
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
                valores.add(rs.getString("valor"));
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro de SQL " + ex.getMessage());
        }
    }
    
    private void Envia() {
        try {
            con = BancoDeDados.getConexao();

            //cria a string para inserir no banco
            String query = "INSERT INTO _matricula (fk_Aluno_Nmatricula,fk_Servico_Id,valorTotal,dataInicio,dataFim) VALUES(?,?,?,?,?)";

            // Cria o comando
            PreparedStatement stmt = con.prepareStatement(query);

            //seta os valores inseridos no banco
            stmt.setString(1, id);
            
            String aux = JCservico.getSelectedItem().toString();
            aux = aux.substring(0, aux.indexOf("-"));
            stmt.setString(2, aux);
            
            stmt.setString(3, Lvalor.getText());
            
            long dataMS = System.currentTimeMillis();
            Date data = new Date(dataMS);
            stmt.setDate(4, data);
            
            int mes = data.getMonth();
            int periodo = Integer.parseInt(JSperiodo.getValue().toString());
            Date data2 = new Date(dataMS);
            data2.setMonth(mes + periodo);
            
            stmt.setDate(5, data2);

            //executa o comando no banco de dados
            stmt.executeUpdate();

            //fecha os comandos de conexão
            stmt.close();
            geraMensal(dataMS);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados(s) Invalidos(s)");
            System.out.println(ex);
        }
    }
    
    private void geraMensal(long dataMS) {
        int x = Integer.parseInt(JSperiodo.getValue().toString());
        
        try {
            con = BancoDeDados.getConexao();

            //cria a string para inserir no banco
            String query = "INSERT INTO mensalidade (fk_Aluno_Nmatricula,fk_Servico_Id,valor,fk__Matricula_dataInicio,dataVencimento) VALUES(?,?,?,?,?)";
            for (int i = 0; i < x; i++) {
                // Cria o comando
                PreparedStatement stmt = con.prepareStatement(query);

                //seta os valores inseridos no banco
                stmt.setString(1, id);
                
                String aux = JCservico.getSelectedItem().toString();
                aux = aux.substring(0, aux.indexOf("-"));
                stmt.setString(2, aux);
                
                stmt.setString(3, Lvalor.getText());
                Date data = new Date(dataMS);
                stmt.setDate(4, data);
                
                int mes = data.getMonth();
                Date data2 = new Date(dataMS);
                data2.setMonth(mes + i + 1);
                stmt.setDate(5, data2);

                //executa o comando no banco de dados
                stmt.executeUpdate();

                //fecha os comandos de conexão
                stmt.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados(s) Invalidos(s)");
            System.out.println(ex);
        }
        
    }
}
