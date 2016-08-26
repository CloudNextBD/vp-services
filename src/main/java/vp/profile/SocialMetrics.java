package vp.profile;

/**
 * Created by mrahman on 2/16/16.
 */
public class SocialMetrics {
    String twitterURL;
    String twitterFollowers;
    String facebookURL;
    String facebookLikes;
    String linkedinURL;
    String linkedinFollowers;
    String instagramURL;
    String instagramFollowers;
    String youTubeURL;
    String youTubeViews;

    public SocialMetrics(){}

    public SocialMetrics(String twitterURL, String twitterFollowers, String facebookURL, String facebookLikes,
                         String linkedinURL, String linkedinFollowers, String instagramURL, String instagramFollowers,
                         String youTubeURL, String youTubeViews) {
        this.twitterURL = twitterURL;
        this.twitterFollowers = twitterFollowers;
        this.facebookURL = facebookURL;
        this.facebookLikes = facebookLikes;
        this.linkedinURL = linkedinURL;
        this.linkedinFollowers = linkedinFollowers;
        this.instagramURL = instagramURL;
        this.instagramFollowers = instagramFollowers;
        this.youTubeURL = youTubeURL;
        this.youTubeViews = youTubeViews;
    }



    public String getTwitterURL() {
        return twitterURL;
    }

    public void setTwitterURL(String twitterURL) {
        this.twitterURL = twitterURL;
    }

    public String getTwitterFollowers() {
        return twitterFollowers;
    }

    public void setTwitterFollowers(String twitterFollowers) {
        this.twitterFollowers = twitterFollowers;
    }

    public String getFacebookURL() {
        return facebookURL;
    }

    public void setFacebookURL(String facebookURL) {
        this.facebookURL = facebookURL;
    }

    public String getFacebookLikes() {
        return facebookLikes;
    }

    public void setFacebookLikes(String facebookLikes) {
        this.facebookLikes = facebookLikes;
    }

    public String getLinkedinURL() {
        return linkedinURL;
    }

    public void setLinkedinURL(String linkedinURl) {
        this.linkedinURL = linkedinURl;
    }

    public String getLinkedinFollowers() {
        return linkedinFollowers;
    }

    public void setLinkedinFollowers(String linkedinFollowers) {
        this.linkedinFollowers = linkedinFollowers;
    }

    public String getInstagramURL() {
        return instagramURL;
    }

    public void setInstagramURL(String instagramURl) {
        this.instagramURL = instagramURl;
    }

    public String getInstagramFollowers() {
        return instagramFollowers;
    }

    public void setInstagramFollowers(String instagramFollowers) {
        this.instagramFollowers = instagramFollowers;
    }

    public String getYouTubeURL() {
        return youTubeURL;
    }

    public void setYouTubeURL(String youTubeURL) {
        this.youTubeURL = youTubeURL;
    }

    public String getYouTubeViews() {
        return youTubeViews;
    }

    public void setYouTubeViews(String youTubeViews) {
        this.youTubeViews = youTubeViews;
    }


}
