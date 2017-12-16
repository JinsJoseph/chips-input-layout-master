package com.tylersuehr.chipexample.Rest;



public class RestBuilderPro {
    private static ApiInterface service;
    public static ApiInterface getService()
    {
        service=ServiceGeneratorpro.createService(ApiInterface.class);
        return service;
    }
}