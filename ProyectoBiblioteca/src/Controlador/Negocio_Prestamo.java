
package Controlador;

import Modelo.Prestamo;
import java.sql.*;
import Modelo.*;
import java.util.*;

public class Negocio_Prestamo {
    
    // Grabar autor
    public String Graba_prestamo(Prestamo a){
    String sql="{call spadiPrestamo(?,?,?,?,?)}";

    try{ //preparar una clase para ejcutar instrucc
        //sql        
     CallableStatement st=Conexion.Conecta().prepareCall(sql);
     //Relacionar parametos con Procedimiento almacenado
     st.setString(1, a.getFecha_prestamo());
     st.setString(2, a.getFecha_devo());
     st.setString(3, a.getCode_lec());
     st.setString(4, a.getCode_emp());
     st.setString(5, a.getCod_libro());
     st.execute();    
     final ResultSet rs = st.getResultSet();
     
    }catch(Exception ex){        
      ex.printStackTrace();
    }
    return "REGISTRO SE REALIZCO CON EXITO";
}
}
