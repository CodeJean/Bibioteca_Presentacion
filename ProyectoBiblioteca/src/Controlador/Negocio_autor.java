
package Controlador;
//en esta capa se van a implementar todos
//los metodos que seran utilizados en el
//formulario Registro autor
import java.sql.*;
import Modelo.*;
import java.util.*;
//import Vista.Registro_Alumno;
import java.io.FileInputStream;

public class Negocio_autor {    
    //listado de Alumnos/Biblioteca colocar en un arraylist        
    public List<Autor> ListadoAutor(){
        List<Autor> lis=new ArrayList();
        String sql="select * from Autor";        
        try{
        PreparedStatement st=Conexion.Conecta()
                .prepareStatement(sql);
        //llevar la consulta a memoria
        ResultSet rs=st.executeQuery();
        //leer filaxfila
        while(rs.next()){
           Autor a=new Autor(rs.getString(1),
           rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5));
           lis.add(a);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        //System.out.println(sql);
        return lis;
    }
    // Grabar autor
    public String Graba(Autor a){
    String sql="{call spadiAutor(?,?,?)}";

    try{ //preparar una clase para ejcutar instrucc
        //sql        
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, a.getNombre_autor());
     st.setString(2, a.getApellido_autor());
     st.setString(3, a.getNacionalidad());   
     st.execute();    
     final ResultSet rs = st.getResultSet();
     
    }catch(Exception ex){        
      ex.printStackTrace();
    }
    return "REGISTRO DE AUTOR SE REALIZCO CON EXITO";
}
    
    //Actualizar Alumno
public String UpdateAutor(Autor a){
    String sql="{call spaUpdateAutor(?,?,?,?)}";
    try{ //preparar una clase para ejcutar instrucc     
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, a.getCod_autor());
     st.setString(2, a.getNombre_autor());
     st.setString(3, a.getApellido_autor());
     st.setString(4, a.getNacionalidad());     
     ///////// Ejecuta Update //////////    
     st.execute();    
     final ResultSet rs = st.getResultSet();
     
    }catch(Exception ex){        
      ex.printStackTrace();
    }
    return "LA ACTUALIZACION SE REALIZO CON EXITO";
}

//Elimina DELETE Alumno
public String DeleteAutor(Autor a){
    String sql="{call spaDeleteAutor(?)}";
    try{ //preparar una clase para ejcutar instrucc     
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, a.getCod_autor());
     ///////// Ejecuta Update //////////    
     st.execute();    
     final ResultSet rs = st.getResultSet();
     
    }catch(Exception ex){        
      ex.printStackTrace();
    }
    return "SE ELIMINO REGISTRO CON EXITO";
}

//listado de Alumnos/Biblioteca colocar en un arraylist        
    public List<Autor> BuscarAutor(String coda){
        List<Autor> lis=new ArrayList();
        //String sql="select * from Alumno";
        String sql="select *\n" +
                "from Autor\n" +
                "where cod_autor=?";
        try{
        PreparedStatement st=Conexion.Conecta().prepareStatement(sql);
        //llevar la consulta a memoria
        st.setString(1, coda);
        ResultSet rs=st.executeQuery();
        //leer filaxfila
        while(rs.next()){
           Autor a=new Autor(rs.getString(1),
           rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5));
           lis.add(a);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        //System.out.println(sql);
        return lis;
    }
    
}
