package Controlador;
//en esta capa se van a implementar todos
//los metodos que seran utilizados en el
//formulario
import java.sql.*;
import Modelo.*;
import java.util.*;
public class Negocio {
    
//listado de Alumnos/Biblioteca colocar en un arraylist
        
    public List<Alumno> ListadoAlumno(){
        List<Alumno> lis=new ArrayList();
        //String sql="select * from Alumno";
        String sql="select  A.cod_alu,A.nro,A.carrera, A.facultad,P.code,P.nombre,p.apellido, p.dni \n" +
        "from Alumno A, Persona P \n" +
        "where A.cod_alu=P.code";
        try{
        PreparedStatement st=Conexion.Conecta()
                .prepareStatement(sql);
        //llevar la consulta a memoria
        ResultSet rs=st.executeQuery();
        //leer filaxfila
        while(rs.next()){
           Alumno a=new Alumno(rs.getString(1),
           rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
           lis.add(a);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        //System.out.println(sql);
        return lis;
    }
    
//Listado docentes
public List<Docente> ListDocente(){
        List<Docente> lis=new ArrayList();
        //String sql="select * from Alumno";
        String sql="select *\n" +
        "from Docente d, Persona p\n" +
        "where d.cod_doce=p.code";
        try{
        PreparedStatement st=Conexion.Conecta()
                .prepareStatement(sql);
        //llevar la consulta a memoria
        ResultSet rs=st.executeQuery();
        //leer filaxfila
        while(rs.next()){
           Docente d=new Docente(rs.getString(1),
           rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
           lis.add(d);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        //System.out.println(sql);
        return lis;
    }
// grabar alumno
public String Graba(Alumno a){
    String sql="{call spadiAlu(?,?,?,?,?)}";

    try{ //preparar una clase para ejcutar instrucc
        //sql
        
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, a.getNombre());
     st.setString(2, a.getApellido());
     st.setString(3, a.getDni());
     st.setString(4, a.getCarrera());
     st.setString(5, a.getFacu());
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
public String UpdateAlu(Alumno a){
    String sql="{call spaUpdateAlu(?,?,?,?,?,?)}";
    try{ //preparar una clase para ejcutar instrucc     
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, a.getCod_alu());
     st.setString(2, a.getNombre());
     st.setString(3, a.getApellido());
     st.setString(4, a.getDni());
     st.setString(5, a.getCarrera());
     st.setString(6, a.getFacu());
     ///////// Ejecuta Update //////////    
     st.execute();    
     final ResultSet rs = st.getResultSet();
     
    }catch(Exception ex){        
      ex.printStackTrace();
    }
    return "LA ACTUALIZACION SE REALIZO CON EXITO";
}
    

 
 
}   

