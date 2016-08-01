package Interfaces;

public class LibroBienvenida extends javax.swing.JFrame {


    public LibroBienvenida() {
        //Bloquear botones por defecto
        setUndecorated(true);
        initComponents();
        //JFrem en el centro
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        bntInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventana/Integrador.png"))); // NOI18N

        bntInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventana/Java_logo.png"))); // NOI18N
        bntInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(330, Short.MAX_VALUE)
                .addComponent(bntInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addComponent(bntInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntInicioActionPerformed
        Login ILA = new Login();
        ILA.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bntInicioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibroBienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntInicio;
    private org.edisoncor.gui.panel.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
