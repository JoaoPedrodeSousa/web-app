package com.example.WepApplication.model.resources;

import com.example.WepApplication.model.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> find() {
        User user = new User(null, "Jose luis", "luidrocha@gmail.com", "21-99254-2563", "Brasil2020");
        return ResponseEntity.ok().body(user);
    }
}
