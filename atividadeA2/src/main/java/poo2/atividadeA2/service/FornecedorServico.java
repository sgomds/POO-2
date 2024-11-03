package poo2.atividadeA2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poo2.atividadeA2.model.Fornecedor;
import poo2.atividadeA2.repository.IFornecedorRepository;

@Service
public class FornecedorServico implements IBaseServicoJPA<Fornecedor> {


    @Autowired
    private IFornecedorRepository fornecedorRepository;

    public List<Fornecedor> listarTodos(){
        return fornecedorRepository.findAll();
    }


    @Override
    public List<Fornecedor> Browse() {
        return this.fornecedorRepository.findAll();
    }

    @Override
    public Optional<Fornecedor> Read(Long chave) {
       return this.fornecedorRepository.findById(2);
    }

    @Override
    public Fornecedor Edit(Fornecedor obj) {
       Optional<Fornecedor> old = this.fornecedorRepository.findById(obj.getCodigo());
       if (old.isPresent()) {
            Fornecedor forn = old.get();
            forn.setCnpj(obj.getCnpj());
            forn.setEmail(obj.getEmail());
            forn.setNomeFantasia(obj.getNomeFantasia());
            forn.setRazaoSocial(obj.getRazaoSocial());
            forn.setTelefone(obj.getTelefone());
            this.fornecedorRepository.save(forn);
            return forn;

       } else {
            
            return null;
       }
    }

    @Override
    public Fornecedor Add(Fornecedor obj) {
        return this.fornecedorRepository.save(obj);
    }

    @Override
    public Fornecedor Delete(Long chave) {
        Optional<Fornecedor> old = this.fornecedorRepository.findById(2);
        if (old.isPresent()) {
            this.fornecedorRepository.delete(old.get());
            return old.get();
            
        } else {
            return null;
        }
    }
    
}
