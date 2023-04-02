package org.example.Homework2.model.Laptops;

import java.util.Random;
import java.util.Scanner;

public class ClientChoice extends Laptop {
    public ClientChoice(Integer ramSize, String memoryType, Integer memorySize, Integer screenSize, String osType, String bodyMaterial, String color) {
        super(ramSize, memoryType, memorySize, screenSize, osType, bodyMaterial, color);
    }

    public ClientChoice(String laptopType, Integer ramSize, String memoryType, Integer memorySize, Integer screenSize, String osType, String bodyMaterial, String color) {
        super(laptopType, ramSize, memoryType, memorySize, screenSize, osType, bodyMaterial, color);
    }

    public ClientChoice() {
    }

    @Override
    public Laptop createRandomLaptop() {
        Random rand = new Random();
        String laptopType = laptopTypes.get(rand.nextInt(laptopTypes.size()));
        Integer ramSize = ramSizes.get(rand.nextInt(ramSizes.size()));
        String memoryType = memoryTypes.get(rand.nextInt(memoryTypes.size()));
        Integer memorySize = memorySizes.get(rand.nextInt(memorySizes.size()));
        Integer screenSize = screenSizes.get(rand.nextInt(screenSizes.size()));
        String osType = osTypes.get(rand.nextInt(osTypes.size()));
        String bodyMaterial = bodyMaterials.get(rand.nextInt(bodyMaterials.size()));
        String color = colors.get(rand.nextInt(colors.size()));
        return new ClientChoice(laptopType, ramSize, memoryType, memorySize, screenSize, osType, bodyMaterial, color);
    }

    @Override
    public Laptop createLaptopManually() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите желаемый тип ноутбука (1 = MacBook, 2 = Classic Laptop, 3 = Ultrabook, " +
                "4 = Transformer, 0 = Пропустить выбор)");
        String laptopType = this.laptopTypes.get(scanner.nextInt());

        System.out.println("Введите минимальный объем ОЗУ в ГБ:");
        Integer ramSize = scanner.nextInt();

        System.out.println("Укажите желаемый тип ПЗУ (1 = HDD, 2 = SDD, 0 = Пропустить выбор):");
        String memoryType = this.memoryTypes.get(scanner.nextInt());

        System.out.println("Введите минимальный объем ПЗУ в ГБ:");
        Integer memorySize = scanner.nextInt();

        System.out.println("Введите минимальную диагональ экрана в дюймах:");
        Integer screenSize = scanner.nextInt();

        System.out.println("Укажите желаемый тип операционной системы (1 = MacOS, 2 = Windows, 3 = Linux, 4 = DOS, " +
                "5 = noOS, 0 = Пропустить выбор):");
        String osType = this.osTypes.get(scanner.nextInt());


        System.out.println("Укажите желаемый материал корпуса (1 = Пластик, 2 = Металл, 3 = Комбинированный, " +
                "0 = Пропустить выбор):");
        String bodyMaterial = this.bodyMaterials.get(scanner.nextInt());

        System.out.println("Укажите желаемый цвет корпуса (1 = Стальной, 2 = Черный, 3 = Серебристый, 4 = Белый, " +
                "5 = Коричневый, 6 = Синий, 7 = Красный, 0 = Пропустить выбор):");
        String color = this.colors.get(scanner.nextInt());

        return new ClientChoice(laptopType, ramSize, memoryType, memorySize, screenSize, osType, bodyMaterial, color);
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
        if (!this.laptopType.equals(laptop.getLaptopType()) && !this.laptopType.equals(laptopTypes.get(0)))
            return false;
        if (this.ramSize > laptop.getRamSize()) return false;
        if (!this.memoryType.equals(laptop.getMemoryType()) && !this.memoryType.equals(memoryTypes.get(0)))
            return false;
        if (this.memorySize > laptop.getMemorySize()) return false;
        if (this.screenSize > laptop.getScreenSize()) return false;
        if (!this.osType.equals(laptop.getOsType()) && !this.osType.equals(osTypes.get(0))) return false;
        if (!this.bodyMaterial.equals(laptop.getBodyMaterial()) && !this.bodyMaterial.equals(bodyMaterials.get(0)))
            return false;
        return this.color.equals(laptop.getColor()) || this.color.equals(colors.get(0));
    }


}
