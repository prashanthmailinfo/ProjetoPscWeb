/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classes.AreaConcurso;
import classes.Concurso;
import classes.Empresa;
import fachada.Fachada;
import fachada.IFachada;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAFAELSANTIAGO
 */
public class AlterarConcurso extends javax.swing.JFrame {
   IFachada fachada = Fachada.obterInstancia();
   long codigo;
   //long codigo2;
   ListarConcurso lstC;
   ArrayList<AreaConcurso> areaConcursos = new ArrayList<>();
   long empresa;
   Concurso concurso= new Concurso();
    /**
     * Creates new form AlterarConcurso
     */
    public AlterarConcurso(Concurso concurso,ListarConcurso lstC) {
        initComponents();
        this.lstC=lstC;
        this.concurso=concurso;
       // AreaConcurso area= new AreaConcurso();
        //codigo2=area.getConcurso().getId();
        codigo= concurso.getId();
        empresa= concurso.getEmpresa().getId();
        TextNomeConcursoConcurso.setText(concurso.getNomeConcurso());
        TextDataInicio.setText((concurso.getDatainscricao().get(5) + "/" + concurso.getDatainscricao().get(2) + "/" + concurso.getDatainscricao().get(1)));
        TextDataFinal.setText((concurso.getDatafinal().get(5) + "/" + concurso.getDatafinal().get(2) + "/" + concurso.getDatafinal().get(1)));
    }

    private AlterarConcurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        TextNomeConcursoConcurso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextDataFinal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextDataInicio = new javax.swing.JTextField();
        ButtonCancelarConcurso = new javax.swing.JButton();
        ButtonAlterarConcurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Nome do Concurso");

        jLabel5.setText("Data do encerramento das inscrições");

        TextDataFinal.setToolTipText("");

        jLabel4.setText("Data do início das inscrições");

        TextDataInicio.setToolTipText("");

        ButtonCancelarConcurso.setText("Cancelar");
        ButtonCancelarConcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarConcursoActionPerformed(evt);
            }
        });

        ButtonAlterarConcurso.setText("Alterar");
        ButtonAlterarConcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarConcursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TextDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextNomeConcursoConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(27, 27, 27)
                                    .addComponent(TextDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(ButtonCancelarConcurso)
                        .addGap(79, 79, 79)
                        .addComponent(ButtonAlterarConcurso)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNomeConcursoConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancelarConcurso)
                    .addComponent(ButtonAlterarConcurso))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAlterarConcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarConcursoActionPerformed
        // TODO add your handling code here:
         
          try {
              concurso.setId(codigo); 
              concurso.getEmpresa().setId(empresa);
              concurso.setNomeConcurso(TextNomeConcursoConcurso.getText());
             // concurso.setAreasConcurso(areaConcursos);
              SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
              concurso.getDatainscricao().setTime(df.parse(TextDataInicio.getText()));
              concurso.getDatafinal().setTime(df.parse(TextDataFinal.getText()));   
//              if(codigo==codigo2){
//              for (AreaConcurso ac : concurso.getAreasConcurso()) {
//                ac.setConcurso(concurso);
//            }
//              
//              }
//              else{
                fachada.atualizarConcurso(concurso);
                JOptionPane.showMessageDialog(rootPane, "Concurso atualizado com sucesso");
                     
//              }  
                            
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(rootPane, ex.getMessage());
          }
    }//GEN-LAST:event_ButtonAlterarConcursoActionPerformed

    private void ButtonCancelarConcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarConcursoActionPerformed
        // TODO add your handling code here:
        this. dispose();
    }//GEN-LAST:event_ButtonCancelarConcursoActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarConcurso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterarConcurso;
    private javax.swing.JButton ButtonCancelarConcurso;
    private javax.swing.JTextField TextDataFinal;
    private javax.swing.JTextField TextDataInicio;
    private javax.swing.JTextField TextNomeConcursoConcurso;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
