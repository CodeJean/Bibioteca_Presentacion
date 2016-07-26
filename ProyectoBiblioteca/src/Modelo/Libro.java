
package Modelo;


public class Libro extends Autor{
    private String cod_libro;
    private int nro;
    private String titulo_libro;
    private String materia;
    private String cod_autor;
    private String estado;

    public Libro() {
    }

    public Libro(String cod_libro, String titulo_libro, String materia, String estado, String cod_autor, String nombre_autor, String apellido_autor, String nacionalidad) {
        super(cod_autor, nombre_autor, apellido_autor, nacionalidad);
        this.cod_libro = cod_libro;
        //this.nro = nro;
        this.titulo_libro = titulo_libro;
        this.materia = materia;
        //this.cod_autor = cod_autor;
        this.estado = estado;
    } 

    public Libro(String cod_libro, int nro, String titulo_libro, String materia, String cod_autor, String estado) {
        this.cod_libro = cod_libro;
        this.nro = nro;
        this.titulo_libro = titulo_libro;
        this.materia = materia;
        this.cod_autor = cod_autor;
        this.estado = estado;
    }
    
    public Libro(String cod_libro, String titulo_libro, String materia, String cod_autor, String estado) {
        this.cod_libro = cod_libro;
        this.titulo_libro = titulo_libro;
        this.materia = materia;
        this.cod_autor = cod_autor;
        this.estado = estado;
    }
    

    public String getCod_libro() {
        return cod_libro;
    }

    public void setCod_libro(String cod_libro) {
        this.cod_libro = cod_libro;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getTitulo_libro() {
        return titulo_libro;
    }

    public void setTitulo_libro(String titulo_libro) {
        this.titulo_libro = titulo_libro;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCod_autor() {
        return cod_autor;
    }

    public void setCod_autor(String cod_autor) {
        this.cod_autor = cod_autor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
