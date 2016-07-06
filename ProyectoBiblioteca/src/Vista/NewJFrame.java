
package Vista;
import Modelo.*;
import Controlador.Negocio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jhonatan Rosales
 */
public class NewJFrame extends javax.swing.JFrame {
    
     Negocio obj=new Negocio();
     
    public NewJFrame() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtape = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        cbcarrera = new javax.swing.JComboBox<>();
        lbfacu = new javax.swing.JLabel();
        txtmsg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabalumno = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btngraba = new javax.swing.JButton();
        btnmodifica = new javax.swing.JButton();
        btnelimina = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL ESTUDIANTE"));

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Apellido:");

        jLabel3.setText("DNI:");

        jLabel4.setText("Carrera:");

        jLabel5.setText("Facultad:");

        cbcarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Seleccionar ---", "Ing. Minas", "Ing. Mecatronica", "Ing. Mecanica", "Ing. Maritima", "Ing. Sistemas", "Ing. Civil", "Ing. Biomedica", "Ing. Empresarial", "Ing. Industrial", "Ing. Telecominaciones", "Contabilidad", "Marketing", "Hoteleria Turismo", "Negocios Intern.", "Comunicacion", "Derecho", "Ciencia Comunicacion", "Diseño digital", "Psicologia", " " }));
        cbcarrera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbcarreraItemStateChanged(evt);
            }
        });

        lbfacu.setText("*************");

        txtmsg.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        txtmsg.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5))
                                .addGap(4, 4, 4)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtdni, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(txtape)
                                .addComponent(txtnom))
                            .addComponent(cbcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbfacu))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtmsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbfacu)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmsg, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jLabel6.setText("REGISTRO DE ESTUDIANTES");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("FOTOGRAFIA"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tabalumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "DNI", "CARRERA", "FACULTAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabalumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabalumnoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabalumno);
        if (tabalumno.getColumnModel().getColumnCount() > 0) {
            tabalumno.getColumnModel().getColumn(0).setResizable(false);
            tabalumno.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabalumno.getColumnModel().getColumn(1).setPreferredWidth(40);
            tabalumno.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabalumno.getColumnModel().getColumn(3).setResizable(false);
            tabalumno.getColumnModel().getColumn(3).setPreferredWidth(40);
            tabalumno.getColumnModel().getColumn(4).setPreferredWidth(40);
            tabalumno.getColumnModel().getColumn(5).setPreferredWidth(50);
        }
        tabalumno.getAccessibleContext().setAccessibleName("");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("MANTENIMIENTO"));

        jButton1.setText("NUEVO");

        btngraba.setText("GRABAR");
        btngraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabaActionPerformed(evt);
            }
        });

        btnmodifica.setText("MODIFICAR");

        btnelimina.setText("ELIMINAR");

        jButton5.setText("LISTAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btngraba)
                .addGap(18, 18, 18)
                .addComponent(btnmodifica)
                .addGap(18, 18, 18)
                .addComponent(btnelimina)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btngraba)
                    .addComponent(btnmodifica)
                    .addComponent(btnelimina)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbcarreraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbcarreraItemStateChanged
        // Evento Elige la Facultad segun carrera:
        int cb = cbcarrera.getSelectedIndex();
        if(cb>0 && cb<=10) lbfacu.setText("INGENIERIA");
        if(cb>10 && cb<=14) lbfacu.setText("GESTIÓN Y NEGOCIOS"); 
        if(cb>14) lbfacu.setText("HUMANIDADES"); 
        
    }//GEN-LAST:event_cbcarreraItemStateChanged

    private void btngrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabaActionPerformed
        // Boton Grabar alumno:
        // Grabar:        
        Alumno a=new Alumno(txtnom.getText(),txtape.getText(),txtdni.getText(), (String) cbcarrera.getSelectedItem(),lbfacu.getText());
        txtmsg.setText(obj.Graba(a));
        try{
            
        DefaultTableModel dt=(DefaultTableModel)tabalumno.getModel();              
        dt.setRowCount(0);
        
        for(Alumno x:obj.ListadoAlumno()){
        dt.addRow(new Object[]{x.getCod_alu(),x.getNombre(),x.getApellido(),x.getDni(),
        x.getCarrera(),x.getFacu()});
        }    
        }catch(Exception ex){}
    }//GEN-LAST:event_btngrabaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        // Listar Alumnos 
        try{
            
        DefaultTableModel dt=(DefaultTableModel)tabalumno.getModel();
        
        dt.setRowCount(0);
        
        for(Alumno x:obj.ListadoAlumno()){
        dt.addRow(new Object[]{x.getCod_alu(),x.getNombre(),x.getApellido(),x.getDni(),
        x.getCarrera(),x.getFacu()});
        }    
        }catch(Exception ex){}    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tabalumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabalumnoMousePressed
        // Evento precionar una fila de la tabla:
        //Evento MousePresset del JTable
        int fila = this.tabalumno.getSelectedRow();        
        //limpiar();
        
        btngraba.setEnabled(false);
        btnelimina.setEnabled(true);
        btnmodifica.setEnabled(true);
        
        try {
            String codAlum = tabalumno.getValueAt(fila, 0).toString(); //Traer Codigo
            
            this.txtnom.setText(tabalumno.getValueAt(fila, 1).toString());
            this.txtape.setText(tabalumno.getValueAt(fila, 2).toString());
            this.txtdni.setText(tabalumno.getValueAt(fila, 3).toString());
            this.cbcarrera.setSelectedItem(tabalumno.getValueAt(fila, 4).toString());
            //this.TXTAPELLIDOM.setText(tabalumno.getValueAt(fila, 4).toString());
            this.lbfacu.setText(tabalumno.getValueAt(fila, 5).toString());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR AL MOMENTO DE SELECCIO EL DOCENTE", "ADVERTENCIA", JOptionPane.QUESTION_MESSAGE);
            
        }
    }//GEN-LAST:event_tabalumnoMousePressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnelimina;
    private javax.swing.JButton btngraba;
    private javax.swing.JButton btnmodifica;
    private javax.swing.JComboBox<String> cbcarrera;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbfacu;
    private javax.swing.JTable tabalumno;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtdni;
    private javax.swing.JLabel txtmsg;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
