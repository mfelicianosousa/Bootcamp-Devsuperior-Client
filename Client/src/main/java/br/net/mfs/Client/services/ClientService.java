package br.net.mfs.Client.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.Client.dto.ClientDTO;
import br.net.mfs.Client.entities.Client;
import br.net.mfs.Client.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository ;
	

	public List< ClientDTO > findAll(){
		List< Client > list = repository.findAll() ;
		List<ClientDTO> listDto = list.stream().map( x -> new ClientDTO( x )).collect( Collectors.toList() );
		
		return listDto ;
	}

	
}
