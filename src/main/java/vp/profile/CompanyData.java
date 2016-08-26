package vp.profile;

/**
 * Created by mrahman on 6/21/16.
 */
public class CompanyData {

    CompanyProfile companyProfile;

    public CompanyProfile getcName() {
        return companyProfile;
    }

    public void setcName(CompanyProfile companyProfile) {
        this.companyProfile = companyProfile;
    }


    public CompanyData(){
    }
    public CompanyData(CompanyProfile companyProfile){
        this.companyProfile = companyProfile;
    }
}
