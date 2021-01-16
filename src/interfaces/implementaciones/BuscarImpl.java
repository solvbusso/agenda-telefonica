package interfaces.implementaciones;

import interfaces.IBuscarContactos;
import modelos.Contacto;
import modelos.enumerador.TipoNumero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuscarImpl implements IBuscarContactos {

    @Override
    public List<Contacto> buscarContactoPorNombre(Set<Contacto> contactos, String nombre) {
        List<Contacto> contactosPorNombre = new ArrayList<>();

        for (Contacto contactoIterador : contactos) {
            if (contactoIterador.getNombre().equals(nombre)) {
                contactosPorNombre.add(contactoIterador);
            }
        }
        return contactosPorNombre;
    }

    @Override
    public List<Contacto> buscarContactoPorApellido(Set<Contacto> contactos, String apellido) {
        List<Contacto> contactosPorApellido = new ArrayList<>();

        for (Contacto contactoIterador : contactos) {
            if (contactoIterador.getApellido().equals(apellido)) {
                contactosPorApellido.add(contactoIterador);
            }
        }
        return contactosPorApellido;
    }

    @Override
    public Contacto buscarContactoPorNumero(Set<Contacto> contactos, int numero) {
        Contacto contactoPorNumero = null;

        for (Contacto contactoIterador : contactos) {
            if (contactoIterador.getNumeroTelefonico() == (numero)) {
                contactoPorNumero = contactoIterador;
            }
        }
        return contactoPorNumero;
    }

    @Override
    public List<Contacto> buscarPorTipoNumero(Set<Contacto> contactos, TipoNumero tipoNumero) {
        List<Contacto> buscartipoDeNumero = new ArrayList<>();

        for (Contacto contactoIterador : contactos) {
            if (tipoNumero.equals(contactoIterador.getTipoNumero())) {
                buscartipoDeNumero.add(contactoIterador);
            }
        }
        return buscartipoDeNumero;
    }
}

