package Saper;

public class Game {
    public static void main(String[] args) {
        Plansza board = new Plansza(10,10);
        board.WybierzIRozpocznij(2,2);
        board.PoliczIleBombGraniczy();

        board.WyprintujPlansze();
        board.WyprintujBomby();

        board.WyprintujIleBombGraniczy();
        board.Odkryj(6,6);
        board.WyprintujPlansze();
        board.WyprintujBomby();

        board.WyprintujIleBombGraniczy();
        // Tutaj musi być scanner;

    }
}
