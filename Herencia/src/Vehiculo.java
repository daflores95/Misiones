/**
 * Created by Diego on 6/5/2015.
 */
public class Vehiculo {
    private String color;
    private int cv, ruedas;
    private int velocidad;
    //Constructor
    public Vehiculo(String color, int cv, int ruedas){
        this.color = color;
        this.cv = cv;
        this.ruedas = ruedas;
    }
    //Gets
    public int getCv() {
        return cv;
    }
    public int getRuedas() {
        return ruedas;
    }
    public int getVelocidad() {
        return velocidad;
    }
    //metodos
    public void acelera(){
        velocidad += cv/20;
    }

    public void frena(){
        velocidad = 0;
    }
}

