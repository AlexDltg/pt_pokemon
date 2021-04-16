package com.alex;

public class Foc extends Pokemon{
    public Foc(String nom) {
        super(nom, 16, 9, 82);
        setAtac(getAtac());
    }

    @Override
    public int getAtac() {
        switch (random.nextInt(2)+1)  {
            case 1:
                return (int) (dany_base + Math.random()*(30-90+1)+90 + 12);
            case 2:
                return (int) (dany_base + Math.random()*(30-90+1)+90 + 4);
        }
        return 0;
    }

    @Override
    public String getDefensa(Pokemon enemic, int atacEnemic) {
        return null;
    }
}
