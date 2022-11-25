/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package appusoselector;

import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import selectordeslizamiento.SelectorDeslizamiento;

/**
 *
 * @author usuario
 */
public class APPUsoSelector extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        
        Label selectores = new Label("Selectores");
        selectores.setId("selectores");
        SelectorDeslizamiento selectorArriba = new SelectorDeslizamiento();
        SelectorDeslizamiento selectorAbajo = new SelectorDeslizamiento();
        Label pulsado = new Label();
        pulsado.setId("pulsado");
        ArrayList<String> items = new ArrayList<>();
        Collections.addAll(items, "1","2","3","4","5", "6", "7", "8", "9", "10");
        items.addAll(items);
        selectorArriba.setItems(items);
        selectorAbajo.setItems(items);
        
        
        selectorArriba.setOnAction(e -> pulsado.setText("Pulsado el selector de arriba"));
        selectorAbajo.setOnAction(e -> pulsado.setText("Pulsado el selector de abajo"));
        
        root.getChildren().addAll(selectores, selectorArriba, selectorAbajo, pulsado);
        root.getStylesheets().add("styles/style.css");
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
