package vp.profile;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mrahman on 2/15/16.
 */

@XmlRootElement
public class ProfileData {

    String companyName;
    String companyLogo;
    String companyDescription;
    String companyURL;
    String companyFacebookURL;
    String companyTwitterURL;
    String companyLinkedinURL;

    public ProfileData(){}

    public ProfileData(String companyName, String companyLogo, String companyDescription, String companyURL, String companyFacebookURL, String companyTwitterURL, String companyLinkedinURL) {
        this.companyName = companyName;
        this.companyLogo = companyLogo;
        this.companyDescription = companyDescription;
        this.companyURL = companyURL;
        this.companyFacebookURL = companyFacebookURL;
        this.companyTwitterURL = companyTwitterURL;
        this.companyLinkedinURL = companyLinkedinURL;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public void setCompanyURL(String companyURL) {
        this.companyURL = companyURL;
    }

    public String getCompanyFacebookURL() {
        return companyFacebookURL;
    }

    public void setCompanyFacebookURL(String companyFacebookURL) {
        this.companyFacebookURL = companyFacebookURL;
    }

    public String getCompanyTwitterURL() {
        return companyTwitterURL;
    }

    public void setCompanyTwitterURL(String companyTwitterURL) {
        this.companyTwitterURL = companyTwitterURL;
    }

    public String getCompanyLinkedinURL() {
        return companyLinkedinURL;
    }

    public void setCompanyLinkedinURL(String companyLinkedinURL) {
        this.companyLinkedinURL = companyLinkedinURL;
    }

}
