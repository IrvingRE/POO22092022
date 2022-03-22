/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion.pelicula;

/**
 *
 * @author Irving
 */
public class Actor {
        private String nombre;
        private int edad;

    public Actor() {
    }

    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Actor(String tobey_Maguire) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
        public void bailar() { 
            System.out.println(this.nombre + "Esta bailando..." );
        }
        
}
