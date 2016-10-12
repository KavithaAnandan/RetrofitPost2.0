package com.influx.retrofitpost20.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.influx.retrofitpost20.R;
import com.influx.retrofitpost20.requestmodel.RequestModel;
import com.influx.retrofitpost20.responsemodel.ResNew;
import com.influx.retrofitpost20.responsemodel.ResponseCode;
import com.influx.retrofitpost20.webservice.RestClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView postresponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postresponse = (TextView) findViewById(R.id.postresponse);


        getcolors();
    }

    private void getcolors() {
        RestClient.APIInterface anInterface = RestClient.getapiclient();
        final Call<ResNew> resNewCall = anInterface.response(new RequestModel("1","PalamSilk","palam@123!"));

        resNewCall.enqueue(new Callback<ResNew>() {
            @Override
            public void onResponse(Call<ResNew> call, Response<ResNew> response) {

                int code = response.code();
                if(code == 200){
                    ResNew user = response.body();
                    String aa = user.d.get__type();
                    postresponse.setText(aa);
                    Toast.makeText(MainActivity.this, "Got the value: "+aa, Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this, "Did not work: " + String.valueOf(code), Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<ResNew> call, Throwable t) {

            }
        });
    }
}
