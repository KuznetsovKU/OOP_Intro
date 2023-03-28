package org.example.Lecture1.Game.model;

import org.example.Lecture1.Game.model.Characters.HeroBase;
import org.example.Lecture1.Game.model.Characters.Magician;
import org.example.Lecture1.Game.model.Characters.Priest;

import java.util.Random;
import java.util.Scanner;

public class Infrastructure {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public HeroBase createHero() {
        getHeroTypesInfo();
        System.out.println("Chose yor HeroType: " +
                "(1 - Magician, 2 - Priest, 0 - get random");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return createMagician();
            case 2:
                return createPriest();
            default:
                return getRandomHero();
        }
    }

    private Magician createMagician(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the Name of your Hero");
        String name = scanner1.nextLine();
        return new Magician(name);
    }

    private Priest createPriest() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the Name of your Hero");
        String name = scanner1.nextLine();
        return new Priest(name);
    }
    private HeroBase getRandomHero() {
        int randomChoice = random.nextInt(2);
        if (randomChoice == 1) return new Magician();
        else return new Priest();
    }

    private void getHeroTypesInfo() {
        System.out.println("Magician: damageIndex = 0.8, protectIndex = 0.8, healIndex = 1.0");
        System.out.println("Priest: damageIndex = 1.0, protectIndex = 0.6, healIndex = 1.2");
    }
}
