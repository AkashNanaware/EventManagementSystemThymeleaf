package com.example.EventManagemetSystem;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class eventimplementation implements eventservice {
    eventrepo repo;
    public eventimplementation(eventrepo repo) {
        this.repo = repo;
    }
    @Override
    public String createevent(eventdetails event) {
       repo.save(event);
       return "Created Successfully";
    }
    @Override
    public String updateevent(eventdetails event) {
        repo.save(event);
        return "Updated Successfully";
    }
    @Override
    public String geteventdetails(String eventid) {
        eventdetails ed=repo.findById(eventid).orElse(null);
        if(ed !=null){
            return "Event_ID- "+ed.getEventid()+", Event_Name- "+ed.getEventname()+", Event_Location- "+ed.getEventlocation()+", Event_Date- "+ed.getEventdate()+", Event_Cost- "+ed.getEventcost();
        }
        else{
            return "Event ID Not Found";
        }
       
    }
    @Override
    public String deleteevent(String eventid) {
       repo.deleteById(eventid);
       return "Deleted Successfully";
    }
    @Override
    public List<eventdetails> getalleventdetails() {
        return repo.findAll();
        
        
    }
    
    
}
