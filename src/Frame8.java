
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pared
 */
public class Frame8 extends javax.swing.JFrame {

    /**
     * Creates new form Frame8
     */
    public Frame8() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadHoras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCajaAhorro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Universidad de la Costa.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cantidad de Horas Dadas:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtCantidadHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadHorasActionPerformed(evt);
            }
        });
        txtCantidadHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadHorasKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidadHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Caja de Ahorro (5%):");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtCajaAhorro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaAhorroKeyTyped(evt);
            }
        });
        jPanel1.add(txtCajaAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Monto Total a Pagar:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtMontoTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoTotalKeyTyped(evt);
            }
        });
        jPanel1.add(txtMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 120, -1));

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 570, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        long montototal, CajaAhorro=5, cantHoras, op1,op2;
        String resultado;
        if (txtCantidadHoras.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Ingrese Cantidad de Horas", "Error", JOptionPane.ERROR_MESSAGE);
            txtCantidadHoras.requestFocusInWindow();
        }
        else {
        cantHoras= Long.parseLong(txtCantidadHoras.getText());
        
        op1= cantHoras*20000;
        op2= (op1*CajaAhorro)/100;
        montototal= op1-op2;
        
        resultado= String.valueOf(montototal);
        txtMontoTotal.setText(resultado);
        txtCajaAhorro.setText(""+op2);
        
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMontoTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoTotalKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
          if(!Character.isLetter(c)) 
          { 
              getToolkit().beep(); 
              evt.consume(); 
          }
    }//GEN-LAST:event_txtMontoTotalKeyTyped

    private void txtCajaAhorroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaAhorroKeyTyped
        // TODO add your handling code here
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
          if(!Character.isLetter(c)) 
          { 
              getToolkit().beep(); 
              evt.consume(); 
          }
    }//GEN-LAST:event_txtCajaAhorroKeyTyped

    private void txtCantidadHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadHorasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCantidadHorasActionPerformed

    private void txtCantidadHorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadHorasKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
    }//GEN-LAST:event_txtCantidadHorasKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtCajaAhorro.setText("");
        txtCantidadHoras.setText("");
        txtMontoTotal.setText("");
        
        txtCantidadHoras.requestFocusInWindow();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCajaAhorro;
    private javax.swing.JTextField txtCantidadHoras;
    private javax.swing.JTextField txtMontoTotal;
    // End of variables declaration//GEN-END:variables
}
