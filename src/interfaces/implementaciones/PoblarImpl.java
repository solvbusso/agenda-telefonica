package interfaces.implementaciones;

import interfaces.IPoblarContactos;
import modelos.Contacto;
import modelos.enumerador.TipoNumero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PoblarImpl implements IPoblarContactos {

    @Override
    public Set<Contacto> poblarContactos() {
        Set<Contacto> contactos = new HashSet<>();

        Contacto gaby = new Contacto("Gaby", "Vega", 1234,TipoNumero.CASA);
        Contacto mariaJose = new Contacto("Maria Jose", "Vega", 112,TipoNumero.PERSONAL);
        Contacto daissy = new Contacto("Daissy", "Quishpe", 2234,TipoNumero.PERSONAL);
        Contacto daissy2 = new Contacto("Daissy", "Perez", 2234);
        Contacto sol = new Contacto("Sol", "Vazquez", 6543,TipoNumero.TRABAJO);
        Contacto sol2 = new Contacto("Sol", "Vazquez", 6543,TipoNumero.CASA);

        contactos.add(gaby);
        contactos.add(mariaJose);
        contactos.add(daissy);
        contactos.add(daissy2);
        contactos.add(sol);
        contactos.add(sol2);


        return contactos;
    }
}
