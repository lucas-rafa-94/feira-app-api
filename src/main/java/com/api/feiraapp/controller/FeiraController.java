package com.api.feiraapp.controller;

import com.api.feiraapp.model.CadastroModel;
import com.api.feiraapp.model.FeiraModel;
import com.api.feiraapp.service.CadastroService;
import com.api.feiraapp.service.FeiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/feira-app/api/feiras")
public class FeiraController {
    @Autowired
    FeiraService feiraService;

    @Autowired
    CadastroService cadastroService;

    @PostMapping
    public void save(@RequestBody FeiraModel feiraModel){
        feiraService.save(feiraModel);
    }

    @PostMapping("cadastro")
    public void save(@RequestBody CadastroModel cadastroModel){
        cadastroService.save(cadastroModel);
    }

    @GetMapping
    public List<FeiraModel> findAll(HttpServletRequest request){
        String remoteAddr = "";

        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

        System.out.println(remoteAddr);
        return feiraService.findAll();
    }
}
