public class Funcionario {
    String nome;
    Departamento departamento;

    public Funcionario(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public void exibirDados() {
        System.out.println("Funcionário: " + nome + ", Departamento: " + departamento.nome);
    }
}