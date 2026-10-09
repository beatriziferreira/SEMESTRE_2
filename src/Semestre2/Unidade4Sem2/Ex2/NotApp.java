package Semestre2.Unidade4Sem2.Ex2;

public class NotApp extends Notificacao{

    public NotApp(String titulo, String destinatario) {
        super(titulo, destinatario);
    }

    public void dispararNotificacao() {
        System.out.println("Dispara notificação via app");
    }
    
}
