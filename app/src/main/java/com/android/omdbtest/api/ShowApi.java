package com.android.omdbtest.api;

import com.android.omdbtest.model.ShowDetails;
import com.android.omdbtest.model.SearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ShowApi
{
    @GET("?")
    Call<SearchResponse> getSearchResults(@Query("s") String title, @Query("page") int pages, @Query("apikey") String apikey);
    @GET("?")
    Call<ShowDetails> getShowDetails(@Query("i") String imdbId, @Query("apikey") String apiKey);
}
