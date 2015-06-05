package mision2;
/**
 *
 * @author Diego
 */
public class Operaciones {
    public double bonoxMontoVenta(double MontoNoIGV){
        double bono = 0;
        if (MontoNoIGV<500){
            bono = MontoNoIGV * 0.03;
        }
        //No se especifica los montos entre 500 y 1000
        if((1000<=MontoNoIGV) && (MontoNoIGV<1500)){
            bono = MontoNoIGV * 0.05;
        }
        if (1500<=MontoNoIGV){
            bono = MontoNoIGV * 0.07;
        }
        return bono;
    }
    
    public int bonoxCantVenta(int Cantidad){
        int bono=0;
        if (Cantidad<30){
            bono = 20;
        }
        //No se especifica las cantidades entre 30 y 40
        if ((Cantidad>=40)&&(Cantidad<100)){
            bono = 50;
        }
        if (Cantidad>=100){
            bono = 100;
        }
        return bono;
    }
    
    public double montoSinIGV(double montoIGV){
        double MontoNoIGV;
        double IGV=0.18;
        MontoNoIGV=montoIGV*(1-IGV);
        return MontoNoIGV;
    }
}
