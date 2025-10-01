package org.example.practicaobligatoriajson.Controller;

import org.example.practicaobligatoriajson.Model.Pelicula;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.practicaobligatoriajson.Model.Pelicula;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;



public class Controller {

    public static final ObjectMapper JSON_MAPPER = new ObjectMapper();



        ArrayList<Pelicula> peliculas =
                null;
        try {
            peliculas = JSON_MAPPER.readValue(new File("src/main/resources/datos/peliculas.json"),
                    JSON_MAPPER.getTypeFactory().constructCollectionType
                            (ArrayList.class, Pelicula.class));

            for (Pelicula p : peliculas) {



            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }





}
