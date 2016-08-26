package vp.databases;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import vp.profile.*;

import java.util.*;

/**
 * Created by mrahman on 2/12/16.
 */
public class OrganizationDatabaseServices {

    public ConnectDB connectDB = new ConnectDB();
    public MongoDatabase mongoDatabase = null;
    public static Fields field = new Fields();
    public static StartupProfile startupProfile = null;
    ProfileData profileData = null;
    KeyData keyData = null;
    FundingData fundingData = null;
    List<FundingData> fundingDataList = new ArrayList<>();
    KeyPeople keyPeopleData = null;
    List<KeyPeople> keyPeopleDataList = new ArrayList<>();
    Videos videosData = null;
    List<Videos> videosList = new ArrayList<>();
    Acquisitions acquisitionsData = null;
    List<Acquisitions> acquisitionsList = new ArrayList<>();
    SocialMetrics socialMetricsData = null;
    List<SocialMetrics> socialMetricsList = new ArrayList<>();

    public StartupProfile findOneCompanyProfile(String companyId){
        Map<Integer, Document> sData = new LinkedHashMap<>();
        Map<Integer, Object> pData = new LinkedHashMap<>();
        Map<Integer, Object> data = new LinkedHashMap<>();
        StartupProfile profile = new StartupProfile();
        mongoDatabase = connectDB.connectMongoClientDB();
        MongoCollection<Document> coll = mongoDatabase.getCollection("startup");
        BasicDBObject basicDBObject = new BasicDBObject();
        basicDBObject.put("profileData.companyName", companyId);
        FindIterable<Document> iterable = coll.find(basicDBObject);
         iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {

                Document pDocument = (Document) document.get("profileData");
                Document kData = (Document)document.get("keyData");
                List<Document> fData = (List<Document>)document.get("fundingData");
                List<Document> kpData = (List<Document>)document.get("keyPeople");
                List<Document> vData = (List<Document>)document.get("videos");
                List<Document> aData = (List<Document>)document.get("acquisitions");
                Document smData = (Document)document.get("socialMetrics");

                String companyName = (String)pDocument.get("companyName");
                String companyLogo = (String)pDocument.get("companyLogo");
                String companyDescription = (String)pDocument.get("companyDescription");
                String companyURL = (String)pDocument.get("companyURL");
                String companyFacebookURL = (String)pDocument.get("companyFacebookURL");
                String companyTwitterURL = (String)pDocument.get("companyTwitterURL");
                String companyLinkedinURL = (String)pDocument.get("companyLinkedinURL");
                profileData = new ProfileData(companyName,companyLogo,companyDescription,companyURL,companyFacebookURL,
                        companyTwitterURL,companyLinkedinURL);

                String foundedYear = (String)kData.get("foundedYear");
                String totalFunding = (String)kData.get("totalFunding");
                String employeeCount = (String)kData.get("employeeCount");
                String acquisitions = (String)kData.get("acquisitions");
                String monthlyUniques = (String)kData.get("monthlyUniques");
                keyData = new KeyData(foundedYear,totalFunding,employeeCount,acquisitions,monthlyUniques);


                String stage = (String)fData.get(1).get("stage");
                String fundingDate = (String)fData.get(1).get("fundingDate");
                String fundingAmount = (String)fData.get(1).get("fundingAmount");
                String fundingNewsTitle = (String)fData.get(1).get("fundingNewsTitle");
                String newsSource = (String)fData.get(1).get("newsSource");
                String author = (String)fData.get(1).get("author");
                String newsURL = (String)fData.get(1).get("newsURL");
                fundingData = new FundingData(stage,fundingDate,fundingAmount,fundingNewsTitle,newsSource,author,newsURL);
                fundingDataList.add(fundingData);

                String name = (String)kpData.get(1).get("name");
                String title = (String)kpData.get(1).get("title");
                String twitter = (String)kpData.get(1).get("twitter");
                String linkedin = (String)kpData.get(1).get("linkedin");
                String uploadImage = (String)kpData.get(1).get("uploadImage");
                String news1Title = (String)kpData.get(1).get("news1Title");
                String news1URL = (String)kpData.get(1).get("news1URL");
                String news2Title = (String)kpData.get(1).get("news2Title");
                String news2URL =(String)kpData.get(1).get("news2URL");
                keyPeopleData = new KeyPeople(name,title,twitter,linkedin,uploadImage,news1Title,news1URL,news2Title,
                        news2URL);
                keyPeopleDataList.add(keyPeopleData);

                String videoTitle = (String)vData.get(1).get("videoTitle");
                String videoEmbedCode = (String)vData.get(1).get("videoEmbedCode");
                videosData = new Videos(videoTitle,videoEmbedCode);
                videosList.add(videosData);

                String acquisitionCompanyName = (String)aData.get(1).get("acquisitionCompanyName");
                String acquisitionData = (String)aData.get(1).get("acquisitionData");
                String acquisitionNewsTitle = (String)aData.get(1).get("acquisitionNewsTitle");
                String acquisitionNewsURL = (String)aData.get(1).get("acquisitionNewsURL");
                String acquisitionNewsSource = (String)aData.get(1).get("acquisitionNewsSource");
                String acquisitionNewsAuthor = (String)aData.get(1).get("acquisitionNewsAuthor");
                acquisitionsData = new Acquisitions(acquisitionCompanyName,acquisitionData,acquisitionNewsTitle,
                        acquisitionNewsURL,acquisitionNewsSource,acquisitionNewsAuthor);
                acquisitionsList.add(acquisitionsData);

                String twitterURL = (String)smData.get("twitterURL");
                String twitterFollowers = (String)smData.get("twitterFollowers");
                String facebookURL = (String)smData.get("facebookURL");
                String facebookLikes = (String)smData.get("facebookLikes");
                String linkedinURL = (String)smData.get("linkedinURL");
                String linkedinFollowers = (String)smData.get("linkedinFollowers");
                String instagramURL = (String)smData.get("instagramURL");
                String instagramFollowers = (String)smData.get("instagramFollowers");
                String youTubeURL = (String)smData.get("youTubeURL");
                String youTubeViews = (String)smData.get("youTubeViews");
                socialMetricsData = new SocialMetrics(twitterURL,twitterFollowers,facebookURL,facebookLikes,linkedinURL,
                        linkedinFollowers,instagramURL,instagramFollowers,youTubeURL,youTubeViews);

                startupProfile = new StartupProfile(profileData,keyData,fundingDataList,keyPeopleDataList,videosList,
                        acquisitionsList,socialMetricsData);
            }

        });


        return startupProfile;
    }
