package Saper;

import java.util.Random;



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
        UstawBomby(rzad + 1,kolumna + 1);
        PoliczIleBombGraniczy();
        Odkryj(rzad+1, kolumna+1);

    }
    public void UstawBomby(int rzad, int kolumna){
        Random rn = new Random();
        for (int i = 1; i <Dlugosc+1 ; i++) {
            for (int j = 1; j <Szerokosc+1 ; j++) {
                if(rn.nextInt(8)==1&& (rzad != i && kolumna != j)){
                    plansza[i][j].setCzyBomba(true);
                }
            }
        }
    }
    public void WyprintujPlansze(){
        for (int i = 0; i <Dlugosc+1 ; i++) {
            for (int j = 0; j <Szerokosc+1 ; j++) {
                if (i == 0 || j == 0) {
                    if(i == 0 && j == 0)
                        System.out.print("    ");
                    if(i == 0 && j != 0)
                        System.out.printf("%-4d", (j - 1));
                    if(j == 0 && i != 0)
                        System.out.printf("%-4d", (i - 1));
                }
                else {
                    if (plansza[i][j].getStan() == "zakryty") {
                        System.out.print("■   ");
                    } else {
                        if(plansza[i][j].getStan() == "flaga"){
                            System.out.print("▲   ");
                        }
                        else {
                            if (plansza[i][j].getIleBombGraniczy() == 0)
                                System.out.print("□   ");
                            else
                                System.out.print(plansza[i][j].getIleBombGraniczy() + "   ");
                        }
                    }
                }
            }
            System.out.println();
        }
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────");
    }
    public void WyprintujBomby(){
        for (int i = 1; i <Dlugosc+1 ; i++) {
            for (int j = 1; j <Szerokosc+1 ; j++) {
                System.out.printf("%10b",plansza[i][j].getCzyBomba());


            }
            System.out.println();

        }

    }
    public void WyprintujIleBombGraniczy(){
        for (int i = 1; i <Dlugosc+1 ; i++) {
            for (int j = 1; j <Szerokosc+1 ; j++) {
                System.out.printf("%10d",plansza[i][j].getIleBombGraniczy());


            }
            System.out.println();

        }

    }
    public void PoliczIleBombGraniczy(){
        int wynik;
        for (int i = 1; i <Dlugosc+1 ; i++) {
            for (int j = 1; j <Szerokosc+1 ; j++) {
                wynik=0;
                if(plansza[i+1][j].getCzyBomba()){
                    wynik++;
                }
                if(plansza[i+1][j+1].getCzyBomba()){
                    wynik++;
                }
                if(plansza[i+1][j-1].getCzyBomba()){
                    wynik++;                 }
                if(plansza[i][j+1].getCzyBomba()){
                    wynik++;                 }
                if(plansza[i][j-1].getCzyBomba()){
                    wynik++;                 }
                if(plansza[i-1][j-1].getCzyBomba()){
                    wynik++;                 }
                if(plansza[i-1][j+1].getCzyBomba()){
                    wynik++;                 }
                if(plansza[i-1][j].getCzyBomba()){
                    wynik++;
                }
                plansza[i][j].setIleBombGraniczy(wynik);
            }
        }
    }
    public void Odkryj(int x, int y){



        plansza[x][y].setStan("odkryty");
        if(plansza[x][y].getIleBombGraniczy()==0) {

            if (plansza[x + 1][y].getIleBombGraniczy() == 0 && plansza[x + 1][y].getStan() != "odkryty") {
                Odkryj(x + 1, y);
            }
            if(plansza[x+1][y+1].getIleBombGraniczy()==0 && plansza[x+1][y+1].getStan() != "odkryty"){
                Odkryj(x+1,y+1);
            }
            if(plansza[x+1][y-1].getIleBombGraniczy()==0 && plansza[x+1][y-1].getStan() != "odkryty"){
                Odkryj(x+1,y-1);
            }
            if(plansza[x-1][y-1].getIleBombGraniczy()==0 && plansza[x-1][y-1].getStan() != "odkryty"){
                Odkryj(x-1,y-1);
            }
            if(plansza[x-1][y+1].getIleBombGraniczy()==0 && plansza[x-1][y+1].getStan() != "odkryty"){
                Odkryj(x-1,y+1);
            }
            if (plansza[x - 1][y].getIleBombGraniczy() == 0 && plansza[x - 1][y].getStan() != "odkryty") {
                Odkryj(x - 1, y);
            }
            if (plansza[x][y + 1].getIleBombGraniczy() == 0 && plansza[x][y + 1].getStan() != "odkryty") {
                Odkryj(x, y + 1);
            }
            if (plansza[x][y - 1].getIleBombGraniczy() == 0 && plansza[x][y - 1].getStan() != "odkryty") {
                Odkryj(x, y - 1);
            }

            plansza[x + 1][y].setStan("odkryty");
            plansza[x + 1][y + 1].setStan("odkryty");
            plansza[x + 1][y - 1].setStan("odkryty");   //Odkryj sąsiadów
            plansza[x - 1][y - 1].setStan("odkryty");
            plansza[x - 1][y + 1].setStan("odkryty");
            plansza[x - 1][y].setStan("odkryty");
            plansza[x][y + 1].setStan("odkryty");
            plansza[x][y - 1].setStan("odkryty");
        }


    }

    public void Wybierz(int rzad, int kolumna){
        int x, y;
        x = rzad + 1;
        y = kolumna + 1;
        if(plansza[x][y].getCzyBomba()){
            System.out.println("Bomba wybuchła");
        } else{
            Odkryj(x, y);
        }



    }




}
