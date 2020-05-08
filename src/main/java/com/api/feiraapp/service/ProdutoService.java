package com.api.feiraapp.service;

import com.api.feiraapp.model.ProdutoModel;
import com.api.feiraapp.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public void save(ProdutoModel produtoModel){
        produtoRepository.save(produtoModel);
    }
}
