package vp.organization;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mrahman on 2/9/16.
 */

@XmlRootElement
public class CompanyP {
    String CompanyName;
    String YearFounded;
    String Location;
    String FundingAmount;
    String CEO;

    public CompanyP() {

    }
//    public CompanyP(String companyName, String yearFounded){
//        this.companyName = companyName;
//        this.yearFounded = yearFounded;
//    }

    public String getYearFounded() {
        return YearFounded;
    }

    public void setYearFounded(String yearFounded) {
        this.YearFounded = yearFounded;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        this.CompanyName = companyName;
    }
    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }
    public String getFundingAmount() {
        return FundingAmount;
    }

    public void setFundingAmount(String fundingAmount) {
        this.FundingAmount = fundingAmount;
    }
    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }



}
