package org.example;

public class Restoran {
    private int kol_voStolov;
    private String name;
    boolean svoboden;

    Restoran (String name, int kol_voStolov, boolean svoboden ){
        this.kol_voStolov = kol_voStolov;
        this.name = name;
        this.svoboden = svoboden;
    }

    public int getKol_voStolov() {
        return kol_voStolov;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Restoran[] restoran = new Restoran[2];
        Restoran kapitol = new Restoran("Kapitol",8, true);
        Restoran perchini = new Restoran("Perchini", 20, true);

        restoran[0] = kapitol;
        restoran[1] = perchini;

        RestoranService restoranService = new RestoranService();

        restoranService.pechataemSvobodnieMesta(restoran);
    }

}
