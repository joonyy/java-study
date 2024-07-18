package _09_dependency_injection.Pr1;

public class OrderService {
    private NotificationService notificationService;
    public OrderService(NotificationService n){
        this.notificationService = n;
    }

    public OrderService(){}
    public void setOrderService(NotificationService n){
        this.notificationService = n;
    }
    public void processOrder(){
        System.out.println("Order processed successfully");
        notificationService.notification();
    }
}
