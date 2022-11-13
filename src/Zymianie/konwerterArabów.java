package Zymianie;

import java.util.HashMap;

public class konwerterArabów {
    static HashMap<Integer,String> jednosci = new HashMap<Integer,String>();
    static HashMap<Integer,String> dziesiatki = new HashMap<Integer,String>();
    static HashMap<Integer,String> setki = new HashMap<Integer,String>();
    static HashMap<Integer,String> tysiace = new HashMap<Integer,String>();
    static HashMap<Integer,HashMap<Integer,String>> slownik_slownikow = new HashMap<Integer,HashMap<Integer,String>>();


    public static void Wypelnij(){
        jednosci.put(0,"");
        jednosci.put(1,"I");
        jednosci.put(2,"II");
        jednosci.put(3,"III");
        jednosci.put(4,"IV");
        jednosci.put(5,"V");
        jednosci.put(6,"VI");
        jednosci.put(7,"VII");
        jednosci.put(8,"VIII");
        jednosci.put(9,"IX");
        dziesiatki.put(0,"");
        dziesiatki.put(1,"X");
        dziesiatki.put(2,"XX");
        dziesiatki.put(3,"XXX");
        dziesiatki.put(4,"XL");
        dziesiatki.put(5,"L");
        dziesiatki.put(6,"LX");
        dziesiatki.put(7,"LXX");
        dziesiatki.put(8,"LXXX");
        dziesiatki.put(9,"XC");
        setki.put(0,"");
        setki.put(1,"C");
        setki.put(2,"CC");
        setki.put(3,"CCC");
        setki.put(4,"CD");
        setki.put(5,"D");
        setki.put(6,"DC");
        setki.put(7,"DCC");
        setki.put(8,"DCCC");
        setki.put(9,"CM");
        tysiace.put(1,"M");
        tysiace.put(2,"MM");
        tysiace.put(3,"MMM");
        slownik_slownikow.put(0,jednosci);
        slownik_slownikow.put(1,dziesiatki);
        slownik_slownikow.put(2,setki);
        slownik_slownikow.put(3,tysiace);




    }
    public static String konwerter(int liczba){
        StringBuffer sb = new StringBuffer();
        String napis="";
        String napisLiczbowy =  Integer.toString(liczba);
        if (liczba<=3999){
            for (int i = 0; i <napisLiczbowy.length() ; i++) {
                sb.insert(0,slownik_slownikow.get(i).get(Integer.parseInt(String.valueOf(napisLiczbowy.charAt(napisLiczbowy.length()-i-1)))));

            }
            napis = sb.toString();


        } else{
            System.out.println("podaj normalną wartość człowieku");
        }

        return napis;
    }
    public static void main(String[] args){
        Wypelnij();
        System.out.println(konwerter(200));

    }
}
