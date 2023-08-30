package com.fatec.produto.servico;

import java.util.List;
import java.util.Optional;

import com.fatec.produto.servico.IProdutoServico;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fatec.produto.model.Produto;
import com.fatec.produto.model.IProdutoRepository;
@Service
public class ProdutoServico implements IProdutoServico {

    @Autowired
    IProdutoRepository repository;
    @Override
    public List<Produto> consultaCatalogo() {
        return repository.findAll();

    }
}