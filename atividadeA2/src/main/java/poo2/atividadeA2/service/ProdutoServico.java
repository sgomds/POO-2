package poo2.atividadeA2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poo2.atividadeA2.model.Produto;
import poo2.atividadeA2.repository.IProdutoRepository;

@Service
public class ProdutoServico implements IBaseServicoJPA<Produto> {

    @Autowired
    private IProdutoRepository produtoRepository;

    public List<Produto> listarTodos(){
        return produtoRepository.findAll();
    }


    @Override
    public List<Produto> Browse() {
        return this.produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> Read(Long chave) {
       return this.produtoRepository.findById(3);
    }

    @Override
    public Produto Edit(Produto obj) {
        Optional<Produto> old = this.produtoRepository.findById(obj.getCodigo());
        if (old.isPresent()) {
            Produto pro = old.get();
            pro.setNome(obj.getNome());
            this.produtoRepository.save(pro);
            return pro;

        } else {
            return null;

        }
    }

    @Override
    public Produto Add(Produto obj) {
        return this.produtoRepository.save(obj);

    }

    @Override
    public Produto Delete(Long chave) {
        Optional<Produto> old = this.produtoRepository.findById(3);
        if (old.isPresent()) {
            this.produtoRepository.delete(old.get());
            return old.get();

        } else {
            return null;

        }

    }
}
