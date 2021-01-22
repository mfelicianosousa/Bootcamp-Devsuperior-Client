package br.net.mfs.Client.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.Client.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria da Silva","07712084890",6900.0,Instant.now(), 3)) ;
		list.add(new Client(2L, "Mauricio de Souza","9099084890",8300.0,Instant.now(), 3)) ;
		
		return ResponseEntity.ok().body(list);
	}
	

}
