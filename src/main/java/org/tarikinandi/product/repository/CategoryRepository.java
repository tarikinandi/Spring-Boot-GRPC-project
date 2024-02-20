package org.tarikinandi.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tarikinandi.product.model.Category;

public interface CategoryRepository extends JpaRepository<Category , Integer> {

}
