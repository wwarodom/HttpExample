package com.warodom.httpexample;

import com.loopj.android.http.*;

/**
 * Created by wwaro on 30/9/2559.
 */

public class ClientFacade {

    private static final String BASE_URL = "http://172.26.1.108/laravel/www/public/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }
}
