package com.talentLMS.API.talentLmsApi;

import java.util.HashMap;
import java.util.Map;

import static org.apache.http.HttpHeaders.HOST;

public class EndPoints {
    public static final String USERS = "users";
    public static final String BRANCHES = "branches";
    public static final String CATEGORIES = "categories";
    public static final String COURSES = "courses";
    public static final String GROUPS = "groups";
    public static final String SYSTEMS = "systems";
    public static final String API = "api";
    public static final String V1 = "v1";
    public static final String EMAIL = "email";
    public static final String ID = "id";
    public static final String USER_NAME = "username";
    public static final String USER_SIGNUP = "usersignup";
    public static final String DELETE_USER = "deleteuser";
    public static Map<String, String> BASE_HEADERS = new HashMap<>() {{
        put("Cookie", "AWSALB=PnAUo8CPxucd+huT+LZW2nd3WsKDEYYLI8RgYWMf3ft8L6reuGzk1fMAIgWB1Yka6wthRd6JvjIwWSvKWvPj1gxEBhpEuq2cVEZhrxuq3IDbeFXax+iKMvW1e/oS; AWSALBCORS=PnAUo8CPxucd+huT+LZW2nd3WsKDEYYLI8RgYWMf3ft8L6reuGzk1fMAIgWB1Yka6wthRd6JvjIwWSvKWvPj1gxEBhpEuq2cVEZhrxuq3IDbeFXax+iKMvW1e/oS; PHPSESSID=elb~uml9l55p2saj9c00k4ugpvnck2");
        put(HOST, "amanzadr.talentlms.com");
        put("Cache-Control", "no-cache");
    }};
}
