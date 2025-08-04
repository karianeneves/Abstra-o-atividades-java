public class Funcionario {
    String nome;
    Departamento departamento;

    public Funcionario(String novonome, Departamento novodepartamento) {
        novonome = nome;
        novodepartamento = departamento;
    }

    public void exibirDados() {
        System.out.println("Funcionário: " + nome + ", Departamento: " + departamento.nome);
    }

}
