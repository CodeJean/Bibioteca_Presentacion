
package Controlador;
//en esta capa se van a implementar todos
//los metodos que seran utilizados en el
//formulario
import java.sql.*;
import Modelo.*;
import java.util.*;

public class Negocio_libro {
    //listado de libros        
    public List<Libro> ListaLibros(){
        List<Libro> lis=new ArrayList();
        String sql="select l.cod_libro,titulo,materia,estado,l.cod_autor,nombre_autor,apellido_autor,nacionalidad\n" +
        "from Libro l, Autor a\n" +
        "where l.cod_autor=a.cod_autor";        
        try{
        PreparedStatement st=Conexion.Conecta()
                .prepareStatement(sql);
        //llevar la consulta a memoria
        ResultSet rs=st.executeQuery();
        //leer filaxfila
        while(rs.next()){
           Libro a=new Libro(rs.getString(1),
           rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
           rs.getString(6),rs.getString(7),rs.getString(8));
           lis.add(a);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        //System.out.println(sql);
        return lis;
    }
    // Listado por estado            
    public List<Libro> ListaLibrosEstado(String estado){
        List<Libro> lis=new ArrayList();
        
        String sql="select l.cod_libro,titulo,materia,estado,l.cod_autor,nombre_autor,apellido_autor,nacionalidad\n" +
                "from Libro l, Autor a\n" +
                "where l.cod_autor=a.cod_autor and estado=?";
        try{
        PreparedStatement st=Conexion.Conecta().prepareStatement(sql);
        //llevar la consulta a memoria
        st.setString(1, estado);
        ResultSet rs=st.executeQuery();
        //leer filaxfila
        while(rs.next()){
           Libro a=new Libro(rs.getString(1),
           rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
           rs.getString(6),rs.getString(7),rs.getString(8));
           lis.add(a);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        //System.out.println(sql);
        return lis;
    }
    
    // Grabar Libro
    public String GrabaLibro(Libro a){
    String sql="{call spadiLibro(?,?,?,?)}";

    try{ //preparar una clase para ejcutar instrucc
        //sql        
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, a.getTitulo_libro());
     st.setString(2, a.getMateria());
     st.setString(3, a.getCod_autor());
     st.setString(4, a.getEstado());
     st.execute();    
     final ResultSet rs = st.getResultSet();
     
    }catch(Exception ex){        
      ex.printStackTrace();
    }
    return "EL LIBRO SE REGISTRO CON EXITO";
}
    
        //Actualizar Libro
public String UpdateLibro(Libro a){
    String sql="{call spaUpdateLibro(?,?,?,?,?)}";
    try{ //preparar una clase para ejcutar instrucc     
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, a.getCod_libro());
     st.setString(2, a.getTitulo_libro());
     st.setString(3, a.getMateria());
     st.setString(4, a.getCod_autor());
     st.setString(5, a.getEstado());       
     ///////// Ejecuta Update //////////    
     st.execute();    
     final ResultSet rs = st.getResultSet();
     
    }catch(Exception ex){        
      ex.printStackTrace();
    }
    return "LA ACTUALIZACION SE REALIZO CON EXITO";
}

//Elimina DELETE Libro
public String DeleteLibro(Libro a){
    String sql="{call spaDeleteLibro(?)}";
    try{ //preparar una clase para ejcutar instrucc     
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, a.getCod_libro());
     ///////// Ejecuta Update //////////    
     st.execute();    
     final ResultSet rs = st.getResultSet();
     
    }catch(Exception ex){        
      ex.printStackTrace();
    }
    return "SE ELIMINO REGISTRO CON EXITO";
}
    
}
