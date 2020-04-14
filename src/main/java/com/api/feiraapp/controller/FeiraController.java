package com.api.feiraapp.controller;

import com.api.feiraapp.model.FeiraModel;
import com.api.feiraapp.service.FeiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feira-app/api/feiras")
public class FeiraController {
    @Autowired
    FeiraService feiraService;

    @PostMapping
    public void save(@RequestBody FeiraModel feiraModel){
        feiraService.save(feiraModel);
    }

    @GetMapping
    public List<FeiraModel> findAll(){
        return feiraService.findAll();
    }
}
