package poo2.atividadeA2.repository;

import poo2.atividadeA2.model.Fornecedor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IFornecedorRepository extends JpaRepository<Fornecedor, Integer>{
    
}
