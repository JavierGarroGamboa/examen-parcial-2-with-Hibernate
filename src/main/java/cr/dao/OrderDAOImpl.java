package cr.dao;

import cr.exception.DAOException;
import cr.model.Orders;
import org.hibernate.Session;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


/**
 * The DAO implementation of appointment
 */
public class OrderDAOImpl implements OrderDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    public OrderDAOImpl() throws DAOException {
    }

    @Override
    public List<Orders> findAll() throws DAOException {
        List<Orders> appointmentList;

        appointmentList = session.createQuery("from Orders", Orders.class).list();

        return appointmentList;
    }

    @Override
    public Orders findById(int id) throws DAOException {
        Orders orders;
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Orders> query = builder.createQuery(Orders.class);
        Root<Orders> root = query.from(Orders.class);
        query.select(root).where(builder.equal(root.get("id"), id));
        Query q = session.createQuery(query);
        orders = (Orders) q.getSingleResult();

        return orders;
    }

    @Override
    public Orders save(Orders orders) throws DAOException {
        session.beginTransaction();
        session.save(orders);
        session.getTransaction().commit();

        return orders;
    }

    @Override
    public Orders update(Orders orders) throws DAOException {
        session.beginTransaction();
        session.update(orders);
        session.getTransaction().commit();

        return orders;
    }

    @Override
    public Orders delete(int id) throws DAOException {
        Orders orders;

        session.beginTransaction();
        orders = session.get(Orders.class, id);
        session.delete(orders);
        session.getTransaction().commit();

        return orders;
    }


}