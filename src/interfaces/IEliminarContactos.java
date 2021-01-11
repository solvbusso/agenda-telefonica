package interfaces;

import modelos.Contacto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface IEliminarContactos {
    Set<Contacto> eliminarContactosPorNombreyApellido(Set<Contacto> contactos, String nombre, String apellido);
    Set<Contacto> eliminarContactosPorNombre(Set<Contacto> contactos, String nombre);
}
