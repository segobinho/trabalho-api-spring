package com.springboot.trabalhoSpringboot.interfaces;

import com.springboot.trabalhoSpringboot.entity.Evolucao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/evolucoes")
public interface EvolucaoControllerInterface {

    @GetMapping
    List<Evolucao> findAll();

    @GetMapping("/{id}")
    Evolucao findById(@PathVariable Long id);
}
