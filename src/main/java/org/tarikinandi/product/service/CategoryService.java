package org.tarikinandi.product.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.tarikinandi.product.model.Category;
import org.tarikinandi.product.repository.CategoryRepository;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public Category add(Category category){
       return repository.save(category);
    }
}
