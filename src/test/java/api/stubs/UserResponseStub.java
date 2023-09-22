package api.stubs;

public class UserResponseStub {

    private static final int ID = 2;
    private static final String EMAIL = "janet.weaver@reqres.in";
    private static final String FIRST_NAME = "Janet";
    private static final String LAST_NAME = "Weaver";
    private static final String AVATAR = "https://reqres.in/img/faces/2-image.jpg";
    private static final String URL = "https://reqres.in/#support-heading";
    private static final String TEXT = "To keep ReqRes free, contributions towards server costs are appreciated!";


    public static int getId() {
        return UserResponseStub.ID;
    }

    public static String getEmail() {
        return UserResponseStub.EMAIL;
    }

    public static String getFirstName() {
        return UserResponseStub.FIRST_NAME;
    }

    public static String getLastName() {
        return UserResponseStub.LAST_NAME;
    }

    public static String getAvatar() {
        return UserResponseStub.AVATAR;
    }

    public static String getUrl() {
        return UserResponseStub.URL;
    }

    public static String getText() {
        return UserResponseStub.TEXT;
    }

}
