package interfaces.implementaciones;

import interfaces.IModificarContactos;
import modelos.Contacto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ModificarImpl implements IModificarContactos {

    @Override
    public List<Contacto> modificarNumero(Set<Contacto> poblarContactos, int numero, int nuevoNumero) {
        List<Contacto> numerosModificados = new ArrayList<>();

        for (Contacto contactoIterador : poblarContactos) {
            if (contactoIterador.getNumeroTelefonico() == numero) {
                contactoIterador.setNumeroTelefonico(nuevoNumero);
                numerosModificados.add(contactoIterador);
            }
        }
        return numerosModificados;
    }

    @Override
    public List<Contacto> modificarNombre(Set<Contacto> poblarContactos, String nombre, String nuevoNombre) {
        List<Contacto> nombresModificados = new ArrayList<>();

        for (Contacto contactoIterador : poblarContactos) {
            if (contactoIterador.getNombre().equals(nombre)) {
                contactoIterador.setNombre(nuevoNombre);
                nombresModificados.add(contactoIterador);
            }
        }
        return nombresModificados;
    }
}
