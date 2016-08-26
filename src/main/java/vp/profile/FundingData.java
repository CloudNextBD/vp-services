package vp.profile;

/**
 * Created by mrahman on 2/16/16.
 */
public class FundingData {

    String stage;
    String fundingDate;
    String fundingAmount;
    String fundingNewsTitle;
    String newsSource;
    String author;
    String newsURL;

    public FundingData(){}

    public FundingData(String stage, String fundingDate, String fundingAmount, String fundingNewsTitle, String newsSource, String author, String newsURL) {
        this.stage = stage;
        this.fundingDate = fundingDate;
        this.fundingAmount = fundingAmount;
        this.fundingNewsTitle = fundingNewsTitle;
        this.newsSource = newsSource;
        this.author = author;
        this.newsURL = newsURL;
    }



    public String getNewsURL() {
        return newsURL;
    }

    public void setNewsURL(String newsURL) {
        this.newsURL = newsURL;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getFundingDate() {
        return fundingDate;
    }

    public void setFundingDate(String fundingDate) {
        this.fundingDate = fundingDate;
    }

    public String getFundingAmount() {
        return fundingAmount;
    }

    public void setFundingAmount(String fundingAmount) {
        this.fundingAmount = fundingAmount;
    }

    public String getFundingNewsTitle() {
        return fundingNewsTitle;
    }

    public void setFundingNewsTitle(String fundingNewsTitle) {
        this.fundingNewsTitle = fundingNewsTitle;
    }

    public String getNewsSource() {
        return newsSource;
    }

    public void setNewsSource(String newsSource) {
        this.newsSource = newsSource;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



}
