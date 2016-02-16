package com.example.xyzreader.remote;

import android.util.Log;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("http://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json" );
        } catch (MalformedURLException ignored) {
            Log.e(Config.class.getSimpleName(), "Incorrect/MalformedURL Exception");
        }

        BASE_URL = url;
    }
}
