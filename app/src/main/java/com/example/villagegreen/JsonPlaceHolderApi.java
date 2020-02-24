package com.example.villagegreen;

import com.example.villagegreen.model.Produit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("getAllProd")
    Call<List<Produit>> getProd();
}
