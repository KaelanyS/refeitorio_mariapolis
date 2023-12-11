package br.upe.centromariapolis.facade;

import br.upe.centromariapolis.entities.Employee;

public class Facade {

    public Facade() {
    }

    public Employee employee = new Employee();

    public Employee getEmployee() {
        return employee;
    }
}
