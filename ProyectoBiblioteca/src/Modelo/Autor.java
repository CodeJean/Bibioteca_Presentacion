package Modelo;


public class Autor {
    //CAMBIE PRIVATE
    String cod_autor;
    int nro;
    String nombre_autor;
    String apellido_autor;
    String nacionalidad;

    public Autor() {
    }

    public Autor(String cod_autor, int nro, String nombre_autor, String apellido_autor, String nacionalidad) {
        this.cod_autor = cod_autor;
        this.nro = nro;
        this.nombre_autor = nombre_autor;
        this.apellido_autor = apellido_autor;
        this.nacionalidad = nacionalidad;
    }
    
    public Autor(String cod_autor, String nombre_autor, String apellido_autor, String nacionalidad) {
        this.cod_autor = cod_autor;        
        this.nombre_autor = nombre_autor;
        this.apellido_autor = apellido_autor;
        this.nacionalidad = nacionalidad;
    }

    public String getCod_autor() {
        return cod_autor;
    }

    public void setCod_autor(String cod_autor) {
        this.cod_autor = cod_autor;
    }

    public int getNro() {
        return nro;
    }


    public void setNro(int nro) {
        this.nro = nro;
    }


    public String getNombre_autor() {
        return nombre_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    public String getApellido_autor() {
        return apellido_autor;
    }

    public void setApellido_autor(String apellido_autor) {
        this.apellido_autor = apellido_autor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
 
}
