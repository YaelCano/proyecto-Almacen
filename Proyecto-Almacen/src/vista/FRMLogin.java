/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Loguin;

/**
 *
 * @author ACER
 */
public class FRMLogin extends javax.swing.JFrame {
    Loguin abc = new Loguin();
    /**
     * Creates new form FRMLogin
     */
    public FRMLogin() {
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXTUsuario = new javax.swing.JTextField();
        TXTContraseña = new javax.swing.JPasswordField();
        BTNInicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNsalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-encendido-apagado.png"))); // NOI18N
        BTNsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsalirActionPerformed(evt);
            }
        });
        getContentPane().add(BTNsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 210, 140));

        Usuario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Usuario.setText("USUARIO:");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 120, -1));

        TXTUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(TXTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, 20));

        TXTContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(TXTContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 256, 130, 20));

        BTNInicio.setBackground(new java.awt.Color(204, 51, 0));
        BTNInicio.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        BTNInicio.setForeground(new java.awt.Color(255, 255, 255));
        BTNInicio.setText("ENTRAR");
        BTNInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNInicioActionPerformed(evt);
            }
        });
        getContentPane().add(BTNInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 120, -1));

        jLabel1.setBackground(new java.awt.Color(249, 112, 0));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTNsalirActionPerformed

    private void BTNInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNInicioActionPerformed
        
   String usuario = this.TXTUsuario.getText();
   String clave = this.TXTContraseña.getText();
  
     abc = obtenerloguin();
     abc.buscarLoguin();

        String idbd = abc.getUsuario();

        System.out.println(idbd);

        if (idbd == null || idbd == "") {
            JOptionPane.showMessageDialog(this, " Usuario no encontrado verefique bien ");
            this.TXTContraseña.setText("");
            this.TXTUsuario.setText("");

        } else {

            this.setVisible(false);

        }
        
                       
    }//GEN-LAST:event_BTNInicioActionPerformed

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
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNInicio;
    private javax.swing.JButton BTNsalir;
    private javax.swing.JPasswordField TXTContraseña;
    private javax.swing.JTextField TXTUsuario;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
    private Loguin obtenerloguin() {
        Loguin elLoguin = new Loguin();
        elLoguin.setContraseña(TXTContraseña.getText());
        elLoguin.setUsuario(TXTUsuario.getText());
        return elLoguin;
    }
}

