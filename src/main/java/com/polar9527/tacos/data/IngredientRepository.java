package com.polar9527.tacos.data;

import com.polar9527.tacos.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findById(String id);

    Ingredient save(Ingredient ingredient);
}
