package Livraria.produtos;

public abstract class Produto {
    private String nome;
    private int id;
    private double preco;
    private String genero;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.id = nome.hashCode()/100;
        this.preco = preco;
    }

    public Produto(String nome, double preco, String genero) {
        this.nome = nome;
        this.id = nome.hashCode()/100;
        this.preco = preco;
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "" +
                "nome= " + nome +
                ", id= " + id +
                ", preco= " + preco +
                ", genero= " + genero;
    }
}
