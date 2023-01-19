package com.bulk.persona.PersonaBACKEND.rest;

import com.bulk.persona.PersonaBACKEND.model.Pais;
import com.bulk.persona.PersonaBACKEND.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisRest {
    @Autowired
    private PaisService paisService;
    @GetMapping("/paises")
    private ResponseEntity<List<Pais>> getAllPaises (){
        return ResponseEntity.ok(paisService.findAll());
    }
}
