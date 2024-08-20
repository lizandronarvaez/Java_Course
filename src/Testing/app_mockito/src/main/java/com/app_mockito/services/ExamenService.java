package com.app_mockito.services;

import java.util.Optional;

import com.app_mockito.models.Examen;

public interface ExamenService {

    Optional<Examen> findExamenPorNombre(String nombre);

    Examen findExamenPorNombreConPreguntas(String nombre);

    Examen guardar(Examen examen);
}
