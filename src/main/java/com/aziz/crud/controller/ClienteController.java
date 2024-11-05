package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.Cliente;
import com.aziz.crud.service.ClienteService;
 
@RestController
@RequestMapping("/clientes")
public class ClienteController extends GenericController<Cliente, Long> {
	
	private final ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		super(clienteService);
		this.clienteService = clienteService;
	}

	@PutMapping("/{id}")
	public ResponseEntity<Cliente> updateCliente(@Valid @PathVariable Long id, @RequestBody Cliente clienteSpecs) {
		return clienteService.updateEntity(id, clienteSpecs);
	}
	
}
