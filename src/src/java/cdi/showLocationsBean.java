/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import ejb.theaterEJB;
import entity.Location;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author teraparish
 */
@Named(value = "showLocationsBean")
@SessionScoped
public class showLocationsBean implements Serializable {

    @EJB
    private theaterEJB theaterEJB;
    private List<Location> location;
    private List<String> zipList;
    private String zipcode;
    private int mapIdx;

    public theaterEJB getTheaterEJB() {
        return theaterEJB;
    }

    public void setTheaterEJB(theaterEJB theaterEJB) {
        this.theaterEJB = theaterEJB;
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }

    public List<String> getZipList() {
        return zipList;
    }

    public void setZipList(List<String> zipList) {
        this.zipList = zipList;
    }

    public int getMapIdx() {
        return mapIdx;
    }

    public void setMapIdx(int mapIdx) {
        this.mapIdx = mapIdx;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<Location> showAllLocations() {
        return theaterEJB.findAllLocations();
    }

    public showLocationsBean() {
    }

    // for numbering the table
    public int showMapIdx() {
        if (mapIdx >= 9) {
            mapIdx = 0;
        }

        return ++this.mapIdx;
    }

    // get a zipcode list without duplicate values
    public List<String> showZipcodes() {
        this.zipList= new ArrayList<>();
        location= theaterEJB.findAllLocations();
        
        for (Location l: location)
            zipList.add(l.getZipcode());
        
        this.zipList= new ArrayList<>(new HashSet<>(zipList));
        return this.zipList;
    }

    public String showLocationList() {
        // retrieve the patameter passed in 
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params
                = fc.getExternalContext().getRequestParameterMap();
        String zip = params.get("zipcode");
        this.zipcode = zip;
        // pass the zipcode to the query to get a list of location
        this.location = theaterEJB.getLocationsForZipcode(zipcode);
        // redirecting page
        return "LocationsByZipcode.xhtml?faces-redirect=true";
    }

}
