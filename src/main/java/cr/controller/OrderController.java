package cr.controller;

import cr.model.Orders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import cr.exception.DAOException;
import cr.exception.ServiceException;
import cr.service.OrderService;
import cr.service.OrderServiceImpl;

import java.util.List;

@Controller
@RequestMapping(value = "/api/orders")
public class OrderController {
    private OrderService orderService = new OrderServiceImpl();

    @GetMapping()
    @ResponseBody
    public List<Orders> findAll() {
        List<Orders> ordersList = null;
        try {
            ordersList = orderService.findAll();
        } catch (DAOException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa DAO", ex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }
        return ordersList;
    }

    @GetMapping("{id}")
    @ResponseBody
    public Orders findById(@PathVariable int id) {
        Orders orders = null;
        try {
            orders = orderService.findById(id);
        } catch (DAOException bex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa DAO", bex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }

        return orders;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Orders save(@RequestBody Orders orders) {
        Orders ordersSaved = null;
        try {
            ordersSaved = orderService.save(orders);
        } catch (DAOException bex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa DAO", bex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }
        return ordersSaved;
    }

    @PutMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Orders update(@RequestBody Orders orders) {
        Orders ordersUpdate = null;
        try {
            ordersUpdate = orderService.update(orders);
        } catch (DAOException bex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa DAO", bex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }
        return ordersUpdate;
    }

    @DeleteMapping("{id}")
    @ResponseBody
    public Orders delete(@PathVariable int id) {
        Orders ordersDelete = null;
        try {
            ordersDelete = orderService.delete(id);
        } catch (DAOException bex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa DAO", bex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }

        return ordersDelete;
    }
}
