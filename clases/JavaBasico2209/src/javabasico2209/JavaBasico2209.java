/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Irving
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int edad = 20;
        System.out.println("Edad = " + edad);
        Integer edad2 = new Integer(22);
        System.out.println( edad2 );
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println( edad2.shortValue() );
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        //convertir Strings a entero.
        String cadena= "99";
        int altura = Integer.parseInt(cadena); //Metodo miembro o metodo de clase 
        Color c1 = Color.BLUE;  //Atributo miembro o atributo de clase
        altura+= 1;
        System.out.println("Altura =" + altura );
        
        float y= Float.parseFloat(cadena);
        y=y + 0.5f;
        System.out.println("Altura = " + y);
        System.out.println("-----------------------------------");
        
        
        System.out.println(" Troncos de un arbol = " + Arbol.tronco );
        Arbol.generarOxigeno();
        
        JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el ttulo", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println( dato );
        
        int edad3 = 20;
        String resultado = "";
        if (edad3 < 18) {
            resultado = "Menor de edad";
        } else {
            resultado = "Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);
        
        int edad4=24;
        String res="";
        res= edad4 < 18? "Menor de edad edad 4": "Mayor de edad, tequila";
        System.out.println(res);
        
        int edad5=19;
        System.out.println(edad5 < 18? "Menor de edad 5": "YA el tequila" );
                
        int val1= 1;
        int val2= 5;
        
        System.out.println(val1 | val2);
              
        int val3= 1;
        int val4= 0;
        val4= val3 <<1;
        System.out.println(val4);
        
        System.out.println("-------ARREGLOS--------");
        int[] edades;
        edades=new int[5];
        System.out.println(edades);
        
        edades[0]=10;
        System.out.println("La primer edad es: " + edades[0]);
        
        int [] estaturas=new int [5];
        int[] pesos={86,99,56,76,77};
        System.out.println(pesos[0]);
        System.out.println(pesos[1]);
        System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);
        
        System.out.println("------CON FOR-------");
        for(int i=0; i< pesos.length; i++){
            System.out.println(pesos[i]);
        }
        System.out.println("Orden inverso");
                for (int i = pesos.length-1 ; i >= 0; i--) {
            System.out.println(pesos[i]);   
        }
        
        
        System.out.println("Arreglo de alumnos");
        Alumno[] lista=new Alumno[5];
        lista[0]=new Alumno("99999", 2 , 9.0f);
        lista[1]=new Alumno("77777", 2 , 7.0f);
        lista[2]=new Alumno("55555", 2 , 7.0f);
        lista[3]=new Alumno("88888", 2 , 8.0f);
        lista[4]=new Alumno("66666", 2 , 6.0f);
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempeño());
            
        }
        
        System.out.println("Con for each");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempeño());
            
        }
    }
    
    
}