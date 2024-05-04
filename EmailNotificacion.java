public class EmailNotificacion implements Notificacion {
    private final String correoRemitente;

    public EmailNotificacion(String correoRemitente) {
        this.correoRemitente = correoRemitente;
    }

    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando correo electrónico a " + correoRemitente + ": " + mensaje);
    }
}
