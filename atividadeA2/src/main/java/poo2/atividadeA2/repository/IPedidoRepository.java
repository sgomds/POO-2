package poo2.atividadeA2.repository;

import poo2.atividadeA2.model.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepository extends JpaRepository<Pedido, Integer>{
    
}
