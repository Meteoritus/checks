package group.check.dao;

import group.check.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChecksDAOImpl implements ChecksDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Checks> allChecks() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(
                        "from Checks as c " +
                        "left join c.plant as p " +
                        "left join c.detailsObjectOfControl as d " +
                        "left join c.inspector as inspector " +
                        "left join c.executor as executor " +
                        "left join c.objectOfControl as o ");
        return query.list();
    }

    @Override
    public List<DetailsObjectOfControl> allDetails() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from DetailsObjectOfControl").list();
    }

    @Override
    public List<Employee> allEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee").list();
    }

    @Override
    public List<ObjectsOfControl> allObjectsOfControl() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from ObjectsOfControl").list();
    }

    @Override
    public List<Plant> allPlants() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Plant").list();
    }

    @Override
    public <E extends ProductionControl> void add(E e) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(e);
    }

    @Override
    public <E extends ProductionControl> void delete(E e) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(e);
    }

    @Override
    public <E extends ProductionControl> void edit(E e) {
        Session session = sessionFactory.getCurrentSession();
        session.update(e);
    }

    @Override
    public Checks getByCheckId(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Checks.class, id);
    }

    @Override
    public DetailsObjectOfControl getByDetailId(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(DetailsObjectOfControl.class, id);
    }

    @Override
    public Employee getByEmployeeId(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }

    @Override
    public ObjectsOfControl getByObjectOfControlId(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(ObjectsOfControl.class, id);
    }

    @Override
    public Plant getByPlantId(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Plant.class, id);
    }
}
