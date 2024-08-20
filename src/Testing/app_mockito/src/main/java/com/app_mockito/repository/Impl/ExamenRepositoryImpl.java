package com.app_mockito.repository.Impl;

import java.util.*;
import com.app_mockito.models.Examen;
import com.app_mockito.repository.ExamenRepository;

public class ExamenRepositoryImpl implements ExamenRepository {

    @Override
    public List<Examen> findAll() {

        return Collections.emptyList();
        // return Arrays.asList(
        //         new Examen(1L, "Programación"),
        //         new Examen(2l, "Sistemas Informáticos"),
        //         new Examen(3L, "Ciberseguridad"));
    }

    @Override
    public Examen guardar(Examen examen) {
        return null;
    }
}
