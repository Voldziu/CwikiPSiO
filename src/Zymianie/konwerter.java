package Zymianie;

import java.util.HashMap;

public class konwerter {
    static HashMap<Character, Integer> slownik = new HashMap<Character, Integer>();
    public static void WypelnijSlownik() {

        slownik.put('I', 1);
        slownik.put('V', 5);
        slownik.put('X', 10);
        slownik.put('L', 50);
        slownik.put('C', 100);
        slownik.put('D', 500);
        slownik.put('M', 1000);



    }
    public static int Konwerter(String napis){
        int suma=0;
        int obecny,nastepny;
        for (int i = 0; i <napis.length()-1; i++) {
            obecny = slownik.get(napis.charAt(i));
            nastepny = slownik.get(napis.charAt(i+1));
            if(obecny<nastepny){
                suma-=obecny;
            }else{
                suma+=obecny;
            }
        }
        suma+=slownik.get(napis.charAt(napis.length()-1));
        return suma;

    }
    public static void main(String[] args){
        WypelnijSlownik();
        System.out.println(Konwerter("XXX"));

    }
}
