package vp.restservices;

import vp.authentication.User;
import vp.authentication.UserProfile;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by mrahman on 2/12/16.
 */

@Path("authentication")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Authenticate {

    UserProfile userProfile = new UserProfile();

    @POST
    public String postIt(User user) {
        return userProfile.registerProfile(user);
    }
    @PUT
    public String updateProfile(User user) {
        return userProfile.updateUserProfileSetting(user);
    }


    @GET
    @Path("/{profileId}")
    public User loginProfile(@PathParam("profileId")String profileId){
        return userProfile.getUserProfile(profileId);
    }

}
