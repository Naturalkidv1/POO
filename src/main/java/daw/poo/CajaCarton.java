package daw.poo;

public class CajaCarton {

    private double ancho, alto, largo, peso;
    private long id;
    
    public CajaCarton(long id, double ancho, double alto, double largo, double peso) {
        this.id = id;
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;

    }

    public CajaCarton() {
        id = 0;
        ancho = 0;
        alto = 0;
        largo = 0;
        peso = 0;
    }

    public void abrir() {
        System.out.println("Has abierto la caja " + this.id +".");
    }

    public void cerrar() {
        System.out.println("Has cerrado la caja " + this.id +".");
    }

    
    @Override
    public String toString() {
        return "CajaCarton {" + "ID=" + id + ", Ancho=" + ancho + ", Alto=" + alto + ", Largo=" + largo + ", Peso=" + peso + '}';
    }
    
    
    
    
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    
}
