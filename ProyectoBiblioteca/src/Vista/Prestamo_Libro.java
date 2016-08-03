
package Vista;
import Controlador.Conexion;
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
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JTable;


public class Prestamo_Libro extends javax.swing.JInternalFrame {
    Negocio obj=new Negocio();
    fotoclass f = new fotoclass(); //Objeto de la clase fotoclass
    String codAlum;
    DefaultTableModel model;
    
    public Prestamo_Libro() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabalumno = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel6.setText("LISTADO PRESTAMO LIBROS");

        tabalumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nº", "Code", "Nombre", "Apellido", "Titulo", "F.Prestamo", "F.Devolucion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, true
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

        jButton5.setText("LISTAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /// Metodos Generales ////
    private void listar(){
    try{            
        //DefaultTableModel dt=(DefaultTableModel)tabalumno.getModel();              
        //dt.setRowCount(0);
        
        String sql="select p.nro_prestamo,per.code,nombre,per.apellido, l.titulo,p.fecha_prestamo,p.fecha_devolucion\n" +
                    "from Prestamo_Libro pl, Prestamo p, Persona per,Libro l\n" +
                    "where pl.nro_prestamo=p.nro_prestamo and p.code=per.code and pl.cod_libro=l.cod_libro";
        
        String [] titulos= {"Nº","Code","Nombre","Apellido","Titulo","F.Prestamo","F.Devolucion"};
        model = new DefaultTableModel(null, titulos);
        PreparedStatement st=Conexion.Conecta()
                .prepareStatement(sql);
        //llevar la consulta a memoria
        ResultSet rs=st.executeQuery();
        //leer filaxfila
        String [] fila = new String[7];
        while(rs.next()){
           fila[0] = rs.getString(1);
           fila[1] = rs.getString(2);
           fila[2] = rs.getString(3);
           fila[3] = rs.getString(4);
           fila[4] = rs.getString(5);
           fila[5] = rs.getString(6);
           fila[6] = rs.getString(7);
           
           model.addRow(fila);
           tabalumno.setModel(model);
           
            tabalumno.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabalumno.getColumnModel().getColumn(1).setPreferredWidth(35);
            tabalumno.getColumnModel().getColumn(2).setPreferredWidth(40);
            tabalumno.getColumnModel().getColumn(3).setPreferredWidth(40);
            tabalumno.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabalumno.getColumnModel().getColumn(5).setPreferredWidth(100);
            tabalumno.getColumnModel().getColumn(6).setPreferredWidth(100);
           
        } 
        }catch(Exception ex){}    
    }
    
    private void limpiar(){
    
    }   
    //// Fin Metodos generales ////////////
    
    
    private void tabalumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabalumnoMousePressed
     
    }//GEN-LAST:event_tabalumnoMousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        listar(); // Listar Alumnos
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabalumno;
    // End of variables declaration//GEN-END:variables
}
