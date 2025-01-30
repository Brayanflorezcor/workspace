package com.std.ec.controller;

import com.std.ec.model.entity.Cliente;
import com.std.ec.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {

    @Autowired
    private ICliente clienteService;

    @PostMapping("/cliente")
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("/cliente")
    public Cliente update(Cliente cliente){
        return clienteService.save(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    public void delete(@PathVariable Integer id){
        Cliente clienteDelete = clienteService.findById(id);
        clienteService.delete(clienteDelete);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<Cliente> showById(@PathVariable Integer id){

        return ResponseEntity.ok(clienteService.findById(id));
    }

    @GetMapping("/cliente")
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

}
