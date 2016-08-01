/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import Modelo.*;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yonna
 */
public class Registro_libro extends javax.swing.JInternalFrame {
     
    Negocio_libro obj=new Negocio_libro();
    Negocio_autor objA=new Negocio_autor();
    String codLibro;
    String CodAutor;
    String es;
    public Registro_libro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblibros = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        CBE = new javax.swing.JComboBox();
        btngraba = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtmateria = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnmodifica = new javax.swing.JButton();
        btnelimina = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CBA = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtmsg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("RELACIÓN DE LIBROS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("REGISTRO DE INFORMACIÓN DE LIBROS");

        tblibros.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tblibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod Libro", "Titulo", "Materia", "Nom Autor", "Ape Autor", "Estado"
            }
        ));
        tblibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblibrosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblibros);
        if (tblibros.getColumnModel().getColumnCount() > 0) {
            tblibros.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles del Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        CBE.setBackground(new java.awt.Color(204, 204, 255));
        CBE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Ocupado", "Reservado" }));
        CBE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CBEKeyPressed(evt);
            }
        });

        btngraba.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btngraba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/as.jpg"))); // NOI18N
        btngraba.setText("Grabar");
        btngraba.setToolTipText("Graba la información en el archivo de Binario");
        btngraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Estado");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Titulo");

        txttitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttituloKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Materia");

        txtmateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmateriaKeyPressed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/buscar_cliente.gif"))); // NOI18N
        btnConsultar.setText("Nuevo");
        btnConsultar.setToolTipText("Busca la información del Arreglo");
        btnConsultar.setMaximumSize(new java.awt.Dimension(121, 59));
        btnConsultar.setMinimumSize(new java.awt.Dimension(21, 59));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnmodifica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnmodifica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/page_edit.gif"))); // NOI18N
        btnmodifica.setText("Modificar");
        btnmodifica.setToolTipText("Actualiza los datos en el Arreglo y Archivo");
        btnmodifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificaActionPerformed(evt);
            }
        });

        btnelimina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnelimina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/editdelete.png"))); // NOI18N
        btnelimina.setText("Eliminar");
        btnelimina.setToolTipText("Elimina un registro en el Archivo Binario");
        btnelimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Autor");

        CBA.setBackground(new java.awt.Color(204, 204, 255));
        CBA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----SELECCIONE-------------", "PROGRAMACION", "GESTION", "SISTEMAS" }));
        CBA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBAItemStateChanged(evt);
            }
        });
        CBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBAActionPerformed(evt);
            }
        });
        CBA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CBAKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/LibroPNG.png"))); // NOI18N

        txtmsg.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        txtmsg.setForeground(new java.awt.Color(0, 204, 51));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/tool_clipboard.png"))); // NOI18N
        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBE, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(CBA, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btngraba, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmodifica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnelimina, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txtmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(CBE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(CBA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtmsg, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngraba, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodifica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnelimina, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Todos");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Disponible");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Ocupado");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Reservado");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButton1)
                .addComponent(jRadioButton2)
                .addComponent(jRadioButton3)
                .addComponent(jRadioButton4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5)
                                .addGap(128, 128, 128)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Metodos Generales libro             
    private void listar_libros(){
    try{
        String estado="";
        DefaultTableModel dt=(DefaultTableModel)tblibros.getModel();              
        dt.setRowCount(0);
        
        for(Libro x:obj.ListaLibros()){
            if(x.getEstado().equals("D")) estado = "Disponible";
            if(x.getEstado().equals("O")) estado = "Ocupado";
            if(x.getEstado().equals("R")) estado = "Reservado";
            
        dt.addRow(new Object[]{x.getCod_libro(),x.getTitulo_libro(),x.getMateria(),x.getNombre_autor(),
        x.getApellido_autor(),estado});
        }    
        }catch(Exception ex){}    
    }
    
    private void listar_librosEstado(String estado){
    try{
        
        DefaultTableModel dt=(DefaultTableModel)tblibros.getModel();              
        dt.setRowCount(0);
        
        for(Libro x:obj.ListaLibrosEstado(estado)){
            if(x.getEstado().equals("D")) estado = "Disponible";
            if(x.getEstado().equals("O")) estado = "Ocupado";
            if(x.getEstado().equals("R")) estado = "Reservado";
            
        dt.addRow(new Object[]{x.getCod_libro(),x.getTitulo_libro(),x.getMateria(),x.getNombre_autor(),
        x.getApellido_autor(),estado});
        }    
        }catch(Exception ex){}    
    }
    
    private void limpiar(){
        btngraba.setEnabled(true);
        txttitulo.setText("");
        txtmateria.setText("");
        txtmsg.setText("");        
    }
