package com.examples.youtubeapidemo.helper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

import com.examples.youtubeapidemo.pojo.PlaylistResponse;
import com.examples.youtubeapidemo.pojo.VideoDetails;

/**
 * Created by Ramakanth on 6/27/2016.
 */
public interface RestInterface {

    @Headers({"Content-Type: application/json",
            "Accept: application/json"})
    @GET("test/androidTest.php")
    Observable<PlaylistResponse> getVideoIds(@Query("key") String key);

    @Headers({"Content-Type: application/json",
            "Accept: application/json"})
    @GET("videos")
    Call<VideoDetails> getVideoDetails(@Query("id") String id, @Query("key") String key, @Query("part") String part);
}
