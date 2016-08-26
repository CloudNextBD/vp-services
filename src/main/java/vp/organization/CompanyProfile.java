package vp.organization;

import vp.databases.ConnectDB;
import vp.databases.OrganizationDatabaseServices;

/**
 * Created by mrahman on 2/9/16.
 */
public class CompanyProfile {

    OrganizationDatabaseServices organizationDatabaseServices = new OrganizationDatabaseServices();
    public static ConnectDB connectDB = new ConnectDB();
//    public List<CompanyP> getCompanyProfile(){
//        List<CompanyP> list = new ArrayList<>();
//        CompanyP c1 = new CompanyP("Dropbox", "2007");
//        CompanyP c2 = new CompanyP("Dropbox", "2007");
//        list.add(c1);
//        list.add(c2);
//
//        return list;
//
//    }

//    public static List<String> getCompanyInfo(){
//        List<String> companyList = new ArrayList<>();
//        List<Document> documentList= connectDB.queryDataList();
//        for(Document doc:documentList){
//             companyList.add(doc.getString("companyName")+doc.getString("Year"));
//        }
//
//        return companyList;
//    }
//
//    public List<CompanyP> getListCompany(){
//        CompanyP company = new CompanyP();
//        List<CompanyP> companyList = new ArrayList<>();
//        List<String> list = getCompanyInfo();
//        for(String st:list){
//            company.setCompanyName(st);
//            //companyList.add(company.getCompanyName());
//        }
//        return companyList;
//    }

}
