package Zymianie;

import java.util.HashMap;

public class konwerterArabów {
    static HashMap<Integer,String> jednosci = new HashMap<Integer,String>();
    static HashMap<Integer,String> dziesiatki = new HashMap<Integer,String>();
    static HashMap<Integer,String> setki = new HashMap<Integer,String>();
    static HashMap<Integer,String> tysiace = new HashMap<Integer,String>();

    public static void Wypelnij(){
        jednosci.put(1,"I");
        jednosci.put(2,"II");
        jednosci.put(3,"III");
        jednosci.put(4,"IV");
        jednosci.put(5,"V");
        jednosci.put(6,"VI");
        jednosci.put(7,"VII");
        jednosci.put(8,"VIII");
        jednosci.put(9,"IX");
        dziesiatki.put(1,"X");
        dziesiatki.put(2,"XX");
        dziesiatki.put(3,"XXX");
        dziesiatki.put(4,"XL");
        dziesiatki.put(5,"L");
        dziesiatki.put(6,"LX");
        dziesiatki.put(7,"LXX");
        dziesiatki.put(8,"LXXX");
        dziesiatki.put(9,"XC");
        setki.put(1,"C");
        setki.put(2,"CC");
        setki.put(3,"CCC");
        setki.put(4,"CD");
        setki.put(5,"D");
        setki.put(6,"DC");
        setki.put(7,"DCC");
        setki.put(8,"DCCC");
        setki.put(9,"CM");
        tysiace.put(1,"C");




    }
//    public static String konwerter(int liczba){
//        String napisLiczbowy;
//
//        return napisLiczbowy;
//    }
    public static void main(String[] args){
        Wypelnij();

    }
}
