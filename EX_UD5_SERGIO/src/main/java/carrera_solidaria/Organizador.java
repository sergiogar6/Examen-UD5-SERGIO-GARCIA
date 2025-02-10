package carrera_solidaria;

import java.util.ArrayList;

public class Organizador {
    private final String nombre = "IES MUTXAMEL";
    private String edicion;
    private ArrayList<Corredor> listaCorredores;

    public Organizador(String edicion) {
        this.edicion = edicion;
        listaCorredores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public ArrayList<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    @Override
    public String toString() {
        return "Organizador{" +
                "nombre='" + nombre + '\'' +
                ", edicion='" + edicion + '\'' +
                ", listaCorredores=" + listaCorredores +
                '}';
    }

    public void mostrarCorredores() {
        System.out.println("Corredores inscritos: " + listaCorredores.size());
        int i = 0;
        for (Corredor corredor : listaCorredores) {
            i++;
            System.out.println("    [" + i + "]. " + corredor.getNombre());
        }
    }

    public void inscribir_corredor(Corredor corredor) {
        if (listaCorredores.size() <= 700) {
            listaCorredores.add(corredor);
            System.out.println("Nueva inscripción realizada. Corredor : " + corredor.getNombre() + " con dorsal" + corredor.getDorsal());
        } else {
            System.out.println("Limite de participantes alcanzado");
        }
    }

    public void calcularDonacion(Corredor corredor) {
        double donacionTotal = corredor.getImporte_vuelta() * corredor.getVueltas_completadas();
        System.out.println("El corredor " + corredor.getNombre() + " donará " + donacionTotal + " €");
    }


}
