package com.oftmartstore.oftmartstore.repos;

import com.oftmartstore.oftmartstore.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
