package com.example.logintest;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("login.php")
    Call<ResponseModel> verifyUser(@Field("email") String email,
                                   @Field("password") String password);

}
