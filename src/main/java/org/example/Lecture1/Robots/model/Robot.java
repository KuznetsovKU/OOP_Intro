package org.example.Lecture1.Robots.model;

import java.util.ArrayList;

public class Robot {
    enum Status { On, Off }
    private static int defaultIndex;
    private static ArrayList<String> names;
    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }
    private int level;
    private String name;
    public Status status;

    private Robot(String name, int level) {
        if (name.isEmpty() || Character.isDigit(name.charAt(0)) || Robot.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }
        Robot.names.add(this.name);
        this.level = level;
        this.status = Status.Off;
    }

    public Robot(String name) {
        this(name, 1);
    }

    public Robot() {
        this("");
    }

    @Override
    public String toString() {
        return "Robot{" +
                "level=" + level +
                ", name='" + name + '\'' +
                '}';
    }

    public int getLevel() {
        return level;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void startBIOS() {
        System.out.println("BIOS is starting");
    }

    private void startOS() {
        System.out.println("Operation System is running");
    }

    private void sayHI() {
        System.out.println("HI! My name is " + this.getName());
    }

    private void stopBIOS() {
        System.out.println("BIOS is stopping");
    }

    private void stopOS() {
        System.out.println("Operation System is stopping");
    }

    private void sayBye() {
        System.out.println("Good Bye");
    }

    public void work() {
        if (this.status == Status.On) {
            System.out.println("Working in progress");
        }
    }

    private void powerON() {
        this.startBIOS();
        this.startOS();
        this.sayHI();
    }

    private void powerOFF() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public void power() {
        if (this.status == Status.Off) {
            this.powerON();
            this.status = Status.On;
        } else {
            this.powerOFF();
            this.status = Status.Off;
        }
        System.out.println();
    }
}
