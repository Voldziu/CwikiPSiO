package GraWZycie;

public class Gra {
    public static void main(String[] args) {
        Matrix obecny= new Matrix(10,10);
        obecny.WypelnijMacierz();
        Matrix nastepny = obecny.Next();
        while(true){
            obecny.WyprintujMacierzZBarierami();
            obecny = nastepny;
            nastepny=obecny.Next();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }
}
