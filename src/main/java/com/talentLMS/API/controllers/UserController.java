package com.talentLMS.API.controllers;

import com.talentLMS.API.pojo.User;
import com.talentLMS.API.pojo.UserRequestBody;
import com.talentLMS.API.request.ApiRequest;
import com.talentLMS.API.utils.JsonUtils;
import io.restassured.response.Response;

import java.util.HashMap;

import static com.talentLMS.API.talentLmsApi.EndPoints.*;

public class UserController extends ApiRequest {

    public UserController(String url) {
        super(url, BASE_HEADERS);
    }

    public Response getUsers() {
        return this.response = super.get(getEndpoint(API, V1, USERS));
    }

    public Response createUser(String requestBody) {
        return this.response = super.post(getEndpoint(API, V1, USERS), requestBody);
    }

    public Response getUserBy(String by, String value) {
        HashMap<String, String> entry = new HashMap();
        entry.put(by, value);
        return this.response = super.get(getEndpoint(API, V1, USERS, formatParameters(entry)));
    }

    public Response createUser(User user) {
        UserRequestBody userRequestBody = new UserRequestBody(user);
        return this.response = super.post(getEndpoint(API, V1, USER_SIGNUP), JsonUtils.convertObjectToJson(userRequestBody));
    }

    public Response deleteUser(String userId) {
        UserRequestBody userRequestBody = new UserRequestBody();
        userRequestBody.setUserId(userId);
        userRequestBody.setDeleteBbyUserId("1");
        return this.response = super.delete(getEndpoint(API, V1, DELETE_USER), JsonUtils.convertObjectToJson(userRequestBody));
    }
}
