class RegularNotificacionFactory implements NotificacionFactory {
    public EmailNotificacion crearEmailNotificacion() {
        // Implementar lógica de creación de email para notificaciones regulares
        return new EmailNotificacion(null);
    }

    public SMSNotificacion crearSMSNotificacion() {
        // Implementar lógica de creación de SMS para notificaciones regulares
        return new SMSNotificacion(null);
    }

    public AppNotificacion creAppNotificacion(){
        return new AppNotificacion();
    }
}