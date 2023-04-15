package com.mazleapi.mazle.controller;

import com.mazleapi.mazle.dto.request.RecipeListRequest;
import com.mazleapi.mazle.dto.response.RecipeListResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.domain.Pageable;

@RequestMapping("/recipe")
public class RecipeController {
    @GetMapping("/list")
    public ResponseEntity<RecipeListResponse> getRecipeList(RecipeListRequest recipeListRequest,
                                                            Pageable pageable) {
        return
    }
}
