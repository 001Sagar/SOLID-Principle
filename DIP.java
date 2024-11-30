
import javax.management.Notification;

// Definition: High-level modules should not depend on low-level modules. Both should depend on abstractions.

public class DIP {

    interface NotificationService {

        void sendNotification();
    }

    static class EmailService implements NotificationService {

        public void sendNotification() {
            System.out.println("Send Notificarion by Mail");
        }
    }

    static class SmsService implements NotificationService {

        public void sendNotification() {
            System.out.println("Send Notification by SMS");
        }
    }

    static class customerNotification {
        private NotificationService notificationService;

        public customerNotification(NotificationService notificationService) {
            this.notificationService = notificationService;
        }

        public void Notify() {
            notificationService.sendNotification();
        }

    }

    public static void main(String[] args) {

        // Use EmailService for notifications
        EmailService e1 = new EmailService();
        customerNotification c1 = new customerNotification(e1);
        c1.Notify();

        // Use SmsService for notification
        SmsService s1 = new SmsService();
        customerNotification c2 = new customerNotification(s1);
        c2.Notify();
    }
}
