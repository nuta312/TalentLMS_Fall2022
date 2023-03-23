package com.talentLMS.API.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class UserRequestBody {
    @JsonProperty("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String firstName;
    @JsonProperty("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String lastName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String login;
    @JsonProperty("deleted_by_user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String deleteBbyUserId;
    @JsonProperty("user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String userId;

    public UserRequestBody(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.login = user.getLogin();
        this.userId = user.getId();
    }
}
