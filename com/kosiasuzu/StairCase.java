package com.kosiasuzu;

public class StairCase {
    private String shape;
    private int height = 0;
    private int width = 0;

    StairCase(String shape){
        this.shape = shape;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public void drawStairs(){
        for(int i = 1; i <= this.height; i++){
            for(int j = 1; j <= i * this.width; j ++){
                System.out.print(this.shape);
            }
            System.out.println();
        }
    }
}
