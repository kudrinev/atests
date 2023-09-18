package api;

import org.junit.jupiter.api.BeforeAll;

public class BaseApiTests {

    @BeforeAll
    public static void baseApi() {
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecification());
    }
}
