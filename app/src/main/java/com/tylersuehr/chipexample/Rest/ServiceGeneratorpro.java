package com.tylersuehr.chipexample.Rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ServiceGeneratorpro {

    private final static String BASEURL="http://jobhunt.test4u.in/";

    public static<S> S createService(Class<S> service){
        Gson gson= new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                .create();

        Retrofit adapter=new Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return adapter.create(service);
    }
}