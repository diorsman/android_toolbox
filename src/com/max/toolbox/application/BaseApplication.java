
package com.max.toolbox.application;

import android.app.Application;

import com.max.toolbox.handler.ErrorLogHandler;

public class BaseApplication extends Application {
    
    @Override
    public void onCreate() {
        super.onCreate();
        ErrorLogHandler.getInstance().init(this);
    }
    
}
