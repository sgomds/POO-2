package poo2.atividadeA2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.atividadeA2.model.Cliente;
import poo2.atividadeA2.service.ClienteServico;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/Clientes")
public class ClienteController {
    
    @Autowired
    private ClienteServico clienteServico;

    public ClienteController(ClienteServico serv){
        this.clienteServico = serv;
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Cliente> getById(@PathVariable Long codigo){
        Optional<Cliente> opt = this.clienteServico.Read(codigo);
        if (opt.isPresent()) {
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        
        }
     }

 @PutMapping
    public ResponseEntity<Cliente> put(@RequestBody Cliente cl){
        Cliente clalt = this.clienteServico.Edit(cl);
        if (clalt != null){
            return new ResponseEntity<>(clalt, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Cliente> delete(@PathVariable Long codigo){
        Cliente cldel = this.clienteServico.Delete(codigo);
        if (cldel != null){
            return new ResponseEntity<>(cldel, HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}


