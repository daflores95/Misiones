/**
 * Created by Diego on 6/5/2015.
 */
public class Principal {
    public static void main(String[] args){
        Coche c = new Coche("rojo",100, 4);
        Moto m = new Moto("verde", 200, false);
        //moto m = new moto("verde", 200,false);

        System.out.println("La velocidad del coche es de: "+c.getVelocidad());
        //System.out.println("La velocidad del moto es de: "+m.getVelocidad());

        c.acelera();
        m.acelera();
        //m.acelera();

        System.out.println("La velocidad del coche es de: "+c.getVelocidad());
        //System.out.println("La velocidad del moto es de: "+m.getVelocidad());
    }
}

