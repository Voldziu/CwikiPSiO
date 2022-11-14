package Saper;

public class Pole {
    private boolean CzyBomba;
    private int stan; //1-zakryty, 2-odkryty 3-flaga
    private int IleBombGraniczy;

    public Pole(){
        this.CzyBomba = false;
        this.stan=1;
        this.IleBombGraniczy=0;

    }

    public Pole(boolean CzyBomba, int stan, int ileBombGraniczy){
        this.CzyBomba = CzyBomba;
        this.stan = stan;
        this.IleBombGraniczy=ileBombGraniczy;

    }

    public boolean getCzyBomba() {
        return CzyBomba;
    }

    public int getStan() {
        return stan;
    }

    public void setCzyBomba(boolean czyBomba) {
        this.CzyBomba = czyBomba;
    }

    public void setStan(int stan) {
        this.stan = stan;
    }

    public int getIleBombGraniczy() {
        return IleBombGraniczy;
    }

    public void setIleBombGraniczy(int ileBombGraniczy) {
        this.IleBombGraniczy = ileBombGraniczy;
    }
}