//    public List<CompanyP> queryListOfCompanyObject(List<String> companyIdList){
//        List<CompanyP> companyList = new ArrayList<>();
//        mongoDatabase = connectDB.connectMongoClientDB();
//        MongoCollection<Document> coll = mongoDatabase.getCollection("startup");
//
//        for(int i=0; i<companyIdList.size(); i++) {
//            CompanyP company = new CompanyP();
//            BasicDBObject basicDBObject = new BasicDBObject();
//            basicDBObject.put("name", companyIdList.get(i));
//            FindIterable<Document> iterable = coll.find(basicDBObject);
//            for (Document doc : iterable) {
//                String name = (String) doc.get("name");
//                String year = (String) doc.get("Year");
//                company.setCompanyName(name);
//                company.setYearFounded(year);
//            }
//            companyList.add(company);
//        }
//        return companyList;
//    }
//    public List<CompanyP> queryListOfCompanyByYear(String year){
//        List<CompanyP> companyList = new ArrayList<>();
//        mongoDatabase = connectDB.connectMongoClientDB();
//        MongoCollection<Document> coll = mongoDatabase.getCollection("startup");
//
//        BasicDBObject basicDBObject = new BasicDBObject();
//        basicDBObject.put("Year", year);
//        FindIterable<Document> iterable = coll.find(basicDBObject);
//        for (Document doc : iterable) {
//            CompanyP company = new CompanyP();
//            String nameList = (String) doc.get("name");
//            String yearList = (String) doc.get("Year");
//            company.setCompanyName(nameList);
//            company.setYearFounded(yearList);
//            companyList.add(company);
//        }
//
//        return companyList;
//    }
//    public List<CompanyP> queryListOfCompanyByLocation(String location){
//        List<CompanyP> companyList = new ArrayList<>();
//        mongoDatabase = connectDB.connectMongoClientDB();
//        MongoCollection<Document> coll = mongoDatabase.getCollection("startup");
//
//        BasicDBObject basicDBObject = new BasicDBObject();
//        basicDBObject.put("location", location);
//        FindIterable<Document> iterable = coll.find(basicDBObject);
//        for (Document doc : iterable) {
//            CompanyP company = new CompanyP();
//            String nameList = (String) doc.get("name");
//            String yearList = (String) doc.get("Year");
//            String locationList = (String) doc.get("location");
//            company.setCompanyName(nameList);
//            company.setYearFounded(yearList);
//            company.setLocation(locationList);
//            companyList.add(company);
//        }
//
//        return companyList;
//    }
//
//    public List<CompanyP> queryListOfCompanyByFundingAmount(String fundingAmount){
//        List<CompanyP> companyList = new ArrayList<>();
//        mongoDatabase = connectDB.connectMongoClientDB();
//        MongoCollection<Document> coll = mongoDatabase.getCollection("startup");
//
//        BasicDBObject basicDBObject = new BasicDBObject();
//        basicDBObject.put("funding", fundingAmount);//funding:{$gt:"2008"}
//        FindIterable<Document> iterable = coll.find(basicDBObject);
//        for (Document doc : iterable) {
//            CompanyP company = new CompanyP();
//            String nameList = (String) doc.get("name");
//            String yearList = (String) doc.get("Year");
//            String locationList = (String) doc.get("location");
//            String fundingList = (String) doc.get("funding");
//            company.setCompanyName(nameList);
//            company.setYearFounded(yearList);
//            company.setLocation(locationList);
//            company.setLocation(fundingList);
//            companyList.add(company);
//        }
//
//        return companyList;
//    }


    public String insertStartupProfile(StartupProfile profile){
        MongoDatabase mongoDatabase1 = null;
        ConnectDB connectDB1 = new ConnectDB();
        String st = profile.getProfileData().getCompanyName()+" "+ "Inserted";
        mongoDatabase1 = connectDB1.connectMongoClientDB();;
        MongoCollection mongoCollection = mongoDatabase1.getCollection("startup");
        Document profileDataDocument = documentProfileData(profile);
        Document keyDataDocument = documentKeyData(profile);
        List<Document> fundingDataDocument = documentFundingData(profile);
        List<Document> keyPeopleDataDocument = documentKeyPeople(profile);
        List<Document> videosDocument = documentVideos(profile);
        List<Document> acquisitionsDocument = documentAcquisitions(profile);
        Document socialMetricsDocument = documentSocialMetrics(profile);
        Document preparedDocument = new Document("profileData",profileDataDocument).append("keyData", keyDataDocument)
                .append("fundingData", fundingDataDocument).append("keyPeople",keyPeopleDataDocument).append("videos",
                videosDocument).append("acquisitions",acquisitionsDocument).append("socialMetrics",socialMetricsDocument);
                mongoCollection.insertOne(preparedDocument);


        return st;

    }
    public static Document documentProfileData(StartupProfile profile){
        Document document = new Document().append(field.companyName, profile.getProfileData().getCompanyName())
        .append(field.companyLogo, profile.getProfileData().getCompanyLogo()).append(field.companyDescription,
                        profile.getProfileData().getCompanyDescription()).append(field.companyURL, profile.getProfileData()
                        .getCompanyURL()).append(field.companyFacebookURL, profile.getProfileData()
         .getCompanyFacebookURL()).append(field.companyTwitterURL,profile.getProfileData().getCompanyTwitterURL())
         .append(field.companyLinkedinURL, profile.getProfileData().getCompanyLinkedinURL());


        return document;
    }
    public static Document documentKeyData(StartupProfile profile){
        Document document = new Document().append(field.foundedYear, profile.getKeyData().getFoundedYear())
                .append(field.totalFunding, profile.getKeyData().getTotalFunding()).append(field.employeeCount,
                profile.getKeyData().getEmployeeCount()).append(field.acquisitions, profile.getKeyData().getAcquisitions())
                .append(field.monthlyUniques, profile.getKeyData().getMonthlyUniques());

        return document;
    }
    public static List<Document> documentFundingData(StartupProfile profile){
        List<Document> fundingDataList = new ArrayList<>();
        Document document = null;
        for(FundingData pr:profile.getFundingData()) {
            document = new Document().append(field.stage, pr.getStage()).append(field.fundingDate, pr.getFundingDate())
            .append(field.fundingAmount,pr.getFundingAmount()).append(field.fundingNewsTitle, pr.getFundingNewsTitle())
            .append(field.newsSource, pr.getNewsSource()).append(field.author, pr.getNewsSource()).append(field.newsURL,
            pr.getAuthor());
            fundingDataList.add(document);
        }

        return fundingDataList;
    }

    public static List<Document> documentKeyPeople(StartupProfile profile){
        List<Document> keyPeopleList = new ArrayList<>();
        Document document = null;
        for(KeyPeople pr:profile.getKeyPeople()) {
            document = new Document().append(field.name,
                    pr.getName()).append(field.title, pr.getTitle()).append(field.twitter,
                    pr.getTitle()).append(field.linkedin, pr.getLinkedin()).append(field.uploadImage,
                    pr.getUploadImage()).append(field.news1Title, pr.getNews1Title()).append(field.news1URL,
                    pr.getNews1URL())
            .append(field.news2Title, pr.getNews2Title()).append(field.news2URL,pr.getNews2URL());
            keyPeopleList.add(document);
        }
        return keyPeopleList;
    }
    public static List<Document> documentVideos(StartupProfile profile){
        List<Document> keyPeopleList = new ArrayList<>();
        Document document = null;
        for(Videos pr:profile.getVideos()) {
            document = new Document().append(field.videoTitle, pr.getVideoTitle()).append(field.videoEmbedCode,
                    pr.getVideoEmbedCode());
            keyPeopleList.add(document);
        }

        return keyPeopleList;
    }

    public static List<Document> documentAcquisitions(StartupProfile profile){
        List<Document> acquisitionsList = new ArrayList<>();
        Document document = null;
        for(Acquisitions pr:profile.getAcquisitions()) {
            document = new Document().append(field.acquisitionCompanyName, pr.getAcquisitionCompanyName())
                    .append(field.acquisitionData, pr.getAcquisitionData()).append(field.acquisitionNewsTitle,
                    pr.getAcquisitionNewsTitle()).append(field.acquisitionNewsURL, pr.getAcquisitionNewsURL())
                    .append(field.acquisitionNewsSource, pr.getAcquisitionNewsSource()).append(field.acquisitionNewsAuthor
                    , pr.getAcquisitionNewsAuthor());
            acquisitionsList.add(document);
        }


        return acquisitionsList;
    }
        public static Document documentSocialMetrics(StartupProfile profile){

            Document document = new Document().append(field.twitterURL, profile.getSocialMetrics().getTwitterURL())
             .append(field.twitterFollowers, profile.getSocialMetrics().getTwitterFollowers()).append(field.facebookURL,
              profile.getSocialMetrics().getFacebookURL()).append(field.facebookLikes, profile.getSocialMetrics()
              .getFacebookLikes()).append(field.linkedinURL, profile.getSocialMetrics().getLinkedinURL()).append(field.linkedinFollowers
              ,profile.getSocialMetrics().getLinkedinFollowers()).append(field.instagramURL,profile.getSocialMetrics().getInstagramURL())
                .append(field.instagramFollowers,profile.getSocialMetrics().getLinkedinFollowers()).append(field.youTubeURL
                ,profile.getSocialMetrics().getYouTubeURL()).append(field.youTubeViews,profile.getSocialMetrics()
                            .getYouTubeViews());


            return document;
        }

    public static void main(String[] args) {


    }

}
