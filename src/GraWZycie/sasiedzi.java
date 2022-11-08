package GraWZycie;

public class  sasiedzi{
    public static  int ile(int x, int y, int[][] macierz){
        int wynik=0;


        if (macierz[x+1][y]==1){
            wynik++;
        }if (macierz[x+1][y+1]==1) {
            wynik++;

        } if (macierz[x+1][y-1]==1) {
            wynik++;
        } if (macierz[x][y-1]==1) {
            wynik++;
        }if (macierz[x][y+1]==1) {
            wynik++;
        } if (macierz[x-1][y+1]==1) {
            wynik++;
        }
        if (macierz[x-1][y-1]==1) {
            wynik++;
        } if (macierz[x-1][y]==1) {
            wynik++;
        }



        return wynik;
    }
}
