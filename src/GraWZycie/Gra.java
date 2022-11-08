package GraWZycie;

public class Gra {
    public static void main(String[] args) {
        Matrix obecny= new Matrix(10,10);
        obecny.WypelnijMacierz();
        Matrix nastepny = obecny.Next();
        while(true){
            obecny.WyprintujMacierzZBarierami();
            nastepny.WyprintujMacierzZBarierami();
            obecny = nastepny;
            nastepny=obecny.Next();
        }

    }
}
