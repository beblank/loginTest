package com.example.adit.mobiletagloc.base;

import android.app.Application;

/**
 * Created by adit on 4/19/2017.
 */
public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
