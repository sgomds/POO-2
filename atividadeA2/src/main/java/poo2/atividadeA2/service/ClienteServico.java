package poo2.atividadeA2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import poo2.atividadeA2.repository.IClienteRepository;

import poo2.atividadeA2.model.Cliente;

@Service
public class ClienteServico implements IBaseServicoJPA<Cliente>{

    @Autowired
    private IClienteRepository clienteRepository;

    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> Browse() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> Read(Long chave) {
       return this.clienteRepository.findById(1);
    }

    @Override
    public Cliente Edit(Cliente obj) {
        Optional<Cliente> old = this.clienteRepository.findById(obj.getCodigo());
        if (old.isPresent()) {
            Cliente cli = old.get();
            cli.setNome(obj.getNome());
            cli.setCpf(obj.getCpf());
            cli.setEmail(obj.getEmail());
            cli.setTelefone(obj.getTelefone());
            this.clienteRepository.save(cli);
            return cli;

        } else{

            return null;
        }
    }

    @Override
    public Cliente Add(Cliente obj) {
       return this.clienteRepository.save(obj);
    }

    @Override
    public Cliente Delete(Long chave) {
        Optional<Cliente> old = this.clienteRepository.findById(1);
        if (old.isPresent()) {
            this.clienteRepository.delete(old.get());
            return old.get();
        } else {
            return null;
        }
    } 
}
