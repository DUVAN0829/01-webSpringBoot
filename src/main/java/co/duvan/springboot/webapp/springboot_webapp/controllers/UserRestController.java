package co.duvan.springboot.webapp.springboot_webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.duvan.springboot.webapp.springboot_webapp.model.User;
import co.duvan.springboot.webapp.springboot_webapp.model.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details-dto")
    public UserDto detailsDto() {
        
        return new UserDto("Hello word fron UserDto", new User("Duván", "Castillo"));

    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User("Duván", "Castillo");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello word from spring boot");
        body.put("user", user);

        return body;

    }
    
}
