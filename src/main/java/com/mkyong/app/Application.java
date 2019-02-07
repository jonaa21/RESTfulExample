package com.mkyong.app;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.mkyong.Country;
import com.mkyong.CountrySet;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {


    public static void main(String[] args) throws IOException {
            toJSON();
    }

    private static void toJSON(){
        ObjectMapper mapper = new ObjectMapper();

        try {
//            File json = new File("../countries.json");
            CountrySet[] country = mapper.readValue(new URL("https://restcountries.eu/rest/v2/all"), CountrySet[].class);
            System.out.println("Java object created from JSON String :");
            System.out.println(country);

        } catch (JsonGenerationException ex) {
            ex.printStackTrace();
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }
}
