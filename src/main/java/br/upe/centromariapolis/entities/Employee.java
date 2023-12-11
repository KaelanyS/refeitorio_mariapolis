package br.upe.centromariapolis.entities;

import java.util.Date;

public class Employee {
    private String nome;
    private String cpf;
    private String email;
    private String cargo;
    private Date nascimento;

    public Employee() {
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
