package group.check.service;

import group.check.dao.ChecksDAO;
import group.check.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ChecksServiceImpl implements ChecksService {

    @Autowired
    private ChecksDAO checksDAO;

    @Override
    @Transactional
    public List<Checks> allChecks() {
        return checksDAO.allChecks();
    }

    @Override
    @Transactional
    public List<DetailsObjectOfControl> allDetails() {
        return checksDAO.allDetails();
    }

    @Override
    @Transactional
    public List<Employee> allEmployees() {
        return checksDAO.allEmployees();
    }

    @Override
    @Transactional
    public List<ObjectsOfControl> allObjectsOfControl() {
        return checksDAO.allObjectsOfControl();
    }

    @Override
    @Transactional
    public List<Plant> allPlants() {
        return checksDAO.allPlants();
    }

    @Override
    @Transactional
    public <E extends ProductionControl> void add(E e) {
        checksDAO.add(e);
    }

    @Override
    @Transactional
    public <E extends ProductionControl> void delete(E e) {
        checksDAO.delete(e);
    }

    @Override
    @Transactional
    public <E extends ProductionControl> void edit(E e) {
        checksDAO.edit(e);
    }

    @Override
    @Transactional
    public Checks getByCheckId(int id) {
        return checksDAO.getByCheckId(id);
    }

    @Override
    @Transactional
    public DetailsObjectOfControl getByDetailId(int id) {
        return checksDAO.getByDetailId(id);
    }

    @Override
    @Transactional
    public Employee getByEmployeeId(int id) {
        return checksDAO.getByEmployeeId(id);
    }

    @Override
    @Transactional
    public ObjectsOfControl getByObjectOfControlId(int id) {
        return checksDAO.getByObjectOfControlId(id);
    }

    @Override
    @Transactional
    public Plant getByPlantId(int id) {
        return checksDAO.getByPlantId(id);
    }
}
