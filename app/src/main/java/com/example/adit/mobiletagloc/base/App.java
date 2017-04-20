package com.example.adit.mobiletagloc.base;

import android.app.Application;
import com.example.adit.mobiletagloc.http.login.APIModule;

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
                .aPIModule(new APIModule())
                .build();

    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
