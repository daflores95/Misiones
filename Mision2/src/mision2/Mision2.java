package mision2;

/**
 *
 * @author Diego
 */


public class Mision2 {
     public static void main(String[] args) {
        Operaciones opc = new Operaciones();
        IngresoDatos ing = new IngresoDatos();
        String nombre;
        int cantidad;
        double suma=0;
        double  monto;
        double bonoMonto;
        double bonoCantidad;
        nombre=ing.leerNombre();
        for (int i=1;i<=3;i++){
            cantidad=ing.leerCantidad();
            monto=ing.leerMonto();
            monto=opc.montoSinIGV(monto);
            bonoMonto = opc.bonoxMontoVenta(monto);
            bonoCantidad= opc.bonoxCantVenta(cantidad);
            suma = suma + bonoMonto + bonoCantidad;
        }
        System.out.printf("El vendedor %s ha generado un bono de: %s",nombre,suma);
     }
}