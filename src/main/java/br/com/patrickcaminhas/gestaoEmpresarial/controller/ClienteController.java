package br.com.patrickcaminhas.gestaoEmpresarial.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.patrickcaminhas.gestaoEmpresarial.model.Cliente;
import br.com.patrickcaminhas.gestaoEmpresarial.repository.ClienteRepository;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteRepository repo;

    public ClienteController(ClienteRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody ClienteRequest req) {
        Cliente c = new Cliente(
            req.getNome(),
            req.getSobrenome(),
            req.getDocumento(),
            req.getEndereco(),
            req.getTelefone(),
            req.getUltimo_a_modificar()
        );
        Cliente saved = repo.save(c);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saved.getId()).toUri();
        return ResponseEntity.created(uri).body(saved);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> obterPorId(@PathVariable String id){
        return repo.findById(id).map(ClienteResponse::from).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}