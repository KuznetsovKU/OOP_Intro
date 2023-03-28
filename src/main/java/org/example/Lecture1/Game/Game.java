package org.example.Lecture1.Game;

import org.example.Lecture1.Game.model.Magician;
import org.example.Lecture1.Game.model.Priest;

public class Game {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        Priest hero2 = new Priest("H2");
        System.out.println(hero1.getName());
        System.out.println(hero1);
        System.out.println(hero2);
        hero1.attack(hero2);
        System.out.println(hero1);
        System.out.println(hero2);
        hero1.attack(hero2);
        System.out.println(hero1);
        System.out.println(hero2);
        hero1.attack(hero2);
        System.out.println(hero1);
        System.out.println(hero2);
        hero1.attack(hero2);
        System.out.println(hero1);
        System.out.println(hero2);
        hero1.attack(hero2);
        System.out.println(hero1);
        System.out.println(hero2);
        hero1.attack(hero2);
        System.out.println(hero1);
        System.out.println(hero2);
//        HeroBase mag1 = new Magician();
//        System.out.println(mag1);
//        System.out.println(mag1.getFullInfo());
//        HeroBase mag2 = new Priest("Priest1");
//        System.out.println(mag2);
//        System.out.println(mag2.getFullInfo());

    }
}