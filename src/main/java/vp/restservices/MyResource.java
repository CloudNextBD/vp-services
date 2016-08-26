package vp.restservices;

import vp.databases.OrganizationDatabaseServices;
import vp.databases.UserDatabaseServices;
import vp.organization.*;
import vp.profile.StartupProfile;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("companyResources")
public class MyResource {

    CompanyProfileServices cps = new CompanyProfileServices();
    UserDatabaseServices databaseServices = new UserDatabaseServices();
    OrganizationDatabaseServices organizationDatabaseServices = new OrganizationDatabaseServices();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<CompanyP> getIt() {
//
//        return cp.getCompanyProfile();
//    }

    //@GET
    //@Path("/{companyIds}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<CompanyP> getListOfCompany(@PathParam("companyIds") PathSegment pathSegment){
//        Set<String>  set = pathSegment.getMatrixParameters().keySet();
//        Iterator it = set.iterator();
//        List<String> companyIdList = new ArrayList<>();
//        while(it.hasNext()) {
//            companyIdList.add(it.next().toString());
//        }
//        return cps.getListOfCompanyProfile(companyIdList);
//    }

    @GET
    @Path("/{companyId}")
    @Produces(MediaType.APPLICATION_JSON)
    public StartupProfile getACompany(@PathParam("companyId") String companyId){

        //return ConnectDB.queryOneCompanyObject(companyId);
       // return cps.getCompanyProfile(companyId);
        System.out.println("GET Request has come to get "+companyId+" profile");
        return organizationDatabaseServices.findOneCompanyProfile(companyId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postOrganizationProfile(StartupProfile profile) {
        System.out.println("POST Request has come to post to Insert company profile");
        organizationDatabaseServices.insertStartupProfile(profile);

        return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .header("Access-Control-Max-Age", "1209600")
                .entity(profile)
                .build();
    }
}
