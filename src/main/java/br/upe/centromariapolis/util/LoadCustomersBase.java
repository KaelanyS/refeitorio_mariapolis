package br.upe.centromariapolis.util;

import br.upe.centromariapolis.model.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadCustomersBase {
    String path = "/mnt/46c02c9e-c8ba-4166-86b2-de869199e8f3/Coding/UPE/refeitorio_mariopolis/src/main/java/br/upe/centromariapolis/repository/customersList.csv";

    public LoadCustomersBase() {
    }

    public List<Customer> loadCustomersCsv(){
        List<Customer> customers = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] lineArray = line.split(",");
                customers.add(new Customer(lineArray[0], lineArray[1], Integer.parseInt(lineArray[2]), lineArray[3]));
                line = br.readLine();
            }
            return customers;

        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
