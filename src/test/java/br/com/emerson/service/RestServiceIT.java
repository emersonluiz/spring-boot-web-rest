package br.com.emerson.service;

import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.jayway.restassured.http.ContentType;

public class RestServiceIT extends TestParent {

    @Test
    public void hello() {
        expect().
        log().all().
        statusCode(200).
        body(containsString("Hello system!!!")).
        when().
        get(serverPath);
    }

    @Test
    public void getInfosTest() {
        expect().
        log().all().
        statusCode(200).
        contentType(ContentType.JSON).
        body("name", equalTo("spring-boot-web-rest")).
        when().
        get(serverPath + "/info");
    }

}
