package vp.profile;

/**
 * Created by mrahman on 2/16/16.
 */
public class Videos {

    String videoTitle;
    String videoEmbedCode;

    public Videos(){}

    public Videos(String videoTitle, String videoEmbedCode) {
        this.videoTitle = videoTitle;
        this.videoEmbedCode = videoEmbedCode;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoEmbedCode() {
        return videoEmbedCode;
    }

    public void setVideoEmbedCode(String videoEmbedCode) {
        this.videoEmbedCode = videoEmbedCode;
    }



}
