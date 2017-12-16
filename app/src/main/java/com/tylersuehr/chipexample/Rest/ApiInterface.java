package com.tylersuehr.chipexample.Rest;




import java.util.HashMap;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;

public interface ApiInterface {

//    @FormUrlEncoded
//    @POST("api/pravasi-registration")
//    Call<Registerd_User_Response> reg_call(@Body Register_Data registerData);



    @GET("api/signup_view")
    Call<Designation_Response>desg_call();


}
