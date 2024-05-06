package com.example.EventManagemetSystem;

import java.util.List;

public interface eventservice {
    public String createevent(eventdetails event);
    public String updateevent(eventdetails event);
    public String geteventdetails(String eventid);
    public String deleteevent(String eventid);
    public List<eventdetails> getalleventdetails();
}
