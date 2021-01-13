package ru.ssau.tk.GameSnake;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class StartMenu extends JFrame
{
    Font font = new Font("Verdana", Font.PLAIN, 18);
    private static final long serialVersionUID = 1L;
    public StartMenu()
    {

        super("Интерфейсы кнопок");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Устанавливаем последовательное расположение
        Container container = getContentPane();
        container.setLayout(new FlowLayout( FlowLayout.LEADING, 0, 10));
        container.setBackground(Color.DARK_GRAY);
        JLabel topLabel = new JLabel("Хлебнуть пенного");
        topLabel.setVerticalAlignment(JLabel.TOP);
        //topLabel.setHorizontalAlignment(JLabel.CENTER);
        topLabel.setFont(font);
        topLabel.setForeground(Color.GREEN);
        container.add(topLabel);

        JLabel anotation = new JLabel("Жамкни бугурта чтобы начать");
        anotation.setVerticalAlignment(JLabel.TOP);
        //topLabel.setHorizontalAlignment(JLabel.CENTER);
        anotation.setFont(font);
        anotation.setForeground(Color.GREEN);
        container.add(anotation);

        // Кнопка со значками на все случаи жизни
        JButton button1 = new JButton();
        button1.setIcon        (new ImageIcon("images/Snake.png"));
        button1.setRolloverIcon(new ImageIcon("images/Snake2.png" ));
        button1.setPressedIcon (new ImageIcon("images/Ahegao.png"));
        button1.setDisabledIcon(new ImageIcon("images/Snake.png"));
        // Убираем все ненужные рамки и закраску
        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.setContentAreaFilled(false);
        // Подключение слушателей событий
        button1.addActionListener(new ListenerAction());
        button1.addChangeListener(new ListenerChange());
        // присоединение слушателя прямо на месте
        button1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});
        container.add(button1);

        // выводим окно на экран
        setSize(400, 350);
        setVisible(true);
    }
    class ListenerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            GameWindow start = new GameWindow();
        }
    }
    class ListenerChange implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
        }
    }
    public static void main(String[] args) {
        new StartMenu();
        Sound.playSound("Images/Music.wav").join();
    }
}