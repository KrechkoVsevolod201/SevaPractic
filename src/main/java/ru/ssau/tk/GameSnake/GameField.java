package ru.ssau.tk.GameSnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GameField extends JPanel implements ActionListener {
    private final int SIZE_X = 1400;
    private final int SIZE_Y = 850;
    private final int DOT_SIZE = 50;
    private final int ALL_DOTS_X = 28;
    private final int ALL_DOTS_Y = 17;
    private Image dot;
    private Image Beer;
    private Image topLine;
    private int BeerX;
    private int BeerY;
    private int[] TopLineX = new int[10];
    private int[] x = new int[ALL_DOTS_X * 28];
    private int[] y = new int[ALL_DOTS_Y * 17];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;
    public final JButton restart = new JButton("Restart");
    private Font font = new Font("Verdana", Font.PLAIN, 28);
    private String points;
    private int point = 0;
    private final int TopLineY = 0 * DOT_SIZE;

    public GameField() {
        setBackground(Color.DARK_GRAY);
        loadImages();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
    }

    public void initGame() {
        dots = 3;
        for (int i = 0; i < dots; i++) {
            x[i] = 50 - i * DOT_SIZE;
            y[i] = 50;
        }
        timer = new Timer(200, this);
        timer.start();
        createApple();
    }

    public void createTopLine(){
    }



    public void createApple() {
        int minX = 1;
        int maxX = 27;
        int diffX = maxX - minX;
        int maxY = 16;
        int minY = 1;
        int diffY = maxY - minY;
        BeerX = new Random().nextInt(diffX) + minX;
        BeerX = BeerX * DOT_SIZE;
        BeerY = new Random().nextInt(diffY) + minX;
        BeerY = BeerY * DOT_SIZE;
    }

    public void loadImages() {
        ImageIcon iia = new ImageIcon("Images/Beer.png");
        Beer = iia.getImage();
        ImageIcon iid = new ImageIcon("Images/Snake2.png");
        dot = iid.getImage();
        ImageIcon TopLine = new ImageIcon("Images/TopLine.png");
        topLine = TopLine.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (inGame) {
            g.drawImage(Beer, BeerX, BeerY, this);
            g.drawImage(topLine, 0 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 1 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 2 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 3 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 4 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 5 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 6 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 7 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 8 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 9 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 10 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 11 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 12 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 13 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 14 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 15 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 16 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 17 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 18 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 19 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 20 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 21 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 22 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 23 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 24 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 25 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 26 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 27 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 28 * DOT_SIZE, TopLineY, this);
            g.drawImage(topLine, 29 * DOT_SIZE, TopLineY, this);

            g.drawImage(Beer, BeerX, BeerY, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 750, this);
            g.drawImage(topLine, 1 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 2 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 3 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 4 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 5 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 6 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 7 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 8 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 9 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 10 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 11 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 12 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 13 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 14 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 15 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 16 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 17 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 18 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 19 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 20 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 21 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 22 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 23 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 24 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 25 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 26 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 27 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 28 * DOT_SIZE, 800, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 800, this);

            g.drawImage(topLine, 0 * DOT_SIZE, 0 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 1 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 2 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 3 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 4 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 5 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 6 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 7 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 8 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 9 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 10 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 11 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 12 * DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 13* DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 14* DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 15* DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 16* DOT_SIZE, this);
            g.drawImage(topLine, 0 * DOT_SIZE, 17* DOT_SIZE, this);

            g.drawImage(topLine, 29 * DOT_SIZE, 0 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 1 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 2 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 3 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 4 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 5 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 6 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 7 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 8 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 9 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 10 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 11 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 12 * DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 13* DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 14* DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 15* DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 16* DOT_SIZE, this);
            g.drawImage(topLine, 29 * DOT_SIZE, 17* DOT_SIZE, this);

            for (int i = 0; i < dots; i++) {
                g.drawImage(dot, x[i], y[i], this);
            }
        } else {
            String str = "Game Over";
            g.setColor(Color.white);
            g.setFont(font);
            g.drawString(str, SIZE_X / 2, SIZE_Y / 2);
        }
    }

    public void move() {
        for (int i = dots; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        if (left) {
            x[0] -= DOT_SIZE;
        }
        if (right) {
            x[0] += DOT_SIZE;
        }
        if (up) {
            y[0] -= DOT_SIZE;
        }
        if (down) {
            y[0] += DOT_SIZE;
        }
    }

    public void checkApple() {
        if (x[0] == BeerX && y[0] == BeerY) {
            dots++;
            points = Integer.toString(point);
            point++;
            createApple();
        }
    }

    public void checkCollisions() {
        for (int i = dots; i > 0; i--) {
            if (i > 4 && x[0] == x[i] && y[0] == y[i]) {
                inGame = false;
            }
        }

        if (x[0] > SIZE_X) {
            inGame = false;
        }
        if (x[0] < 0) {
            inGame = false;
        }
        if (y[0] > SIZE_Y - 100) {
            inGame = false;
        }
        if (y[0] < 50) {
            inGame = false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            checkApple();
            checkCollisions();
            createTopLine();
            move();
            repaint();
        } else {
            if (inGame == false) {
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


    class FieldKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT && !right) {
                left = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_RIGHT && !left) {
                right = true;
                up = false;
                down = false;
            }

            if (key == KeyEvent.VK_UP && !down) {
                right = false;
                up = true;
                left = false;
            }
            if (key == KeyEvent.VK_DOWN && !up) {
                right = false;
                down = true;
                left = false;
            }
        }
    }

    class TestActionListener implements ActionListener { // наследуемся от стандартного класса  ActionListener
        public void actionPerformed(ActionEvent e) {
            new GameWindow();
        }
    }

}