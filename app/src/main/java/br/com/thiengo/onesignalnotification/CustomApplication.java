package br.com.thiengo.onesignalnotification;

import android.app.Application;

import com.onesignal.OneSignal;

/**
 * Created by viniciusthiengo on 9/26/16.
 */

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal
                .startInit(this)
                .setNotificationOpenedHandler( new CustomNotificationOpenedHandler() )
                .setNotificationReceivedHandler( new CustomNotificationReceivedHandler() )
                .init();
    }
}
