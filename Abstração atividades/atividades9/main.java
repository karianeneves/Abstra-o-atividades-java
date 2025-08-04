public class Main {
    public static void main(String[] args) {
 
        Animal cachorro = new Animal("tobi", "Cachorro", 5);

        Animal gato = new Animal("pepo", "Gato", 2);

        System.out.println("Instâncias de Animais");
        System.out.println("Animal 1:");
        System.out.println("Nome: " + cachorro.nome + ", Espécie: " + cachorro.especie);
        cachorro.fazerBarulho();
        
        System.out.println("\nAnimal 2:");
        System.out.println("Nome: " + gato.nome + ", Espécie: " + gato.especie);
        gato.fazerBarulho();
    }
}