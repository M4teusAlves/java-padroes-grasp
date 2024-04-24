public class EconomicDeliveryProvider implements DeliveryProvider {
    @Override
    public void deliverOrder(String orderId) {
        System.out.println("Entrega Econômica: Pedido " + orderId + " entregue de forma econômica.");
    }
}
