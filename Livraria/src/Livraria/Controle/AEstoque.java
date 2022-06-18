package Livraria.Controle;

import Livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public abstract class AEstoque {

    public abstract void adicionarProduto(Produto produto);
    public abstract List<Produto> listarTodosProdutos();
    }
