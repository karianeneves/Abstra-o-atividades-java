import java.util.ArrayList;
import java.util.List;

public class Departamento {
    String nome;
    List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void exibirDepartamento() {
        System.out.println("Departamento: " + nome);
        System.out.println("Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println("- " + f.nome);
        }
    }
}