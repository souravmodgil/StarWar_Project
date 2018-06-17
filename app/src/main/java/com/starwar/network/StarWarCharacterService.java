package com.starwar.network;

import com.starwar.model.StarWarCharacterResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface StarWarCharacterService {
    @GET
    Observable<StarWarCharacterResponse> fetchCharcaterList(@Url String url);
}
