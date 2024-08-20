package com.app_mockito.services.Impl;

import java.util.Arrays;
import java.util.List;

import com.app_mockito.models.Examen;

public class Datos {
    public final static List<Examen> EXAMENES = Arrays.asList(
            new Examen(1L, "Programación"),
            new Examen(2L, "Sistemas Informáticos"),
            new Examen(3L, "Ciberseguridad"));

    public final static List<String> PREGUNTAS = Arrays.asList("desarrollo", "calculo", "algoritmo", "matemáticas");

    public final static Examen examen=new Examen(null, "Seguridad Informática");
}
