package api.responseModel.userResponse;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Getter
@EqualsAndHashCode
@SuperBuilder
@NoArgsConstructor
@ToString
@Accessors(chain = true, fluent = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Data{

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("avatar")
    private String avatar;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("email")
    private String email;

    public String getLastName(){
        return lastName;
    }

    public Integer getId(){
        return id;
    }

    public String getAvatar(){
        return avatar;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getEmail(){
        return email;
    }
}