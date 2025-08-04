public class Curso {
    String nome;
    String codigo;
    int cargaHoraria;

    public Curso(String novonome, String novocodigo, int novacargaHoraria) {
        nome = novonome;
        codigo = novocodigo;
        cargaHoraria = novacargaHoraria;
    }

    public void exibirDados() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
    }

}
