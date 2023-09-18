package api.tests;

import api.BaseApiTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetUserTests extends BaseApiTests {

    @Test
    @DisplayName("GET /users. Проверка кода ответа")
    public void getUsersSuccessCode() {
        given()
                .when()
                .get("api/users?page=2")
                .then()
                .log().all()
                .statusCode(200);
    }


    @Test
    @DisplayName("GET /users.") //todo написать ещё тест
    public void getUsers() {

    }

}
