package org.example;

import java.util.List;

public class Inscripcion {
   private Alumno persona;
   private List<Materia> materias;

   public Inscripcion(Alumno persona, List<Materia> materias) {
       this.persona = persona;
       this.materias = materias;
   }

   public Boolean aprobada(){
       return this.materias
               .stream()
               .allMatch(m -> persona.puedeCursar(m));
   }

   public Alumno getPersona() {
       return persona;
   }
   public void setPersona(Alumno persona) {
       this.persona = persona;
   }

    public List<Materia> getMaterias() {
        return materias;
    }
    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}