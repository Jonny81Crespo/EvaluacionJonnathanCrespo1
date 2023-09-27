package com.example.EvaluacionJonnathanCrespo.repositorio;

import com.example.EvaluacionJonnathanCrespo.datos.Datos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Datosrepositorio extends JpaRepository<Datos,Integer> {

   // List<Datos> buscarid(Integer userId);
}
