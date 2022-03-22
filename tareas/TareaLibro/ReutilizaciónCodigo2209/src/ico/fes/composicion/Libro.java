/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion;

import ico.fes.composicion.libro.Autor;
import ico.fes.composicion.libro.Editorial;


/**
 *
 * @author Irving
 */
public class Libro {
    private String nombre;
    private String categoria;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
        autor=new Autor();
        editorial=new Editorial();
    }

    public Libro(String nombre, String categoria, Autor autor, Editorial editorial) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", categoria=" + categoria + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
}
