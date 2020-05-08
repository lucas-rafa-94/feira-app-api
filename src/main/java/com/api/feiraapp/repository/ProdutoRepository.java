package com.api.feiraapp.repository;

import com.api.feiraapp.model.FeiraModel;
import com.api.feiraapp.model.ProdutoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<ProdutoModel, Long> {
}
