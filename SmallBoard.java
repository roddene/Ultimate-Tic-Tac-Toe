/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1tic;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Elliott
 */
public class SmallBoard extends GridPane {

    private int xVal;
    private int yVal;
    private boolean player;

    public SmallBoard(int x, int y) {
        GridPane grid = new GridPane();
        this.xVal = x;
        this.yVal = y;

        Tile[][] tilArray = new Tile[3][3];
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                Tile til = new Tile(i, j, x, y);

                tilArray[i][j] = til;
                tilArray[i][j].setOnMouseClicked((MouseEvent event) -> {
                    System.out.println("Board: (" + x + ", " + y + ") Tile: (" + til.getX() + ", " + til.getY() + ")");
                    tilArray[til.getX()][til.getY()].setColor(player);
                    setPlayer();
                });

                grid.add(til, i, j);
            }
        }
        getChildren().add(grid);
    }

    public void setPlayer() {
        if (player == false) {
            player = true;
        } else {
            player = false;
        }
    }
}
