package ru.ssau.tk.GameSnake;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1480,850);
        setLocation(-10,0);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args){
        MainWindow start = new MainWindow();
    }
}
