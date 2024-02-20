package br.upe.centromariapolis.model;

import java.util.Date;

public class Customer implements IPerson{
    private String cpf;
    private String name;
    private int qntRefeicoes;
    private String checkInTimestamp;

    public Customer(String cpf, String name, int qntRefeicoes, String checkInTimestamp) {
        this.cpf = cpf;
        this.name = name;
        this.qntRefeicoes = qntRefeicoes;
        this.checkInTimestamp = checkInTimestamp;
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

    public int getQntRefeicoes() {
        return qntRefeicoes;
    }

    public void setQntRefeicoes(int qntRefeicoes) {
        this.qntRefeicoes = qntRefeicoes;
    }

    public String getCheckInTimestamp() {
        return checkInTimestamp;
    }

    public void setCheckInTimestamp(String checkInTimestamp) {
        this.checkInTimestamp = checkInTimestamp;
    }
}
