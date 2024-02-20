package org.tarikinandi.product.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.tarikinandi.product.model.Product;
import org.tarikinandi.product.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public Product add(Product product){
        return repository.save(product);
    }

    public List<Product> getAll(){
        return repository.findAll();
    }
}
