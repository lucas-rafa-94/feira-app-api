package com.api.feiraapp.repository;

import com.api.feiraapp.model.FeiraModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeiraRepository extends CrudRepository<FeiraModel, String> {
}
