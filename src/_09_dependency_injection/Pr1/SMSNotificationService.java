package _09_dependency_injection.Pr1;

public class SMSNotificationService implements NotificationService {
    @Override
    public void notification() {
        System.out.println("Sending SMS notification : Your order has been processed");
    }
}
