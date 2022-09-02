package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("search")
    Call<CMRespDto<RespDto>> search(@Query("phone") String phone);

}
