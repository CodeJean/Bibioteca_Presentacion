/*
 
 */
package Modelo;

/**
 *
 * @author Rosales Jhonatan
 */
public abstract class Persona {
    private String code;
    private String nombre;
    private String apellido;
    private String dni;

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
