package com.bulk.persona.PersonaBACKEND.rest;

import com.bulk.persona.PersonaBACKEND.model.Persona;
import com.bulk.persona.PersonaBACKEND.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/personas/")
public class PersonaRest {
    @Autowired
    private PersonaService personaService;


    @GetMapping
    private ResponseEntity<List<Persona>> getAllPersonas(){
        return ResponseEntity.ok(personaService.findAll());
    }
    @PostMapping
    private ResponseEntity<Persona> savePersona (@RequestBody Persona persona){
        try{
            Persona personaGuardada = personaService.save(persona);
            return ResponseEntity.created(new URI("/personas/"+personaGuardada.getId())).body(personaGuardada);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> deletePersona (@PathVariable("id") Long id){
        personaService.deleteById(id);
        return ResponseEntity.ok(!(personaService.findById(id)!=null));
    }

}
