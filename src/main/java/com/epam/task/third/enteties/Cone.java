package com.epam.task.third.enteties;

public class Cone {
    private static int count;
    private int id;
    private Circle circle;
    private Point apexOfCone;


    public Cone(Circle circle, Point apexOfCone) {
        this.circle = circle;
        this.apexOfCone = apexOfCone;
        count++;
        this.id=count;
    }

    public int getId() {
        return id;
    }



    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Point getApexOfCone() {
        return apexOfCone;
    }

    public void setApexOfCone(Point apexOfCone) {
        this.apexOfCone = apexOfCone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cone cone = (Cone) o;

        if (getCircle() != null ? !getCircle().equals(cone.getCircle()) : cone.getCircle() != null) return false;
        return getApexOfCone() != null ? getApexOfCone().equals(cone.getApexOfCone()) : cone.getApexOfCone() == null;
    }

    @Override
    public int hashCode() {
        int result = getCircle() != null ? getCircle().hashCode() : 0;
        result = 31 * result + (getApexOfCone() != null ? getApexOfCone().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cone{" + "circle=" + circle + ", apexOfCone=" + apexOfCone + '}';
    }
}
