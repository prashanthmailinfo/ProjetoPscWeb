/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classes.DiaFase;
import classes.Fase;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author RAFAELSANTIAGO
 */
public class AlterarDiaFase extends javax.swing.JFrame {
     CRUDFase crudfase;
     Fase fase = new Fase();
     int codigo;
    /**
     * Creates new form AlterarDiaFase
     */
    public AlterarDiaFase(CRUDFase crudfase,int codigo) {
         initComponents();
         this.crudfase=crudfase;
         this.codigo=codigo;
        // textHoraInicial.setText();
    }

    private AlterarDiaFase() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textHoraInicial = new javax.swing.JTextField();
        textHoraFinal = new javax.swing.JTextField();
        textData = new net.sf.nachocalendar.components.DateField();
        ButtonAlterarDiaFase = new javax.swing.JButton();
        ButtonLimparDiaFase = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data");

        jLabel3.setText("Hora Inicial");

        jLabel4.setText("Hora Final");

        textHoraInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHoraInicialActionPerformed(evt);
            }
        });

        ButtonAlterarDiaFase.setText("Alterar");
        ButtonAlterarDiaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarDiaFaseActionPerformed(evt);
            }
        });

        ButtonLimparDiaFase.setText("Cancelar");
        ButtonLimparDiaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparDiaFaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textHoraInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addComponent(textHoraFinal))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(ButtonLimparDiaFase)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonAlterarDiaFase)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLimparDiaFase)
                    .addComponent(ButtonAlterarDiaFase))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textHoraInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHoraInicialActionPerformed

    }//GEN-LAST:event_textHoraInicialActionPerformed

    private void ButtonAlterarDiaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarDiaFaseActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
             if(codigo!=-1){
          fase.getDiasFase().remove(codigo);
      
      }
            DiaFase diaFase = new DiaFase();
            Date data = (Date) textData.getValue();
            diaFase.getDataDia().setTime(data);
            SimpleDateFormat df = new SimpleDateFormat("HH:mm");
            diaFase.getHoraInicial().setTime(df.parse(textHoraInicial.getText()));
            diaFase.getHoraFinal().setTime(df.parse(textHoraFinal.getText()));
            crudfase.fase.getDiasFase().add(diaFase);
            crudfase.atualizarListaDiaFase();
            this.dispose();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonAlterarDiaFaseActionPerformed

    private void ButtonLimparDiaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparDiaFaseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ButtonLimparDiaFaseActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarDiaFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarDiaFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarDiaFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarDiaFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarDiaFase().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterarDiaFase;
    private javax.swing.JButton ButtonLimparDiaFase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private net.sf.nachocalendar.components.DateField textData;
    private javax.swing.JTextField textHoraFinal;
    private javax.swing.JTextField textHoraInicial;
    // End of variables declaration//GEN-END:variables
}
