/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author Irving
 */
public class CuentaHabiente {
        private String idCliente;
    private String nombre;
    private float balance;

    public CuentaHabiente() {
    }

    public CuentaHabiente(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CuentaHabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    public void retirarDinero(float monto){
        
        balance -= monto;
        System.out.println("El saldo restante. " + balance);
        
    }
    public String evaluarNivelCliente(){
        if(balance<= 50000){
            return "Cliente Regular";
            
        }else{
              return "Cliente Premium";
        } 
        
    }
}


