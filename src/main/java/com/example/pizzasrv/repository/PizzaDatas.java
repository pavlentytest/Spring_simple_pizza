package com.example.pizzasrv.repository;

import com.example.pizzasrv.model.Pizza;
import org.springframework.data.repository.CrudRepository;


// CRUD => Create Read Update Delete

public interface PizzaDatas extends CrudRepository<Pizza, Integer> {

}
