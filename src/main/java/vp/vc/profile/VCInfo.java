package vp.vc.profile;

/**
 * Created by mrahman on 7/26/16.
 */
public class VCInfo {

    public String   vcName;
    public String   vcType;
    public Location vcLocation;
    public String   numberOfDeals;
    public String   vcUrl;
    public String   vcEmail;
    public String   vcFoundedYear;

    public VCInfo(){

    }

    public VCInfo(String vcName, String vcType, Location vcLocation, String numberOfDeals,
                  String vcUrl, String vcEmail, String vcFoundedYear) {
        this.vcName = vcName;
        this.vcType = vcType;
        this.vcLocation = vcLocation;
        this.numberOfDeals = numberOfDeals;
        this.vcUrl = vcUrl;
        this.vcEmail = vcEmail;
        this.vcFoundedYear = vcFoundedYear;
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName;
    }

    public String getVcType() {
        return vcType;
    }

    public void setVcType(String vcType) {
        this.vcType = vcType;
    }

    public Location getVcLocation() {
        return vcLocation;
    }

    public void setVcLocation(Location vcLocation) {
        this.vcLocation = vcLocation;
    }

    public String getNumberOfDeals() {
        return numberOfDeals;
    }

    public void setNumberOfDeals(String numberOfDeals) {
        this.numberOfDeals = numberOfDeals;
    }

    public String getVcUrl() {
        return vcUrl;
    }

    public void setVcUrl(String vcUrl) {
        this.vcUrl = vcUrl;
    }

    public String getVcEmail() {
        return vcEmail;
    }

    public void setVcEmail(String vcEmail) {
        this.vcEmail = vcEmail;
    }

    public String getVcFoundedYear() {
        return vcFoundedYear;
    }

    public void setVcFoundedYear(String vcFoundedYear) {
        this.vcFoundedYear = vcFoundedYear;
    }



}
