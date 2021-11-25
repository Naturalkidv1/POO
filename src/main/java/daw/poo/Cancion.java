// 10, 12, 13 -- Relacion C
package daw.poo;

/**
 *
 * @author ajbazan01
 */
public class Cancion {

    private String titulo, autor;

    public Cancion() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";

    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Titulo: " + titulo + ", Autor: " + autor + '}';
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
