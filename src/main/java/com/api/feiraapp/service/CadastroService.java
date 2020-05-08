package com.api.feiraapp.service;

import com.api.feiraapp.model.CadastroModel;
import com.api.feiraapp.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {

    @Autowired
    CadastroRepository cadastroRepository;

    public void save(CadastroModel cadastroModel){
            cadastroRepository.save(cadastroModel);
    }
}
