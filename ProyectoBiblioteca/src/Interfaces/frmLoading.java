package Interfaces;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;



public class frmLoading extends javax.swing.JFrame {

    private Timer t;
    private ActionListener al;
    
    public frmLoading() {
        
        al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jbarra.getValue()<200) {
                    jbarra.setValue(jbarra.getValue()+10);
                }else
                {
                    t.stop();
                    mostrarVentana();
                }
            }
        };
        
        t = new Timer(200,al);
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        t.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbarra = new javax.swing.JProgressBar();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jbarra.setMaximum(200);
        getContentPane().add(jbarra);
        jbarra.setBounds(30, 160, 120, 20);

        lblimagen.setBackground(new java.awt.Color(255, 255, 255));
        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LogoBiblio2.jpg"))); // NOI18N
        getContentPane().add(lblimagen);
        lblimagen.setBounds(20, 20, 190, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarVentana()
    {
        LibroBienvenida bienvenida= new LibroBienvenida();
        bienvenida.setLocationRelativeTo(null);
        bienvenida.setVisible(true);
        this.dispose(); //cerrar esta ventana
    }
    
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
            java.util.logging.Logger.getLogger(frmLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jbarra;
    private javax.swing.JLabel lblimagen;
    // End of variables declaration//GEN-END:variables
}
