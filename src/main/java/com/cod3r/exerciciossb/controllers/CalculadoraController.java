package com.cod3r.exerciciossb.controllers;

import com.cod3r.exerciciossb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    //Calculadora / Soma / 10 + 20
    @GetMapping("/somar/{valor1}/{valor2}")
    public int SomarValores1(@PathVariable int valor1, @PathVariable int valor2){

        int soma;
        soma = valor1 + valor2;

        return soma;

    };

    //Calculadora / Subtracao / ?valor - ?valor2

    @GetMapping
    public Cliente SubtrairValores(@RequestParam(name = "valor1", defaultValue = "1") int valor1, @RequestParam(name = "valor2", defaultValue = "1") int valor2){

        int subtracao;
        subtracao = valor1 - valor2;
        return new Cliente( subtracao, "TesteSubracao", "Teste de Subtracao");

    };
}
