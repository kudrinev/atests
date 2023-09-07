package api.tests;

import api.responseModel.usersResponse.DataItem;
import com.sun.source.tree.AssertTree;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.*;

public class GetUserTests {

    private String URL = "https://reqres.in/";

    @Test
    @DisplayName("GET /user. Проверка кода ответа")
    public void getUsers() {
        List<DataItem> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + "api/users?page=2")
                .then()
                .log().all()
                .statusCode(200)
                .extract().body().jsonPath().getList("data", DataItem.class);
        System.out.println(users.toString());
        users.forEach(x -> Assertions.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assertions.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));


        List<String> avatars = users.stream().map(DataItem::getAvatar).toList();
        List<String> ids = users.stream().map(x->x.getId().toString()).toList();
        for (int i  = 0; i<avatars.size(); i++){
            Assertions.assertTrue(avatars.get(i).contains(ids.get(i)));
        }

    }
}
