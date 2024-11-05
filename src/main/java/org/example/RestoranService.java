package org.example;

public class RestoranService {
    public void pechataemSvobodnieMesta(Restoran[] restoran) {
        for (int i = 0; i < restoran.length; i++) {
            System.out.println(restoran[i].getName() + " " + restoran[i].getKol_voStolov() + "-svobodnih stolikov, " +
                    "posadochnih mest:" + (restoran[i].getKol_voStolov()*4));
           // return;
        }
    }
}
