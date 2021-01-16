package interfaces;

import modelos.Contacto;
import modelos.enumerador.TipoNumero;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface IBuscarContactos {
    List<Contacto> buscarContactoPorNombre(Set<Contacto> contactos, String nombre);
    List<Contacto> buscarContactoPorApellido(Set<Contacto> contactos, String apellido);
    Contacto buscarContactoPorNumero(Set<Contacto> contactos, int numeroTelefonico);
    List<Contacto>buscarPorTipoNumero(Set<Contacto>contactos, TipoNumero tipoNumero);
}
