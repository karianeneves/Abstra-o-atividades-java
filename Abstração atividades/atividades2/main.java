public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "2024001");
        
        aluno1.adicionarNota(8.5f);
        aluno1.adicionarNota(7.0f);
        aluno1.adicionarNota(9.0f);
        
        aluno1.exibirBoletim();
    }
}