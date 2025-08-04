public class Animal {
    String nome;
    String especie;
    int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public void fazerBarulho() {
        System.out.println(nome + " faz um barulho!");
    }
}