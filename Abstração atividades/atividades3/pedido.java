import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Cliente cliente;
    List<Prato> listaDePratos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.listaDePratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        listaDePratos.add(prato);
    }

    public void exibirPedido() {
        System.out.println("--- Pedido ---");
        cliente.exibirNome();
        System.out.println("Pratos:");
        for (Prato prato : listaDePratos) {
            System.out.printf("  - %s (R$%.2f)\n", prato.nome, prato.preco);
        }
        System.out.println(" ");
    }
}