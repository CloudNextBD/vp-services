package vp.vc.profile;

/**
 * Created by mrahman on 7/26/16.
 */
public class Location {

    public String city;
    public String state;

    public Location(){

    }
    public Location(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
