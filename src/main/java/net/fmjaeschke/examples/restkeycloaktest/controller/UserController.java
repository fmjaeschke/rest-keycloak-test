package net.fmjaeschke.examples.restkeycloaktest.controller;


import net.fmjaeschke.examples.restkeycloaktest.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping("me")
    public ResponseEntity<UserDto> getMe() {
        return ResponseEntity.ok(new UserDto(1L, "janedoe", "Doe", "Jane", "jane.doe@fmjaeschke.net"));
    }
}
