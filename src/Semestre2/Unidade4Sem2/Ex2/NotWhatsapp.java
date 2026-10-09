package Semestre2.Unidade4Sem2.Ex2;

public class NotWhatsapp extends NotTelefone {
    private String usuario;

    public void dispararNotificacao() {
        System.out.println("Dispara notificação via WhatsApp");
    }

    public String getUsuario() {
        return usuario;
    }
    
}
