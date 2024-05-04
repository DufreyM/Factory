class SMSNotificacion implements Notificacion {
    private final String numeroTelefono;

    public SMSNotificacion(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS al número " + numeroTelefono + ": " + mensaje); 
    }
}
