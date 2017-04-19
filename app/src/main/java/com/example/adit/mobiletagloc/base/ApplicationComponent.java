package com.example.adit.mobiletagloc.base;

import com.example.adit.mobiletagloc.LoginActivity;
import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by adit on 4/19/2017.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity activity);

}
