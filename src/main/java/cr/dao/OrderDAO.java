package cr.dao;

import cr.exception.DAOException;
import cr.model.Orders;

import java.util.List;

/**
 * appointment DAO
 */
public interface OrderDAO {

    public List<Orders> findAll() throws DAOException;

    public Orders findById(int id) throws DAOException;

    public Orders save(Orders orders) throws DAOException;

    public Orders update(Orders orders) throws DAOException;

    public Orders delete(int id) throws DAOException;
}
