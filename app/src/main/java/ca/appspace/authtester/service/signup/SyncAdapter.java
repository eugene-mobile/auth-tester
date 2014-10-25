package ca.appspace.authtester.service.signup;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import retrofit.RestAdapter;

/**
 * Created by esukharev on 23/10/2014.
 */
public class SyncAdapter extends AbstractThreadedSyncAdapter {

    ContentResolver _contentResolver;

    public SyncAdapter(Context context, boolean autoInitialize) {
        super(context, autoInitialize);
        _contentResolver = context.getContentResolver();
    }

    @Override
    public void onPerformSync(Account account, Bundle bundle, String s, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://")
                .build();
        RemoteSignupService remoteSignupService = restAdapter.create(RemoteSignupService.class);
        SignupData data = new SignupData();
        data.setName("Test Name");
        data.setEmail("test@robot.com");
        data.setMedicalRecord("123123123");
        remoteSignupService.signUp(data);
    }
}
