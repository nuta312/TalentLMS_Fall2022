package com.talentLMS.API.controllers;

import com.talentLMS.API.request.ApiRequest;
import io.restassured.response.Response;

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
}
