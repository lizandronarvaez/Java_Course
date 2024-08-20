package com.app_mockito.services.Impl;

import com.app_mockito.models.Examen;
import com.app_mockito.repository.ExamenRepository;
import com.app_mockito.repository.PreguntaRepository;
import com.app_mockito.services.ExamenService;
import java.util.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ExamenServiceImplTest {

    // TODO!!: APLICANDO MOCK COMO @ANOTACION
    @Mock
    private ExamenRepository examenRepository;

    @Mock
    private PreguntaRepository preguntaRepository;

    @InjectMocks
    private ExamenServiceImpl examenServiceImpl;

    // Antes de cada test asigname esto
    @BeforeEach
    void setUp() {
        // Aplicar los mocks
        MockitoAnnotations.openMocks(this);

        // TODO:!!APLICANDO MOCK de manera estatica sin anotacion
        // examenRepository = mock(ExamenRepository.class);
        // preguntaRepository = mock(PreguntaRepository.class);
        // examenService = new ExamenServiceImpl(examenRepository, preguntaRepository);
    }

    @Test
    void testFindExamenPorNombre() {
        // Cuando llames al metodo findAll me retornaras estos datos
        when(examenRepository.findAll()).thenReturn(Datos.EXAMENES);

        Optional<Examen> examen = examenServiceImpl.findExamenPorNombre("Ciberseguridad");

        // Verifica que no es nulo
        assertTrue(examen.isPresent());

        // Verifica que el id es igual al que esta buscando
        assertEquals(3L, examen.orElseThrow().getId());

        // verifica que el nombr es igual
        assertEquals("Ciberseguridad", examen.get().getNombre());

    }

    @Test
    void testFindExamenPorNombreListaVacia() {

        List<Examen> datos = Collections.emptyList();

        // Cuando llames al metodo findAll me retornaras estos datos
        when(examenRepository.findAll()).thenReturn(datos);

        Optional<Examen> examen = examenServiceImpl.findExamenPorNombre("Ciberseguridad");

        // Verifica que no es nulo
        assertFalse(examen.isPresent());
    }

    @Test
    void testFindPreguntasPorExamenId() {

        when(this.examenRepository.findAll()).thenReturn(Datos.EXAMENES);
        when(this.preguntaRepository.findPreguntasPorExamenId(anyLong())).thenReturn(Datos.PREGUNTAS);

        Examen examen = examenServiceImpl.findExamenPorNombreConPreguntas("Programación");

        // PRUEBAS
        assertEquals(4, examen.getPreguntas().size());
        assertTrue(examen.getPreguntas().contains("calculo"));
    }

    @Test
    void testPreguntasExamenVerify() {

        when(this.examenRepository.findAll()).thenReturn(Datos.EXAMENES);
        when(this.preguntaRepository.findPreguntasPorExamenId(anyLong())).thenReturn(Datos.PREGUNTAS);

        Examen examen = examenServiceImpl.findExamenPorNombreConPreguntas("Programación");

        // PRUEBAS
        assertEquals(4, examen.getPreguntas().size());
        assertTrue(examen.getPreguntas().contains("calculo"));
        verify(this.examenRepository).findAll();
        verify(this.preguntaRepository).findPreguntasPorExamenId(1L);
    }

    @Test
    void testGuardarExamen() {
        when(this.examenRepository.guardar(any(Examen.class))).thenReturn(Datos.examen);

        Examen examen = this.examenServiceImpl.guardar(Datos.examen);

        assertEquals(5, examen.getId());
        assertEquals("Seguridad Informática", examen.getNombre());
        verify(this.examenRepository).guardar(any(Examen.class));
        verify(this.preguntaRepository).guardarVarias(anyList());
    }
    
}
