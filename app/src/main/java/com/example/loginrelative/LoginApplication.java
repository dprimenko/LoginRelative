package com.example.loginrelative;

import android.app.Application;

/**
 * Created by dprimenko on 19/10/16.
 */
public class LoginApplication extends Application {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
