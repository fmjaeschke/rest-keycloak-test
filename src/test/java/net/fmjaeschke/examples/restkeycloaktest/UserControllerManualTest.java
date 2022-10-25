package net.fmjaeschke.examples.restkeycloaktest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers(disabledWithoutDocker = true)
class UserControllerManualTest extends KeycloakTestContainers {

    @Test
    void givenAuthenticatedUser_whenGetMe_shouldReturnMyInfo() {
        given().header("Authorization", getJaneDoeBearer())
                .when()
                .get("/users/me")
                .then()
                .contentType("application/json")
                .body("username", equalTo("janedoe"))
                .body("lastname", equalTo("Doe"))
                .body("firstname", equalTo("Jane"))
                .body("email", equalTo("jane.doe@fmjaeschke.net"))
                .log();

    }
}