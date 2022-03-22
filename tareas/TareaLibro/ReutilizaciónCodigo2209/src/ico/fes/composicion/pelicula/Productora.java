/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion.pelicula;

/**
 *
 * @author Irving
 */
public class Productora {
    private String nombre;
    private int creacion;

    public Productora() {
    }

    public Productora(String nombre, int creacion) {
        this.nombre = nombre;
        this.creacion = creacion;
    }

    public int getCreacion() {
        return creacion;
    }

    public void setCreacion(int creacion) {
        this.creacion = creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", creacion=" + creacion + '}';
    }
    public void producir(){
            System.out.println(this.getNombre()+ "Esta produciendo una pelicula");

    }
}
