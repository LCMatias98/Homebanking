package com.mindhub.homebanking.services;

import com.mindhub.homebanking.dtos.ClientDTO;
import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;

import java.util.List;

public interface ClientService {

    void saveClient(Client client);

    List<ClientDTO> getClientsDTO();

    ClientDTO getClientDTO(long id);

    Client findById(long id);

    Client findByEmail(String email);


}
