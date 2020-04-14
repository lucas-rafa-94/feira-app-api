package com.api.feiraapp.service;

import com.api.feiraapp.model.ResponseApiModel;
import com.api.feiraapp.model.UserModel;
import com.api.feiraapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ResponseApiModel save(UserModel userModel){
        ResponseApiModel responseApiModel = new ResponseApiModel();
        if(userRepository.findByEmail(userModel.getEmail()) == null){
            try{
                userRepository.save(userModel);
                responseApiModel.setMsg("Usuário Criado com Sucesso");
                responseApiModel.setCode(200);
            }catch (Exception e){
                responseApiModel.setMsg("Erro ao criar usuário!");
                responseApiModel.setCode(400);
            }
        }else{
            responseApiModel.setMsg("Email já cadastrado!");
            responseApiModel.setCode(300);
        }
        return responseApiModel;
    }

    public ResponseApiModel login(String email, String password){
        ResponseApiModel responseApiModel = new ResponseApiModel();

        UserModel userModel = new UserModel();
        userModel = userRepository.findByEmailAndAndPassword(email, password);

        if(userModel != null){
            responseApiModel.setMsg("Credenciais Aceitas!");
            responseApiModel.setCode(200);
        }else {
            responseApiModel.setMsg("Credenciais não Aceitas!");
            responseApiModel.setCode(400);
        }
        return responseApiModel;
    }
}
