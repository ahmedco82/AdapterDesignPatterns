package com.ahmedco.adapter.example4;



public class AppleAdapter extends Apple{

    private Orange orange;
    private Apple apple;
    public AppleAdapter(Orange orange){
        this.orange = orange;
    }

    public void getAColor(String str){
        orange.getOColor(str);
    }
}