package modelos;

import modelos.enums.TipoNumero;

import java.util.Objects;

public class Contacto extends Persona{
    private int numeroTelefonico;
    private TipoNumero tipoNumero;

    public Contacto(String nombre, String apellido, int numeroTelefonico, TipoNumero tipoNumero) {
        super(nombre, apellido);
        this.numeroTelefonico = numeroTelefonico;
        this.tipoNumero = tipoNumero;
    }

    public Contacto(String nombre, String apellido, int numeroTelefonico) {
        super(nombre, apellido);
        this.numeroTelefonico = numeroTelefonico;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(TipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre ='" + getNombre() + '\'' +
                ", apellido ='" + getApellido() + '\'' +
                ", numeroTelefonico =" + numeroTelefonico + '\'' +
                ", tipoDeNumero ='" + tipoNumero + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return numeroTelefonico == contacto.numeroTelefonico &&
                Objects.equals(tipoNumero, contacto.tipoNumero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroTelefonico, tipoNumero);
    }
}



