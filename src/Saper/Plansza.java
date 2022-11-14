package Saper;

import java.util.Random;

public class Plansza {
    private int Dlugosc;
    private int Szerokosc;
    private Pole[][] plansza;

    public Plansza(int dlugosc, int szerokosc){
        this.Dlugosc = dlugosc;
        this.Szerokosc= szerokosc;
        this.plansza=new Pole[dlugosc+2][szerokosc+2];
        for (int i = 0; i <dlugosc+2 ; i++) {
            for (int j = 0; j <szerokosc+2 ; j++) {
                plansza[i][j]= new Pole();
            }
        }
    }


    public void  WybierzIRozpocznij(int rzad, int kolumna){
        plansza[rzad+1][kolumna+1].setStan(2);
        UstawBomby(rzad,kolumna);

    }
    public void UstawBomby(int rzad, int kolumna){
        Random rn = new Random();
        for (int i = 1; i <Dlugosc+1 ; i++) {
            for (int j = 1; j <Szerokosc+1 ; j++) {
                if(rn.nextInt(8)==1&& (rzad!=i && kolumna!=j)){
                    plansza[i][j].setCzyBomba(true);
                }
            }
        }
    }



}
