package api.responseModel.usersResponse;

import java.util.List;

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
public class UsersResponse{

    @JsonProperty("per_page")
    private Integer perPage;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("data")
    private List<DataItem> data;

    @JsonProperty("page")
    private Integer page;

    @JsonProperty("total_pages")
    private Integer totalPages;

    @JsonProperty("support")
    private Support support;

    public Integer getPerPage(){
        return perPage;
    }

    public Integer getTotal(){
        return total;
    }

    public List<DataItem> getData(){
        return data;
    }

    public Integer getPage(){
        return page;
    }

    public Integer getTotalPages(){
        return totalPages;
    }

    public Support getSupport(){
        return support;
    }
}