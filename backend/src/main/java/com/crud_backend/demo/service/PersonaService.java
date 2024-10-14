package com.crud_backend.demo.service;

import com.crud_backend.demo.model.Persona;
import com.crud_backend.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;

    public List<Persona> getAll() {
        return repository.findAll();
    }

    public Optional<Persona> getById(Long id) {
        return repository.findById(id);
    }

    public Persona save(Persona persona) {
        return repository.save(persona);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
