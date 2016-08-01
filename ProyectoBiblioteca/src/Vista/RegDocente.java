package Vista;
import Modelo.*;
import Controlador.Negocio_Docente;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class RegDocente extends javax.swing.JInternalFrame {
    Negocio_Docente obj=new Negocio_Docente();
    fotoclass f = new fotoclass(); //Objeto de la clase fotoclass
    String codDoce;
    File file;
    
    public RegDocente() {
        initComponents();
    }
    
    private void limpiar(){
        btngrabar.setEnabled(true);
        txtnombre.setText("");
        txtapellido.setText("");
        txtdni.setText("");
        lblfoto.setIcon(null);
        //lblfoto.setIcon(new ImageIcon(getClass().getResource("/Iconos/sin_rostro.jpg")));
        this.cboespecialidad.setSelectedIndex(0);
    }
    
    private void listar_Docente(){
        //se jalan solo los datos que quieres que aparesca en el JTable
    try{            
        DefaultTableModel dt=(DefaultTableModel)tablaDocente.getModel();              
        dt.setRowCount(0);
        
        for(Docente x:obj.ListDocente()){
        dt.addRow(new Object[]{x.getCod_doce(),x.getNombre(),x.getApellido(),x.getDni(),x.getEspecialidad()});
        }    
        }catch(Exception ex){}    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        cboespecialidad = new javax.swing.JComboBox<>();
        txtmsg = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDocente = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btngrabar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnfoto = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Docentes");

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Datos del Docente"));

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("DNI:");

        jLabel6.setText("Especialidad");

        cboespecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Matemático", "Abogado", "Telecomunicaciones", "Físico", "Químico", "Literatura", "Electrónica", "Programación", "Mecanica" }));

        txtmsg.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        txtmsg.setForeground(new java.awt.Color(51, 255, 51));
        txtmsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtmsg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addComponent(cboespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(cboespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblfoto.setText("Foto");
        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tablaDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Apellido", "DNI", "Especialidad"
            }
        ));
        tablaDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaDocenteMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDocente);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Mantenimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btngrabar.setText("Grabar");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnnuevo)
                .addGap(21, 21, 21)
                .addComponent(btngrabar)
                .addGap(18, 18, 18)
                .addComponent(btnmodificar)
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addGap(18, 18, 18)
                .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnlistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btneliminar)
                        .addComponent(btnmodificar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnnuevo)
                        .addComponent(btngrabar)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel2.setText("Buscar Imagen");

        btnfoto.setText("Seleccionar Archivo");
        btnfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfotoActionPerformed(evt);
            }
        });

        jLabel7.setText("Buscar por Código");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnfoto)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
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
            lblfoto.setIcon(newIcon);//Seteamos la foto el el label llamado jLFoto del frame HISTORIALASISITENCIA
            lblfoto.setSize(159, 164);//Seteamos el tamaño para la foto  
        }
    }
    private void tablaDocenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDocenteMousePressed
        // Evento precionar una fila de la tabla:
        //Evento MousePresset del JTable
        int fila = this.tablaDocente.getSelectedRow();
        //limpiar();

        btngrabar.setEnabled(false);
        btneliminar.setEnabled(true);
        btnmodificar.setEnabled(true);

        try {
            codDoce =tablaDocente.getValueAt(fila, 0).toString(); //Traer Codigo

            this.txtnombre.setText(tablaDocente.getValueAt(fila, 1).toString());
            this.txtapellido.setText(tablaDocente.getValueAt(fila, 2).toString());
            this.txtdni.setText(tablaDocente.getValueAt(fila, 3).toString());
            this.cboespecialidad.setSelectedItem(tablaDocente.getValueAt(fila, 4).toString());
            //this.TXTAPELLIDOM.setText(tabalumno.getValueAt(fila, 4).toString());
            // Procedimiento para consultar si existe foto
            String RESPUES = obj.ExisteFoto(codDoce);
            // 0= no existe   1= existe
            if (RESPUES.equals("0")) {
                lblfoto.setIcon(new ImageIcon(getClass().getResource("/Iconos/sin_rostro.jpg")));
                lblfoto.setSize(159, 164);
            } else {
                cargarfoto(codDoce);;//llama al metodo para cargar la foto en el table y le invia el parametro DNI
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR AL MOMENTO DE SELECCION DEL Docente", "ADVERTENCIA", JOptionPane.QUESTION_MESSAGE);

        }
    }//GEN-LAST:event_tablaDocenteMousePressed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
         
        String IMG;
        if(file == null){ // Comprobar si file esta vacio para evaluar en graba
            IMG = "";
        }else{
            IMG = String.valueOf(file);
        }

        Docente D=new Docente("",txtnombre.getText(),txtapellido.getText(),txtdni.getText(),(String) cboespecialidad.getSelectedItem(), IMG);
        txtmsg.setText(obj.GrabaD(D));
        //Lista alumno
        listar_Docente();
        limpiar();
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Desea modificar registro", "ADVERTENCIA", dialogButton);
        
        if(dialogResult == 0) {
        Docente D=new Docente(codDoce,txtnombre.getText(),txtapellido.getText(),txtdni.getText(),(String) cboespecialidad.getSelectedItem());
        txtmsg.setText(obj.UpdateDocente(D));
        //txtmsg.setText(obj.(D));
        listar_Docente();
        limpiar();
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        listar_Docente();
    }//GEN-LAST:event_btnlistarActionPerformed

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
            lblfoto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_btnfotoActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // BTN ELIMINAR
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Desea eliminar registro", "ADVERTENCIA", dialogButton);
        
        if(dialogResult == 0) {           
          Docente d=new Docente(codDoce);
          txtmsg.setText(obj.DeleteDocente(d));
          listar_Docente();
          limpiar();
        } else {          
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // BTN BUSCAR:
        try{            
        DefaultTableModel dt=(DefaultTableModel)tablaDocente.getModel();              
        dt.setRowCount(0);
        //Imprime en tabla
        for(Docente x:obj.BuscarDocente(txtcode.getText())){
        dt.addRow(new Object[]{x.getCod_doce(),x.getNombre(),x.getApellido(),x.getDni(),
        x.getEspecialidad()});
        }
            
        if(tablaDocente.getRowCount()== 0){
            limpiar();
            lblfoto.setIcon(null);
            lblfoto.setSize(159, 164);
            JOptionPane.showMessageDialog(null, "ESTE CODIGO NO EXISTE");             
        }else{
            this.txtnombre.setText(tablaDocente.getValueAt(0, 1).toString());
            this.txtapellido.setText(tablaDocente.getValueAt(0, 2).toString());
            this.txtdni.setText(tablaDocente.getValueAt(0, 3).toString());
            this.cboespecialidad.setSelectedItem(tablaDocente.getValueAt(0, 4).toString());         
            dt.setRowCount(0);// ocultar o eliminar busqueda impresa en tabla            
            // Procedimiento para consultar si existe foto
            String RESPUES = obj.ExisteFoto(txtcode.getText());
            // 0= no existe   1= existe
            if (RESPUES.equals("0")) {
                lblfoto.setIcon(new ImageIcon(getClass().getResource("/Iconos/sin_rostro.jpg")));
                lblfoto.setSize(159, 164);
            } else {
                cargarfoto(txtcode.getText());;//llama al metodo para cargar la foto en el table y le invia el parametro DNI
            }
        }        
        }catch(Exception ex){}
    }//GEN-LAST:event_btnbuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnfoto;
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cboespecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JTable tablaDocente;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtdni;
    private javax.swing.JLabel txtmsg;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
