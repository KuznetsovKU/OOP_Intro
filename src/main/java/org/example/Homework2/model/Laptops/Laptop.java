package org.example.Homework2.model.Laptops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Laptop implements LaptopActions {
    protected static Integer laptopIdCounter;

    static {
        Laptop.laptopIdCounter = 1;
    }

    protected Integer laptopId;
    protected String laptopType;
    protected Integer ramSize;
    protected String memoryType;
    protected Integer memorySize;
    protected Integer screenSize;
    protected String osType;
    protected String bodyMaterial;
    protected String color;

    protected List<String> laptopTypes = new ArrayList<>(Arrays.asList("any", "MacBook", "Classic Laptop", "Ultrabook", "Transformer"));
    protected List<Integer> ramSizes = new ArrayList<>(Arrays.asList(4, 6, 8, 12, 16, 24, 32));
    protected List<String> memoryTypes = new ArrayList<>(Arrays.asList("any", "HDD", "SDD"));
    protected List<Integer> memorySizes = new ArrayList<>(Arrays.asList(128, 256, 512, 1024, 2048));
    protected List<Integer> screenSizes = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
    protected List<String> osTypes = new ArrayList<>(Arrays.asList("any", "MacOS", "Windows", "Linux", "DOS", "noOS"));
    protected List<String> bodyMaterials = new ArrayList<>(Arrays.asList("any", "Plastic", "Metal", "Combined"));
    protected List<String> colors = new ArrayList<>(Arrays.asList("any", "Steel", "Black", "Silver", "White", "Brown", "Blue", "Red"));

    protected Laptop(Integer ramSize, String memoryType, Integer memorySize, Integer screenSize, String osType, String bodyMaterial, String color) {
        this.laptopId = laptopIdCounter++;
        this.laptopType = this.getClass().getSimpleName().toString();
        this.ramSize = ramSize;
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.screenSize = screenSize;
        this.osType = osType;
        this.bodyMaterial = bodyMaterial;
        this.color = color;
    }

    protected Laptop(String laptopType, Integer ramSize, String memoryType, Integer memorySize, Integer screenSize, String osType, String bodyMaterial, String color) {
        this.laptopId = laptopIdCounter++;
        this.laptopType = laptopType;
        this.ramSize = ramSize;
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.screenSize = screenSize;
        this.osType = osType;
        this.bodyMaterial = bodyMaterial;
        this.color = color;
    }

    public Laptop() {
    }

    public String getLaptopType() {
        return laptopType;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public String getOsType() {
        return osType;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public String getColor() {
        return color;
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
}
