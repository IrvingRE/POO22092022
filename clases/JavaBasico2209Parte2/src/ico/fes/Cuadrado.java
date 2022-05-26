
package ico.fes;


public class Cuadrado implements Figura{
    
    private float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public float calcularArea() {
        System.out.println("Multiplicando lado por lado");
        return this.lado * this.lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
}
