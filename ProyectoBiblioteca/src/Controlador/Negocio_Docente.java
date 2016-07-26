
package Controlador;

/**
 *
 * @author Jean
 */

import java.sql.*;
import Modelo.*;
import java.util.*;
import Vista.RegDocente;
import java.io.FileInputStream;
import javax.print.Doc;

public class Negocio_Docente {
    
    // Buscar existencia de foto
    public String ExisteFoto(String codAlum){
        String sql="{call fotoexiste(?)}";
        String resp="";
        try{ //preparar una clase para ejcutar instruccion
            //sql
            CallableStatement st=Conexion.Conecta().prepareCall(sql);
            //relacionar cada parametro con ep
            st.setString(1, codAlum);
            ResultSet rs=st.executeQuery();
            rs.next();
            resp=rs.getString(1);
            //st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return resp;
    }
    
    
    //Listado docentes
    public List<Docente> ListDocente(){
        List<Docente> lis=new ArrayList();
        //String sql="select * from Alumno";
        String sql="select D.cod_doce,P.nombre,P.apellido,P.dni,D.especialidad \n" +
        "from Docente D, Persona P \n" +
        "where D.cod_doce = P.code";
        try{
        PreparedStatement st=Conexion.Conecta()
                .prepareStatement(sql);
        //llevar la consulta a memoria
        ResultSet rs=st.executeQuery();
        //leer filaxfila
        while(rs.next()){
           //los rs.getString tiene que coincidir con la cantidad de la consulta sql que está arriba
           Docente d=new Docente(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
           lis.add(d);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        //System.out.println(sql);
        return lis;
    }
    
    
    public String GrabaD(Docente D){
        String sql="{call spadiDocente(?,?,?,?,?)}";

        try{ //preparar una clase para ejcutar instrucc
            //sql
            FileInputStream ArchivoFoto;   
            CallableStatement st=Conexion.Conecta().prepareCall(sql);
            //Relacionar parametos con Procedimiento almacenado
            st.setString(1, D.getNombre());
            st.setString(2, D.getApellido());
            st.setString(3, D.getDni());
            st.setString(4, D.getEspecialidad());
            //System.out.println(""+a.getFoto());
            // Parametro 6 se enviara null o direccion para ser grabado en bd
            if(D.getFoto()== ""){         
                st.setBinaryStream(5,null);  
            }else{
                ArchivoFoto = new FileInputStream(D.getFoto());        
                st.setBinaryStream(5,ArchivoFoto); 
            }
            ///////// Probando //////////
            //ResultSet rs=st.executeQuery();
            //rs.next();       
            st.execute();    
            final ResultSet rs = st.getResultSet();
     
        }catch(Exception ex){        
            ex.printStackTrace();
        }
        return "EL REGISTRO SE REALIZO CON EXITO";
    }
    
    //Actualizar Alumno
public String UpdateDocente(Docente d){
    String sql="{call spaUpdateDocente(?,?,?,?,?)}";
    try{ //preparar una clase para ejcutar instrucc     
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, d.getCod_doce());
     st.setString(2, d.getNombre());
     st.setString(3, d.getApellido());
     st.setString(4, d.getDni());
     st.setString(5, d.getEspecialidad());
     ///////// Ejecuta Update //////////    
     st.execute();    
     final ResultSet rs = st.getResultSet();
     
    }catch(Exception ex){        
      ex.printStackTrace();
    }
    return "LA ACTUALIZACION SE REALIZO CON EXITO";
}

//Elimina DELETE Alumno
public String DeleteDocente(Docente d){
    String sql="{call spaDeleteDocente(?)}";
    try{ //preparar una clase para ejcutar instrucc     
        CallableStatement st=Conexion.Conecta().prepareCall(sql);
        //Relacionar parametos con Procedimiento almacenado
        st.setString(1, d.getCod_doce());
        ///////// Ejecuta Update //////////    
        st.execute();    
        final ResultSet rs = st.getResultSet();
    }catch(Exception ex){        
        ex.printStackTrace();
    }
    return "SE ELIMINO REGISTRO CON EXITO";
} 
        
 //listado de Alumnos/Biblioteca colocar en un arraylist        
    public List<Docente> BuscarDocente(String coda){
        List<Docente> lis=new ArrayList();
        //String sql="select * from Alumno";
        String sql="select code,nombre,apellido,dni,especialidad,foto\n" +
                    "from Persona p,Docente D\n" +
                    "where code=cod_doce and code=?";
        try{
        PreparedStatement st=Conexion.Conecta().prepareStatement(sql);
        //llevar la consulta a memoria
        st.setString(1, coda);
        ResultSet rs=st.executeQuery();
        //leer filaxfila
        while(rs.next()){
           Docente d=new Docente(rs.getString(1),
           rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
           lis.add(d);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        //System.out.println(sql);
        return lis;
    }
}


