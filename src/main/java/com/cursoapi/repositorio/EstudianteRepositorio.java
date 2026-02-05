package com.cursoapi.repositorio;


import com.cursoapi.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteRepositorio {
    private final List<Estudiante> estudiantes = new ArrayList<>(
            List.of(
                    new Estudiante("Max", "García", "12345", 19),
                    new Estudiante("Mariana", "Flores", "14456", 19),
                    new Estudiante("Emmanuel", "Serrano", "14490", 22)
            )
    );

    public List<Estudiante> buscarTodos(){
        return estudiantes;
    }








}
