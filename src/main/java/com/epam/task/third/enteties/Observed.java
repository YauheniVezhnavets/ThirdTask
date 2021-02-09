package com.epam.task.third.enteties;

import com.epam.task.third.observer.Observer;

public interface Observed {

    void attach (Observer observer);
    void detach (Observer observer);
    void notifyObservers();

}
