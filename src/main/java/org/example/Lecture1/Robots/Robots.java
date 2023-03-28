package org.example.Lecture1.Robots;

import org.example.Lecture1.Robots.model.Robot;

public class Robots {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        System.out.println(robot1.getName() + " status is " + robot1.status);
        robot1.work();
        robot1.power();
        System.out.println(robot1.getName() + " status is " + robot1.status);
        robot1.work();
        robot1.power();
        System.out.println(robot1.getName() + " status is " + robot1.status);
        Robot robot2 = new Robot();
        System.out.println(robot2.getName());
    }
}
