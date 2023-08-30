package com.fatec.produto.servico;

import com.fatec.produto.model.Produto;

import java.util.List;

public interface IProdutoServico {
    public List<Produto> consultaCatalogo();
}
