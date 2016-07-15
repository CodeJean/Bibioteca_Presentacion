package Controlador;
//en esta capa se van a implementar todos
//los metodos que seran utilizados en el
//formulario
import java.sql.*;
import Modelo.*;
import java.util.*;
import Vista.Registro_Alumno;
import java.io.FileInputStream;

public class Negocio {
// Buscar existencia de foto
    public String ExisteFoto(String codAlum){
    String sql="{call fotoexiste(?)}";
    String resp="";
    try{ //preparar una clase para ejcutar instrucc
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
    
    // LOGIN Alumno / Docente
    public String LoginPer(String cod,String dni){
    String sql="{call LoginPer(?,?)}";
    String resp="";
    try{ //preparar una clase para ejcutar instrucc
        //sql
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //relacionar cada parametro con ep
     st.setString(1, cod);
     st.setString(2, dni);
     ResultSet rs=st.executeQuery();
     rs.next();
     resp=rs.getString(1);
     //st.executeUpdate();
    }catch(Exception ex){
      ex.printStackTrace();
    }
        return resp;
}
    // LOGIN
    public String LoginEmp(String cod,String dni,String tipo){
    String sql="{call LoginEmp(?,?,?)}";
    String resp="";
    try{ //preparar una clase para ejcutar instrucc
        //sql
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //relacionar cada parametro con ep
     st.setString(1, cod);
     st.setString(2, dni);
     st.setString(3, tipo);
     ResultSet rs=st.executeQuery();
     rs.next();
     resp=rs.getString(1);
     //st.executeUpdate();
    }catch(Exception ex){
      ex.printStackTrace();
    }
        return resp;
}

    
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
 //listado de Alumnos/Biblioteca colocar en un arraylist        
    public List<Alumno> BuscarAlumno(String coda){
        List<Alumno> lis=new ArrayList();
        //String sql="select * from Alumno";
        String sql="select code,nombre,apellido,dni,carrera,facultad,foto\n" +
                    "from Persona p,Alumno a\n" +
                    "where code=cod_alu and code=?";
        try{
        PreparedStatement st=Conexion.Conecta().prepareStatement(sql);
        //llevar la consulta a memoria
        st.setString(1, coda);
        ResultSet rs=st.executeQuery();
        //leer filaxfila
        while(rs.next()){
           Alumno a=new Alumno(rs.getString(1),
           rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
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
    String sql="{call spadiAlu(?,?,?,?,?,?)}";

    try{ //preparar una clase para ejcutar instrucc
        //sql
     FileInputStream ArchivoFoto;   
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, a.getNombre());
     st.setString(2, a.getApellido());
     st.setString(3, a.getDni());
     st.setString(4, a.getCarrera());
     st.setString(5, a.getFacu());
     //System.out.println(""+a.getFoto());
     // Parametro 6 se enviara null o direccion para ser grabado en bd
     if(a.getFoto()== ""){         
         st.setBinaryStream(6,null);  
     }else{
         ArchivoFoto = new FileInputStream(a.getFoto());        
        st.setBinaryStream(6,ArchivoFoto); 
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
//Elimina DELETE Alumno
public String DeleteAlu(Alumno a){
    String sql="{call spaDeleteAlu(?)}";
    try{ //preparar una clase para ejcutar instrucc     
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, a.getCod_alu());
     ///////// Ejecuta Update //////////    
     st.execute();    
     final ResultSet rs = st.getResultSet();
     
    }catch(Exception ex){        
      ex.printStackTrace();
    }
    return "SE ELIMINO REGISTRO CON EXITO";
}  

   
 
}   

