public class Prato {
    String nome;
    double preco;

    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirPrato() {
        System.out.printf("Prato: %s, Preço: R$%.2f\n", nome, preco);
    }
}