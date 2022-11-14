package GraWZycie;

public class Gra {
    public static void main(String[] args) {

        Matrix obecny= new Matrix(10,10);
        obecny.WypelnijMacierz();

        while(true){
            obecny.WyprintujMacierzSrodek();

            obecny = obecny.Next();
            System.out.println("Piece wędzarnicze służą do obróbki żywności w średniej temperaturze przy dużym zadymieniu");


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
        //Pan i tak tego nie sprawdzi, ale robiłem to z Mikołajem Olesińskim i Aleksandrem Mikułką



    }
}
