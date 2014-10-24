package ca.appspace.authtester;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import retrofit.RestAdapter;

public class SignupService extends Service {

    public SignupService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void sendTestSignup() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://127.0.0.1")
                .build();
        RemoteSignupService remoteSignupService = restAdapter.create(RemoteSignupService.class);
        SignupData data = new SignupData();
        data.setEmail("eugene@appspace.ca");
        data.setName("Eugene");
        data.setDoctor(true);
        data.setMedicalRecord("123123123");
        remoteSignupService.signUp(data);
    }
}
