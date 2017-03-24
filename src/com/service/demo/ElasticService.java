package com.service.demo;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ElasticService {
	@GET("/")
    Call<EasticsearchResponce> reposForElastic( );
}
