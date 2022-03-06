package com.example.instagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VURaj58f0Q5uLSVWL8VAsvPMIKQLQaI5USayVHml")
                .clientKey("Kw7OfN0xM3cYlAXV3qs3JoaAgyGduJRgvGjAKydk")
                .server("https://parseapi.back4app.com")
                .build());
    }
}