// fin Metodos generales //   
    private void CBEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CBEKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER)
        btngraba.requestFocus();
    }//GEN-LAST:event_CBEKeyPressed

    private void CBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBAActionPerformed

    private void CBAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CBAKeyPressed
        //if(evt.getKeyCode()==evt.VK_ENTER)
        //jtxtAnio.requestFocus();
    }//GEN-LAST:event_CBAKeyPressed

    private void btngrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabaActionPerformed
        // Boton Grabar Libro:
        // Grabar:
        es="";
        int estado = CBE.getSelectedIndex();
        if(estado==0) es="D";
        if(estado==1) es="O";
        if(estado==2) es="R";
        
        Libro a=new Libro("",txttitulo.getText(),txtmateria.getText(),CodAutor,es);
        txtmsg.setText(obj.GrabaLibro(a));
        limpiar(); // Limpia jfield
        listar_libros(); // lista autor
        
    }//GEN-LAST:event_btngrabaActionPerformed

    private void txttituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttituloKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER)
        CBA.requestFocus();
    }//GEN-LAST:event_txttituloKeyPressed

    private void txtmateriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmateriaKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER)
        CBE.requestFocus();
    }//GEN-LAST:event_txtmateriaKeyPressed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // Llamada al metodo para hacer la consulta
        //BTN nuevo registro
        limpiar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnmodificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificaActionPerformed
        // llamada al metodo que modifica la informacion del Libro
        // BTN MODIFICAR:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Desea modificar registro", "ADVERTENCIA", dialogButton);
        
            int estado = CBE.getSelectedIndex();
            if(estado==0) es="D";
            if(estado==1) es="O";
            if(estado==2) es="R";
        
        if(dialogResult == 0) {            
            Libro a=new Libro(codLibro,txttitulo.getText(),txtmateria.getText(),CodAutor,es);
            txtmsg.setText(obj.UpdateLibro(a));
            listar_libros();
            //limpiar();
        } else {
        }
    }//GEN-LAST:event_btnmodificaActionPerformed

    private void btneliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminaActionPerformed
        // Llamada al metodo que elimina un registro
        // BTN ELIMINAR
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Desea eliminar registro", "ADVERTENCIA", dialogButton);
        
        if(dialogResult == 0) {           
          Libro a=new Libro(codLibro,"","","","");
          txtmsg.setText(obj.DeleteLibro(a));
          listar_libros();
          //limpiar();
        } else {          
        } 
    }//GEN-LAST:event_btneliminaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BTN Listar libros
        listar_libros();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // Listar en combo nombre de autores:
        CBA.removeAllItems();
        for(Autor x:objA.ListadoAutor()){
            CBA.addItem(x.getApellido_autor()+", "+x.getNombre_autor());
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void CBAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBAItemStateChanged
        // Seleccionar item de combo:
    try{
    int indice=CBA.getSelectedIndex();
    CodAutor=objA.ListadoAutor().get(indice).getCod_autor();
        System.out.println(""+CodAutor+"\n");
    }catch(Exception ex){}
    }//GEN-LAST:event_CBAItemStateChanged

    private void tblibrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblibrosMousePressed
         // Evento precionar una fila de la tabla:
        //Evento MousePresset del JTable
         
        int fila = this.tblibros.getSelectedRow();        
                
        btngraba.setEnabled(false);
        btnelimina.setEnabled(true);
        btnmodifica.setEnabled(true);
        
        try {
            codLibro = tblibros.getValueAt(fila, 0).toString(); //Traer Codigo            
            this.txttitulo.setText(tblibros.getValueAt(fila, 1).toString());
            this.txtmateria.setText(tblibros.getValueAt(fila, 2).toString());
            this.CBA.setSelectedItem(tblibros.getValueAt(fila, 4).toString()+", "+tblibros.getValueAt(fila, 3).toString());
            this.CBE.setSelectedItem(tblibros.getValueAt(fila, 5).toString());                        
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR AL MOMENTO DE SELECCION DEL AUTOR", "ADVERTENCIA", JOptionPane.QUESTION_MESSAGE);           
        }
        
    }//GEN-LAST:event_tblibrosMousePressed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        listar_libros();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // Listado dispobible
        String estado="D";
        listar_librosEstado(estado);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // Listado Ocupado
        String estado="O";
        listar_librosEstado(estado);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // Listado reservado
        String estado="R";
        listar_librosEstado(estado);
    }//GEN-LAST:event_jRadioButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBA;
    private javax.swing.JComboBox CBE;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnelimina;
    private javax.swing.JButton btngraba;
    private javax.swing.JButton btnmodifica;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblibros;
    private javax.swing.JTextField txtmateria;
    private javax.swing.JLabel txtmsg;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
