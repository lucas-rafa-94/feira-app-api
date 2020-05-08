package com.api.feiraapp.repository;

import com.api.feiraapp.model.CadastroModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository  extends CrudRepository<CadastroModel, Long> {
}
