package com.talentLMS.API.request;

import com.talentLMS.UI.dataProviders.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public abstract class ApiRequest {
    //    String url = "https://{{domain}}/api/v1/branches";
    protected String URL;
    protected Map<String, String> headers;
    public Response response;
    protected RequestSpecification specification;

    public ApiRequest(String url, Map<String, String> headers) {
        this.headers = headers;
        this.URL = url;
        specification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(this.URL)
                .setAccept(ContentType.JSON)
                .addHeaders(this.headers)
                .build();
        specification.log();
    }

    public static final String SLASH = "/";

    public static String getEndpoint(String... args) {
        StringBuilder endPoint = new StringBuilder();
        for (String arg : args) {
            endPoint.append(arg).append(SLASH);
        }
        return endPoint.substring(0, endPoint.length() - 1);
    }

    public Response get(String endPoint) {
        System.out.printf("Performing get %s", endPoint);
        return this.response = RestAssured.given()
                .spec(this.specification)
                .auth()
                .basic(ConfigReader.getProperty("apiKey"), "")
                .get(endPoint);
    }

    public Response post(String endPoint, String body) {
        return this.response = RestAssured.given()
                .auth()
                .basic(ConfigReader.getProperty("apiKey"), "")
                .spec(specification)
                .body(body)
                .post();
    }

    public Response delete(String endPoint) {
        return this.response = RestAssured.given()
                .spec(specification)
                .delete();
    }

    public Response put(String endPoint, String body) {
        return this.response = RestAssured.given()
                .spec(specification)
                .body(body)
                .put();
    }

    public Response patch(String endPoint, String body) {
        return this.response = RestAssured.given()
                .spec(specification)
                .body(body)
                .patch();
    }

}
