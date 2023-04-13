package org.example.Homework2.model;

import org.example.Homework2.model.Laptops.Laptop;

import java.util.Comparator;
import java.util.Scanner;

public class LaptopComparator implements Comparator<Laptop> {
    @Override
    public int compare(Laptop o1, Laptop o2) {
        int chosenParameter = getCompareParameter();
        switch (chosenParameter) {
            case 1:
                return compareByType(o1, o2);
            case 2:
                return compareByRAMSize(o1, o2);
            case 3:
                return compareByMemoryType(o1, o2);
            case 4:
                return compareByMemorySize(o1, o2);
            case 5:
                return compareByScreenSize(o1, o2);
            case 6:
                return compareByOsType(o1, o2);
            case 7:
                return compareByBodyMaterial(o1, o2);
            case 8:
                return compareByColor(o1, o2);
        }
        return 0;
//        return compareByRAMSize(o1, o2);
    }

    public int compareByType(Laptop o1, Laptop o2) {
        return o1.getLaptopType().compareToIgnoreCase(o2.getLaptopType());
    }

    public int compareByRAMSize(Laptop o1, Laptop o2) {
        return o1.getRamSize() - o2.getRamSize();
    }

    public int compareByMemoryType(Laptop o1, Laptop o2) {
        return o1.getMemoryType().compareToIgnoreCase(o2.getMemoryType());
    }

    public int compareByMemorySize(Laptop o1, Laptop o2) {
        return o1.getMemorySize() - o2.getMemorySize();
    }

    public int compareByScreenSize(Laptop o1, Laptop o2) {
        return o1.getScreenSize() - o2.getScreenSize();
    }

    public int compareByOsType(Laptop o1, Laptop o2) {
        return o1.getOsType().compareToIgnoreCase(o2.getOsType());
    }

    public int compareByBodyMaterial(Laptop o1, Laptop o2) {
        return o1.getBodyMaterial().compareToIgnoreCase(o2.getBodyMaterial());
    }

    public int compareByColor(Laptop o1, Laptop o2) {
        return o1.getColor().compareToIgnoreCase(o2.getColor());
    }

    public int getCompareParameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите параметр для сравнения: ");
        System.out.println("1 - Тип ноутбука, 2 - Объем ОЗУ, 3 - Тип накопителя, 4 - Объем накопителя, " +
                "5 - Размер экрана, 6 - Тип ОС, 7 - Материал корпуса, 8 - Цвет корпуса");
        int chosenParameter = scanner.nextInt();
        return chosenParameter;
    }
}
