package br.upe.centromariapolis.model;

public class Employee implements IPerson{
    private String cpf;
    private String name;

    public Employee(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
