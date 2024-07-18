package _09_dependency_injection.Pr1;

public class EmailNotificationService implements NotificationService{
    @Override
    public void notification() {
        System.out.println("Sending email notification : Your order has been processed");
    }
}
