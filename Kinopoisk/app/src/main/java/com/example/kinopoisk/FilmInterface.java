package com.example.kinopoisk;

import com.example.kinopoisk.models.FilmInfo;
import com.example.kinopoisk.models.Root;
import com.example.kinopoisk.models.Trailer;
import com.example.kinopoisk.models.Video;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface FilmInterface {

    @Headers({"X-API-KEY: 3dce5dbd-5520-4447-b334-e9829d2317b9", "Content-Type: application/json"})
    @GET("films/top?type=TOP_AWAIT_FILMS&page=1")
    Call<Root> getPageId();

    @Headers({"X-API-KEY: 3dce5dbd-5520-4447-b334-e9829d2317b9", "Content-Type: application/json"})
    @GET("films/top?type=TOP_250_BEST_FILMS&page=1")
    Call<Root> getPagesId();

    @Headers({"X-API-KEY: 3dce5dbd-5520-4447-b334-e9829d2317b9"})
    @GET("films/{kinopiskId}")
    Call<FilmInfo> getFid(@Path("kinopiskId") int kinopoiskId);

    @Headers({"X-API-KEY: 3dce5dbd-5520-4447-b334-e9829d2317b9"})
    @GET("films/{kinopiskId}/videos")
    Call<Trailer> getVId(@Path("kinopiskId") int kinopoiskId);
}
