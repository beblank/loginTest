package com.example.adit.mobiletagloc.http.login;

import com.example.adit.mobiletagloc.http.login.model.ServerResponse;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;


/**
 * Created by adit on 4/20/2017.
 */
public interface APIService {

    @FormUrlEncoded
    @POST("/api.php")
    Observable<ServerResponse> post(
        @Field("method") String method,
        @Field("username") String username,
        @Field("password") String password
    );

    @GET("/api.php")
    Observable<ServerResponse> get(
        @Field("method") String method,
        @Field("username") String username,
        @Field("password") String password
    );

}
