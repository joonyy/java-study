package _09_dependency_injection.Pr1;

public class Main {

    public static void main(String[] args) {
        NotificationService service1 = new EmailNotificationService();
        OrderService serviceA = new OrderService(service1);
        serviceA.processOrder();

        System.out.println("---");
        NotificationService service2 = new SMSNotificationService();
        OrderService serviceB = new OrderService();
        serviceB.setOrderService(service2);
        serviceB.processOrder();
    }
}
