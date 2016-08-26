package vp.profile;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mrahman on 2/16/16.
 */

@XmlRootElement
public class KeyPeople {

    String name;
    String title;
    String twitter;
    String linkedin;
    String uploadImage;
    String news1Title;
    String news1URL;
    String news2Title;
    String news2URL;

    public KeyPeople(){}

    public KeyPeople(String name, String title, String twitter, String linkedin, String uploadImage, String news1Title, String news1URL, String news2Title, String news2URL) {
        this.name = name;
        this.title = title;
        this.twitter = twitter;
        this.linkedin = linkedin;
        this.uploadImage = uploadImage;
        this.news1Title = news1Title;
        this.news1URL = news1URL;
        this.news2Title = news2Title;
        this.news2URL = news2URL;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getUploadImage() {
        return uploadImage;
    }

    public void setUploadImage(String uploadImage) {
        this.uploadImage = uploadImage;
    }

    public String getNews1Title() {
        return news1Title;
    }

    public void setNews1Title(String news1Title) {
        this.news1Title = news1Title;
    }

    public String getNews1URL() {
        return news1URL;
    }

    public void setNews1URL(String news1URL) {
        this.news1URL = news1URL;
    }

    public String getNews2Title() {
        return news2Title;
    }

    public void setNews2Title(String news2Title) {
        this.news2Title = news2Title;
    }

    public String getNews2URL() {
        return news2URL;
    }

    public void setNews2URL(String news2URL) {
        this.news2URL = news2URL;
    }






}
