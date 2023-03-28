package org.example.Lecture1.Points.model;

public class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(int z) {
        this.z = z;
    }

    public Point3D(int x, int y) {
        super(x, y);
    }

    public Point3D() {
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + this.getX() + ", y=" + this.getY() + ", z=" + z + '}';
    }

    /**
     * Метод определяющий расстояние между двумя точами
     *
     * @param secondPoint - вторая точка, до которой необходимо рассчитать расстояние
     * @return - расстояние между точками
     */
    public Double getDistance(Point3D secondPoint) {
        return Math.sqrt(Math.pow(secondPoint.getX() - this.getX(), 2) + Math.pow(secondPoint.getY() - this.getY(), 2)
                + Math.pow(secondPoint.getZ() - this.getZ(), 2));
    }
}
