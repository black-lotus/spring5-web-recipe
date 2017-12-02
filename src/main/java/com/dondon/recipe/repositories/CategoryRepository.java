package com.dondon.recipe.repositories;

import com.dondon.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
