
package Modelo;

import Controlador.Negocio;

/**
 *
 * @author Rosales Jhonatan
 */
public class Alumno extends Persona{
    private String cod_alu;
    private int nro;
    private String carrera;
    private String facu;

    public Alumno(String cod_alu, int nro, String carrera, String facu, String code, String nombre, String apellido, String dni) {
        super(code, nombre, apellido, dni);
        this.cod_alu = cod_alu;
        this.nro = nro;
        this.carrera = carrera;
        this.facu = facu;
    }

    public String getCod_alu() {
        return cod_alu;
    }

    public void setCod_alu(String cod_alu) {
        this.cod_alu = cod_alu;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFacu() {
        return facu;
    }

    public void setFacu(String facu) {
        this.facu = facu;
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