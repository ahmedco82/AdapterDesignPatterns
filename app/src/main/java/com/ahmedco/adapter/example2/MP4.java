package com.ahmedco.adapter.example2;

public class MP4 implements MediaPackage{


@Override
  public void playFile(String filename) {
    System.out.println("Playing MP4 File " + filename);
   }
}
