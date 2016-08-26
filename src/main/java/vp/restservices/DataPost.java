package vp.restservices;

import vp.profile.CompanyData;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by mrahman on 6/21/16.
 */

@Path("dataResources")
public class DataPost {
        //CompanyData cName = new CompanyData();
        @POST
        @Consumes(MediaType.APPLICATION_JSON)
        @Produces(MediaType.APPLICATION_JSON)
        public void postOrganizationProfile(CompanyData profile) {
            System.out.println("POST Request has come to post to Insert company profile"+profile);

    }

}
