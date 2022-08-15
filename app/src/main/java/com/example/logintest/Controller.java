package com.example.logintest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller {

    public static final String url = "http://192.168.43.63/apitest/";

    static Controller clientObject;
    Retrofit retrofit;
    Controller() {
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized Controller getInstance(){
        if(clientObject == null)
            clientObject = new Controller();
        return clientObject;
    }
    Api getApi(){
        return retrofit.create(Api.class);
    }

}
