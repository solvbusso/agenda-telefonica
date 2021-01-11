package modelos;

import java.util.Objects;

public class Contacto extends Persona{
    private int numeroTelefonico;
    private String tipoDeNumero;

    public Contacto(String nombre, String apellido, int numeroTelefonico, String tipoDeNumero) {
        super(nombre, apellido);
        this.numeroTelefonico = numeroTelefonico;
        this.tipoDeNumero = tipoDeNumero;
    }

    public Contacto(String nombre, String apellido, int numeroTelefonico) {
        super(nombre, apellido);
        this.numeroTelefonico = numeroTelefonico;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public String getTipoDeNumero() {
        return tipoDeNumero;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public void setTipoDeNumero(String tipoDeNumero) {
        this.tipoDeNumero = tipoDeNumero;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre ='" + getNombre() + '\'' +
                ", apellido ='" + getApellido() + '\'' +
                ", numeroTelefonico =" + numeroTelefonico + '\'' +
                ", tipoDeNumero ='" + tipoDeNumero + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return numeroTelefonico == contacto.numeroTelefonico &&
                Objects.equals(tipoDeNumero, contacto.tipoDeNumero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroTelefonico, tipoDeNumero);
    }
}



