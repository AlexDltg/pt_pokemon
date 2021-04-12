package com.alex;

import java.util.Random;

public abstract class Pokemon implements Atacable, Defensable{
    Random random = new Random();
    String nom;
    int energia = 100;
    double vida = Math.random()*(300-500+1)+500;
    int dany_base;
    int defensa;
    int precision;
    int atac;

    public void setAtac(int atac) {
        this.atac = atac;
    }

    public Pokemon(String nom, int dany_base, int defensa, int precision) {
        this.nom = nom;
        this.dany_base = dany_base;
        this.defensa = defensa;
        this.precision = precision;
    }

}
