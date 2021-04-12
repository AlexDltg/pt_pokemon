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
}
