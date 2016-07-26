
package Vista;
import Modelo.*;
import Controlador.Negocio_autor;
import java.awt.Color;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;


public class Registro_Autor extends javax.swing.JInternalFrame {
    Negocio_autor obj=new Negocio_autor();
    String codAlum;
    
    public Registro_Autor() {
        initComponents();        
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtape = new javax.swing.JTextField();
        txtnacionalidad = new javax.swing.JTextField();
        txtmsg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabautor = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btngraba = new javax.swing.JButton();
        btnmodifica = new javax.swing.JButton();
        btnelimina = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL AUTOR"));
        jPanel1.setOpaque(false);

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Nacionalidad");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(txtape)
                            .addComponent(txtnom))
                        .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(txtnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("REGISTRO DE AUTOR");

        tabautor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "NACIONALIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabautor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabautorMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabautor);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("MANTENIMIENTO"));
        jPanel4.setOpaque(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/buscar_cliente.gif"))); // NOI18N
        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btngraba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/AS.JPG"))); // NOI18N
        btngraba.setText("GRABAR");
        btngraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabaActionPerformed(evt);
            }
        });

        btnmodifica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/page_edit.gif"))); // NOI18N
        btnmodifica.setText("MODIFICAR");
        btnmodifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificaActionPerformed(evt);
            }
        });

        btnelimina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/editdelete.png"))); // NOI18N
        btnelimina.setText("ELIMINAR");
        btnelimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminaActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/tool_clipboard.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btngraba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmodifica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnelimina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngraba, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodifica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnelimina, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jLabel8.setText("Ingrese codigo:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/BUSCAR.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/AutorIMG.jpg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("RELACIÓN DE AUTORES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel8)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btnBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar))
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void listar_autor(){
    try{            
        DefaultTableModel dt=(DefaultTableModel)tabautor.getModel();              
        dt.setRowCount(0);
        
        for(Autor x:obj.ListadoAutor()){
        dt.addRow(new Object[]{x.getCod_autor(),x.getNombre_autor(),x.getApellido_autor(),x.getNacionalidad()});
        }    
        }catch(Exception ex){}    
    }
    
    private void limpiar(){
        btngraba.setEnabled(true);
        txtnom.setText("");
        txtape.setText("");
        txtnacionalidad.setText("");        
    }
    private void tabautorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabautorMousePressed
        // Evento precionar una fila de la tabla:
        //Evento MousePresset del JTable
         
        int fila = this.tabautor.getSelectedRow();        
                
        btngraba.setEnabled(false);
        btnelimina.setEnabled(true);
        btnmodifica.setEnabled(true);
        
        try {
            codAlum = tabautor.getValueAt(fila, 0).toString(); //Traer Codigo            
            this.txtnom.setText(tabautor.getValueAt(fila, 1).toString());
            this.txtape.setText(tabautor.getValueAt(fila, 2).toString());
            this.txtnacionalidad.setText(tabautor.getValueAt(fila, 3).toString());             
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR AL MOMENTO DE SELECCION DEL AUTOR", "ADVERTENCIA", JOptionPane.QUESTION_MESSAGE);           
        }
        
    }//GEN-LAST:event_tabautorMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BTN Nuevo registro:
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btngrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabaActionPerformed
        // Boton Grabar autor:
        // Grabar:                 
        Autor a=new Autor("",txtnom.getText(),txtape.getText(),txtnacionalidad.getText());
        txtmsg.setText(obj.Graba(a));
        limpiar(); // Limpia jfield
        listar_autor(); // lista autor
    }//GEN-LAST:event_btngrabaActionPerformed

    private void btnmodificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificaActionPerformed
        // BTN MODIFICAR:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Desea modificar registro", "ADVERTENCIA", dialogButton);
        
        if(dialogResult == 0) {            
            Autor a=new Autor(codAlum,txtnom.getText(),txtape.getText(),txtnacionalidad.getText());
            txtmsg.setText(obj.UpdateAutor(a));
            listar_autor();
            limpiar();
        } else {
        }
    }//GEN-LAST:event_btnmodificaActionPerformed

    private void btneliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminaActionPerformed
        // BTN ELIMINAR
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Desea eliminar registro", "ADVERTENCIA", dialogButton);
        
        if(dialogResult == 0) {           
          Autor a=new Autor(codAlum,"","","");
          txtmsg.setText(obj.DeleteAutor(a));
          listar_autor();
          limpiar();
        } else {          
        } 
    }//GEN-LAST:event_btneliminaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Listar Autor
        listar_autor();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       // BTN BUSCAR:
        try{            
        DefaultTableModel dt=(DefaultTableModel)tabautor.getModel();              
        dt.setRowCount(0);
        //Imprime en tabla
        for(Autor x:obj.BuscarAutor(txtcode.getText())){
        dt.addRow(new Object[]{x.getCod_autor(),x.getNombre_autor(),x.getApellido_autor(),x.getNacionalidad()});
        }
            
        if(tabautor.getRowCount()== 0){
            limpiar();            
            JOptionPane.showMessageDialog(null, "ESTE CODIGO NO EXISTE");             
        }else{
            this.txtnom.setText(tabautor.getValueAt(0, 1).toString());
            this.txtape.setText(tabautor.getValueAt(0, 2).toString());
            this.txtnacionalidad.setText(tabautor.getValueAt(0, 3).toString());            
            dt.setRowCount(0);// ocultar o eliminar busqueda impresa en tabla
        }        
        }catch(Exception ex){}
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnelimina;
    private javax.swing.JButton btngraba;
    private javax.swing.JButton btnmodifica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabautor;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtcode;
    private javax.swing.JLabel txtmsg;
    private javax.swing.JTextField txtnacionalidad;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
