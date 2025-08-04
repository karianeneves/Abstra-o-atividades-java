public class Animal {
    String nome;
    String especie;
    int idade;

    public Animal(String nnome, String nespecie, int nidade) {
        nome = nnome;
        especie = nespecie;
        idade = nidade;
    }

    public void fazerBarulho() {
        System.out.println(nome + " faz um barulho!");
    }

}
