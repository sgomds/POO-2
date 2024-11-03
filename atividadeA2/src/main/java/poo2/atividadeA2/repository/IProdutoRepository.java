package poo2.atividadeA2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poo2.atividadeA2.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
