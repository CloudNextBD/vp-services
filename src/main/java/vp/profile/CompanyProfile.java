package vp.profile;

/**
 * Created by mrahman on 6/21/16.
 */
public class CompanyProfile {

    String name;
    String year;

    public CompanyProfile(){

    }

    public CompanyProfile(String name, String year){

        this.name = name;
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
