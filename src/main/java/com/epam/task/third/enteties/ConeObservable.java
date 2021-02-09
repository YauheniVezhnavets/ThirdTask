package com.epam.task.third.enteties;

import com.epam.task.third.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ConeObservable extends Cone implements Observed {
    private final List<Observer> observers = new ArrayList<>();


    public ConeObservable(Circle circle, Point apexOfCone) {
        super(circle, apexOfCone);
    }


    @Override
    public void setApexOfCone(Point apexOfCone) {
        super.setApexOfCone(apexOfCone);
        notifyObservers();
    }

    @Override
    public void setCircle(Circle circle) {
        super.setCircle(circle);
        notifyObservers();
    }


    @Override
    public void attach(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void detach(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){

            observer.update(this);

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ConeObservable that = (ConeObservable) o;

        return observers != null ? observers.equals(that.observers) : that.observers == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (observers != null ? observers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ConeObservable{" + "observers=" + observers + '}';
    }
}
