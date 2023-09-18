package api.tests;

import api.BaseApiTests;
import api.requestModel.postRegister.RegisterRequest;
import api.responseModel.postRegisterResponse.RegisterResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostRegisterTests extends BaseApiTests {

    //todo перенести генератор запроса из класса
    //todo разобраться с softAssert
    @Test
    public void postRegisterSuccessCode() {
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        RegisterRequest request = generatepostRegisterRequest();


        RegisterResponse response = given()
                .body(request)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(RegisterResponse.class);
        Assertions.assertEquals(response.id(), id);
        Assertions.assertEquals(response.token(), token);
    }


    private static RegisterRequest generatepostRegisterRequest() {

        new RegisterRequest();
        return RegisterRequest
                .builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();

    }

}
