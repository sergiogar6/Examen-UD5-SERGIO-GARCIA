package carrera_solidaria;

import java.util.ArrayList;
import java.util.Arrays;

public class Corredor {
    private String nombre;
    private int dorsal;
    private ArrayList<String> listaPatrocinadores;
    private double importe_vuelta;
    private int vueltas_completadas = 0;
    private int count=0;

    public Corredor(String nombre, double importe_vuelta) {
        count++;
        this.nombre = nombre;
        this.dorsal = count;
        setImporte_vuelta(importe_vuelta);
        this.importe_vuelta = importe_vuelta;
        listaPatrocinadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public ArrayList<String> getListaPatrocinadores() {
        return listaPatrocinadores;
    }

    public double getImporte_vuelta() {
        return importe_vuelta;
    }

    public void setImporte_vuelta(double importe_vuelta) {
        if (importe_vuelta < 0.5) {
            this.importe_vuelta = 0.5;
        } else {
            this.importe_vuelta = importe_vuelta;
        }
    }

    public int getVueltas_completadas() {
        return vueltas_completadas;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "nombre='" + nombre + '\'' +
                ", dorsal=" + dorsal +
                ", listaPatrocinadores=" + listaPatrocinadores +
                ", importe_vuelta=" + importe_vuelta +
                ", vueltas_completadas=" + vueltas_completadas +
                ", count=" + count +
                '}';
    }

    public void setVueltas_completadas(int vueltas_completadas) {
        this.vueltas_completadas = vueltas_completadas;
    }

    public void insertarPatrocinador(String... patrocinadores) {
        listaPatrocinadores.addAll(Arrays.asList(patrocinadores));
        System.out.println("Nuevos patrocinadores añadidos para el corredor " + this.nombre);
    }

}
