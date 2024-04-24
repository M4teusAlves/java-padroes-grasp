public class App {
    public static void main(String[] args) throws Exception {
        // Usando o provedor de entrega "Entrega Rápida"
        DeliveryProvider fastDeliveryProvider = new FastDeliveryProvider();
        OrderProcessor orderProcessor1 = new OrderProcessor(fastDeliveryProvider);
        orderProcessor1.processOrder("123");

        // Usando o provedor de entrega "Entrega Econômica"
        DeliveryProvider economicDeliveryProvider = new EconomicDeliveryProvider();
        OrderProcessor orderProcessor2 = new OrderProcessor(economicDeliveryProvider);
        orderProcessor2.processOrder("456");
    }
}
