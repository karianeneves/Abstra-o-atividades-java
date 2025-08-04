import java.util.ArrayList;

public class Aluno {
    String nome;
    String matricula;
    ArrayList<Float> notas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(float nota) {
        notas.add(nota);
    }

    public float calcularMedia() {
        if (notas.isEmpty()) {
            return 0;
        }
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public void exibirBoletim() {
        System.out.println("Boletim do Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Notas: " + notas);
        System.out.printf("Média: %.2f\n", calcularMedia());
    }
}