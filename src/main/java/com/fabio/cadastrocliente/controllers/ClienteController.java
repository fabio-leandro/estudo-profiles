package com.fabio.cadastrocliente.controllers;

import com.fabio.cadastrocliente.domain.Cliente;
import com.fabio.cadastrocliente.dtos.ClienteDto;
import com.fabio.cadastrocliente.dtos.ClienteNewDto;
import com.fabio.cadastrocliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto> getById(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.getById(id));
    }
    @PostMapping
    public ResponseEntity<ClienteDto> saveCliente(@RequestBody ClienteNewDto clienteNewDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.saveCliente(clienteNewDto));
    }

    @GetMapping
    public ResponseEntity<List<ClienteDto>> getAllClientes(){
        return ResponseEntity.ok(clienteService.getAllClientes());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteDto> updateById(@PathVariable Long id, @RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.updateById(id,cliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        clienteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
