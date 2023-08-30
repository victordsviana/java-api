package com.fatec.produto.servico;

import com.fatec.produto.model.IProdutoRepository;
import com.fatec.produto.model.Produto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

@Configuration
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase (IProdutoRepository repository){
        return args -> {
            Produto produto1 = new Produto("Tirante Brastemp", "Maquina de lavar", 51.60, 12);
            repository.saveAll(Arrays.asList(produto1));
        };
    }
}
