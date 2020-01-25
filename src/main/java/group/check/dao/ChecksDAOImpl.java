package group.check.dao;

import group.check.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        return session.createQuery("from Checks").list();
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
}
