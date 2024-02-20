package br.upe.centromariapolis.repository;

import br.upe.centromariapolis.model.Customer;
import br.upe.centromariapolis.util.LoadCustomersBase;
import br.upe.centromariapolis.util.SearchPeople;

import java.util.ArrayList;
import java.util.List;

public class RepoCustomer implements IRepoCustomer{

    List<Customer> customers = new ArrayList<>();

    public RepoCustomer() {
        LoadCustomersBase customersBase = new LoadCustomersBase();
        customers = customersBase.loadCustomersCsv();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> listCustomers(){
        return customers;
    }

    public void updateCustomer(String cpf, String name, int newQuantRef) {
        Customer customer = SearchPeople.findPerson(customers, cpf);
        if (customer != null){
            customer.setName(name);
            customer.setQntRefeicoes(newQuantRef);
        }
    }

    public void deleteCustomer(Customer customer) {
        customers.remove(customer);
    }
}
