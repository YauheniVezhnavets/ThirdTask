package com.epam.task.third.repository;

import com.epam.task.third.enteties.Cone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfConeRepository implements ConeRepository {

    private Map<Integer, Cone> mapOfCones = new HashMap<>();



    @Override
    public void addCone(Cone cone) {
        mapOfCones.put(cone.getId(), cone);

    }

    @Override
    public void removeCone(Cone cone) {
        mapOfCones.remove(cone.getId());

    }

    @Override
    public void updateCone(Cone cone) {
        //it's incorrect
        cone.setCircle(cone.getCircle());
    }

    @Override
    public List<Cone> query(ConeSpecification specification) {
        List<Cone> result = new ArrayList<>();
        for (Cone cone : mapOfCones.values()) {
            if (specification.specified(cone)) {
                result.add(cone);
            }
        }
        return result;
    }
}
