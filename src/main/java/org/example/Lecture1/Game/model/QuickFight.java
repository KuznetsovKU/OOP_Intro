package org.example.Lecture1.Game.model;

import org.example.Lecture1.Game.model.Characters.HeroBase;

public class QuickFight {
    public static void simpleFight1() {
        HeroBase hero1 = new Infrastructure().createHero();
        HeroBase hero2 = new Infrastructure().createHero();

        while (hero1.getLifeStatus() == 1 && hero2.getLifeStatus() == 1) {
            System.out.println(hero1);
            System.out.println(hero2);
            if (hero1.getLifeStatus() == 1) hero1.attack(hero2);
            if (hero2.getLifeStatus() == 1) hero2.attack(hero1);
        }
    }
}
