package com.app_mockito.repository;

import java.util.List;

import com.app_mockito.models.Examen;

public interface ExamenRepository {
    List<Examen> findAll();

    Examen guardar(Examen examen);
}
