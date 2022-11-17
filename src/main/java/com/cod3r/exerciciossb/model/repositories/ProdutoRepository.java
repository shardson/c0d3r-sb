package com.cod3r.exerciciossb.model.repositories;

import com.cod3r.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository
        extends CrudRepository<Produto, Integer> {
}
