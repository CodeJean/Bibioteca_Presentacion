
package Modelo;

/**
 *
 * @author Rosales Jhonatan
 */
public class Alumno extends Persona{
    private String cod_alu;
    private int nro;
    private String carrera;
    private String facu;

    public Alumno() {
    }
    
    public Alumno(String cod_alu, int nro, String carrera, String facu) {
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
    
}
