package com.epam.task.third.enteties;

public class Circle {
    private final double radius;
    private final Point centerOfCircle;
    private final Point pointOnCircle;


    public Circle(double radius, Point centerOfCircle, Point pointOnCircle) {
        this.radius = radius;
        this.centerOfCircle = centerOfCircle;
        this.pointOnCircle = pointOnCircle;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenterOfCircle() {
        return centerOfCircle;
    }

    public Point getPointOnCircle() {
        return pointOnCircle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.getRadius(), getRadius()) != 0) return false;
        if (getCenterOfCircle() != null ? !getCenterOfCircle().equals(circle.getCenterOfCircle()) : circle.getCenterOfCircle() != null)
            return false;
        return getPointOnCircle() != null ? getPointOnCircle().equals(circle.getPointOnCircle()) : circle.getPointOnCircle() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getRadius());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getCenterOfCircle() != null ? getCenterOfCircle().hashCode() : 0);
        result = 31 * result + (getPointOnCircle() != null ? getPointOnCircle().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +  "radius=" + radius +  ", centerOfCircle=" + centerOfCircle + "," +
                " pointOnCircle=" + pointOnCircle + '}';
    }
}
