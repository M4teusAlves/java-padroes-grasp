public class OrderProcessor {
    private DeliveryProvider deliveryProvider;

    public OrderProcessor(DeliveryProvider deliveryProvider) {
        this.deliveryProvider = deliveryProvider;
    }

    public void processOrder(String orderId) {

        System.out.println("Pedido " + orderId + " sendo preparado.");

        deliveryProvider.deliverOrder(orderId);

        System.out.println("Pedido " + orderId + " entregue com sucesso.");
    }
}
