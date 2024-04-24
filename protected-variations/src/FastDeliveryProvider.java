public class FastDeliveryProvider implements DeliveryProvider {
    @Override
    public void deliverOrder(String orderId) {
        System.out.println("Entrega Rápida: Pedido " + orderId + " entregue rapidamente.");
    }
}