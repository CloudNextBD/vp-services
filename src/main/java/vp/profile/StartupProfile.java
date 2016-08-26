package vp.profile;

import vp.organization.CompanyP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by mrahman on 2/15/16.
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StartupProfile {
// @XmlElement(name="profileData")
    public ProfileData profileData;
    public KeyData keyData;
    public List<FundingData> fundingData;
    public List<KeyPeople> keyPeople;
    public List<Videos> videos;
    public List<Acquisitions> acquisitions;
    public SocialMetrics socialMetrics;

    public StartupProfile(){}

    public StartupProfile(ProfileData profileData,KeyData keyData,List<FundingData> fundingData,List<KeyPeople>
            keyPeople,List<Videos> videos,List<Acquisitions> acquisitions,SocialMetrics socialMetrics){

        this.profileData = profileData;
        this.keyData = keyData;
        this.fundingData = fundingData;
        this.keyPeople = keyPeople;
        this.videos = videos;
        this.acquisitions = acquisitions;
        this.socialMetrics = socialMetrics;
    }

    public List<KeyPeople> getKeyPeople() {
        return keyPeople;
    }

    public void setKeyPeople(List<KeyPeople> keyPeople) {
        this.keyPeople = keyPeople;
    }

    public List<Videos> getVideos() {
        return videos;
    }

    public void setVideos(List<Videos> videos) {
        this.videos = videos;
    }

    public List<Acquisitions> getAcquisitions() {
        return acquisitions;
    }

    public void setAcquisitions(List<Acquisitions> acquisitions) {
        this.acquisitions = acquisitions;
    }

    public SocialMetrics getSocialMetrics() {
        return socialMetrics;
    }

    public void setSocialMetrics(SocialMetrics socialMetrics) {
        this.socialMetrics = socialMetrics;
    }

    public List<FundingData> getFundingData() {
        return fundingData;
    }

    public void setFundingData(List<FundingData> fundingData) {
        this.fundingData = fundingData;
    }

    public KeyData getKeyData() {
        return keyData;
    }

    public void setKeyData(KeyData keyData) {
        this.keyData = keyData;
    }


    public ProfileData getProfileData() {
        return profileData;
    }

    public void setProfileData(ProfileData profileData) {
        this.profileData = profileData;
    }

}
