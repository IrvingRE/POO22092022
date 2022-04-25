/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author Irving
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------Arreglo de cuentahabientes------");
        CuentaHabiente[] lista=new CuentaHabiente[5];
        lista[0]=new CuentaHabiente("65123", "Pepe" , 95000.45f);
        lista[1]=new CuentaHabiente("45789", "Toño" , 48500.40f);
        lista[2]=new CuentaHabiente("15478", "Irving" , 78549.90f);
        lista[3]=new CuentaHabiente("78945", "Sharon" , 10054.20f);
        lista[4]=new CuentaHabiente("24146", "Hai Xel" , 51050.30f);
        
        for (CuentaHabiente cuentaHabiente: lista){
            System.out.println(cuentaHabiente.evaluarNivelCliente());
        }
    }
    
}

    
    
