/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sobczak.lukasz.spttest.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import pl.sobczak.lukasz.spttest.httpClient.HttpClientService;
import pl.sobczak.lukasz.spttest.httpClient.Url;

/**
 *
 * @author piko
 */
public class SWCharacterPageTest {
    
    HttpClientService httpService;
    Gson gson = new GsonBuilder().create();
    
    public SWCharacterPageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
      
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of toString method, of class SWCharacterPage.
     */
    @Test
    public void testToString() {
    }
    
    @Test
    public void oneCharacter(){
    /*
    MockitoAnnotations.initMocks(this);
    httpService = mock(HttpClientService.class);
    String jsonForSkywalker = "{\"count\":3,\"next\":null,\"previous\":null,\"results\":[{\"name\":\"Luke Skywalker\",\"height\":\"172\",\"mass\":\"77\",\"hair_color\":\"blond\",\"skin_color\":\"fair\",\"eye_color\":\"blue\",\"birth_year\":\"19BBY\",\"gender\":\"male\",\"homeworld\":\"https://swapi.co/api/planets/1/\",\"films\":[\"https://swapi.co/api/films/2/\",\"https://swapi.co/api/films/6/\",\"https://swapi.co/api/films/3/\",\"https://swapi.co/api/films/1/\",\"https://swapi.co/api/films/7/\"],\"species\":[\"https://swapi.co/api/species/1/\"],\"vehicles\":[\"https://swapi.co/api/vehicles/14/\",\"https://swapi.co/api/vehicles/30/\"],\"starships\":[\"https://swapi.co/api/starships/12/\",\"https://swapi.co/api/starships/22/\"],\"created\":\"2014-12-09T13:50:51.644000Z\",\"edited\":\"2014-12-20T21:17:56.891000Z\",\"url\":\"https://swapi.co/api/people/1/\"},{\"name\":\"Anakin Skywalker\",\"height\":\"188\",\"mass\":\"84\",\"hair_color\":\"blond\",\"skin_color\":\"fair\",\"eye_color\":\"blue\",\"birth_year\":\"41.9BBY\",\"gender\":\"male\",\"homeworld\":\"https://swapi.co/api/planets/1/\",\"films\":[\"https://swapi.co/api/films/5/\",\"https://swapi.co/api/films/4/\",\"https://swapi.co/api/films/6/\"],\"species\":[\"https://swapi.co/api/species/1/\"],\"vehicles\":[\"https://swapi.co/api/vehicles/44/\",\"https://swapi.co/api/vehicles/46/\"],\"starships\":[\"https://swapi.co/api/starships/59/\",\"https://swapi.co/api/starships/65/\",\"https://swapi.co/api/starships/39/\"],\"created\":\"2014-12-10T16:20:44.310000Z\",\"edited\":\"2014-12-20T21:17:50.327000Z\",\"url\":\"https://swapi.co/api/people/11/\"},{\"name\":\"Shmi Skywalker\",\"height\":\"163\",\"mass\":\"unknown\",\"hair_color\":\"black\",\"skin_color\":\"fair\",\"eye_color\":\"brown\",\"birth_year\":\"72BBY\",\"gender\":\"female\",\"homeworld\":\"https://swapi.co/api/planets/1/\",\"films\":[\"https://swapi.co/api/films/5/\",\"https://swapi.co/api/films/4/\"],\"species\":[\"https://swapi.co/api/species/1/\"],\"vehicles\":[],\"starships\":[],\"created\":\"2014-12-19T17:57:41.191000Z\",\"edited\":\"2014-12-20T21:17:50.401000Z\",\"url\":\"https://swapi.co/api/people/43/\"}]}";
    SWCharacterPage pg = gson.fromJson(jsonForSkywalker, SWCharacterPage.class);
    System.out.println(httpService);
        System.out.println(pg);
    Mockito.when(httpService.getResponsePage(any(String.class),SWCharacterPage.class)).thenReturn(pg);
    var SWCtst = new SWCharacterPage(Url.PEOPLE, "Skywalker", httpService);
        System.out.println(SWCtst);
     */
    }

    /**
     * Test of Validate method, of class SWCharacterPage.
     */
    @Test
    public void testValidate() {
    }

    /**
     * Test of getFilmsReferences method, of class SWCharacterPage.
     */
    @Test
    public void testGetFilmsReferences() {
    }
    
}
