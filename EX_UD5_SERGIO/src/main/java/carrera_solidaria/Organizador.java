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

    //recorre la lista de corredores e imprime el nombre de cada corredor.
    public void mostrarCorredores() {
        System.out.println("Corredores inscritos: " + listaCorredores.size());
        int i = 0;
        for (Corredor corredor : listaCorredores) {
            i++;
            System.out.println("    [" + i + "]. " + corredor.getNombre());
        }
    }

    //Si no hay mas de 700 corredores añade el corredor a la lista de corredores si no un mensjae indica que el limite se ha alcanzado
    public void inscribir_corredor(Corredor corredor) {
        if (listaCorredores.size() <= 700) {
            listaCorredores.add(corredor);
            System.out.println("Nueva inscripción realizada. Corredor : " + corredor.getNombre() + " con dorsal" + corredor.getDorsal());
        } else {
            System.out.println("Limite de participantes alcanzado");
        }
    }

    // calcula la donacion total multiplicando el numero de vueltas por el importe de vuelta
    public void calcularDonacion(Corredor corredor) {
        double donacionTotal = corredor.getImporte_vuelta() * corredor.getVueltas_completadas();
        System.out.println("El corredor " + corredor.getNombre() + " donará " + donacionTotal + " €");
    }


}
