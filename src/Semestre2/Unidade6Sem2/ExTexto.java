package Semestre2.Unidade6Sem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class ExTexto {
    public static void main(String[] args) {
        File arquivo = new File("texto.txt");
        try {
            PrintWriter pw = new PrintWriter(arquivo);
            pw.write("STRIKER");
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        
    }
}
