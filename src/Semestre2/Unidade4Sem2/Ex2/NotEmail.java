package Semestre2.Unidade4Sem2.Ex2;

public class NotEmail extends Notificacao {
    
    private String email;
    private String assunto;
    private String remetente;

    public void dispararNotificacao(){
        System.out.println("Envio de notificação via e-mail");
    }

    public NotEmail(String titulo, String destinatario, String email, String assunto, String remetente) {
        super(titulo, destinatario);
        this.email = email;
        this.assunto = assunto;
        this.remetente = remetente;
    }

    public String getEmail() {
        return email;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getRemetente() {
        return remetente;
    }
}
    
    

