package Livraria.produtos.Teste;

import Livraria.Controle.AEstoque;
import Livraria.Controle.Caixa;
import Livraria.Controle.Estoque;
import Livraria.produtos.*;

import java.util.List;

public class Programa {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Caixa caixa = new Caixa(50d, estoque);

        estoque.adicionarProduto(new Livros("Aqui é trabalho",29.90,
                "Mujica","4Linhas","Esportes"));
        estoque.adicionarProduto(new Livros("Turma de 93",26.30,
                "Fergson","4Linhas","Esportes"));

        estoque.adicionarProduto(new Jogos("GTA6",299.90,"RPG",
                "RockStar","RSA"));
        estoque.adicionarProduto(new Jogos("Gamork",59.99,"Terror",
                "HR","ARDistrinuição"));

       estoque.adicionarProduto(new Brinquedos("Carro xr",99.99,"Miniatura"));
       estoque.adicionarProduto(new Brinquedos("Boliche",19.90,"Plastico"));

       estoque.adicionarProduto(new Filmes("Zumbilandia",29.90,"comedia",
               "Jualian Scritian", "Universal"));
       estoque.adicionarProduto(new Filmes("BatMan vs ET",9.99,"Medo","Teco",
               "Disney"));

       estoque.adicionarProduto(new AlbunsDeMusica("Aquele dia", 19.99,
               "Pop","Banda Flex","Selado"));
       estoque.adicionarProduto(new AlbunsDeMusica("Aquele outro dia",29.99,
               "Brega","Banda alelo","ReSelado"));

        System.out.println("------------------------");
        System.out.println("Listando dos os itens");
        System.out.println(estoque.listarTodosProdutos());
        System.out.println("------------------------");
        System.out.println("Listando itens pelo tipo");
        System.out.println(estoque.listarProdutosPorTipo("Jogos"));
        System.out.println("------------------------");
        System.out.println("Listando item pelo ID");
        System.out.println(estoque.listarProdutoPeloId(21256087));
        System.out.println("------------------------");
        System.out.println("Buscando produto pelo nome");
        System.out.println(estoque.buscarProdutoPeloNome("aquele dia"));
        System.out.println("------------------------");
        System.out.println("Buscando produto pelo nome");
        System.out.println(estoque.buscarProdutoPeloNome("aquele dia"));
        System.out.println("------------------------");
        System.out.println("Removendo produto");
        System.out.println(estoque.removerProduto(700652));
        System.out.println("------------------------");
        System.out.println("Vendendo Produto");
        System.out.println(caixa.venderProduto(21979));
        System.out.println("------------------------");

    }


}
