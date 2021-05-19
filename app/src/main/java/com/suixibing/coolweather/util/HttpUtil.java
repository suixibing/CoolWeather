package com.suixibing.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address)
                .addHeader("Connection","close").build();
        client.newCall(request).enqueue(callback);
    }

}
