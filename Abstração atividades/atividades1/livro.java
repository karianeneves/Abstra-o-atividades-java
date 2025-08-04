public class Livro {
    String titulo;
    String autor;
    String ISBN;

    public Livro(String novotitulo, String novoautor, String novoISBN) {
        titulo = novotitulo;
        autor = novoautor;
        ISBN = novoISBN;
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
    }

}
