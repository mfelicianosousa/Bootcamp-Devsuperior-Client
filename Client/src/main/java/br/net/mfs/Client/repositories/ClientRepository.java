package br.net.mfs.Client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.net.mfs.Client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
