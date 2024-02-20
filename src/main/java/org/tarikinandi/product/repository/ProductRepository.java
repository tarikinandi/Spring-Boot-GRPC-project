package org.tarikinandi.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tarikinandi.product.model.Product;

public interface ProductRepository extends JpaRepository<Product , Integer> {

}
