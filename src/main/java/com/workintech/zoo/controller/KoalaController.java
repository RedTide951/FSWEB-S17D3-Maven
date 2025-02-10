package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Koala;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/koalas")
public class KoalaController {
    private Map<Integer, Koala> koalas;

    public KoalaController() {
        this.koalas = new HashMap<>();
    }

    @GetMapping
    public List<Koala> getAllKoalas() {
        return new ArrayList<>(koalas.values());
    }

    @GetMapping("/{id}")
    public Koala getKoala(@PathVariable int id) {
        return koalas.get(id);
    }

    @PostMapping
    public String addKoala(@RequestBody Koala koala) {
        koalas.put(koala.getId(), koala);
        return "Koala added successfully!";
    }

    // Update an existing Koala
    @PutMapping("/{id}")
    public String updateKoala(@PathVariable int id, @RequestBody Koala updatedKoala) {
        if (!koalas.containsKey(id)) {
            return "Koala not found!";
        }
        updatedKoala.setId(id); // Ensure ID consistency
        koalas.put(id, updatedKoala);
        return "Koala updated successfully!";
    }

    // Delete a Koala
    @DeleteMapping("/{id}")
    public String deleteKoala(@PathVariable int id) {
        if (koalas.remove(id) != null) {
            return "Koala deleted successfully!";
        } else {
            return "Koala not found!";
        }
    }
}
