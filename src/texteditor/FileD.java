/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

import java.io.File;
import java.io.FileWriter;
import javafx.scene.control.Menu;
/**
 *
 * @author gaurav
 */
public class FileD {
    public Menu save = new Menu("Save");
    public Menu open = new Menu("Open");
    public void fileread(String content ,File fil){
try{
    FileWriter fw = new FileWriter(fil);
    fw.write(content);
    fw.close();
}catch(Exception e){
    System.out.println("Cant save");
}
    }
    
}
