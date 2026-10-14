package com.senai.singleton.entidades;

import java.util.ArrayList;

public class Teste {

    public void testar(){
        for (Carro c : Singleton.getInstance().carros) {
            System.out.println(c.getModelo());
        }
    }

}
