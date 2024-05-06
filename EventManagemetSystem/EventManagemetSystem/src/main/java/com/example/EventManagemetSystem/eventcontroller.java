package com.example.EventManagemetSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/eventdetails")
public class eventcontroller {
    eventservice eventService;

    public eventcontroller(eventservice eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/{eventid}")
    public String getEventDetails(@PathVariable("eventid") String eventid, Model model) {
        model.addAttribute("event", eventService.geteventdetails(eventid));
        return "eventdetails";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("event", new eventdetails());
        return "createevent";
    }

    @PostMapping("/create")
    public String createEventDetails(@ModelAttribute("event") eventdetails event) {
        eventService.createevent(event);
        return "redirect:/eventdetails";
    }

    @GetMapping("/update/{eventid}")
    public String showUpdateForm(@PathVariable("eventid") String eventid, Model model) {
        model.addAttribute("event", eventService.geteventdetails(eventid));
        return "updateevent";
    }

    @PostMapping("/update")
    public String updateEventDetails(@ModelAttribute("event") eventdetails event) {
        eventService.updateevent(event);
        return "redirect:/eventdetails";
    }

    @GetMapping("/delete/{eventid}")
    public String deleteEventDetails(@PathVariable("eventid") String eventid) {
        eventService.deleteevent(eventid);
        return "redirect:/eventdetails";
    }

    @GetMapping
    public String getAllEventDetails(Model model) {
        model.addAttribute("events", eventService.getalleventdetails());
        return "alleventdetails";
    }
}
