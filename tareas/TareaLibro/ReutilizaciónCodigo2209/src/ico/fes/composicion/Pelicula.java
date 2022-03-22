/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion;

import ico.fes.composicion.pelicula.Actor;
import ico.fes.composicion.pelicula.Productora;
import ico.fes.composicion.pelicula.Director;

/**
 *
 * @author Irving
 */
public class Pelicula {
    private String nombre;
    private int creacion;
    private Director cineasta;
    private Productora  produccion;
    private Actor interprete;

    public Pelicula() {
        cineasta=new Director();
        produccion=new Productora();
        interprete=new Actor();
    }

    public Pelicula(String nombre, int creacion, Director cineasta, Productora produccion, Actor interprete) {
        this.nombre = nombre;
        this.creacion = creacion;
        this.cineasta = cineasta;
        this.produccion = produccion;
        this.interprete = interprete;
    }

    public Actor getInterprete() {
        return interprete;
    }

    public void setInterprete(Actor interprete) {
        this.interprete = interprete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreacion() {
        return creacion;
    }

    public void setCreacion(int creacion) {
        this.creacion = creacion;
    }

    public Director getCineasta() {
        return cineasta;
    }

    public void setCineasta(Director cineasta) {
        this.cineasta = cineasta;
    }

    public Productora getProduccion() {
        return produccion;
    }

    public void setProduccion(Productora produccion) {
        this.produccion = produccion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", creacion=" + creacion + ", cineasta=" + cineasta + ", produccion=" + produccion + ", interprete=" + interprete + '}';
    }
    
}
