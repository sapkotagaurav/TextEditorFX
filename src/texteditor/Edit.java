/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

import javafx.scene.control.Menu;

/**
 *
 * @author gaurav
 */
public class Edit {
    public Menu Font = new Menu("Font Size");
    public Menu Sizesmall = new Menu("Small");
    public Menu Sizemedium = new Menu("Medium");
    public Menu Sizelarge = new Menu("Large");
    public Menu color = new Menu("Color");
    public Menu red = new Menu("Red");
    public Menu Blue = new Menu("Blue");
    public Menu green =new Menu("Green");
    public Menu black = new Menu("Black");
    public Menu Cap = new Menu("Captailized");
    public Menu low = new Menu("Small letters");
    public Menu caps = new Menu("Capitalization");
    public void font(){
        Font.getItems().addAll(Sizesmall,Sizemedium,Sizelarge);
        color.getItems().addAll(red,Blue,green,black);
        caps.getItems().addAll(Cap,low);
    }
}
