package Livraria.produtos;

public class Filmes extends Produto{
    private String diretor;
    private String produtor;

    public Filmes(String nome, double preco, String genero, String diretor, String produtor) {
        super(nome, preco, genero);
        this.diretor = diretor;
        this.produtor = produtor;
    }

    @Override
    public String toString() {
        return "Filme: " + super.toString() +
                "diretor= " + diretor + '\'' +
                ", produtor= " + produtor + '\'' +
                "\n";
    }
}
