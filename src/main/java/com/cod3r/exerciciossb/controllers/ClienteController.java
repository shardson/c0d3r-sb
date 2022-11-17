package com.cod3r.exerciciossb.controllers;

import com.cod3r.exerciciossb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {

        return new Cliente(25, "Pedro Barbosa", "34567890123");

    };

    @GetMapping("/{id}")
    public Cliente ObterClientePorId1(@PathVariable int id){

        return new Cliente( id, "Izabella Barbosa", "34571890192");

    };

    @GetMapping
    public Cliente ObterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id){

        return new Cliente( id, "Shardson Nascimento", "72279761149");

    };
}
