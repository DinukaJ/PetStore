package org.acme;

import com.example.petstore.Entity.PetType;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class PetTypeTest {

    PetType petType = new PetType();

	@Test
    public void testPetTypeEndpoint() {
        given()
          .when().get("/pettypes")
          .then()
             .statusCode(200);

        petType.setName("Dog");
        petType.setStatus(1);
        given()
                .contentType(ContentType.JSON)
                .body(petType)
                .when().post("/pettypes")
                .then()
                .statusCode(200);

        petType.setName("Dog Update");
        petType.setIdPetType(3);
        given()
                .contentType(ContentType.JSON)
                .body(petType)
                .when().put("/pettypes")
                .then()
                .statusCode(200);

        given()
                .when().delete("/pettypes/3")
                .then()
                .statusCode(200);

    }

}