package com.kedacom.category.service;



import com.kedacom.category.model.Category;

import java.util.List;

public interface CategoryService {
    Category findOne(Long id);

    List<Category> findByLevelAndName(Integer level, String name);

    Category save(Category category);
}
