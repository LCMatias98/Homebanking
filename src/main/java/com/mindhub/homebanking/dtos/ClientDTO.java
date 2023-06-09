package com.mindhub.homebanking.dtos;

import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ClientDTO{

    private long id;
    private String firstName;
    private String lastName;
    private String email;

    private Set<AccountDTO> accounts = new HashSet<>();

    public ClientDTO(Client client) {

        this.id = client.getId();

        this.firstName = client.getFirstName();

        this.lastName = client.getLastName();

        this.email = client.getEmail();

        this.accounts = client.getAccounts().stream().map(AccountDTO::new).collect(Collectors.toSet());
    }

    public ClientDTO(){}

    public Set<AccountDTO> getAccounts() {
        return accounts;
    }


    public ClientDTO(Account account) {
    }

    public long getId() {
        return id;
    }

    
    public String getFirstName() {
        return firstName;
    }

   

    public String getLastName() {
        return lastName;
    }

    

    public String getEmail() {
        return email;
    }

   


}