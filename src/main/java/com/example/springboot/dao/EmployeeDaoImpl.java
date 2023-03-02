package com.example.springboot.dao;

import com.example.springboot.model.Employee;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    private EntityManager entityManager;


    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public List<Employee> getEmployees() {
        return entityManager.createQuery("From Employee").getResultList();
    }

    @Override
    public void updateEmployee(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    public void deleteEmployeeById(int id) {
        Query query = entityManager.createQuery("delete from Employee where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
