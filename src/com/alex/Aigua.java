package com.alex;

public class Aigua extends Pokemon {
    public Aigua(String nom) {
        super(nom, 15, 10, 80);
        setAtac(getAtac());
    }

    @Override
    public int getAtac() {
        switch (random.nextInt(3)+1)  {
            case 1:
                return (int) (dany_base + Math.random()*(30-90+1)+90 + 7);
            case 2:
                return (int) (dany_base + Math.random()*(30-90+1)+90 + 13);
            case 3:
                return (int) (dany_base + Math.random()*(30-90+1)+90 + 5);
        }
        return 0;
    }

    @Override
    public String getDefensa(Pokemon enemic, int atacEnemic) {
        int probabilidad = 10-getPrecision();
        int random10 = random.nextInt(probabilidad)+1;
        if (probabilidad != random10) return enemic.getNom() + "ha fallat el atac";
        if (enemic.getClass() == Foc.class) return "L’atac es poc efectiu. La vida s’ha reduït en" + (atacEnemic - getDefensa()*2) + " Punts la salut del pokemon" + getNom();
        else if (enemic.getClass() == Electric.class) return "Atac crític. La vida s’ha reduït en" + (3*atacEnemic - getDefensa()*2) + " Punts la salut del pokemon" + getNom();
        return "";
    }
}
