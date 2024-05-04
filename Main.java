public class Main {
    public static void main(String[] args) {
        NotificacionFactory urgenteFactory = new UrgenteNotificacionFactory();

        //Notificaciones urgentes
        EmailNotificacion emailUrgente = urgenteFactory.crearEmailNotificacion();
        SMSNotificacion smsUrgente = urgenteFactory.crearSMSNotificacion();

        emailUrgente.enviarMensaje("Este es un correo urgente");
        smsUrgente.enviarMensaje("Este es un mensaje de texto urgente");

        // Notificaciones regulares
        NotificacionFactory regularFactory = new RegularNotificacionFactory();

        EmailNotificacion emailRegular = regularFactory.crearEmailNotificacion();
        SMSNotificacion smsRegular = regularFactory.crearSMSNotificacion();

        emailRegular.enviarMensaje("Este es un correo regular");
        smsRegular.enviarMensaje("Este es un mensaje de texto regular");
    }
}
