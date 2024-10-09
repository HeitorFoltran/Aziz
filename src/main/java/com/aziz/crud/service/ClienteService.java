package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.Cliente;
import com.aziz.crud.repository.ClienteRepository;

@Service
public class ClienteService extends GenericService<Cliente, Long> {
	
	public ClienteService (ClienteRepository repository) {
		super(repository);
	}
	
	@Override
    protected Cliente performUpdate(Cliente existingCliente, Cliente updatedCliente) {
        existingCliente.setCpf(updatedCliente.getCpf());
        existingCliente.setSenha(updatedCliente.getSenha());
        existingCliente.setRg(updatedCliente.getRg());
        existingCliente.setNome(updatedCliente.getNome());
        existingCliente.setCidade(updatedCliente.getCidade());
        return existingCliente;
    }
}
