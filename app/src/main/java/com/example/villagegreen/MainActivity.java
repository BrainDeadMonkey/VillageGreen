package com.example.villagegreen;

import androidx.annotation.XmlRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.villagegreen.model.Produit;

import java.text.CollationElementIterator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.web1);
//        setContentView(webView);
        webView.loadUrl("https://dev.amorce.org/vboulard/VillageGreen/");
//        final TextView resultata = (TextView) findViewById(R.id.text_result);
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://dev.amorce.org/vboulard/VillageGreen/index.php/Api/getAllProd/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
//
//        Call<List<Produit>> call = jsonPlaceHolderApi.getProd();
//
//        call.enqueue(new Callback<List<Produit>>() {
//            @Override
//            public void onResponse(Call<List<Produit>> call, Response<List<Produit>> response) {
//                if (!response.isSuccessful()){
//                    resultata.setText("Code "+response.code());
//                    return;
//                }
//
//                List<Produit> posts = response.body();
//
//                for (Produit post : posts){
//                    String content = "";
//                    content += "ID: " + post.getPro_priV() + "\n\n";
//                    content += "User ID: " + post.getPro_ref() + "\n\n";
//                    content += "Titre: " + post.getPro_des() + "\n\n";
//                    content += "Text: " + post.getPro_lib() + "\n\n";
//                    content += "============================\n";
//
//                    System.out.println(post.getPro_des());
//
//
//
//                    resultata.append(content);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Produit>> call, Throwable t) {
//                resultata.setText(t.getMessage());
//            }
//        });
}
}
