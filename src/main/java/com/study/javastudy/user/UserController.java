package com.study.javastudy.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<Users> getUser() {
        return userService.getUser();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/users")
    public ResponseEntity<Users> createUser(@Valid @RequestBody UserDto userDto) {

        return ResponseEntity.ok().body(userService.createUser(userDto));
    }
}
