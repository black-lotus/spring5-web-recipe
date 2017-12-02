package com.dondon.recipe.controllers;

import com.dondon.recipe.domain.Category;
import com.dondon.recipe.domain.UnitOfMeasure;
import com.dondon.recipe.repositories.CategoryRepository;
import com.dondon.recipe.repositories.UnitOfMeasureRepository;
import com.dondon.recipe.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    @Autowired
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }

}
