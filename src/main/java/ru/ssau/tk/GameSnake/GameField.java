package ru.ssau.tk.GameSnake;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class GameField extends JPanel implements ActionListener{
    private final int SIZE_X = 1400;
    private final int SIZE_Y = 850;
    private final int DOT_SIZE = 50;
    private final int ALL_DOTS_X = 24;
    private final int ALL_DOTS_Y = 17;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS_X * 17];
    private int[] y = new int[ALL_DOTS_Y * 24];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;
    public final JButton restart = new JButton("Restart");


    public GameField(){
        setBackground(Color.DARK_GRAY);
        loadImages();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
    }

    public void initGame(){
        dots = 3;
        for (int i = 0; i < dots; i++) {
            x[i] = 50 - i*DOT_SIZE;
            y[i] = 50;
        }
        timer = new Timer(250,this);
        timer.start();
        createApple();
    }

    public void createApple(){
        appleX = new Random().nextInt(22)*DOT_SIZE;
        appleY = new Random().nextInt(15)*DOT_SIZE;
    }

    public void loadImages(){
        ImageIcon iia = new ImageIcon("Images/Beer.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("Images/Snake.png");
        dot = iid.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(inGame){
            g.drawImage(apple,appleX,appleY,this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot,x[i],y[i],this);
            }
        } else{
            String str = "Game Over";
            //Font f = new Font("Arial",14,Font.BOLD);
            g.setColor(Color.white);
            //g.setFont(f);
            g.drawString(str,SIZE_X/2,SIZE_Y/2);
        }
    }


    public void move(){
        for (int i = dots; i > 0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        if(left){
            x[0] -= DOT_SIZE;
        }
        if(right){
            x[0] += DOT_SIZE;
        } if(up){
            y[0] -= DOT_SIZE;
        } if(down){
            y[0] += DOT_SIZE;
        }
    }

    public void checkApple(){
        if(x[0] == appleX && y[0] == appleY){
            dots++;
            createApple();
        }
    }

    public void checkCollisions(){
        for (int i = dots; i >0 ; i--) {
            if(i>4 && x[0] == x[i] && y[0] == y[i]){
                inGame = false;
            }
        }

        if(x[0]>SIZE_X){
            inGame = false;
        }
        if(x[0]<20){
            inGame = false;
        }
        if(y[0]>SIZE_Y - 100){
            inGame = false;
        }
        if(y[0]<50){
            inGame = false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(inGame){
            checkApple();
            checkCollisions();
            move();
            repaint();
        }else {
        if(inGame == false) {
            timer.stop();
            JDialog dialog = new JDialog();
            dialog.setBounds(400, 400, 300, 200);
            dialog.setBackground(Color.DARK_GRAY);
            dialog.setLayout(new FlowLayout());
            ActionListener actionListener = new TestActionListener(); // создаём создаём действие
            // назначаем этот обработчик кнопке
            restart.addActionListener(actionListener);
            restart.setBackground(Color.white);
            dialog.add(restart);
            dialog.setVisible(true);
            }
        }
    }



    class FieldKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_LEFT && !right){
                left = true;
                up = false;
                down = false;
            }
            if(key == KeyEvent.VK_RIGHT && !left){
                right = true;
                up = false;
                down = false;
            }

            if(key == KeyEvent.VK_UP && !down){
                right = false;
                up = true;
                left = false;
            }
            if(key == KeyEvent.VK_DOWN && !up){
                right = false;
                down = true;
                left = false;
            }
        }
    }

    class TestActionListener implements ActionListener { // наследуемся от стандартного класса  ActionListener
        public void actionPerformed(ActionEvent e) {
            new MainWindow();
        }
    }

}