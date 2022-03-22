/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion.libro;

/**
 *
 * @author Irving
 */
public class Editorial {
    private String nombre;
    private int fechaCreacion;

    public Editorial() {
    }

    public Editorial(String nombre, int fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public int getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + '}';
    }
    public void creacion(){
         System.out.println(this.getFechaCreacion()+ "Es su fecha de creación");

    }
     
}
