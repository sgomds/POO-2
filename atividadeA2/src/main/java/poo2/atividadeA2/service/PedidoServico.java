package poo2.atividadeA2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poo2.atividadeA2.model.Pedido;
import poo2.atividadeA2.repository.IPedidoRepository;

@Service
public class PedidoServico implements IBaseServicoJPA<Pedido> {


@Autowired
    private IPedidoRepository pedidoRepository;

    public List<Pedido> listarTodos(){
        return pedidoRepository.findAll();
    }


    @Override
    public List<Pedido> Browse() {
        return this.pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> Read(Long chave) {
        return this.pedidoRepository.findById(4);
    }

    @Override
    public Pedido Edit(Pedido obj) {
        Optional<Pedido> old = this.pedidoRepository.findById(obj.getCodigo());
        if (old.isPresent()) {
            Pedido ped = old.get();
            ped.setDataDeAlteracao(obj.getDataDeAlteracao());
            ped.setCliente(obj.getCliente());
            ped.setDataDeInclusao(obj.getDataDeInclusao());
            ped.setFornecedor(obj.getFornecedor());
            ped.setNome(obj.getNome());
            ped.setProdutos(obj.getProdutos());
            this.pedidoRepository.save(ped);
            return ped;

        } else {
            return null;
    
        }
    }

    @Override
    public Pedido Add(Pedido obj) {
       return this.pedidoRepository.save(obj);
    }

    @Override
    public Pedido Delete(Long chave) {
       Optional<Pedido> old = this.pedidoRepository.findById(4);
       if (old.isPresent()) {
            this.pedidoRepository.delete(old.get());
            return old.get();

       } else {
            return null;

       }
    }
}
