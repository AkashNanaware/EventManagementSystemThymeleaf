package com.example.EventManagemetSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Event_Info")
public class eventdetails {
    @Id
    private String eventid;
    private String eventname;
    private String eventlocation;
    private String eventdate;
    private String eventcost;
    public eventdetails(String eventid, String eventname, String eventlocation, String eventdate, String eventcost) {
        this.eventid = eventid;
        this.eventname = eventname;
        this.eventlocation = eventlocation;
        this.eventdate = eventdate;
        this.eventcost = eventcost;
    }
    public eventdetails() {
    }
    public String getEventid() {
        return eventid;
    }
    public void setEventid(String eventid) {
        this.eventid = eventid;
    }
    public String getEventname() {
        return eventname;
    }
    public void setEventname(String eventname) {
        this.eventname = eventname;
    }
    public String getEventlocation() {
        return eventlocation;
    }
    public void setEventlocation(String eventlocation) {
        this.eventlocation = eventlocation;
    }
    public String getEventdate() {
        return eventdate;
    }
    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }
    public String getEventcost() {
        return eventcost;
    }
    public void setEventcost(String eventcost) {
        this.eventcost = eventcost;
    }
}
