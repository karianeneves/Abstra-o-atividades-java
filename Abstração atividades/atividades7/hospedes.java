public class Hospede {
    String nome;
    String documento;

    public Hospede(String novonome, String novodocumento) {
        nome = novonome;
        documento = novodocumento;
    }

    public void exibirDados() {
        System.out.println("Hospede: " + nome);
        System.out.println("Documento: " + documento);
    }

}
