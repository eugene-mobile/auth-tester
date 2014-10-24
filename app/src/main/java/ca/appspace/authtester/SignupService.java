package ca.appspace.authtester;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SignupService extends Service {

    public SignupService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
