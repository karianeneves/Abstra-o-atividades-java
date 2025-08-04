public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("kaka");
        
       
        Prato prato1 = new Prato("Macarrão", 35.50);
        Prato prato2 = new Prato("Arroz", 25.00);

        Pedido pedido1 = new Pedido(cliente1);

        pedido1.adicionarPrato(prato1);
        pedido1.adicionarPrato(prato2);
        
        pedido1.exibirPedido();
    }

}
