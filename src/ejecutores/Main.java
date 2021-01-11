package ejecutores;

import interfaces.IBuscarContactos;
import interfaces.IEliminarContactos;
import interfaces.IModificarContactos;
import interfaces.IPoblarContactos;
import interfaces.implementaciones.BuscarImpl;
import interfaces.implementaciones.EliminarImpl;
import interfaces.implementaciones.ModificarImpl;
import interfaces.implementaciones.PoblarImpl;
import modelos.Contacto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        IPoblarContactos poblarContacto = new PoblarImpl();
        IBuscarContactos buscarContactos = new BuscarImpl();
        IModificarContactos modificarContactos = new ModificarImpl();
        IEliminarContactos eliminarContactos = new EliminarImpl();

        Set<Contacto> contactos = poblarContacto.poblarContactos();
        System.out.println(contactos);

        List<Contacto> contactosModificados = modificarContactos.modificarNombre(contactos, "Gaby", "Dany");
        System.out.println(contactosModificados);

        Set<Contacto> contactosEliminados = eliminarContactos.eliminarContactosPorNombre(contactos, "Daissy");
        System.out.println(contactosEliminados);

        Set<Contacto> contactosEliminadosPorNombreYApellido = eliminarContactos.eliminarContactosPorNombreyApellido(contactos, "Sol", "Vazquez");
        System.out.println(contactosEliminadosPorNombreYApellido);

        List<Contacto> contactosConElNombre = buscarContactos.buscarContactoPorNombre(contactos, "Maria Jose");
        System.out.println(contactosConElNombre);

        Contacto contactoConElNumero = buscarContactos.buscarContactoPorNumero(contactos, 1234);
        System.out.println(contactoConElNumero);

    }
}
