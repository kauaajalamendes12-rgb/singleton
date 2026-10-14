package com.senai.singleton.entidades;

import java.util.ArrayList;

public class Singleton {

    private static Singleton singleton;
    public ArrayList<Carro>  carros = new ArrayList<>();

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }


}
