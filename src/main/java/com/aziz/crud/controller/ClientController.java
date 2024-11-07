package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.Client;
import com.aziz.crud.service.ClientService;
 
@RestController
@RequestMapping("/clientes")
public class ClientController extends GenericController<Client, Long> {
	
	private final ClientService clientService;

	public ClientController(ClientService clientService) {
		super(clientService);
		this.clientService = clientService;
	}

	@PutMapping("/{id}")
	public ResponseEntity<Client> updateCliente(@Valid @PathVariable Long id, @RequestBody Client clientSpecs) {
		return clientService.updateEntity(id, clientSpecs);
	}
	
}
