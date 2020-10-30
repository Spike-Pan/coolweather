package com.coolweather.android.util;

import com.coolweather.android.NetWorkInterceptor;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new NetWorkInterceptor())
                .build();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
