package br.net.mfs.Client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.Client.entities.Client;
import br.net.mfs.Client.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository ;
	
	public List<Client> findAll(){
		return repository.findAll() ;
		
	}

	
}
