public class Quarto {
    int numero;
    String tipo;
    String status;

    public Quarto(int novonumero, String novotipo, String novostatus) {
        numero = novonumero;
        tipo = novotipo;
        status = novostatus;
    }

    public void exibirDados() {
        System.out.println("Número do Quarto: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
    }

}
