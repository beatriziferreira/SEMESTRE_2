package Semestre2.Unidade5Sem2.ExRevisão;

public interface Cobravel {
    double calcularValorCobrar();

    default String gerarComporovante(){
        return "Valor a cobrar: ";
    }
}
