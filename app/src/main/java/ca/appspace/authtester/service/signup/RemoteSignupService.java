package ca.appspace.authtester.service.signup;

import retrofit.http.Body;
import retrofit.http.POST;

public interface RemoteSignupService {

    @POST("/signup")
    void signUp(@Body SignupData request);

}
