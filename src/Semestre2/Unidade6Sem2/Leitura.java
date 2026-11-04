package Semestre2.Unidade6Sem2;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Leitura {
    public static void main(String[] args) throws FileNotFoundException {
        int dado;
            File arquivo = new File("dados.dat");
            FileInputStream fis = new FileInputStream(arquivo);
            DataInputStream dis = new DataInputStream(fis);
            try {
                while ((dado = fis.read()) != -1){
                    System.out.println(dado);
                }   
                double d = dis.readDouble();
                System.out.println(d);
                String s = dis.readUTF();
                System.out.println(s);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                if (fis != null){
                   try {
                    fis.close();
                   } catch (IOException e) {
                    System.out.println(e.getMessage());
                   }
                }
            }
    }
}
