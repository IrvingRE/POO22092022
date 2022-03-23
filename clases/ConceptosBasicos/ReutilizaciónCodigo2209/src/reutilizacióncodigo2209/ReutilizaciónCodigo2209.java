/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacióncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.composicion.Libro;
import ico.fes.composicion.Pelicula;
import ico.fes.composicion.libro.Autor;
import ico.fes.composicion.libro.Editorial;
import ico.fes.composicion.pelicula.Actor;
import ico.fes.composicion.pelicula.Director;
import ico.fes.composicion.pelicula.Productora;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;

/**
 *
 * @author Irving
 */
public class ReutilizaciónCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="José José";
        System.out.println(nombre);
        System.out.println(nombre.charAt(3) );
        System.out.println(nombre.toUpperCase());
        /*
        JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        */
        Computadora miCompu= new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //Ejercicio: Establecer un mouse marca Logitech tipo óptico 
        miCompu.setRatón(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);
        
        Computadora compu2= new Computadora("Apple", "MacBook Pro" ,
                new Monitor("Toshiba", 14.3f),
                new Mouse("Acteck", "optico") ,
                new Teclado("Apple", 101),
                new Procesador("M1", 3.4f));
        System.out.println(compu2);
        
        System.out.println("-----------------------------");
        Alumno alu1=new Alumno();
        alu1.setNombre("Jose");
        System.out.println(alu1);
        
        Alumno alu2= new Alumno("319298653", "ICO" , "Irving" , 18);
        System.out.println(alu2);
        
        System.out.println("-----------------------------");
        Libro libro1= new Libro("El principito","Ficción",
                new Autor("Antoine de Saint Exupery", 44),
                new Editorial( "Reynal & Hitchcock", 1933));
        System.out.println(libro1);
        
        System.out.println("-----------------------------");
        Pelicula peli1= new Pelicula("Spiderman", 2002 ,
                new Director("Sam Raimi", 62),
                new Productora("Marvel Entertainment", 1998),
                new Actor("Tobey Maguire", 46));
        System.out.println(peli1);
        
        alu1.setNumeroCuenta("6526526556256");
        alu1.setEdad(19);
        System.out.println(alu1); //Otorgar nuevos valores
        
        /*
        System.out.println("---------Composicion y herencia en la misma clase-------------------");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRaton(new Mouse("LG", "Optico"));
        System.out.println(server);
        server.getRaton().setMarca ("Logitech");
        System.out.println(server);
*/
        
        System.out.println("-----Ejemplo polimorfismo---------");
        Perro dog=new Perro("Bull dog", "5 estrellas", 4);
        dog.emitirSonido();
        Animal animal= (Animal)dog;
        System.out.println(animal.getClass());
    }
    
}
