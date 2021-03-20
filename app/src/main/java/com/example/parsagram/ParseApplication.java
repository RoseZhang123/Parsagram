package com.example.parsagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("uo40JCyOcd1ADeeOVQIW2EFGDNonh9g9TNfIgOQ1")
                .clientKey("j9GGOnmJ9EiPoTIGagnl7Nv7FBoHfIYN3X4gKvSQ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
