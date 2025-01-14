package assign2;

public class NotificationSystem {
    public void notifyEmployees(String notificationType, String message, String recipient) {
        Notification notification = NotificationFactory.getNotification(notificationType);
        notification.send(message, recipient);
    }
}
