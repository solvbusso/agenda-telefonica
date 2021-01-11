package interfaces.implementaciones;

import interfaces.IPoblarContactos;
import modelos.Contacto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PoblarImpl implements IPoblarContactos {

    @Override
    public Set<Contacto> poblarContactos() {
        Set<Contacto> contactos = new HashSet<>();

        Contacto gaby = new Contacto("Gaby", "Vega", 1234,"Fijo");
        Contacto mariaJose = new Contacto("Maria Jose", "Vega", 1122,"Celular");
        Contacto daissy = new Contacto("Daissy", "Quishpe", 2234);
        Contacto daissy2 = new Contacto("Daissy", "Perez", 2234);
        Contacto sol = new Contacto("Sol", "Vazquez", 6543,"Celular");
        Contacto sol2 = new Contacto("Sol", "Vazquez", 6543,"Celular");

        contactos.add(gaby);
        contactos.add(mariaJose);
        contactos.add(daissy);
        contactos.add(sol);
        contactos.add(sol2);

        return contactos;
    }
}
