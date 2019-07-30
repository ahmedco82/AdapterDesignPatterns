package com.ahmedco.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.ahmedco.adapter.example1.EnemyAttacker;
import com.ahmedco.adapter.example1.EnemyRobot;
import com.ahmedco.adapter.example1.EnemyRobotAdapter;
import com.ahmedco.adapter.example1.EnemyTank;
import com.ahmedco.adapter.example2.FormatAdapter;
import com.ahmedco.adapter.example2.MP3;
import com.ahmedco.adapter.example2.MP4;

import com.ahmedco.adapter.example2.MediaPlayer;
import com.ahmedco.adapter.example2.MediaPackage;
import com.ahmedco.adapter.example2.VLC;
import com.ahmedco.adapter.example3.Circle;
import com.ahmedco.adapter.example3.Drawing;
import com.ahmedco.adapter.example3.Rectangle;
import com.ahmedco.adapter.example4.Apple;
import com.ahmedco.adapter.example4.AppleAdapter;
import com.ahmedco.adapter.example4.Orange;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Example2();
        // Example3();

        Example4();
    }

    private void Example4() {
        // https://www.programcreek.com/2011/09/java-design-pattern-adapter/
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        apple1.getAColor("green");
        Orange orange = new Orange();
        AppleAdapter aa = new AppleAdapter(orange);
        aa.getAColor("red");
    }




    private void Example3() {
        //https://medium.com/@ssaurel/implement-the-adapter-design-pattern-in-java-f9adb6a8828f
        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
    }


    private void Example2(){
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        // player = new FormatAdapter(new MP4());
        // player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file0909.avi");
        /*
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
        */
    }


    private void Example1(){
        //http://www.newthinktank.com/2012/09/adapter-design-pattern-tutorial/
        EnemyTank rx7Tank = new EnemyTank();
        EnemyRobot fredTheRobot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
        System.out.println("The Robot");
        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println();
        System.out.println("The Enemy Tank");
        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println();
        System.out.println("The Robot with Adapter");
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }





    // End -----------
}


