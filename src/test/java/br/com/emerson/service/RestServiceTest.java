package br.com.emerson.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.ws.rs.core.Response;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.emerson.model.InfoSystem;

public class RestServiceTest {

    private static RestService restService;

    @BeforeClass
    public static void init() {
        InfoSystem infoSystem = new InfoSystem();
        restService = new DefaultRestService(infoSystem);
    }

    @Test
    public void helloTest() {
        assertEquals("Hello system!!!", restService.hello());
    }

    @Test
    public void notHelloTest() {
        assertNotEquals("Hello", restService.hello());
    }

    @Test
    public void getInfos() {
        Response response = restService.getInfos();
        assertEquals(response.getStatus(), 200);
    }

    @Test
    public void noGetInfos() {
        Response response = restService.getInfos();
        assertNotEquals(response.getStatus(), 201);
    }

    @Test(expected=Exception.class)
    public void getInfosException() {
        RestService mockRestService = mock(DefaultRestService.class);
        when(mockRestService.getInfos()).thenThrow(new Exception());
        mockRestService.getInfos();
    }

}
