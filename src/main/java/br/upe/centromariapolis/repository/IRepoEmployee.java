package br.upe.centromariapolis.repository;

import br.upe.centromariapolis.model.Employee;

import java.util.List;

public interface IRepoEmployee {
    public void addEmployee(Employee employee);
    public List<Employee> listCustomers();
    public void updateCustomer(String cpf, String name);
    public void deleteCustomer(Employee employee);
}
