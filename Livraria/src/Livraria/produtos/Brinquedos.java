package Livraria.produtos;

public class Brinquedos extends Produto{
    private String tipo;

    public Brinquedos(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedo: " + super.toString() +
                "tipo= " + tipo + '\'' +
                "\n";
    }
}
