package javaproject.tasks.task5;

public class HomeDeliveryFactory extends DeliveryFactory {
    @Override
    public Delivery createDelivery() {
        return new HomeDelivery();
    }
}
