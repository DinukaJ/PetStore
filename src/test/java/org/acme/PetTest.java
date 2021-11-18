package org.acme;
import com.example.petstore.Entity.Pet;
import com.example.petstore.Entity.PetType;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class PetTest {

    Pet pet = new Pet();
    PetType petType = new PetType();

    @Test
    public void testPetEndpoint() {
        given()
                .when().get("/pets")
                .then()
                .statusCode(200);

        given()
                .when().get("/pets/id/1")
                .then()
                .statusCode(200);

        given()
                .when().get("/pets/name/Duke")
                .then()
                .statusCode(200);

        given()
                .when().get("/pets/age/5")
                .then()
                .statusCode(200);

        pet.setPetName("Test");
        pet.setPetAge(10);
        petType.setIdPetType(1);
        petType.setName("Dog");
        petType.setStatus(1);
        pet.setIdPetType(petType);
        given()
                .contentType(ContentType.JSON)
                .body(pet)
                .when().post("/pets")
                .then()
                .statusCode(200);

        pet.setPetName("Test Update");
        pet.setPetId(3);
        given()
                .contentType(ContentType.JSON)
                .body(pet)
                .when().put("/pets")
                .then()
                .statusCode(200);

        given()
                .when().delete("/pets/3")
                .then()
                .statusCode(200);

    }
}
