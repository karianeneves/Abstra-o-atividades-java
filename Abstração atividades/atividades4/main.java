public class Main {
    public static void main(String[] args) {
     
        Departamento rh = new Departamento("Recursos Humanos");

        
        Funcionario func1 = new Funcionario("kaka", rh);
        Funcionario func2 = new Funcionario("Pedro", rh);
        Funcionario func3 = new Funcionario("alana", rh);

      
        rh.adicionarFuncionario(func1);
        rh.adicionarFuncionario(func2);
        rh.adicionarFuncionario(func3);

  
        rh.exibirDepartamento();
    }
}