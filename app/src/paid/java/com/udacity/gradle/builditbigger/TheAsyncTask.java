package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;

import com.example.jokesshow.Display;
import com.example.maka.myapplication.backend.myApi.MyApi;
import com.example.maka.myapplication.backend.myApi.model.MyBean;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by maka on 07/07/2017.
 */

public class TheAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {

    private static MyApi myApi = null;
    private Context context;


    private String result;
    private ProgressBar progressBar;

    public TheAsyncTask(Context context, ProgressBar progressBar) {
        this.context = context;

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        if (progressBar != null) {
            progressBar.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected String doInBackground(Pair<Context, String>... params) {
        if (myApi == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/");
            myApi = builder.build();
        }
        try {
            return myApi.randomJoke().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);

        this.result = result;
        JokeDisplayActivity();
    }

    private void JokeDisplayActivity() {
        Intent intent = new Intent(context, Display.class);
        intent.putExtra("JOKE", result);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}