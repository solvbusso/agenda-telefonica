package interfaces.implementaciones;

import interfaces.IEliminarContactos;
import modelos.Contacto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EliminarImpl implements IEliminarContactos {
    @Override
    public Set<Contacto> eliminarContactosPorNombreyApellido(Set<Contacto> contactos, String nombre, String apellido) {
        List<Contacto> contactosAEliminar = new ArrayList<>();

        for (Contacto eliminaIterador : contactos) {
            if (eliminaIterador.getApellido().equals(apellido) && eliminaIterador.getNombre().equals(nombre)) {
                contactosAEliminar.add(eliminaIterador);
            }
        }
        contactos.removeAll(contactosAEliminar);
        return contactos;
    }

    @Override
    public Set<Contacto> eliminarContactosPorNombre(Set<Contacto> contactos, String nombre) {
        Contacto contactoAEliminar = null;

        for (Contacto eliminaIterador : contactos) {
            if (eliminaIterador.getNombre().equals(nombre)) {
                contactoAEliminar = eliminaIterador;
            }
        }
        contactos.remove(contactoAEliminar);
        return contactos;
    }
}
