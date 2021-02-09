package com.epam.task.third.repository;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;


import java.util.ArrayList;
import java.util.List;

public class MapOfConeRepositoryTest {

    private final MapOfConeRepository mapOfConeRepository = new MapOfConeRepository();
    private final Cone FIRST_CONE = new Cone(new Circle(2.0, new Point(0.0, 0.0, 0.0)),
            new Point(0.0, 3.0, 0.0));
    private final Cone SECOND_CONE = new Cone(new Circle(4.0, new Point(1.0, 1.0, 1.0)),
            new Point(1.0, 5.0, 1.0));
    private final List <Cone> EMPTY_LIST =  new ArrayList<>();










}
