package com.examples.youtubeapidemo.helper;

import com.examples.youtubeapidemo.helper.GlobalUrl;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ramakanth on 6/27/2016.
 */

public class ServiceGenerator {

    private static OkHttpClient client = new OkHttpClient.Builder().addNetworkInterceptor(new StethoInterceptor()).build();

    private static RxJavaCallAdapterFactory rxAdapter = RxJavaCallAdapterFactory.create();

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(GlobalUrl.BAYMACK_BASE_URL)
            .client(client)
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static Retrofit youtube_retrofit = new Retrofit.Builder()
            .baseUrl(GlobalUrl.YOUTUBE_TITLE_URL)
            .client(client)
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }

    public static <S> S createYoutubeService(Class<S> serviceClass) {
        return youtube_retrofit.create(serviceClass);
    }
}