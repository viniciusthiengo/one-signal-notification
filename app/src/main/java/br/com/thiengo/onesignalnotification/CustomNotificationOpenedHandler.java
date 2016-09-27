package br.com.thiengo.onesignalnotification;

import android.util.Log;

import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

import org.json.JSONObject;

/**
 * Created by viniciusthiengo on 9/26/16.
 */

public class CustomNotificationOpenedHandler implements OneSignal.NotificationOpenedHandler {
    @Override
    public void notificationOpened(OSNotificationOpenResult result) {
        JSONObject data = result.notification.payload.additionalData;

        if( data != null ){
            Log.i("Log", "notificationOpened: "+data);
        }
    }
}
