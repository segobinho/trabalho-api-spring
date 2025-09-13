package com.springboot.trabalhoSpringboot.service;

import com.springboot.trabalhoSpringboot.entity.Evolucao;
import com.springboot.trabalhoSpringboot.repository.EvolucaoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EvolucaoService {

    private final EvolucaoRepository repository;

    public EvolucaoService(EvolucaoRepository repository) {
        this.repository = repository;
    }

    public List<Evolucao> findAll() {
        return repository.findAll();
    }

    public Evolucao findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Evolucao save(Evolucao evolucao) {
        return repository.save(evolucao);
    }

    public Evolucao update(Long id, Evolucao evolucaoDetails) {
        Evolucao evolucao = findById(id);
        evolucao.setData(evolucaoDetails.getData());
        evolucao.setPeso(evolucaoDetails.getPeso());
        evolucao.setAltura(evolucaoDetails.getAltura());
        evolucao.setCintura(evolucaoDetails.getCintura());
        evolucao.setUser(evolucaoDetails.getUser());
        return repository.save(evolucao);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}