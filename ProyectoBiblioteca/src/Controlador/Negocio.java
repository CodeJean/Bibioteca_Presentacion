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
public void Graba(Alumno a){
    String sql="{call spadiAlu(?,?,?,?,?)}";
    
    //String coda="";
    try{ //preparar una clase para ejcutar instrucc
        //sql
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //relacionar cada parametro con ep
     st.setString(1, a.getNombre());
     st.setString(2, a.getApellido());
     st.setString(3, a.getDni());
     st.setString(4, a.getCarrera());
     st.setString(5, a.getFacu());
     ResultSet rs=st.executeQuery();
     rs.next();
        System.out.println(sql);
     //coda=rs.getString(1);
     //coda="El Registro se realizo con exito";
     //st.executeUpdate();
    }catch(Exception ex){
        
      ex.printStackTrace();
    }
     
}
    

 
 
}   

