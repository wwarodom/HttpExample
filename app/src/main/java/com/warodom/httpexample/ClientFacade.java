package com.warodom.httpexample;

import com.loopj.android.http.*;


class ClientFacade {

    private static final String BASE_URL = "http://ServerIP/public/android/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }
}

