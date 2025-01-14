package assign2;

public class Main {
    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem();
        notificationSystem.notifyEmployees("email", "New policy update is available.", "tanvi@gmail.com");

        notificationSystem.notifyEmployees("sms", "Don't forget about the upcoming office event!", "+91-7566955431");

        notificationSystem.notifyEmployees("push", "Scheduled server downtime at 2 AM.", "tanvi756");
    }
}
