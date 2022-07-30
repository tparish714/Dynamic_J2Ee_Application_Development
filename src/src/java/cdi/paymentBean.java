/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import ejb.theaterEJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.validation.constraints.Size;

/**
 *
 * @author teraparish
 */
@Named(value = "paymentBean")
@SessionScoped
public class paymentBean implements Serializable {

    @EJB
    private theaterEJB theaterEJB;
    private String showtime;
    private String cc;

    public theaterEJB getTheaterEJB() {
        return theaterEJB;
    }

    public void setTheaterEJB(theaterEJB theaterEJB) {
        this.theaterEJB = theaterEJB;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    // validate the card number entered
    @Size(min = 16, max = 16, message = "! Invalid Card Number: Must Be 16 Digits")
    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    /**
     * Creates a new instance of paymentBean
     */
    public paymentBean() {
    }
   

    public String toSeating(String showtime) {
        this.showtime = showtime;
        // redirecting page
        return "Seating.xhtml?faces-redirect=true";
    }
}
