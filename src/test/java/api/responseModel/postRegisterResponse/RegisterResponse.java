package api.responseModel.postRegisterResponse;

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
public class RegisterResponse{

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("token")
    private String token;
}