/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1tic;
import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Elliott
 */
public class SmallBoard extends GridPane {
    private int xVal;
    private int yVal;
    
    public SmallBoard(int x, int y){
        GridPane grid = new GridPane();
        this.xVal =x;
        this.yVal = y;
        
        
        for(int i =0;i<3;i++){
           
            for(int j = 0;j<3;j++){
                int[] iArray = {0,1,2};
                Tile til = new Tile(i,j,x,y);
               
               Tile[][] tilArray= new Tile[3][3];
               tilArray[i][j]= til;
               tilArray[i][j].setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("Board: ("+ x+ ", "+ y+ ") Tile: ("+ til.getX()+", "+til.getY()+")");

            }
            
               });
        
               
                grid.add(til, i, j);
            }
        }
        getChildren().add(grid);
    }
   
    
    public void setState(){
        
    }
}
