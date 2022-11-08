package GraWZycie;

public class Gra {
    public static void main(String[] args) {

        Matrix obecny= new Matrix(5,5);
        obecny.WypelnijMacierz();

        while(true){
            obecny.WyprintujMacierzSrodek();
            obecny = obecny.Next();
            System.out.println();


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }



    }
}
