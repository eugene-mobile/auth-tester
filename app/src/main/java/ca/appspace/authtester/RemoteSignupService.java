package ca.appspace.authtester;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

public interface RemoteSignupService {

    @POST("/signup")
    void signUp(@Body SignupData request);

}
