package com.service.demo;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a very simple REST adapter which points the GitHub API endpoint.
		ElasticService elasticService = APIServiceGenerator.createService(ElasticService.class);
		// Fetch a list of the Github repositories.
		Call<EasticsearchResponce> call = elasticService.reposForElastic();

		// Execute the call asynchronously. Get a positive or negative callback.
		call.enqueue(new Callback<EasticsearchResponce>() {  
		    @Override
		    public void onResponse(Call<EasticsearchResponce> call, Response<EasticsearchResponce> response) {
		        // The network call was a success and we got a response
		        // TODO: use the repository list and display it
		    	if(response.body()!= null){
		    		System.out.println(response.body().getName());
		    	}
		    }

		    @Override
		    public void onFailure(Call<EasticsearchResponce> call, Throwable t) {
		        // the network call was a failure
		        // TODO: handle error
		    }
		});
	}

}
