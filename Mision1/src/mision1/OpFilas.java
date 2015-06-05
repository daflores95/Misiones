package mision1;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.hssf.usermodel.HSSFRow;

public class OpFilas {
    public void creaFila(int meses,HSSFWorkbook libro, double tasaAnual, int credito, int cuenta, HSSFSheet hoja){
        //Creamos un objeto de tipo Credito
        Credito opc = new Credito();
        double tasaMensual = opc.modificarTasa(tasaAnual);
        double vccm = opc.pagoMensual(credito, meses, tasaMensual);
        double cred=credito;
        double interes, amortizacion;
        //Creamos los nombres de cada cleda
        HSSFRow fila0 = hoja.createRow(0);
        HSSFCell celda01 = fila0.createCell(0);
        HSSFCell celda02 = fila0.createCell(1);
        HSSFCell celda03 = fila0.createCell(2);
        HSSFCell celda04 = fila0.createCell(3);
        HSSFRichTextString texto0 = new HSSFRichTextString("Número de cuota");
        celda01.setCellValue(texto0);
        HSSFRichTextString texto01 = new HSSFRichTextString("Amortización");
        celda02.setCellValue(texto01);
        HSSFRichTextString texto02 = new HSSFRichTextString("Interés");
        celda03.setCellValue(texto02);
        HSSFRichTextString texto03 = new HSSFRichTextString("Valor de cuota por cada mes");
        celda04.setCellValue(texto03);
        for(int contador=1;contador<=meses;contador++){
            // Se crea una fila dentro de la hoja
            HSSFRow fila1 = hoja.createRow(contador+cuenta);
            // Se crea una celda dentro de la fila
            HSSFCell celdauno = fila1.createCell(0);
            HSSFCell celdados = fila1.createCell(1);
            HSSFCell celdatres = fila1.createCell(2);
            HSSFCell celdacuatro = fila1.createCell(3);
            //
            interes = opc.interes(cred, tasaMensual);
            amortizacion=opc.amortizacion(interes, vccm);
            //Convertir datos a cadenas
            String cadena0 = String.valueOf(contador);
            //El interes se calcula a partir del producto del credito*tasaMensual
            String cadena2 = String.valueOf(interes);
            //La amortizacion se calcula a partir de la cuota menos el interes
            String cadena1 = String.valueOf(amortizacion);
            String cadena3 = String.valueOf(vccm);
            //Insertar datos en celdas
             HSSFRichTextString texto = new HSSFRichTextString(cadena0);
            celdauno.setCellValue(texto);
            HSSFRichTextString texto1 = new HSSFRichTextString(cadena1);
            celdados.setCellValue(texto1);
            HSSFRichTextString texto2 = new HSSFRichTextString(cadena2);
            celdatres.setCellValue(texto2);
            HSSFRichTextString texto3 = new HSSFRichTextString(cadena3);
            celdacuatro.setCellValue(texto3);
            cred=cred-(vccm-cred*(tasaMensual));
        } 
        try {
            FileOutputStream elFichero = new FileOutputStream("Prestamo_Personal.xls");
            libro.write(elFichero);
            elFichero.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
