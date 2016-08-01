
package Vista;
import Modelo.*;
import Controlador.Negocio;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FilenameFilter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class RegAlumno extends javax.swing.JInternalFrame {
    Negocio obj=new Negocio();
    fotoclass f = new fotoclass(); //Objeto de la clase fotoclass
    String codAlum;
    File file;
    
    public RegAlumno() {
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
        txtfoto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabalumno = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btngraba = new javax.swing.JButton();
        btnmodifica = new javax.swing.JButton();
        btnelimina = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnfoto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL ESTUDIANTE"));
        jPanel1.setOpaque(false);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setText("REGISTRO DE ESTUDIANTES");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("FOTOGRAFIA"));
        jPanel2.setOpaque(false);

        txtfoto.setMaximumSize(new java.awt.Dimension(159, 164));
        txtfoto.setMinimumSize(new java.awt.Dimension(159, 164));
        txtfoto.setPreferredSize(new java.awt.Dimension(159, 164));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("MANTENIMIENTO"));
        jPanel4.setOpaque(false);

        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btngraba.setText("GRABAR");
        btngraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabaActionPerformed(evt);
            }
        });

        btnmodifica.setText("MODIFICAR");
        btnmodifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificaActionPerformed(evt);
            }
        });

        btnelimina.setText("ELIMINAR");
        btnelimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminaActionPerformed(evt);
            }
        });

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

        jLabel7.setText("Busca la imagen:");

        btnfoto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnfoto.setText("Seleccionar archivo");
        btnfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfotoActionPerformed(evt);
            }
        });

        jLabel8.setText("Ingrese codigo:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnfoto)))))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(btnfoto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /// Metodos Generales ////
    private void listar_alumno(){
    try{            
        DefaultTableModel dt=(DefaultTableModel)tabalumno.getModel();              
        dt.setRowCount(0);
        
        for(Alumno x:obj.ListadoAlumno()){
        dt.addRow(new Object[]{x.getCod_alu(),x.getNombre(),x.getApellido(),x.getDni(),
        x.getCarrera(),x.getFacu()});
        }    
        }catch(Exception ex){}    
    }
    
    private void limpiar(){
        btngraba.setEnabled(true);
        txtnom.setText("");
        txtape.setText("");
        txtdni.setText("");
        this.cbcarrera.setSelectedIndex(0);
        lbfacu.setText("");
    }
    
    //METODO PARA CARGAR LA FOTO DEL alumno
    public void cargarfoto(String codal) {
        Image dtCat = f.recuperarfotos(codal);
        ImageIcon icon = new ImageIcon(dtCat);
        //Se extrae la imagen del icono
        Image img = icon.getImage();
        //Se modifica su tamaño
        Image newimg = img.getScaledInstance(155, 180, java.awt.Image.SCALE_SMOOTH);
        //SE GENERA EL IMAGE ICON CON LA NUEVA IMAGEN
        ImageIcon newIcon = new ImageIcon(newimg);
        //Se coloca el nuevo icono modificado
        if (newIcon == null) {
            JOptionPane.showMessageDialog(null, "no tiene imagen","ADVERTENCIA",JOptionPane.ERROR);
        } else {
            txtfoto.setIcon(newIcon);//Seteamos la foto el el label llamado jLFoto del frame HISTORIALASISITENCIA
            txtfoto.setSize(159, 164);//Seteamos el tamaño para la foto  
        }
    }
    //// Fin Metodos generales ////////////
    
    
    private void cbcarreraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbcarreraItemStateChanged
        // Evento Elige la Facultad segun carrera:
        int cb = cbcarrera.getSelectedIndex();
        if(cb>0 && cb<=10) lbfacu.setText("INGENIERIA");
        if(cb>10 && cb<=14) lbfacu.setText("GESTIÓN Y NEGOCIOS");
        if(cb>14) lbfacu.setText("HUMANIDADES");

    }//GEN-LAST:event_cbcarreraItemStateChanged

    private void tabalumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabalumnoMousePressed
        // Evento precionar una fila de la tabla:
        //Evento MousePresset del JTable
        int fila = this.tabalumno.getSelectedRow();

        btngraba.setEnabled(false);
        btnelimina.setEnabled(true);
        btnmodifica.setEnabled(true);

        try {
            codAlum = tabalumno.getValueAt(fila, 0).toString(); //Traer Codigo

            this.txtnom.setText(tabalumno.getValueAt(fila, 1).toString());
            this.txtape.setText(tabalumno.getValueAt(fila, 2).toString());
            this.txtdni.setText(tabalumno.getValueAt(fila, 3).toString());
            this.cbcarrera.setSelectedItem(tabalumno.getValueAt(fila, 4).toString());
            this.lbfacu.setText(tabalumno.getValueAt(fila, 5).toString());
            // Procedimiento para consultar si existe foto
            String RESPUES = obj.ExisteFoto(codAlum);
            // 0= no existe   1= existe
            if (RESPUES.equals("0")) {
                txtfoto.setIcon(new ImageIcon(getClass().getResource("/Iconos/sin_rostro.jpg")));
                txtfoto.setSize(159, 164);
            } else {
                cargarfoto(codAlum);;//llama al metodo para cargar la foto en el table y le invia el parametro DNI
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR AL MOMENTO DE SELECCION DEL ALUMNO", "ADVERTENCIA", JOptionPane.QUESTION_MESSAGE);

        }
    }//GEN-LAST:event_tabalumnoMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BTN Nuevo registro:
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btngrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabaActionPerformed
        // Boton Grabar alumno:
        // Grabar:
        String IMG;
        if(file == null){ // Comprobar si file esta vacio para evaluar en graba
            IMG = "";
        }else{
            IMG = String.valueOf(file);
        }
        Alumno a=new Alumno("",txtnom.getText(),txtape.getText(),txtdni.getText(), (String) cbcarrera.getSelectedItem(),lbfacu.getText(), IMG);
        txtmsg.setText(obj.Graba(a));
        limpiar(); // Limpia jfield
        listar_alumno(); // lista alumno
    }//GEN-LAST:event_btngrabaActionPerformed

    private void btnmodificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificaActionPerformed
        // BTN MODIFICAR:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Desea modificar registro", "ADVERTENCIA", dialogButton);

        if(dialogResult == 0) {
            Alumno a=new Alumno(codAlum,txtnom.getText(),txtape.getText(),txtdni.getText(), (String) cbcarrera.getSelectedItem(),lbfacu.getText());
            txtmsg.setText(obj.UpdateAlu(a));
            listar_alumno();
            limpiar();
        } else {
        }
    }//GEN-LAST:event_btnmodificaActionPerformed

    private void btneliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminaActionPerformed
        // BTN ELIMINAR
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Desea eliminar registro", "ADVERTENCIA", dialogButton);

        if(dialogResult == 0) {
            Alumno a=new Alumno(codAlum);
            txtmsg.setText(obj.DeleteAlu(a));
            listar_alumno();
            limpiar();
        } else {
        }

    }//GEN-LAST:event_btneliminaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        listar_alumno(); // Listar Alumnos
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfotoActionPerformed
        // BTN SELECCIONAR IMAGEN:
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG;*.JPEG)","jpg","jpeg");
        JFileChooser archivo = new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Abrir archivo");
        int ventana = archivo.showOpenDialog(null);
        if(ventana == JFileChooser.APPROVE_OPTION){
            file = archivo.getSelectedFile(); // contiene direccion de foto
            //System.out.println(file);
            Image foto = getToolkit().getImage(String.valueOf(file));
            foto = foto.getScaledInstance(159, 164, Image.SCALE_DEFAULT);
            txtfoto.setIcon(new ImageIcon(foto));
        }

    }//GEN-LAST:event_btnfotoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // BTN BUSCAR:
        try{
            DefaultTableModel dt=(DefaultTableModel)tabalumno.getModel();
            dt.setRowCount(0);
            //Imprime en tabla
            for(Alumno x:obj.BuscarAlumno(txtcode.getText())){
                dt.addRow(new Object[]{x.getCod_alu(),x.getNombre(),x.getApellido(),x.getDni(),
                    x.getCarrera(),x.getFacu()});
        }

        if(tabalumno.getRowCount()== 0){
            limpiar();
            txtfoto.setIcon(new ImageIcon(getClass().getResource("/Iconos/sin_rostro.jpg")));
            txtfoto.setSize(159, 164);
            JOptionPane.showMessageDialog(null, "ESTE CODIGO NO EXISTE");
        }else{
            this.txtnom.setText(tabalumno.getValueAt(0, 1).toString());
            this.txtape.setText(tabalumno.getValueAt(0, 2).toString());
            this.txtdni.setText(tabalumno.getValueAt(0, 3).toString());
            this.cbcarrera.setSelectedItem(tabalumno.getValueAt(0, 4).toString());
            this.lbfacu.setText(tabalumno.getValueAt(0, 5).toString());
            dt.setRowCount(0);// ocultar o eliminar busqueda impresa en tabla
            // Procedimiento para consultar si existe foto
            String RESPUES = obj.ExisteFoto(txtcode.getText());
            // 0= no existe   1= existe
            if (RESPUES.equals("0")) {
                txtfoto.setIcon(new ImageIcon(getClass().getResource("/Iconos/sin_rostro.jpg")));
                txtfoto.setSize(159, 164);
            } else {
                cargarfoto(txtcode.getText());;//llama al metodo para cargar la foto en el table y le invia el parametro DNI
            }
        }
        }catch(Exception ex){}
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnelimina;
    private javax.swing.JButton btnfoto;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbfacu;
    private javax.swing.JTable tabalumno;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtdni;
    private javax.swing.JLabel txtfoto;
    private javax.swing.JLabel txtmsg;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
