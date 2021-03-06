package vp.databases;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import vp.profile.*;
import vp.vc.profile.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mrahman on 7/17/16.
 */
public class VCDatabaseServices {
    public ConnectDB connectDB = new ConnectDB();
    public MongoDatabase mongoDatabase = null;
    public static VCFields vcFields = new VCFields();
    public static VCInfo vcInfo = null;
    public static SocialData socialData = null;
    public static FundingHistory fundingHistory = null;
    public List<FundingHistory> fundingHistoryList = new ArrayList<FundingHistory>();
    public VCProfile vcProfile = null;


    public String insertVCProfile(VCProfile profile){
        MongoDatabase mongoDatabase1 = null;
        ConnectDB connectDB1 = new ConnectDB();
        String st = profile.getVcInfo().getVcName()+" "+ "is Inserted";
        mongoDatabase1 = connectDB1.connectMongoClientDB();
        MongoCollection mongoCollection = mongoDatabase1.getCollection("vc");
        Document vcInfoDocument = documentVCInfoData(profile);
        Document socialDataDocument = documentVCSocialData(profile);
        List<Document> fundingHistoryDocument = documentVCFundingHistoryData(profile);

        Document preparedDocument = new Document("vcInfo", vcInfoDocument).append("socialData", socialDataDocument)
                .append("fundingHistory", fundingHistoryDocument);

        mongoCollection.insertOne(preparedDocument);

        return st;
    }
    public static Document documentVCInfoData(VCProfile profile){
        Document document = new Document().append(vcFields.vcName, profile.getVcInfo().getVcName())
                .append(vcFields.vcType, profile.getVcInfo().getVcType()).append(vcFields.city, profile.getVcInfo()
                .getVcLocation().getCity()).append(vcFields.state, profile.getVcInfo().getVcLocation().getState())
                .append(vcFields.numberOfDeals, profile.getVcInfo().getNumberOfDeals()).append(vcFields.vcUrl,
                 profile.getVcInfo().getVcUrl()).append(vcFields.vcEmail,profile.getVcInfo().getVcEmail())
                .append(vcFields.vcFoundedYear, profile.getVcInfo().getVcFoundedYear());

        return document;
    }
    public static Document documentVCSocialData(VCProfile profile){
        Document document = new Document().append(vcFields.facebookUrl, profile.getSocialData().getFacebookUrl())
                .append(vcFields.twitterUrl, profile.getSocialData().getTwitterUrl()).append(vcFields.linkedinUrl,
                profile.getSocialData().getLinkedinUrl());

        return document;
    }

    public static List<Document> documentVCFundingHistoryData(VCProfile profile){
        List<Document> fundingHistoryData = new ArrayList<>();
        Document document = null;
        for(FundingHistory pr:profile.getFundingHistory()) {
            document = new Document().append(vcFields.fundingDate, pr.getFundingDate()).append(vcFields.companyName,
            pr.getCompanyName()).append(vcFields.fundingAmount,pr.getFundingAmount()).append(vcFields.fundingRound,
            pr.getFundingRound()).append(vcFields.categories, pr.getCategories());

            fundingHistoryData.add(document);
        }

        return fundingHistoryData;
    }

    public VCProfile findOneVCProfile(String vcId){
        Map<Integer, Document> sData = new LinkedHashMap<>();
        Map<Integer, Object> pData = new LinkedHashMap<>();
        Map<Integer, Object> data = new LinkedHashMap<>();
        StartupProfile profile = new StartupProfile();
        mongoDatabase = connectDB.connectMongoClientDB();
        MongoCollection<Document> coll = mongoDatabase.getCollection("vc");
        BasicDBObject basicDBObject = new BasicDBObject();
        basicDBObject.put("vcInfo.vcName", vcId);
        FindIterable<Document> iterable = coll.find(basicDBObject);
        iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {

                Document vcInfoDocument = (Document) document.get("vcInfo");
                Document socialDataDocument = (Document)document.get("socialData");
                List<Document> fundingHistoryDocument = (List<Document>)document.get("fundingHistory");


                String vcName = (String)vcInfoDocument.get("vcName");
                String vcType = (String)vcInfoDocument.get("vcType");
                String vcLocationCity = (String)vcInfoDocument.get("city");
                String vcLocationState = (String)vcInfoDocument.get("state");
                Location vcLocation = new Location(vcLocationCity, vcLocationState);
                String numberOfDeals = (String)vcInfoDocument.get("numberOfDeals");
                String vcUrl = (String)vcInfoDocument.get("vcUrl");
                String vcEmail = (String)vcInfoDocument.get("vcEmail");
                String vcFoundedYear = (String)vcInfoDocument.get("vcFoundedYear");

                vcInfo = new VCInfo(vcName,vcType,vcLocation,numberOfDeals, vcUrl,vcEmail,vcFoundedYear);

                String facebookUrl = (String)socialDataDocument.get("facebookUrl");
                String twitterUrl  = (String)socialDataDocument.get("twitterUrl");
                String linkedinUrl = (String)socialDataDocument.get("linkedinUrl");

                socialData = new SocialData(facebookUrl, twitterUrl, linkedinUrl);

                String fundingDate = (String)fundingHistoryDocument.get(1).get("fundingDate");
                String companyName = (String)fundingHistoryDocument.get(1).get("companyName");
                String fundingAmount = (String)fundingHistoryDocument.get(1).get("fundingAmount");
                String fundingRound = (String)fundingHistoryDocument.get(1).get("fundingRound");
                String categories = (String)fundingHistoryDocument.get(1).get("categories");

                fundingHistory = new FundingHistory(fundingDate,companyName,fundingAmount,fundingRound,categories);
                fundingHistoryList.add(fundingHistory);


                vcProfile = new VCProfile(vcInfo,socialData,fundingHistoryList);

            }

        });


        return vcProfile;
    }
    /*
    public static Document documentVCFundingHistoryData(VCProfile profile){
        Document document = new Document().append(vcFields.fundingDate, profile.getFundingHistory().get(1).getFundingDate()).append(
                vcFields.companyName, fundingHistory.getCompanyName()).append(vcFields.fundingAmount,
                fundingHistory.getFundingAmount()).append(vcFields.fundingRound, fundingHistory.getFundingRound())
                .append(vcFields.categories, fundingHistory.getCategories());

        return document;
    }  */
}
