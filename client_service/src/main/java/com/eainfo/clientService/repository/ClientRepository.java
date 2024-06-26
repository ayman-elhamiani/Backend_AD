package com.eainfo.clientService.repository;

import com.eainfo.clientService.enums.ClientStatus;
import com.eainfo.clientService.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByEmail(String email);
    Client findById(String id);
    List<Client> findByClientStatus(ClientStatus clientStatus);
}
