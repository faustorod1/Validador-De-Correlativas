package org.example;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> materiasRequeridasParaCursar;

    public Materia(String nombre, List<Materia> materiasRequeridasParaCursar) {
        this.nombre = nombre;
        this.materiasRequeridasParaCursar = materiasRequeridasParaCursar;
    }

    public List<Materia> getMateriasRequeridasParaCursar() {
        return materiasRequeridasParaCursar;
    }
    public void setMateriasRequeridasParaCursar(List<Materia> materiasRequeridasParaCursar) {
        this.materiasRequeridasParaCursar = materiasRequeridasParaCursar;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
