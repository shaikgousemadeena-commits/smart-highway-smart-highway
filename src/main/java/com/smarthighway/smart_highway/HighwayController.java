
package com.smarthighway.smart_highway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.List;

@RestController
public class HighwayController {

    @GetMapping("/api/health")
    public Map<String, String> health() {
        return Map.of(
            "project", "Smart Highway Travel Assistant",
            "status", "Running"
        );
    }

    @GetMapping("/api/facilities")
    public List<Map<String, String>> facilities() {
        return List.of(
            Map.of("name", "Fuel Station", "type", "Fuel"),
            Map.of("name", "EV Charging Point", "type", "EV"),
            Map.of("name", "Hospital", "type", "Emergency"),
            Map.of("name", "Vehicle Repair", "type", "Service")
        );
    }
}
