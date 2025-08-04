public class Main {
    public static void main(String[] args) {

        Quarto quarto1 = new Quarto(14, "Suíte", "Ocupado");

        Hospede hospede1 = new Hospede("kakis", "123.456.789-00");

        Reserva reserva1 = new Reserva(quarto1, hospede1, "03/08/2025", "07/08/2025");

        reserva1.exibirDados();
    }
}