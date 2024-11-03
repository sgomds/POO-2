package poo2.atividadeA2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

import poo2.atividadeA2.model.Pedido;
import poo2.atividadeA2.service.PedidoServico;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/atividadeA2/Pedidos")
public class PedidoController {
    
    @Autowired
    private PedidoServico pedidoServico;

    public PedidoController(PedidoServico serv){
        this.pedidoServico = serv;
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Pedido> getById(@PathVariable Long codigo){
        Optional<Pedido> opt = this.pedidoServico.Read(codigo);
        if (opt.isPresent()) {
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        
        }
     }

 @PutMapping
    public ResponseEntity<Pedido> put(@RequestBody Pedido ped){
        Pedido pedalt = this.pedidoServico.Edit(ped);
        if (pedalt != null){
            return new ResponseEntity<>(pedalt, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Pedido> delete(@PathVariable Long codigo){
        Pedido peddel = this.pedidoServico.Delete(codigo);
        if (peddel != null){
            return new ResponseEntity<>(peddel, HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
