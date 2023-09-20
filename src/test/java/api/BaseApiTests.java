package api;

import org.junit.jupiter.api.BeforeAll;

public class BaseApiTests {
//todo написать ui тесты
    @BeforeAll
    public static void baseApi() {
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecification());
    }
}
