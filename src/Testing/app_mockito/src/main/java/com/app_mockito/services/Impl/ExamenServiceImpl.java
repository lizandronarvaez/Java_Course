package com.app_mockito.services.Impl;

import java.util.*;

import com.app_mockito.models.Examen;
import com.app_mockito.repository.ExamenRepository;
import com.app_mockito.repository.PreguntaRepository;
import com.app_mockito.services.ExamenService;

public class ExamenServiceImpl implements ExamenService {

    private ExamenRepository examenRepository;
    private PreguntaRepository preguntaRepository;

    public ExamenServiceImpl(ExamenRepository examenRepository, PreguntaRepository preguntaRepository) {
        this.examenRepository = examenRepository;
        this.preguntaRepository = preguntaRepository;
    }

    @Override
    public Optional<Examen> findExamenPorNombre(String nombre) {

        return this.examenRepository.findAll().stream()
                .filter(item -> item.getNombre().equalsIgnoreCase(nombre.toLowerCase()))
                .findFirst();
    }

    @Override
    public Examen findExamenPorNombreConPreguntas(String nombre) {
        Optional<Examen> examenOptional = findExamenPorNombre(nombre);
        Examen examen = null;
        if (examenOptional.isPresent()) {
            examen = examenOptional.orElseThrow();
            List<String> preguntas = preguntaRepository.findPreguntasPorExamenId(examen.getId());
            examen.setPreguntas(preguntas);
        }
        return examen;
    }

    @Override
    public Examen guardar(Examen examen) {
        if (examen.getPreguntas().isEmpty())
            this.preguntaRepository.guardarVarias(examen.getPreguntas());
        return this.examenRepository.guardar(examen);
    }

}
