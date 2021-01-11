package interfaces;

import modelos.Contacto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface IModificarContactos {
    List<Contacto> modificarNumero(Set<Contacto> poblarContactos, int numero, int nuevoNumero);
    List<Contacto> modificarNombre(Set<Contacto> poblarContactos, String nombre, String nuevoNombre);
}
