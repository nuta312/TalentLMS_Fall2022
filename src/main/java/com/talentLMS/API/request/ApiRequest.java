package com.talentLMS.API.request;

import com.talentLMS.UI.dataProviders.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

import static com.talentLMS.API.talentLmsApi.EndPoints.API;
import static com.talentLMS.API.talentLmsApi.EndPoints.V1;

@Slf4j
@Data
public abstract class ApiRequest {
    protected String URL;
    protected Map<String, String> headers;
    public Response response;
    protected RequestSpecification specification;

    public ApiRequest(String url, Map<String, String> headers) {
        this.headers = headers;
        this.URL = url;
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName(ConfigReader.getProperty("apiKey"));
        specification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAuth(authScheme)
                .setBaseUri(this.URL)
                .setAccept(ContentType.JSON)
                .addHeaders(this.headers)
                .build();
        specification.log();
    }

    public static final String SLASH = "/";
    protected static String[] DEFAULT_ENDPOINTS = {API, V1};

    public static String getEndpoint(String... args) {
        StringBuilder endPoint = new StringBuilder();
        for (String arg : args) {
            endPoint.append(arg).append(SLASH);
        }
        return endPoint.substring(0, endPoint.length() - 1);
    }

    public static String formatParameters(HashMap<String, String> parameters) {
        StringBuilder query = new StringBuilder("?");
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            query.append(entry.getKey() + "=" + entry.getValue() + "&");
        }
        return query.deleteCharAt(query.length() - 1).toString();
    }

    public ApiRequest logResponse() {
        log.warn("Response is:");
        log.warn(getResponse().getBody().asString());
        log.warn(String.valueOf(getResponse().getStatusCode()));
        return this;
    }

    public Response get(String endPoint) {
        log.info("Perform get request: {}", endPoint);
        this.response = RestAssured.given()
                .spec(this.specification)
                .get(endPoint);
        logResponse();
        return this.response;
    }

    public Response post(String endPoint, String body) {
        log.info("Perform post request: {}", endPoint);
        log.info("Body is: {}", body);
        this.response = RestAssured.given()
                .spec(specification)
                .body(body)
                .post(endPoint);
        logResponse();
        return this.response;
    }

    public Response delete(String endPoint) {
        log.info("Perform delete request: {}", endPoint);
        this.response = RestAssured.given()
                .spec(specification)
                .delete(endPoint);
        logResponse();
        return this.response;
    }

    public Response delete(String endPoint, String body) {
        log.info("Perform delete request: {}", endPoint);
        log.info("Body is: {}", body);
        this.response = RestAssured.given()
                .spec(specification)
                .body(body)
                .delete(endPoint);
        logResponse();
        return this.response;
    }

    public Response put(String endPoint, String body) {
        log.info("Perform put request: {}", endPoint);
        log.info("Body is: {}", body);
        this.response = RestAssured.given()
                .spec(specification)
                .body(body)
                .put(endPoint);
        return this.response;
    }

    public Response patch(String endPoint, String body) {
        log.info("Perform patch request: {}", endPoint);
        log.info("Body is: {}", body);
        this.response = RestAssured.given()
                .spec(specification)
                .body(body)
                .patch(endPoint);
        logResponse();
        return this.response;
    }

}
