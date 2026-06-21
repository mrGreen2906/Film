package model.titoli.cls;

import model.titoli.TipoTitoloEnum;
import model.titoli.abs.AbstractTitoli;

public class Film extends AbstractTitoli {
    protected Film(String n, int a, String l, TipoTitoloEnum t, float p) {
        super(n, a, l, t, p);
    }

    @Override
    public void scontoTipo() {

    }
}
