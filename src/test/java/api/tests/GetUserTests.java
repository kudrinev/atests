package api.tests;

import api.BaseApiTests;
import api.responseModel.userResponse.UserResponse;
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
    //todo Вынести в отдельный класс(ы) тело ответов апи и сравнивать с ними
    @Test
    @DisplayName("Проверка тела ответа")
    public void getUserResponseBody() {

        int ID = 2;
        String EMAIL = "janet.weaver@reqres.in";
        String FIRST_NAME = "Janet";
        String LAST_NAME = "Weaver";
        String AVATAR = "https://reqres.in/img/faces/2-image.jpg";
        String URL = "https://reqres.in/#support-heading";
        String TEXT = "To keep ReqRes free, contributions towards server costs are appreciated!";


        //todo написать ещё тестов



        UserResponse response = given()
                .when()
                .get("/api/users/2")
                .then()
                .log().all()
                .extract().as(UserResponse.class);

        Assertions.assertEquals((int) response.data().id(), ID);
        Assertions.assertEquals(response.data().email(), EMAIL);
        Assertions.assertEquals(response.data().firstName(), FIRST_NAME);
        Assertions.assertEquals(response.data().lastName(), LAST_NAME);
        Assertions.assertEquals(response.data().avatar(), AVATAR);
        Assertions.assertEquals(response.support().url(), URL);
        Assertions.assertEquals(response.support().text(), TEXT);
    }



}
