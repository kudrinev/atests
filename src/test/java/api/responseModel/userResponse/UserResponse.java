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
public class UserResponse{

    @JsonProperty("data")
    private Data data;

    @JsonProperty("support")
    private Support support;

    public Data getData(){
        return data;
    }

    public Support getSupport(){
        return support;
    }
}