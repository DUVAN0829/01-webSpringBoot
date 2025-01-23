package co.duvan.springboot.webapp.springboot_webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details() {

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello world from spring boot");
        body.put("name", "Duván");
        body.put("lastname", "González");

        return body;

    }
    
}
