/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author gaurav
 */

public class About {
    public Stage primaryStag;
    public void about(){
        Label  label = new Label("Created by Gaurav sapkota");
        label.setStyle("-fx-text-fill:blue; -fx-font-size:20px;");
       Pane pane = new Pane();
       pane.getChildren().add(label);
       Scene scene = new Scene(pane,250,130);
       primaryStag = new Stage();
       primaryStag.setScene(scene);
       primaryStag.setTitle("About");
       
       
    }
}
