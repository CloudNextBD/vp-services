package vp.profile;

/**
 * Created by mrahman on 2/16/16.
 */
public class Acquisitions {

    String acquisitionCompanyName;
    String acquisitionData;
    String acquisitionNewsTitle;
    String acquisitionNewsURL;
    String acquisitionNewsSource;
    String acquisitionNewsAuthor;

    public Acquisitions(){}

    public Acquisitions(String acquisitionCompanyName, String acquisitionData, String acquisitionNewsTitle,
                        String acquisitionNewsURL, String acquisitionNewsSource, String acquisitionNewsAuthor) {

        this.acquisitionCompanyName = acquisitionCompanyName;
        this.acquisitionData = acquisitionData;
        this.acquisitionNewsTitle = acquisitionNewsTitle;
        this.acquisitionNewsURL = acquisitionNewsURL;
        this.acquisitionNewsSource = acquisitionNewsSource;
        this.acquisitionNewsAuthor = acquisitionNewsAuthor;
    }



    public String getAcquisitionCompanyName() {
        return acquisitionCompanyName;
    }

    public void setAcquisitionCompanyName(String acquisitionCompanyName) {
        this.acquisitionCompanyName = acquisitionCompanyName;
    }

    public String getAcquisitionData() {
        return acquisitionData;
    }

    public void setAcquisitionData(String acquisitionDate) {
        this.acquisitionData = acquisitionDate;
    }

    public String getAcquisitionNewsTitle() {
        return acquisitionNewsTitle;
    }

    public void setAcquisitionNewsTitle(String acquisitionNewsTitle) {
        this.acquisitionNewsTitle = acquisitionNewsTitle;
    }

    public String getAcquisitionNewsURL() {
        return acquisitionNewsURL;
    }

    public void setAcquisitionNewsURL(String acquisitionNewsURL) {
        this.acquisitionNewsURL = acquisitionNewsURL;
    }

    public String getAcquisitionNewsSource() {
        return acquisitionNewsSource;
    }

    public void setAcquisitionNewsSource(String acquisitionNewsSource) {
        this.acquisitionNewsSource = acquisitionNewsSource;
    }

    public String getAcquisitionNewsAuthor() {
        return acquisitionNewsAuthor;
    }

    public void setAcquisitionNewsAuthor(String acquisitionNewsAuthor) {
        this.acquisitionNewsAuthor = acquisitionNewsAuthor;
    }


}
