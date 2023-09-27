package com.example.EvaluacionJonnathanCrespo.controlador;

import com.example.EvaluacionJonnathanCrespo.datos.Datos;
import com.example.EvaluacionJonnathanCrespo.repositorio.Datosrepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controlador {


    private final Servicio servicio;

    @Autowired
    public Controlador(Servicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/insertardatos")
    public void insertardatos() {
         servicio.insertardatos();
    }

   /* @GetMapping("/titulos/{userId}")
    public List<String> getTitulos(@PathVariable Integer userId) {
        return servicio.getTitlesByUserId(userId);
    }*/


}
