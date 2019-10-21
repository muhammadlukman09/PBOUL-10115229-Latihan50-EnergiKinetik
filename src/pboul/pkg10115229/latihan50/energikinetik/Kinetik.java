/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan50.energikinetik;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 */
public class Kinetik {
      private int massa;
    private int kec;
    
    public Kinetik(){}

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }


    public int getKec() {
        return kec;
    }

    public void setKec(int kec) {
        this.kec = kec;
    }
    
    public double energiKinetik(){
        double ek;
            ek = 0.5 * massa * (kec * kec);
        return ek;
    }
    
    public double besarUsaha(){
        double gaya;
        gaya = massa * kec;
        return gaya;
    }
    
}
