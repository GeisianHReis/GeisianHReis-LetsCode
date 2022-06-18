package Livraria.produtos;

public class AlbunsDeMusica extends Produto{
    private String artistas;
    private String selos;

    public AlbunsDeMusica(String nome, double preco, String genero, String artistas, String selos) {
        super(nome, preco, genero);
        this.artistas = artistas;
        this.selos = selos;
    }

    @Override
    public String toString() {
        return "Album de musica: " + super.toString() +
                "artistas= " + artistas + '\'' +
                ", selos= " + selos + '\'' +
                "\n";
    }
}
