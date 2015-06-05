package mision2;

import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class IngresoDatos {
    Scanner entrada=new Scanner(System.in);
    public int leerCantidad(){
        int cantidad;
        System.out.print("Ingrese la Cantidad de productos vendidos: ");
        cantidad = entrada.nextInt();
        return cantidad;
    }
    public double leerMonto(){
        double monto;
        System.out.print("Ingrese el monto: ");
        monto = entrada.nextDouble();
        return monto;
    }
    public String leerNombre(){
        String nombre;
        System.out.print("Ingrese el nombre del vendedor: ");
        nombre = entrada.nextLine();
        return nombre;
    }
}
