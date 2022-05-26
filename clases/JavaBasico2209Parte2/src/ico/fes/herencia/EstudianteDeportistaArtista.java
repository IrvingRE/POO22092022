
package ico.fes.herencia;


public class EstudianteDeportistaArtista extends Persona implements Deportista, Artista{
    private String carrera;
    private String numeroCuanta;
    private String disciplinaDeportiva;
    private String generoArtistico;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numeroCuanta, String disciplinaDeportiva, String generoArtistico) {
        this.carrera = carrera;
        this.numeroCuanta = numeroCuanta;
        this.disciplinaDeportiva = disciplinaDeportiva;
        this.generoArtistico = generoArtistico;
    }

    public String getGeneroArtistico() {
        return generoArtistico;
    }

    public void setGeneroArtistico(String generoArtistico) {
        this.generoArtistico = generoArtistico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuanta() {
        return numeroCuanta;
    }

    public void setNumeroCuanta(String numeroCuanta) {
        this.numeroCuanta = numeroCuanta;
    }

    public String getDisciplinaDeportiva() {
        return disciplinaDeportiva;
    }

    public void setDisciplinaDeportiva(String disciplinaDeportiva) {
        this.disciplinaDeportiva = disciplinaDeportiva;
    }

    @Override
    public void entrenar() {
        System.out.println(this.nombre + "Esta entrenando " + this.disciplinaDeportiva);
    }

    @Override
    public void jugar() {
        System.out.println(this.nombre + "esta jugando " + this.disciplinaDeportiva);
    }

    @Override
    public void ensayar() {
        System.out.println(this.nombre + " esta ensayando/practicando " + this.generoArtistico);
    }

    @Override
    public void presentar() {
        System.out.println(this.nombre + " esta presentando su obra de " + this.generoArtistico);
    }
    
    
}
