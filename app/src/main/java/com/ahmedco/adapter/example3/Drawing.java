package com.ahmedco.adapter.example3;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Drawing{
    List<Shape> shapes = new ArrayList<Shape>();

    public Drawing(){
        super();
    }
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    public List<Shape> getShapes(){
        return new ArrayList<Shape>(shapes);
    }
    public void draw(){
        if (shapes.isEmpty()){
            System.out.println(" public void draw(){\n to draw!");
        }else{
                for(int i =0 ; i<=shapes.size()-1; i++){
                    shapes.get(i).draw();
                }
        }
    }

    public void resize(){
        if (shapes.isEmpty()) {
            System.out.println("Nothing to resize!");
        } else {
            for(int i =0 ; i<=shapes.size()-1; i++){
                shapes.get(i).draw();
            }
        }
    }

}