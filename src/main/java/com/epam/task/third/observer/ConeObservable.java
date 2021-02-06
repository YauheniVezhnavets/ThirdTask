package com.epam.task.third.observer;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;

import java.util.ArrayList;
import java.util.List;

public class ConeObservable extends Cone implements Subject {
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

            // maybe it's not correct
            observer.notify();

        }
    }
}
