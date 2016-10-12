package com.influx.retrofitpost20.webservice;

import com.influx.retrofitpost20.requestmodel.RequestModel;
import com.influx.retrofitpost20.responsemodel.ResNew;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Influx on 7/22/2016.
 */

public class RestClient {


    public static APIInterface apiInterface;
    public static String BASE_URL = "http://www.palamsilk.com";


    public static APIInterface getapiclient() {

        if (apiInterface == null) {

            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

            Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create()).build();

            apiInterface = retrofit.create(APIInterface.class);
        }

        return apiInterface;
    }


    public interface APIInterface {

        @POST("/Webservice/palamcollections.asmx/ListColorsByCategory")
        Call<ResNew> response(@Body RequestModel requestModel);

    }


}
