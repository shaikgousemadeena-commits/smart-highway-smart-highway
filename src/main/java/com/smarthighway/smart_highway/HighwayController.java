package com.smarthighway.smart_highway;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {
    "http://localhost:5173"
})
public class HighwayController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
            "project", "Smart Highway Travel Assistant",
            "status", "UP"
        );
    }

    @GetMapping("/facilities")
    public List<Map<String, String>> getFacilities() {
        return List.of(
            Map.of("name", "Fuel Station", "type", "Fuel"),
            Map.of("name", "EV Charging Point", "type", "EV"),
            Map.of("name", "Hospital", "type", "Emergency"),
            Map.of("name", "Vehicle Repair", "type", "Service")
        );
    }
}