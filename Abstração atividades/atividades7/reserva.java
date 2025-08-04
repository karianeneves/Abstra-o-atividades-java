public class Reserva {
    Quarto quarto;
    Hospede hospede;
    String dataEntrada;
    String dataSaida;

    public Reserva(Quarto nquarto, Hospede nhospede, String ndataEntrada, String ndataSaida) {
        quarto = nquarto;
        hospede = nhospede;
        dataEntrada = ndataEntrada;
        dataSaida = ndataSaida;
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
