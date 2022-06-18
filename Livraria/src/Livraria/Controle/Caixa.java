package Livraria.Controle;

import Livraria.produtos.Produto;

public class Caixa {
    double valorEmCaixa;
    Estoque estoque;

    public Caixa(double valorEmCaixa, Estoque estoque) {
        this.valorEmCaixa = valorEmCaixa;
        this.estoque = estoque;
    }

    public String venderProduto(String nome) {
        for (Produto item : estoque.listarTodosProdutos()) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                valorEmCaixa += item.getPreco();
                estoque.removerProduto(item);
                return "Venda realizada com sucesso!" +
                        " Valor em caixa: " + valorEmCaixa;
            }
        }
        return "Item não encotrado";
    }
        public String venderProduto(int id){
            for (Produto item: estoque.listarTodosProdutos()) {
                if(item.getId() == id){
                    valorEmCaixa += item.getPreco();
                    estoque.removerProduto(item);
                    return "Venda realizada com sucesso!"+
                            " Valor em caixa: "+valorEmCaixa;
                }
            }
            return "Item não encotrado";
    }
}
