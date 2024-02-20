package br.upe.centromariapolis.util;

import br.upe.centromariapolis.model.IPerson;

import java.util.List;

public final class SearchPeople {

    private SearchPeople(){}

    public static <T extends IPerson> T findPerson(List<T> people, String cpf){
        for (T person : people) {
            if (person.getCpf().equals(cpf)){
                return person;
            }
        }
        return null;
    }
}
