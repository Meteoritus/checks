package group.check.dao;


import group.check.model.*;

import java.util.List;

public interface ChecksDAO {
    List<Checks> allChecks();
    List<DetailsObjectOfControl> allDetails();
    List<Employee> allEmployees();
    List<ObjectsOfControl> allObjectsOfControl();
    List<Plant> allPlants();
    <E extends ProductionControl> void add(E e);
    <E extends ProductionControl> void delete(E e);
    <E extends ProductionControl> void edit(E e);


    /*void add(DetailsObjectOfControl detailsObjectOfControl);
    void delete(DetailsObjectOfControl detailsObjectOfControl);
    void edit(DetailsObjectOfControl detailsObjectOfControl);


    void add(Employee employee);
    void delete(Employee employee);
    void edit(Employee employee);


    void add(ObjectsOfControl objectsOfControl);
    void delete(ObjectsOfControl objectsOfControl);
    void edit(ObjectsOfControl objectsOfControl);


    void add(Plant plant);
    void delete(Plant plant);
    void edit(Plant plant);*/

}
