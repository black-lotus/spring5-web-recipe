package com.dondon.recipe.repositories;

import com.dondon.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
