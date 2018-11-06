/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1tic;
import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 *
 * @author Elliott
 */
public class Tile extends Pane{
    private int xVal;
    private int yVal;
    private Rectangle rect;
    public Tile(int x, int y,int boardX, int boardY){
        
        
        this.xVal = x;
        this.yVal = y;
        rect = new Rectangle(40,40);
        rect.setFill(null);
        rect.setStroke(Color.BLACK);
        rect.setStrokeWidth(3);
        //System.out.println("Board: ("+ boardX+ ", "+ boardY+ ") Tile: ("+ x+", "+y+")");
        
        
        
        getChildren().add(rect);


        
    }
    public int getX(){
        return this.xVal;
    }
    public int getY(){
        return this.yVal;
    }
    public void setColor(boolean player){
        if(player == true){
            rect.setFill(Color.RED);
        }
        else{
            rect.setFill(Color.BLUE);
        }
    }
    
}
