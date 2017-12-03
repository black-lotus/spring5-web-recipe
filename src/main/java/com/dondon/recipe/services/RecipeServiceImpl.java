package com.dondon.recipe.services;

import com.dondon.recipe.domain.Recipe;
import com.dondon.recipe.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I am in the service");

        Set<Recipe> recipeSet = new HashSet<>();
        // recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        recipeRepository.findAll().iterator().forEachRemaining(recipe -> {
            recipeSet.add(recipe);
        });

        return recipeSet;
    }

}
