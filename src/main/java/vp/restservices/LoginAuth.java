package vp.restservices;

import vp.authentication.LoginUser;
import vp.authentication.LoginUserProfile;
import vp.authentication.User;
import vp.authentication.UserProfile;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by mrahman on 8/24/16.
 */

@Path("loginauth")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LoginAuth {

        LoginUserProfile loginUserProfile = new LoginUserProfile();

        @POST
        public boolean postIt(LoginUser user) {
            return loginUserProfile.verifyUser(user);
        }
        @PUT
        public String updateProfile(LoginUser user) {
            return loginUserProfile.updateUserProfileSetting(user);
        }


        @GET
        @Path("/{profileId}")
        public LoginUser loginProfile(@PathParam("profileId")String profileId){
            return loginUserProfile.getUserProfile(profileId);
        }

}
