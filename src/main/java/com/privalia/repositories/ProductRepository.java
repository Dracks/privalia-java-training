package com.privalia.repositories;

import com.privalia.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Integer> {

    Iterable<Product> findByDescription(String description);
}
