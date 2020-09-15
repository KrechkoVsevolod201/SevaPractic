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
        for (points = 6; points > 0; ) {
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
    }
}
