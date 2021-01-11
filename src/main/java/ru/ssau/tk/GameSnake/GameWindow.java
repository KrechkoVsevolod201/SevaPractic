package ru.ssau.tk.GameSnake;

import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1480,850);
        setLocation(-5,0);
        add(new GameField());
        setVisible(true);

    }



    public static void main(String[] args){
        GameWindow start = new GameWindow();
        Sound.playSound("Images/Music.wav").join();
    }
}
