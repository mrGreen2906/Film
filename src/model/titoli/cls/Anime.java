package model.titoli.cls;

import model.titoli.TipoTitoloEnum;
import model.titoli.abs.AbstractTitoli;

import java.util.Objects;

public class Anime extends AbstractTitoli {
    String sottotitoli;
    protected Anime(String n, int a, String l, TipoTitoloEnum t, String s, int p) {
        super(n, a, l, t,p);
        if(Objects.equals(s, ""))
            this.sottotitoli="No sottotitoli";
        else
            this.sottotitoli = "Sottotitoli in "+s;
    }

    @Override
    public void scontoTipo() {

    }
}
