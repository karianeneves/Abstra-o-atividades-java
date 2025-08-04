public class Prato {
    String nome;
    double preco;

    public Prato(String novonome, double novopreco) {
        nome = novonome;
        preco = novopreco;
    }

    public void exibirPrato() {
        System.out.printf("Prato: %s, Preço: R$%.2f\n", nome, preco);
    }

}
