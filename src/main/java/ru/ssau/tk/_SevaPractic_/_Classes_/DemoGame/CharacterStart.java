package ru.ssau.tk._SevaPractic_._Classes_.DemoGame;

import java.util.Scanner;
public class CharacterStart {
    public static void main(String[] args){
        String Name, choice, choice1 = "power" , choice2 = "intelligence", choice3 = "agility";
        int power = 0, intel = 0, agility = 0, points = 6;
        Scanner in = new Scanner(System.in);
        System.out.println("Please write your name");
        Name = in.nextLine();
        System.out.println("Your name is:");
        System.out.println(Name);
        System.out.println("Please set your stats");
        for (points = 6; points > 0; ) {   //распределяет очки по трём характеристикам
            System.out.print("points:  ");
            System.out.println(points);
            System.out.print("power:  ");
            System.out.println(power);
            System.out.print("intelligence:  ");
            System.out.println(intel);
            System.out.print("agility:  ");
            System.out.println(agility);
            choice = in.nextLine();
            if (choice.equals(choice1)){
                power++;
                points--;
            }
            if (choice.equals(choice2)){
                intel++;
                points--;
            }
            if (choice.equals(choice3)){
                agility++;
                points--;
            }
        }

        String head1 = "(^_^)", head2 = " (._.)", head3 = "(^ . ^)", body1 = " |(|)| ", body2 = "|(||)|", body3 = "|(.)|", legs1 = "_||_", legs2 = " .||.", legs3 = " ,||,";
        System.out.println("Choose your look");     //выбор внешности персонажа
        System.out.print(head1);
        System.out.print(" ");
        System.out.print(head2);
        System.out.print(" ");
        System.out.print(head3);
        System.out.println(" ");
        System.out.print(body1);
        System.out.print(" ");
        System.out.print(body2);
        System.out.print(" ");
        System.out.print(body3);
        System.out.println(" ");
        System.out.print(legs1);
        System.out.print(" ");
        System.out.print(legs2);
        System.out.print(" ");
        System.out.print(legs3);
        System.out.println(" ");
        System.out.println("Choose your head");
        int h1 = 1, h2 = 2, h3 = 3, b1 = 1, b2 = 2, b3 = 3, l1 = 1, l2 = 2, l3 = 3, h, b, l;
        h = in.nextInt();
        if (h == 1){
            System.out.println(head1);
        }
        if (h == 2){
            System.out.println(head2);
        }
        if (h == 3){
            System.out.println(head3);
        }

        System.out.println("Choose your body");
        b = in.nextInt();
        if (b == 1){
            System.out.println(body1);
        }
        if (b == 2){
            System.out.println(body2);
        }
        if (b == 3){
            System.out.println(body3);
        }

        System.out.println("Choose your legs");
        l = in.nextInt();
        if (l == 1){
            System.out.println(legs1);
        }
        if (l == 2){
            System.out.println(legs2);
        }
        if (l == 3){
            System.out.println(legs3);
        }

        System.out.println("Your body is");
        if (h == 1){
            System.out.println(head1);
        }
        if (h == 2){
            System.out.println(head2);
        }
        if (h == 3){
            System.out.println(head3);
        }


        if (b == 1){
            System.out.println(body1);
        }
        if (b == 2){
            System.out.println(body2);
        }
        if (b == 3){
            System.out.println(body3);
        }


        if (l == 1){
            System.out.println(legs1);
        }
        if (l == 2){
            System.out.println(legs2);
        }
        if (l == 3){
            System.out.println(legs3);
        }

    }
}