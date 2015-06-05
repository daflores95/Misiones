/**
 * Created by Diego on 6/5/2015.
 */
public class Moto extends Vehiculo{
    private boolean reparar_cadena;
    //Constructor
    public Moto(String color, int cv, boolean reparar_cadena){
        super (color, cv, 2);
        this.reparar_cadena = reparar_cadena;
    }

}
