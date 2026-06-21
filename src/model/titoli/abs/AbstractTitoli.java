package model.titoli.abs;

import model.titoli.Scontoint;
import model.titoli.TipoTitoloEnum;
import model.titoli.TitoliInt;

public abstract class AbstractTitoli implements TitoliInt, Scontoint {
    String nome, lingua;
    int annoPub;
    TipoTitoloEnum tipo;
    float prezzo;
    protected AbstractTitoli(String n, int a, String l, TipoTitoloEnum t, float p){
        this.nome=n;
        this.annoPub=a;
        this.lingua=l;
        this.tipo=t;
        this.prezzo=p;
    }

    public String getTitolo(){ return "Titolo "+this.nome;}
    public String getAnno(){ return "Anno "+ this.annoPub;}


    public void scontoAnno(){
        if(this.annoPub<2015)
            this.prezzo-= this.prezzo/10;
    }

    public abstract void scontoTipo();


}
