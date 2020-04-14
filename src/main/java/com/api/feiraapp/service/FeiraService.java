package com.api.feiraapp.service;

import com.api.feiraapp.model.FeiraModel;
import com.api.feiraapp.repository.FeiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeiraService {

    @Autowired
    FeiraRepository feiraRepository;

    public void save(FeiraModel feiraModel){
        feiraRepository.save(feiraModel);
    }

    public List<FeiraModel> findAll(){
        return (List<FeiraModel>) feiraRepository.findAll();
    }
}
