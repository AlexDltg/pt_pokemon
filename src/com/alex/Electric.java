package com.alex;

public class Electric extends Pokemon{
    public Electric(String nom) {
        super(nom, 14, 11, 83);
        setAtac(getAtac());
    }

    @Override
    public int getAtac() {
        switch (random.nextInt(2)+1)  {
            case 1:
                return (int) (dany_base + Math.random()*(30-90+1)+90 + 12);
            case 2:
                return (int) (dany_base + Math.random()*(30-90+1)+90 + 7);
        }
        return 0;
    }
}
