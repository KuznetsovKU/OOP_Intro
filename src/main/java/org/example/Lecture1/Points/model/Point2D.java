package org.example.Lecture1.Points.model;

public class Point2D {
    private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    @Override
    public String toString() {
        return "Point2D{" + "x=" + x + ", y=" + y + '}';
    }

    /**
     * Метод определяющий расстояние между двумя точами
     *
     * @param secondPoint - вторая точка, до которой необходимо рассчитать расстояние
     * @return - расстояние между точками
     */
    public Double getDistance(Point2D secondPoint) {
        return Math.sqrt(Math.pow(secondPoint.getX() - this.getX(), 2) + Math.pow(secondPoint.getY() - this.getY(), 2));
    }
}
