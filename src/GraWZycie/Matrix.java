package GraWZycie;

import java.util.Arrays;

import java.util.Random;

public class Matrix {
    private int n;
    private int m;
    private int[][] Macierz;
    public Matrix(int m, int n){
        this.n = n;
        this.m = m;
        this.Macierz= new int[m+2][n+2];


    }

    public int[][] getMacierz() {
        return Macierz;
    }
    public void WypelnijMacierz(){
        Random rn = new Random();

        for (int i = 0; i <m+2 ; i++) {
            for (int j = 0; j <n+2 ; j++) {
                    Macierz[i][j]=-1;
                }

            }
        for (int i = 1; i <m+1 ; i++) {
            for (int j = 1; j <n+1 ; j++) {
                Macierz[i][j]=rn.nextInt(2);
                }

            }
        }
        public void WyprintujMacierzArray(){
        for (int i = 0; i <m+2 ; i++) {
            System.out.println(Arrays.toString(Macierz[i]));

        }
    }
    public void WyprintujMacierzZBarierami(){
        for (int i = 0; i <m+2; i++) {
            for (int j = 0; j <n+2 ; j++) {
                System.out.printf("%5d",Macierz[i][j]);
            }
            System.out.println();
        }
    }
    public void WyprintujMacierzSrodek(){
        for (int i = 1; i <m+1; i++) {
            for (int j = 1; j <n+1 ; j++) {
                System.out.printf("%5d",Macierz[i][j]);
            }
            System.out.println();
        }
    }
    public Matrix Next(){
        Matrix nastepny= new Matrix(m,n);

        for (int i = 1; i <Macierz.length-1 ; i++) {
            for (int j = 1; j <Macierz[i].length-1 ; j++) {
                if(Macierz[i][j]==1) {
                    if ((sasiedzi.ile(i, j, Macierz) == 2) || (sasiedzi.ile(i, j, Macierz) == 3)) {
                        nastepny.getMacierz()[i][j] = 1;
                    } else {
                        nastepny.getMacierz()[i][j] = 0;
                    }
                }else{
                    if (sasiedzi.ile(i,j,Macierz)==3){
                        nastepny.getMacierz()[i][j]=1;
                    }
                }
            }

        }
        return nastepny;

    }


}




