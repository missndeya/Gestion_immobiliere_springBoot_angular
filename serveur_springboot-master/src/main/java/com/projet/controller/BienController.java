package com.projet.controller;

import com.projet.doa.IBien;
import com.projet.entities.Bien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BienController {
    @Autowired
    private IBien bienRepo;

    @GetMapping(path = "/bien/all")
    public @ResponseBody
    Iterable<Bien> getAllBien()
    {
        return bienRepo.findAll();
    }

    @PostMapping("/bien/add")
    public Bien addBien(@RequestBody Bien p){
        return bienRepo.save(p);
    }
}

