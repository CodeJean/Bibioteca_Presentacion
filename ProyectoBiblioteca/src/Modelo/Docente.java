package Modelo;

import Controlador.Negocio;

public class Docente extends Persona{
    private String cod_doce;
    private int nro;
    private String especialidad;

    public Docente() {
        super(null, null, null, null);
    }

    public Docente(String cod_doce, int nro, String especialidad, String code, String nombre, String apellido, String dni) {
        super(code, nombre, apellido, dni);
        this.cod_doce = cod_doce;
        this.nro = nro;
        this.especialidad = especialidad;
    }
    
    public Docente(String cod_doce, String nombre, String apellido, String dni,String especialidad) {
        super(nombre, apellido, dni);
        this.cod_doce = cod_doce;
        this.especialidad = especialidad;
    }
    
    /*public alumno(String cod_alu,String nombre, String apellido, String dni, String carrera, String facu) {
        super(nombre, apellido, dni);
        this.cod_alu = cod_alu;
        this.carrera = carrera;
        this.facu = facu;
    }*/
    
    public Docente(String nombre, String apellido, String dni,String especialidad) {
        super(nombre, apellido, dni);
        this.especialidad = especialidad;
    }
    
    
    
    public String getCod_doce() {
        return cod_doce;
    }

    public void setCod_doce(String cod_doce) {
        this.cod_doce = cod_doce;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
