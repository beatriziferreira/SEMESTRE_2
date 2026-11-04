package Semestre2.Unidade6Sem2;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExemploBinario {
    public static void main(String[] args) {
        try {
            File arquivo = new File("dados.dat");
            FileOutputStream f = new FileOutputStream(arquivo);
            DataOutputStream d = new DataOutputStream(f);
            f.write(65);
            f.write(67);
            d.writeDouble(26.7);
            d.writeUTF("A");
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}