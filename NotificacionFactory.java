interface NotificacionFactory {
    EmailNotificacion crearEmailNotificacion();
    SMSNotificacion crearSMSNotificacion();
    AppNotificacion creAppNotificacion();
}
