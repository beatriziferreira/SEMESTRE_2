package Semestre2.Unidade6Sem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraTexto {
    public static void main(String[] args) {
    File arquivo = new File("texto.txt");
    Scanner sc;
    try {
        sc = new Scanner(arquivo);
        while(sc.hasNext()){
        System.out.println(sc.nextLine());
    }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    
    
}
}
