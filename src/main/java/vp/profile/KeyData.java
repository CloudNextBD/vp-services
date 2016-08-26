package vp.profile;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mrahman on 2/15/16.
 */

@XmlRootElement
public class KeyData {

    String foundedYear;
    String totalFunding;
    String employeeCount;
    String acquisitions;
    String monthlyUniques;

    public KeyData(){}

    public KeyData(String foundedYear, String totalFunding, String employeeCount, String acquisitions, String monthlyUniques) {
        this.foundedYear = foundedYear;
        this.totalFunding = totalFunding;
        this.employeeCount = employeeCount;
        this.acquisitions = acquisitions;
        this.monthlyUniques = monthlyUniques;
    }

    public String getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(String foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getTotalFunding() {
        return totalFunding;
    }

    public void setTotalFunding(String totalFunding) {
        this.totalFunding = totalFunding;
    }

    public String getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(String employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getAcquisitions() {
        return acquisitions;
    }

    public void setAcquisitions(String acquisitions) {
        this.acquisitions = acquisitions;
    }

    public String getMonthlyUniques() {
        return monthlyUniques;
    }

    public void setMonthlyUniques(String monthlyUniques) {
        this.monthlyUniques = monthlyUniques;
    }

}
