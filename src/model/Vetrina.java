package model;

import model.titoli.TitoliInt;

import java.util.ArrayList;

public class Vetrina extends ArrayList<TitoliInt> {
    static Vetrina v ;
    private Vetrina(){

    }

    public Vetrina getInstance(){
        if(v==null)
            v=new Vetrina();
        return v;
    }


}
