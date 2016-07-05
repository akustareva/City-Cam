package ru.ifmo.android_2015.citycam.webcams;

import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URL;

public final class Webcams {

    private static final String DEV_ID = "77bb1b221306d58e854db724e986e36a";

    private static final String BASE_URL = "http://api.webcams.travel/rest";

    private static final String PARAM_DEVID = "devid";
    private static final String PARAM_METHOD = "method";
    private static final String PARAM_LAT = "lat";
    private static final String PARAM_LON = "lng";
    private static final String PARAM_FORMAT = "format";

    private static final String METHOD_NEARBY = "wct.webcams.list_nearby";

    private static final String FORMAT_JSON = "json";

    public static URL createNearbyUrl(double latitude, double longitude)
            throws MalformedURLException {
        Uri uri = Uri.parse(BASE_URL).buildUpon()
                .appendQueryParameter(PARAM_METHOD, METHOD_NEARBY)
                .appendQueryParameter(PARAM_LAT, Double.toString(latitude))
                .appendQueryParameter(PARAM_LON, Double.toString(longitude))
                .appendQueryParameter(PARAM_DEVID, DEV_ID)
                .appendQueryParameter(PARAM_FORMAT, FORMAT_JSON)
                .build();
        return new URL(uri.toString());
    }

    private Webcams() {}
}
