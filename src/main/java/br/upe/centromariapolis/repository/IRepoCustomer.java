package br.upe.centromariapolis.repository;

import br.upe.centromariapolis.model.Customer;

import java.util.List;

public interface IRepoCustomer {
    public void addCustomer(Customer customer);
    public List<Customer> listCustomers();
    public void updateCustomer(String cpf, String name, int newQuantRef);
    public void deleteCustomer(Customer customer);
}
