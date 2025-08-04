public class Cliente {
    String nome;

    public Cliente(String novonome) {
        nome = novonome;
    }

    public void exibirNome() {
        System.out.println("Cliente: " + nome);
    }

}
