package poo2.atividadeA2.repository;

import poo2.atividadeA2.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
 
}
