package poo2.atividadeA2.controller;

import org.springframework.web.bind.annotation.RestController;

import poo2.atividadeA2.model.Produto;
import poo2.atividadeA2.service.ProdutoServico;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/atividadeA2/Produtos")
public class ProdutoController {

     @Autowired
    private ProdutoServico produtoServico;

    public ProdutoController(ProdutoServico serv){
        this.produtoServico = serv;
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Produto> getById(@PathVariable Long codigo){
        Optional<Produto> opt = this.produtoServico.Read(codigo);
        if (opt.isPresent()) {
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        
        }
     }

 @PutMapping
    public ResponseEntity<Produto> put(@RequestBody Produto pro){
        Produto proalt = this.produtoServico.Edit(pro);
        if (proalt != null){
            return new ResponseEntity<>(proalt, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Produto> delete(@PathVariable Long codigo){
        Produto prodel = this.produtoServico.Delete(codigo);
        if (prodel != null){
            return new ResponseEntity<>(prodel, HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
