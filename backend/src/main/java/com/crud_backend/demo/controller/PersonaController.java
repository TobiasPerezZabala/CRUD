package com.crud_backend.demo.controller;

import com.crud_backend.demo.model.Persona;
import com.crud_backend.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired
    private PersonaService service;

    @GetMapping
    public List<Persona> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Persona> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Persona create(@RequestBody Persona persona) {
        return service.save(persona);
    }

    @PutMapping("/{id}")
    public Persona update(@PathVariable Long id, @RequestBody Persona persona) {
        persona.setId(id);
        return service.save(persona);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

