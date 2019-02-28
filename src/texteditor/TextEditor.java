/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author gaurav
 */
public class TextEditor extends Application {
    public Scene scene;
    public Stage primaryStage;
    @Override
    public void start(Stage primaryStage) {
        About ab = new About();
        Edit ed = new Edit();
        FileD fd = new FileD();
 MenuBar mb = new MenuBar();
 Menu file = new Menu("File");
 file.getItems().addAll(fd.save,fd.open);
 Menu edit = new Menu("Edit");
 ed.font();
 
 edit.getItems().addAll(ed.Font,ed.color,ed.caps);
 Menu about = new Menu("About");
 Menu about2 = new Menu("About");
about.getItems().addAll(about2);
about2.setOnAction(e->{
    ab.about();
    ab.primaryStag.initModality(Modality.APPLICATION_MODAL);
    ab.primaryStag.showAndWait();
});
 TextArea mainText = new TextArea();
 mainText.setId("small");
 mainText.setPrefSize(700,800);
 ed.Sizesmall.setOnAction(e->{
     mainText.setId("small");
 });
 ed.Sizemedium.setOnAction(e ->{
     mainText.setId("medium");
 });
 ed.Sizelarge.setOnAction(e ->{
     mainText.setId("large");
 });
ed.red.setOnAction(e->{mainText.setStyle("-fx-text-fill:red");});
ed.black.setOnAction(e->{mainText.setStyle("-fx-text-fill:black");});
ed.Blue.setOnAction(e->{mainText.setStyle("-fx-text-fill:blue");});
ed.green.setOnAction(e->{mainText.setStyle("-fx-text-fill:green");});
 mb.getMenus().addAll(file,edit,about);
 fd.save.setOnAction(e->{
     FileChooser fc = new FileChooser();
     fc.setTitle("Save File");
     fc.setSelectedExtensionFilter(new FileChooser.ExtensionFilter("Text file", "*.txt"));
     fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("TextFile", "*.txt"),new FileChooser.ExtensionFilter("Any File", "*.*"));
     File fil = fc.showSaveDialog(primaryStage);
     if(fil!=null){
         fd.fileread(mainText.getText(), fil);
     }
 });
 fd.open.setOnAction(e ->{
     FileChooser fc = new FileChooser();
     fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("TextFile", "*.txt"),new FileChooser.ExtensionFilter("Any File", "*.*"));
     File fi = fc.showOpenDialog(primaryStage);
            try {
              Scanner sc = new Scanner(fi);
                String filk = sc.nextLine();
                while(sc.hasNext()){
                    filk = filk +"\n"+ sc.nextLine();
                }
                mainText.setText(filk);
            } catch (FileNotFoundException ex) {
                
            } catch (IOException ex) {
                
                System.out.println("error"+e.toString());
            }
 });
 ed.Cap.setOnAction(e ->{
     String string = mainText.getText().toUpperCase();
     mainText.setText(string);
 });
 ed.low.setOnAction(e ->{
     String string =mainText.getText().toLowerCase();
     mainText.setText(string);
 });
 VBox root = new VBox();
 root.getChildren().addAll(mb,mainText);
  scene = new Scene(root,700,700);
  scene.getStylesheets().add(getClass().getResource("css.css").toExternalForm());
 primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Gaurav's Notepad");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
  
}
