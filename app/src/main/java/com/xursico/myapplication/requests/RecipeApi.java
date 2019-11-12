package com.xursico.myapplication.requests;

import com.xursico.myapplication.requests.responses.RecipeResponse;
import com.xursico.myapplication.requests.responses.RecipeSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeApi {

    // Search
    @GET("/api/search")
    Call<RecipeSearchResponse> searchRecipe(
            @Query("key") String key,
            @Query("q") String query,
            @Query("page") String page
    );

    // Get recipe request
    @GET("/api/get")
    Call<RecipeResponse> getRecipe(
            @Query("key") String key,
            @Query("rld") String recipe_id
    );
}
