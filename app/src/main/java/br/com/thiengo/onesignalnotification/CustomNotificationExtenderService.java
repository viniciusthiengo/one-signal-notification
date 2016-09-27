package br.com.thiengo.onesignalnotification;

import android.util.Log;

import com.onesignal.NotificationExtenderService;
import com.onesignal.OSNotificationReceivedResult;

import org.json.JSONObject;

/**
 * Created by viniciusthiengo on 9/26/16.
 */

public class CustomNotificationExtenderService extends NotificationExtenderService {
    @Override
    protected boolean onNotificationProcessing(OSNotificationReceivedResult notification) {
        JSONObject data = notification.payload.additionalData;

        if( data != null ){
            Log.i("Log", "onNotificationProcessing: "+data);
        }

        return false;
    }
}
