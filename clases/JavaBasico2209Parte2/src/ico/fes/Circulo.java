
package ico.fes;

//Java bean, POJO diferente a los EJB
public class Circulo implements Figura{
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return Figura.PI * (this.radio * this.radio);
    }
    /**
     * Principio de diseño de 1. P: 0, 1 e infinito: Solo los valores
     * 0, 1 e infinitos son validos para usarse en la codificacion de algortimos
     * El lenguaje de programacion debe proporcionar un mecanismo para evitar
     * literales numericas en el programa
     */
    
    
}
