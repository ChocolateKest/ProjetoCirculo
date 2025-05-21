
package model;

/**
 *
 * @author gusta
 */
public class Circulo {
    
    private double raio;
    private double pi;
    
    public Circulo(){
    this(0,3.14);
}

    public Circulo(double raio, double pi) {
        this.raio = raio;
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    
    public double getPerimetro(){
        return (getRaio() * getRaio()) * getPi();
    }
    
}
    

