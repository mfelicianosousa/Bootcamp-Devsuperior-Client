package br.net.mfs.Client.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.mfs.Client.dto.ClientDTO;
import br.net.mfs.Client.entities.Client;
import br.net.mfs.Client.repositories.ClientRepository;
import br.net.mfs.Client.services.exception.EntityNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository ;
	
    @Transactional(readOnly = true)
	public List< ClientDTO > findAll(){
		List< Client > list = repository.findAll() ;
		List<ClientDTO> listDto = list.stream().map( x -> new ClientDTO( x )).collect( Collectors.toList() );
		
		return listDto ;
	}

    @Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional< Client > obj = repository.findById( id ) ;
		Client entity = obj.orElseThrow(()-> new EntityNotFoundException("Entity not found")) ;
		return new ClientDTO( entity );
	}

	
}
