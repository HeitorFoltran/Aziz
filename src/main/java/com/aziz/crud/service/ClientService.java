package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.Client;
import com.aziz.crud.repository.ClientRepository;

@Service
public class ClientService extends GenericService<Client, Long> {
	
	public ClientService(ClientRepository repository) {
		super(repository);
	}
	
	@Override
    protected Client performUpdate(Client existingClient, Client updatedClient) {
        existingClient.setCpf(updatedClient.getCpf());
        existingClient.setPassword(updatedClient.getPassword());
        existingClient.setRg(updatedClient.getRg());
        existingClient.setName(updatedClient.getName());
        existingClient.setCity(updatedClient.getCity());
        return existingClient;
    }
}
