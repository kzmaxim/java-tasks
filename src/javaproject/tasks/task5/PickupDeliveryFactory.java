package javaproject.tasks.task5;

public class PickupDeliveryFactory extends DeliveryFactory {
    @Override
    public Delivery createDelivery() {
        return new PickupDelivery();
    }
}
