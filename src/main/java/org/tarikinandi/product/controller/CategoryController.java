package org.tarikinandi.product.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tarikinandi.product.model.Category;
import org.tarikinandi.product.service.CategoryService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody Category category){

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(
                        categoryService.add(category)
                );
    }
}
