package poo2.atividadeA2.controller;

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
import org.springframework.web.bind.annotation.RestController;

import poo2.atividadeA2.model.Fornecedor;
import poo2.atividadeA2.service.FornecedorServico;


@RestController
@RequestMapping("/api/atividadeA2/Fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorServico fornecedorServico;

    public FornecedorController(FornecedorServico serv){
        this.fornecedorServico = serv;
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Fornecedor> getById(@PathVariable Long codigo){
        Optional<Fornecedor> opt = this.fornecedorServico.Read(codigo);
        if (opt.isPresent()) {
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        
        }
     }

    @PutMapping
    public ResponseEntity<Fornecedor> put(@RequestBody Fornecedor forn){
        Fornecedor fornalt = this.fornecedorServico.Edit(forn);
        if (fornalt != null){
            return new ResponseEntity<>(fornalt, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Fornecedor> delete(@PathVariable Long codigo){
        Fornecedor forndel = this.fornecedorServico.Delete(codigo);
        if (forndel != null){
            return new ResponseEntity<>(forndel, HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
