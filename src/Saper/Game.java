package Saper;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int poczatekx, poczateky;
        int strzalx, strzaly;
        int decyzja; // 0 - flaga 1- strzal
        Plansza board = new Plansza(10,10);
        board.WyprintujPlansze();

        Scanner scn = new Scanner(System.in);
        System.out.println("Podaj koordynaty inicjalne");
        poczatekx = scn.nextInt();
        poczateky = scn.nextInt();
        board.WybierzIRozpocznij(poczatekx,poczateky);
        board.WyprintujPlansze();
        while (board.getCzyGramy()) {
            System.out.println("Podaj koordynaty wyboru");
            decyzja = scn.nextInt();
            strzalx = scn.nextInt();
            strzaly = scn.nextInt();
            if(decyzja==0){
                board.getPlansza()[strzalx+1][strzaly+1].setStan("flaga");
            } else{
                if (decyzja ==1){
                    board.Wybierz(strzalx,strzaly);
                } else{
                    System.out.println("debilu miałeś dać 0 lub 1"); // dopisany scanner
                }
            }
            board.WyprintujPlansze();
        }




    }
}
