package com.xursico.myapplication.util;

import android.util.Log;

import com.xursico.myapplication.models.Recipe;

import java.util.List;

public class Testing {

    public static void printRecipes(List<Recipe> list, String tag) {
        for (Recipe recipe: list) {
            Log.d(tag, "printRecipes: " + recipe.getTitle());
        }
    }
}
