package cr.service;

import cr.dao.OrderDAO;
import cr.dao.OrderDAOImpl;
import cr.model.Orders;
import cr.exception.DAOException;
import cr.exception.ServiceException;

import java.util.List;

/**
 * The appointment service implementation
 */
public class OrderServiceImpl implements OrderService {
    private OrderDAO orderDAO;

    @Override
    public List<Orders> findAll() throws DAOException, ServiceException {
        List<Orders> ordersList = null;
        orderDAO = new OrderDAOImpl();
        ordersList = orderDAO.findAll();
        return ordersList;
    }

    @Override
    public Orders findById(int id) throws DAOException, ServiceException {
        Orders orders = null;
        orderDAO = new OrderDAOImpl();
        orders = orderDAO.findById(id);
        return orders;
    }

    @Override
    public Orders save(Orders appointment) throws DAOException, ServiceException {
        Orders orders;
        orderDAO = new OrderDAOImpl();
        orders = orderDAO.save(appointment);
        return orders;
    }

    @Override
    public Orders update(Orders appointment) throws DAOException, ServiceException {
        Orders orders;
        orderDAO = new OrderDAOImpl();
        orders = orderDAO.update(appointment);
        return orders;
    }

    @Override
    public Orders delete(int id) throws DAOException, ServiceException {
        Orders orders;
        orderDAO = new OrderDAOImpl();
        orders = orderDAO.delete(id);
        return orders;
    }
}
