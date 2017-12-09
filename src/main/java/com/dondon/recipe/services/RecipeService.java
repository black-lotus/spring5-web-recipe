package com.dondon.recipe.services;

import com.dondon.recipe.commands.RecipeCommand;
import com.dondon.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand findCommandById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);

}
