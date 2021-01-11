package ru.ssau.tk.GameSnake;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1480,850);
        setLocation(-5,0);
        add(new GameField());
        setVisible(true);

    }



    public static void main(String[] args){
        MainWindow start = new MainWindow();
        Sound.playSound("Images/Music.wav").join();
    }
}
