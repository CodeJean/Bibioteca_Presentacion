/*
 
 */
package Modelo;

/**
 *
 * @author Rosales Jhonatan
 */
public class Persona {
    String code;
    String nombre;
    String apellido;
    String dni;

    public Persona() {
    }
    
    public Persona(String code, String nombre, String apellido, String dni) {
        this.code = code;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public Persona( String nombre, String apellido, String dni) {
       
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }   
    
    
}
