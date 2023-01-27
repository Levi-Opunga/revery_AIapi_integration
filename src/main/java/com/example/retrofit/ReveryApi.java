package com.example.retrofit;


import com.example.models.Example;
import com.example.models.Response;
import com.example.models.faces.Faces;
import com.example.models.female.FemaleShoe;
import com.example.models.mods.Models;
import com.example.models.serverRequest.ReqBody;
import com.example.models.serverRes.TryOn;
import com.example.models.upload.Delete;
import com.example.models.upload.Upload;
import retrofit2.Call;
import retrofit2.http.*;

public interface ReveryApi {
    @GET("get_filtered_garments?page_size=200")
    Call<Response> getAllGarments(
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp
    );

    @GET("get_filtered_garments")
    Call<Response> getAllGarmentsGender(
            @Query("gender") String gender,
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp
    );

    @GET("get_filtered_garments")
    Call<Response> getTops(
            @Query("category") String category,
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp
    );

    @GET("get_filtered_garments")
    Call<Response> getBottoms(
            @Query("category") String category,
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp
    );

    @GET("get_selected_shoes")
    Call<Example> getShoes(
            @Query("gender") String gender,
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp
    );

    @GET("get_selected_shoes")
    Call<FemaleShoe> getFemaleShoes(
            @Query("gender") String gender,
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp
    );

    @POST("process_new_garment")
    Call<com.example.models.upload.Response> uploadImageUrl(
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp,
            @Body() Upload request

    );

    @PUT("delete_garment")
    Call<com.example.models.upload.Response> delete_garment(
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp,
            @Body() Delete request);

    @POST("request_tryon")
    Call<TryOn> getTryon(
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp,
            @Body() ReqBody request

    );


    @GET("get_model_list?gender=male")
    Call<Models> getMaleModels(
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp);

    @GET("get_model_list?gender=female")
    Call<Models> getFemaleModels(
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp);


    @GET("get_selected_faces?gender=female")
    Call<Faces> getFemales(
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp);

    @GET("get_selected_faces?gender=male")
    Call<Faces> getMaleFaces(
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp);

    @GET("get_selected_faces")
    Call<Faces> getFaces(
            @Header("one_time_code") String one_time_code,
            @Header("timestamp") String timestamp);
}
