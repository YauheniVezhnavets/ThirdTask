package com.epam.task.third.repository;

import com.epam.task.third.enteties.Cone;

import java.util.List;

public interface ConeRepository {

    void addCone(Cone cone);
    void removeCone(Cone cone);
    void updateCone(Cone cone);

    List <Cone> query(ConeSpecification specification);

}

