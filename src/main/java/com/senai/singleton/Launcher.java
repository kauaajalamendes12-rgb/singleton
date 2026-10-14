package com.senai.singleton;

import com.senai.singleton.entidades.Carro;
import com.senai.singleton.entidades.Singleton;
import com.senai.singleton.entidades.Teste;
import javafx.application.Application;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
//        Application.launch(HelloApplication.class, args);

        Carro c1 = new Carro(1999, "Prata", "Honda", "Civic EX Manual Vtec");
        Carro c2 = new Carro(2014, "Preto", "Volkswagen", "VW Beattle TSI EA888");
        Carro c3 = new Carro(1979, "Laranja", "Hazda", "7878");

       Singleton.getInstance().carros.add(c1);
       Singleton.getInstance().carros.add(c2);
       Singleton.getInstance().carros.add(c3);

        Teste teste = new Teste();
        teste.testar();


    }
}
