package com.epam.task.third.repository;

import com.epam.task.third.enteties.Cone;
import com.epam.task.third.repository.specifications.ConeSpecification;

import java.util.List;

public interface ConeRepository {

    void addCone(Cone cone);
    void removeCone(Cone cone);
    void updateCone(Cone cone, double radius);

    List <Cone> query(ConeSpecification specification);

}

