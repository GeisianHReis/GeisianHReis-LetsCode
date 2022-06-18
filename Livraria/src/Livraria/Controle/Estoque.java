package Livraria.Controle;

import Livraria.produtos.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Estoque extends AEstoque{
    public List<Produto> estoque = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }
    @Override
    public List<Produto> listarTodosProdutos() {
        return estoque;
    }
    public List<Produto> listarProdutosPorTipo(String nome) {
        List<Produto> listarDeProdutos = new ArrayList<>();
        for (Produto item: estoque) {
            switch (nome){
                case "Livros":
                     if(item instanceof Livros) listarDeProdutos.add(item);
                     break;
                case "Jogos":
                    if(item instanceof Jogos) listarDeProdutos.add(item);
                    break;
                case "Musicas":
                    if(item instanceof AlbunsDeMusica) listarDeProdutos.add(item);
                    break;
                case "Filmes":
                    if(item instanceof Filmes) listarDeProdutos.add(item);
                    break;
                case "Brinquedos":
                    if(item instanceof Brinquedos) listarDeProdutos.add(item);
                    break;
            }
        }
        return listarDeProdutos;
    }
        

    public Produto listarProdutoPeloId(int id) {
        for (Produto item: estoque) {
            if (item.getId() == id) return item;
        }
        return null;
    }
    public Produto buscarProdutoPeloNome(String nome) {
        for (Produto item: estoque) {
            if (item.getNome().equalsIgnoreCase(nome)) return item;
        }
        return null;
    }
    public String removerProduto(Produto produto){
        estoque.remove(produto);
        return "Item removido com sucesso!";
    }
    public String removerProduto(int id){
        int indexProdutoRemocao;
        for (Produto item:estoque) {
            if(item.getId() == id){
                indexProdutoRemocao = estoque.indexOf(item);
                estoque.remove(indexProdutoRemocao);
                return "Item removido com sucesso!";
            }
        }
        return "Item não encotrado";
    }
    public String removerProduto(String nome){
        int indexProdutoRemocao;
        for (Produto item:estoque) {
            if(item.getNome().equalsIgnoreCase(nome)){
                indexProdutoRemocao = estoque.indexOf(item);
                estoque.remove(indexProdutoRemocao);
                return "Item removido com sucesso!";
            }
        }
        return "Item não encotrado";
    }
}
