package vp.restservices;

import org.glassfish.jersey.server.JSONP;
import vp.databases.VCDatabaseServices;
import vp.profile.StartupProfile;
import vp.vc.profile.FundingHistory;
import vp.vc.profile.VCProfile;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by mrahman on 7/17/16.
 */

@Path("vcResources")
public class VCResources {

    VCDatabaseServices vcDatabaseServices = new VCDatabaseServices();

    @GET
    @Path("/{vcId}")
    @Produces(MediaType.APPLICATION_JSON)
    public VCProfile getACompany(@PathParam("vcId") String vcId){

        //return ConnectDB.queryOneCompanyObject(companyId);
        // return cps.getCompanyProfile(companyId);
        System.out.println("GET Request has come to get "+vcId+" profile");
        return vcDatabaseServices.findOneVCProfile(vcId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON) //MediaType.APPLICATION_FORM_URLENCODED
    public void postOrganizationProfile(VCProfile profile) {
        System.out.println("POST Request has come to post to Insert a vc profile");
        String postMessage = vcDatabaseServices.insertVCProfile(profile);
        //return postMessage;


    }

}
