package group.check.service;


import group.check.model.*;

import java.util.List;

public interface ChecksService {
    List<Checks> allChecks();
    List<DetailsObjectOfControl> allDetails();
    List<Employee> allEmployees();
    List<ObjectsOfControl> allObjectsOfControl();
    List<Plant> allPlants();
    <E extends ProductionControl> void add(E e);
    <E extends ProductionControl> void delete(E e);
    <E extends ProductionControl> void edit(E e);
}
