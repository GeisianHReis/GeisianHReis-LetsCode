package Livraria.produtos;

public class Livros extends Produto {
    private String escritor;
    private String editora;

    public Livros(String nome, double preco,String escritor, String editora, String genero) {
        super(nome,  preco, genero);
        this.editora = editora;
        this.escritor = escritor;
    }

    @Override
    public String toString() {
        return "Livro: " + super.toString() +
                ", escritor= " + escritor +
                ", editora= " + editora + "\n";
    }
}
