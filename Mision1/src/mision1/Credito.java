package mision1;
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Credito {
    
    public double pagoMensual(int credito, int meses, double tasaMensual ) {
        double pagoMes = (tasaMensual * (double)credito) / (1.0D - Math.pow(1.0D + tasaMensual, (-meses)));
        return pagoMes;
    }

    public double modificarTasa(double tasaAnual) {
        double tasaMensual = Math.pow(1.0D + tasaAnual, 1.0D / 12.0D)-1;
        return tasaMensual;
    }
    
    public double interes(double credito, double tasaMensual){
        double Interes;
        Interes = credito*tasaMensual;
        return Interes;
    }
    
    public double amortizacion(double interes, double pagoMensual){
        double Amortizacion;
        Amortizacion = pagoMensual-interes;
        return Amortizacion;
    }
}
