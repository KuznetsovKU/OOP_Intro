package org.example.Lecture1.Points;

import org.example.Lecture1.Points.model.Point2D;
import org.example.Lecture1.Points.model.Point3D;


public class Points {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(-3, 0);
        System.out.println(point1);
        Point2D point2 = new Point2D(3, 0);
        System.out.println(point2);
        Point3D point3 = new Point3D(-3, 0, 0);
        System.out.println(point3);
        Point3D point4 = new Point3D(3, 0, 0);
        System.out.println(point3);
        System.out.println(point1.getDistance(point2));
        System.out.println(point3.getDistance(point4));
    }
}
