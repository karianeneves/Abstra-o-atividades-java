public class Celular {
    String marca;
    String modelo;
    String numeroSerie;

    public Celular(String nmarca, String nmodelo, String nwnumeroSerie) {
        marca = nmarca;
        modelo = nmodelo;
        numeroSerie = nwnumeroSerie;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de Série: " + numeroSerie);
    }

}
