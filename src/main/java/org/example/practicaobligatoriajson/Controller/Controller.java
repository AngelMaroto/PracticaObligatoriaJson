package org.example.practicaobligatoriajson.Controller;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import org.example.practicaobligatoriajson.Model.Pelicula;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.practicaobligatoriajson.Model.Pelicula;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;



public class Controller {

    @FXML
    private TextField textFieldTitulo, textFieldFecha, textFieldGenero, textFieldDirector;
    @FXML private ListView<Pelicula> lista;
    @FXML private Button btnImportar;

    public static final ObjectMapper JSON_MAPPER = new ObjectMapper();

        @FXML
        private void onImportar() {
            ArrayList<Pelicula> peliculas;
            try {
                peliculas = JSON_MAPPER.readValue(new File("src/main/resources/datos/peliculas.json"),
                        JSON_MAPPER.getTypeFactory().constructCollectionType
                                (ArrayList.class, Pelicula.class));

                ObservableList<Pelicula> datos = FXCollections.observableArrayList(peliculas);
                lista.setItems(datos);

                lista.getSelectionModel().selectedItemProperty().addListener((obs, vieja, nueva) -> {
                    if (nueva != null) {
                        textFieldTitulo.setText(nueva.getTitulo());
                        textFieldFecha.setText(nueva.getFecha());
                        textFieldGenero.setText(nueva.getGenero());
                        textFieldDirector.setText(nueva.getDirector());
                    }
                });
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    private Pelicula p;


    public void setPelicula(Pelicula pel){
        this.p = pel;
        textFieldDirector.setText(pel.getDirector());
        textFieldFecha.setText(pel.getFecha());
        textFieldGenero.setText(pel.getGenero());
        textFieldTitulo.setText(pel.getTitulo());
    }
}