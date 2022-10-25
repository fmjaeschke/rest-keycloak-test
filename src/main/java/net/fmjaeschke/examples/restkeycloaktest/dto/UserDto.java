package net.fmjaeschke.examples.restkeycloaktest.dto;

import lombok.Data;

@Data
public class UserDto {
    private final long id;
    private final String username;
    private final String lastname;
    private final String firstname;
    private final String email;
}
