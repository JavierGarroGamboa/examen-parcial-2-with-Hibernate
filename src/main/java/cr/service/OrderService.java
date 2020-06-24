package cr.service;

import cr.exception.DAOException;
import cr.exception.ServiceException;
import cr.model.Orders;

import java.util.List;

public interface OrderService {

    public List<Orders> findAll() throws DAOException, ServiceException;

    public Orders findById(int id) throws DAOException, ServiceException;

    public Orders save(Orders orders) throws DAOException, ServiceException;

    public Orders update(Orders orders) throws DAOException, ServiceException;

    public Orders delete(int id) throws DAOException, ServiceException;

}
