package Livraria.produtos;

public class Jogos extends Produto{
    private String distribuidora;
    private String estudio;

    public Jogos(String nome, double preco, String genero, String distribuidora, String estudio) {
        super(nome, preco, genero);
        this.distribuidora = distribuidora;
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Jogo: " + super.toString() +
                "distribuidora= " + distribuidora + '\'' +
                " estudio= " + estudio + '\'' +
                "\n";
    }
}
