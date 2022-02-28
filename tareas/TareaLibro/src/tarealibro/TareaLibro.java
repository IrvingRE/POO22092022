/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

/**
 *
 * @author Irving
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro Libronuevo = new Libro();
        Libronuevo.setNombre("El principito");
        System.out.println("El nombre del libro es: " + Libronuevo.getNombre());
        
        Libronuevo.setGenero("Fantasia");
        System.out.println("El genero del libro es: " + Libronuevo.getGenero());
        
        Libronuevo.setEditorial("EUA");
        System.out.println("La editorial del libro es: " + Libronuevo.getEditorial());
        
        Libronuevo.setCosto(250);
        System.out.println("El costo del libro es: " + Libronuevo.getCosto());
        
        Libronuevo.setPaginas(120);
        System.out.println("El numero de paginas del libro son: " + Libronuevo.getPaginas());
    }
    
}
