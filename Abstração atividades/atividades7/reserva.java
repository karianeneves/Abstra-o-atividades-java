public class Reserva {
    Quarto quarto;
    Hospede hospede;
    String dataEntrada;
    String dataSaida;

    public Reserva(Quarto quarto, Hospede hospede, String dataEntrada, String dataSaida) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public void exibirDados() {
        System.out.println("Detalhes da Reserva");
        System.out.println("Quarto: " + quarto.numero);
        System.out.println("Hóspede: " + hospede.nome);
        System.out.println("Entrada: " + dataEntrada);
        System.out.println("Saída: " + dataSaida);
        System.out.println("  ");
    }
}