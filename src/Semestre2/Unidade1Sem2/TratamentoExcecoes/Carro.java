package Semestre2.Unidade1Sem2.TratamentoExcecoes;
public class Carro {
    private String placa;
    private String modelo;
    private int hora;
    private int minuto;

    public Carro(String modelo, String placa){
        this.placa = placa;
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    
}
