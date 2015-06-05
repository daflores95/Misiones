package mision1;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * Ejemplo sencillo de cómo crear una hoja Excel con POI
 * 
 * @author chuidiang
 * 
 */
public class Mision1 {

    public static void main(String[] args) {
        // Cuenta solamente se utiliza para posicionar los dator de manera ordenada
        int cuenta=0;
        // Se crea el libro
        HSSFWorkbook libro = new HSSFWorkbook();
        HSSFSheet hoja = libro.createSheet();
        OpFilas abc = new OpFilas() ;
        abc.creaFila(24,libro,0.36, 15000, cuenta, hoja);
        cuenta=25;
        abc.creaFila(36,libro,0.36, 15000, cuenta, hoja);
        cuenta=62;
        abc.creaFila(48,libro,0.36, 15000, cuenta, hoja);
    }
}