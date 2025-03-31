package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    public void cargarInscripcion(){
        List<Materia> materiasAprobadas = new ArrayList<>();
        Alumno unAlumno = new Alumno("Fausto", "Rodriguez", 2140720, materiasAprobadas);

        List<Materia> materiasDeseadas = new ArrayList<>();

        List<Materia> materiasRequeridasPdp = new ArrayList<>();
        Materia pdp = new Materia("pdp", materiasRequeridasPdp);

        materiasDeseadas.add(pdp);

        Inscripcion unaInscripcion = new Inscripcion(unAlumno,materiasDeseadas);

        Assertions.assertEquals("Fausto",unaInscripcion.getPersona().getNombre());
        Assertions.assertEquals("Rodriguez",unaInscripcion.getPersona().getApellido());
        Assertions.assertTrue(unaInscripcion.getMaterias().stream().anyMatch(materia -> materia.getNombre().equals("pdp")));
    }

    @Test
    public void inscripcionAprobada(){
        List<Materia> materiasAprobadas = new ArrayList<>();
        Alumno unAlumno = new Alumno("Fausto", "Rodriguez", 2140720, materiasAprobadas);

        List<Materia> materiasDeseadas = new ArrayList<>();

        List<Materia> materiasRequeridasPdp = new ArrayList<>();
        Materia pdp = new Materia("pdp", materiasRequeridasPdp);

        materiasDeseadas.add(pdp);

        Inscripcion unaInscripcion = new Inscripcion(unAlumno,materiasDeseadas);

        Assertions.assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void inscripcionRechazada(){
        List<Materia> materiasRequeridasAm2 = new ArrayList<>();
        Materia am2 = new Materia("am2", materiasRequeridasAm2);

        List<Materia> materiasRequeridasAga = new ArrayList<>();
        Materia aga = new Materia("aga", materiasRequeridasAga);
        materiasRequeridasAm2.add(aga);

        List<Materia> materiasAprobadas = new ArrayList<>();
        Alumno unAlumno = new Alumno("Fausto", "Rodriguez", 2140720, materiasAprobadas);

        List<Materia> materiasDeseadas = new ArrayList<>();

        materiasDeseadas.add(am2);

        Inscripcion unaInscripcion = new Inscripcion(unAlumno,materiasDeseadas);

        Assertions.assertFalse(unaInscripcion.aprobada());
    }
}