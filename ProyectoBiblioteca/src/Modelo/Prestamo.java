
package Modelo;

public class Prestamo extends Libro{
    private int nroprestamo;
    private String fecha_prestamo;
    private String fecha_devo;
    private String code_lec;
    private String code_emp;

    public Prestamo() {
    }

    public Prestamo(String fecha_prestamo, String fecha_devo, String code_lec, String code_emp, String cod_libro) {
        super(cod_libro);        
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devo = fecha_devo;
        this.code_lec = code_lec;
        this.code_emp = code_emp;
    }    

    public Prestamo(int nroprestamo, String fecha_prestamo, String fecha_devo, String code_lec, String code_emp) {
        this.nroprestamo = nroprestamo;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devo = fecha_devo;
        this.code_lec = code_lec;
        this.code_emp = code_emp;
    }

    public int getNroprestamo() {
        return nroprestamo;
    }

    public void setNroprestamo(int nroprestamo) {
        this.nroprestamo = nroprestamo;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_devo() {
        return fecha_devo;
    }

    public void setFecha_devo(String fecha_devo) {
        this.fecha_devo = fecha_devo;
    }

    public String getCode_lec() {
        return code_lec;
    }

    public void setCode_lec(String code_lec) {
        this.code_lec = code_lec;
    }

    public String getCode_emp() {
        return code_emp;
    }

    public void setCode_emp(String code_emp) {
        this.code_emp = code_emp;
    }
 
}
