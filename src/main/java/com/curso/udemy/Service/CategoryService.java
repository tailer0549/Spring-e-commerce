package com.curso.udemy.Service;

import com.curso.udemy.Entities.Category;
import com.curso.udemy.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        List<Category> list = repository.findAll();
        return list;
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get(); // .get() retorna o objeto dentro de category
    }
}
