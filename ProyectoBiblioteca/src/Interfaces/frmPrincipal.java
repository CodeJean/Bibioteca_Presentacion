package Interfaces;

import Vista.Prestamo_Libro;
import Vista.RegDocente;
import Vista.Registro_Autor;
import Vista.Registro_Prestamo;
import Vista.Registro_libro;

public class frmPrincipal extends javax.swing.JFrame {

    public String codemp="E0001"; //codigo login
    
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEscritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcodemp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuPrestamos = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuRegDocentes = new javax.swing.JMenuItem();
        menuRegAlumnos = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuRegAutor = new javax.swing.JMenuItem();
        menuRegLibros = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        jLabel1.setText("Codigo: ");

        txtcodemp.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        txtcodemp.setText("E0001");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        cargo.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        cargo.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcodemp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtcodemp)
                            .addComponent(jLabel3)
                            .addComponent(cargo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelEscritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelEscritorioLayout = new javax.swing.GroupLayout(panelEscritorio);
        panelEscritorio.setLayout(panelEscritorioLayout);
        panelEscritorioLayout.setHorizontalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEscritorioLayout.setVerticalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEscritorioLayout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        menuPrestamos.setText("Prestamos");
        menuPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrestamosActionPerformed(evt);
            }
        });
        jMenu1.add(menuPrestamos);

        jMenuItem2.setText("Reservas");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registros");

        menuRegDocentes.setText("Docentes");
        menuRegDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegDocentesActionPerformed(evt);
            }
        });
        jMenu2.add(menuRegDocentes);

        menuRegAlumnos.setText("Alumnos");
        menuRegAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegAlumnosActionPerformed(evt);
            }
        });
        jMenu2.add(menuRegAlumnos);

        jMenuItem6.setText("Empleados");
        jMenu2.add(jMenuItem6);

        menuRegAutor.setText("Autor");
        menuRegAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegAutorActionPerformed(evt);
            }
        });
        jMenu2.add(menuRegAutor);

        menuRegLibros.setText("Libros");
        menuRegLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegLibrosActionPerformed(evt);
            }
        });
        jMenu2.add(menuRegLibros);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Historial");

        jMenuItem7.setText("Listado-Prestamos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegDocentesActionPerformed
        
        RegDocente docentes = new RegDocente();
        panelEscritorio.add(docentes);
        docentes.show();
     
    }//GEN-LAST:event_menuRegDocentesActionPerformed

    private void menuRegAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegAlumnosActionPerformed
        Prestamo_Libro alumno = new Prestamo_Libro();
        panelEscritorio.add(alumno);
        alumno.show();
    }//GEN-LAST:event_menuRegAlumnosActionPerformed

    private void menuRegAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegAutorActionPerformed
        Registro_Autor autor = new Registro_Autor();
        panelEscritorio.add(autor);
        autor.show();
    }//GEN-LAST:event_menuRegAutorActionPerformed

    private void menuRegLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegLibrosActionPerformed
        Registro_libro libro = new Registro_libro();
        panelEscritorio.add(libro);
        libro.show();
    }//GEN-LAST:event_menuRegLibrosActionPerformed

    private void menuPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrestamosActionPerformed
        Registro_Prestamo prestamo = new Registro_Prestamo();
        prestamo.codemp=txtcodemp.getText(); // mando codigo a frame Principal
        panelEscritorio.add(prestamo);
        prestamo.show();
    }//GEN-LAST:event_menuPrestamosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:        
        txtcodemp.setText(codemp);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Prestamo_Libro prestamo = new Prestamo_Libro();
        //prestamo.codemp=txtcodemp.getText(); // mando codigo a frame Principal
        panelEscritorio.add(prestamo);
        prestamo.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
                new frmPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuPrestamos;
    private javax.swing.JMenuItem menuRegAlumnos;
    private javax.swing.JMenuItem menuRegAutor;
    private javax.swing.JMenuItem menuRegDocentes;
    private javax.swing.JMenuItem menuRegLibros;
    private javax.swing.JDesktopPane panelEscritorio;
    private javax.swing.JLabel txtcodemp;
    private javax.swing.JLabel txtnombre;
    // End of variables declaration//GEN-END:variables
}
