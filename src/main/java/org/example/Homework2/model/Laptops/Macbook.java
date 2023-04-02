package org.example.Homework2.model.Laptops;

import java.util.Random;
import java.util.Scanner;

public class Macbook extends Laptop {
    public Macbook(Integer ramSize, String memoryType, Integer memorySize, Integer screenSize, String osType, String bodyMaterial, String color) {
        super(ramSize, memoryType, memorySize, screenSize, osType, bodyMaterial, color);
    }

    public Macbook() {
    }

    @Override
    public Laptop createRandomLaptop() {
        Random rand = new Random();
        Integer ramSize = ramSizes.get(rand.nextInt(ramSizes.size()));
        String memoryType = memoryTypes.get(rand.nextInt(1, memoryTypes.size()));
        Integer memorySize = memorySizes.get(rand.nextInt(memorySizes.size()));
        Integer screenSize = screenSizes.get(rand.nextInt(screenSizes.size()));
        String osType = "MacOS";
        String bodyMaterial = bodyMaterials.get(rand.nextInt(1, bodyMaterials.size()));
        String color = colors.get(rand.nextInt(1, colors.size()));
        return new Macbook(ramSize, memoryType, memorySize, screenSize, osType, bodyMaterial, color);
    }

    @Override
    public Laptop createLaptopManually() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите объем ОЗУ в ГБ:");
        Integer ramSize = scanner.nextInt();

        System.out.println("Укажите тип ПЗУ (1 = HDD, 2 = SDD):");
        String memoryType = this.memoryTypes.get(scanner.nextInt());

        System.out.println("Введите объем ПЗУ в ГБ:");
        Integer memorySize = scanner.nextInt();

        System.out.println("Введите диагональ экрана в дюймах:");
        Integer screenSize = scanner.nextInt();

        String osType = "MacOS";

        System.out.println("Укажите материал корпуса (1 = Пластик, 2 = Металл, 3 = Комбинированный):");
        String bodyMaterial = this.bodyMaterials.get(scanner.nextInt());

        System.out.println("Укажите желаемый цвет корпуса (1 = Стальной, 2 = Черный, 3 = Серебристый, 4 = Белый, " +
                "5 = Коричневый, 6 = Синий, 7 = Красный, 0 = Пропустить выбор):");
        String color = this.colors.get(scanner.nextInt());

        return new Macbook(ramSize, memoryType, memorySize, screenSize, osType, bodyMaterial, color);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + laptopId +
                ", laptopType='" + laptopType + '\'' +
                ", ramSize=" + ramSize +
                ", memoryType='" + memoryType + '\'' +
                ", memorySize=" + memorySize +
                ", screenSize=" + screenSize +
                ", osType='" + osType + '\'' +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean isEqualsLaptop(Laptop laptop) {
        if (!this.laptopType.equals(laptop.getLaptopType())) return false;
        if (!this.ramSize.equals(laptop.getRamSize())) return false;
        if (!this.memoryType.equals(laptop.getMemoryType())) return false;
        if (!this.memorySize.equals(laptop.getMemorySize())) return false;
        if (!this.screenSize.equals(laptop.getScreenSize())) return false;
        if (!this.osType.equals(laptop.getOsType())) return false;
        if (!this.bodyMaterial.equals(laptop.getBodyMaterial())) return false;
        return this.color.equals(laptop.getColor());
    }
}
