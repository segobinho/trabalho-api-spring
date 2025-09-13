package com.springboot.trabalhoSpringboot.repository;

import com.springboot.trabalhoSpringboot.entity.Evolucao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvolucaoRepository extends JpaRepository<Evolucao, Long> {
}