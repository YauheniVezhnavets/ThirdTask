package com.epam.task.third.repository.specifications;

import com.epam.task.third.enteties.Cone;

public class ConeIdSpecification implements ConeSpecification {

    private final int id;


    public ConeIdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specified(Cone cone) {
        return cone.getId() == id;
    }
}
