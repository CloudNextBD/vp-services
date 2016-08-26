package vp.vc.profile;

import java.util.List;

/**
 * Created by mrahman on 7/26/16.
 */
public class VCProfile {

    public VCInfo vcInfo;
    public SocialData socialData;
    public List<FundingHistory> fundingHistory;

    public VCProfile(){

    }

    public VCProfile(VCInfo vcInfo, SocialData socialData, List<FundingHistory> fundingHistory) {
        this.vcInfo = vcInfo;
        this.socialData = socialData;
        this.fundingHistory = fundingHistory;
    }


    public VCInfo getVcInfo() {
        return vcInfo;
    }

    public void setVcInfo(VCInfo vcInfo) {
        this.vcInfo = vcInfo;
    }

    public SocialData getSocialData() {
        return socialData;
    }

    public void setSocialData(SocialData socialData) {
        this.socialData = socialData;
    }

    public List<FundingHistory> getFundingHistory() {
        return fundingHistory;
    }

    public void setFundingHistory(List<FundingHistory> fundingHistory) {
        this.fundingHistory = fundingHistory;
    }




}
