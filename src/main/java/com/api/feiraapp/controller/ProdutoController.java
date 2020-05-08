package com.api.feiraapp.controller;

import com.api.feiraapp.model.FeiraModel;
import com.api.feiraapp.model.ProdutoModel;
import com.api.feiraapp.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feira-app/api/produto")
public class ProdutoController {
    @Autowired
    ProdutoService produtoService;
    @PostMapping
    public void save(@RequestBody ProdutoModel produtoModel){
        produtoService.save(produtoModel);
    }
}

