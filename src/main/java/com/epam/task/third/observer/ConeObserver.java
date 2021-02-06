package com.epam.task.third.observer;

import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.ConeParameters;
import com.epam.task.third.logic.ConeCalculator;

import java.util.HashMap;
import java.util.Map;


public class ConeObserver implements Observer {
    private final static ConeObserver INSTANCE = new ConeObserver();
    private ConeCalculator coneCalculator;
    private Map<Integer, ConeParameters> parameters = new HashMap<>();
    private ConeObservable coneObservable;

    private ConeObserver(){}

    public static ConeObserver getInstance(){
        return INSTANCE;
    }

    @Override
    public void update(Cone cone) {
        double area = coneCalculator.calculateArea(cone);
        double volume = coneCalculator.calculateVolume(cone);
        ConeParameters params = new ConeParameters(area,volume);
        parameters.put(cone.getId(),params);

    }
}
