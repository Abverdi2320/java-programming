package day55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
        Grid grid = new Grid();
        for(int col=0;col<grid.getWd();col++){
            for(int row=0;row<grid.getHt();row++){
                if(row<grid.getHt()/3 ){
                    grid.setColor(row, col, Color.BLUE);
                }else if(row<grid.getHt()/3*2){
                    grid.setColor(row, col, Color.RED);
                }else{
                    grid.setColor(row, col, Color.GREEN);
                }
            }
        }

        }
}
