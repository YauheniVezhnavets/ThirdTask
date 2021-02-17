package com.epam.task.third.enteties;

public class Circle {
    private double radius;
    private Point centerOfCircle;


    public Circle(double radius, Point centerOfCircle) {
        this.radius = radius;
        this.centerOfCircle = centerOfCircle;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenterOfCircle() {
        return centerOfCircle;
    }


    public void setCenterOfCircle(Point centerOfCircle) {
        this.centerOfCircle = centerOfCircle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.getRadius(), getRadius()) != 0) return false;
        return getCenterOfCircle() != null ? getCenterOfCircle().equals(circle.getCenterOfCircle()) : circle.getCenterOfCircle() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getRadius());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getCenterOfCircle() != null ? getCenterOfCircle().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", centerOfCircle=" + centerOfCircle + '}';
    }
}
