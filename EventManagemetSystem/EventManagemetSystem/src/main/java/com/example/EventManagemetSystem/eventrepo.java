package com.example.EventManagemetSystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface eventrepo extends JpaRepository<eventdetails, String> {
    
} 
