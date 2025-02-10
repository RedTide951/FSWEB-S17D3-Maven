package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;
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
@RequestMapping("/kangaroos")
public class KangarooController {
    private Map<Integer, Kangaroo> kangaroos;

    public KangarooController() {
        this.kangaroos = new HashMap<>();
    }

    @GetMapping
    public List<Kangaroo> getAllKangaroos() {
        return new ArrayList<>(kangaroos.values());
    }

    @GetMapping("/{id}")
    public Kangaroo getKangaroo(@PathVariable int id) {
        return kangaroos.get(id);
    }

    @PostMapping
    public String addKangaroo(@RequestBody Kangaroo kangaroo) {
        kangaroos.put(kangaroo.getId(), kangaroo);
        return "Kangaroo added successfully!";
    }

    // Update an existing kangaroo
    @PutMapping("/{id}")
    public String updateKangaroo(@PathVariable int id, @RequestBody Kangaroo updatedKangaroo) {
        if (!kangaroos.containsKey(id)) {
            return "Kangaroo not found!";
        }
        updatedKangaroo.setId(id); // Ensure ID consistency
        kangaroos.put(id, updatedKangaroo);
        return "Kangaroo updated successfully!";
    }

    // Delete a kangaroo
    @DeleteMapping("/{id}")
    public String deleteKangaroo(@PathVariable int id) {
        if (kangaroos.remove(id) != null) {
            return "Kangaroo deleted successfully!";
        } else {
            return "Kangaroo not found!";
        }
    }
}
