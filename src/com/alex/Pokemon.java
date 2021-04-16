package com.alex;

import java.util.Random;

public abstract class Pokemon implements Atacable, Defensable{
    Random random = new Random();
    int energia = 100;
    double vida = Math.random()*(300-500+1)+500;
    String nom;
    int dany_base;
    int defensa;
    int precision;
    int atac;

    @Override
    public String toString() {
        return "Pokemon{" +
                "energia=" + energia +
                ", vida=" + vida +
                ", nom='" + nom + '\'' +
                ", dany_base=" + dany_base +
                ", defensa=" + defensa +
                ", precision=" + precision +
                '}';
    }

    public void resetStats(){
        double vida = Math.random()*(300-500+1)+500;
        int energia = 100;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDany_base() {
        return dany_base;
    }

    public void setDany_base(int dany_base) {
        this.dany_base = dany_base;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getAtacFinal() {
        return atac;
    }

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
