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
        String sql="select	p.code,p.nombre,p.apellido,p.dni,a.carrera,a.facultad\n" +
        "from Persona p,Alumno a\n" +
        "where p.code=a.cod_alu";
        try{
        PreparedStatement st=Conexion.Conecta()
                .prepareStatement(sql);
        //llevar la consulta a memoria
        ResultSet rs=st.executeQuery();
        //leer filaxfila
        while(rs.next()){
           Alumno a=new Alumno(rs.getString(1),
           rs.getInt(2),rs.getString(3),rs.getString(4));
           lis.add(a);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return lis;
    }    
    

 
 
}   

