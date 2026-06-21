package model.titoli.abs;

import model.titoli.TipoTitoloEnum;

public abstract class AbstractTitoli {
    String nome, lingua;
    int annoPub;
    TipoTitoloEnum tipo;

    protected AbstractTitoli(String n, int a, String l, TipoTitoloEnum t){
        this.nome=n;
        this.annoPub=a;
        this.lingua=l;
        this.tipo=t;
    }

    public String getTitolo(){ return "Titolo "+this.nome;}
    public String getAnno(){ return "Anno "+ this.annoPub;}




}
