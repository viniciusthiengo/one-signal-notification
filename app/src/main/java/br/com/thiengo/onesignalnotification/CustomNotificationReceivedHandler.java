package br.com.thiengo.onesignalnotification;

import android.util.Log;

import com.onesignal.OSNotification;
import com.onesignal.OneSignal;

import org.json.JSONObject;

/**
 * Created by viniciusthiengo on 9/26/16.
 */

public class CustomNotificationReceivedHandler implements OneSignal.NotificationReceivedHandler {
    @Override
    public void notificationReceived(OSNotification notification) {
        JSONObject data = notification.payload.additionalData;

        if( data != null ){
            Log.i("Log", "notificationReceived: "+data);
        }
    }
}
