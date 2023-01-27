package com.example.retrofit;


import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

import static com.example.env.Constants.BASE_URL;
import static com.example.env.Constants.PUBLIC_KEY;

public class ReveryClient {
private static Retrofit retrofit= null;

public static ReveryApi getClient(){
if(retrofit ==null) {
    OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request newRequest  = chain.request().newBuilder()
                            .addHeader("Content-Type","application/json")
                            .addHeader("public_key", PUBLIC_KEY)
                            .build();
                    return chain.proceed(newRequest);
                }
            })
            .build();
    retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
            .build();

}
return retrofit.create(ReveryApi.class);
    }

}
