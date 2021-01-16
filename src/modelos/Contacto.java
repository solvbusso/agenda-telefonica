package modelos;

import modelos.enumerador.TipoNumero;

import java.util.Objects;

public class Contacto extends Persona{
    private int numeroTelefonico;
    TipoNumero tipoNumero;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return numeroTelefonico == contacto.numeroTelefonico &&
                Objects.equals(tipoNumero, contacto.tipoNumero);
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "numeroTelefonico=" + numeroTelefonico +
                ", tipoNumero=" + tipoNumero +
                "} " + super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroTelefonico, tipoNumero);
    }
}



