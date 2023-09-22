package api.tests;

import api.BaseApiTests;
import api.responseModel.userResponse.UserResponse;
import api.stubs.UserResponseStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetUserTests extends BaseApiTests {
    @Test
    @DisplayName("Проверка кода ответа")
    public void getUserSuccessCode() {
        given()
                .when()
                .get("/api/users/2")
                .then()
                .log().all();

    }

    //todo написать ещё тестов
    @Test
    @DisplayName("Проверка тела ответа")
    public void getUserResponseBody() {

        UserResponse response = given()
                .when()
                .get("/api/users/2")
                .then()
                .log().all()
                .extract().as(UserResponse.class);

        Assertions.assertEquals((int) response.data().id(), UserResponseStub.getId());
        Assertions.assertEquals(response.data().email(), UserResponseStub.getEmail());
        Assertions.assertEquals(response.data().firstName(), UserResponseStub.getFirstName());
        Assertions.assertEquals(response.data().lastName(), UserResponseStub.getLastName());
        Assertions.assertEquals(response.data().avatar(), UserResponseStub.getAvatar());
        Assertions.assertEquals(response.support().url(), UserResponseStub.getUrl());
        Assertions.assertEquals(response.support().text(), UserResponseStub.getText());
    }


}
