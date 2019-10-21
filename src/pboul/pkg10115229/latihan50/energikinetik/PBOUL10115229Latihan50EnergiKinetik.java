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
public class PBOUL10115229Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Kinetik kinetik = new Kinetik();
        kinetik.setMassa(145);
        kinetik.setKec(25);
        
        System.out.println("Diketahui :");
        System.out.println("Massa Benda : "+kinetik.getMassa()+" g");
        System.out.println("Kecepatan : "+kinetik.getKec()+" m/s");
        
        System.out.println("Hasil :");
        System.out.println("Energi Kinetik :"+kinetik.energiKinetik()+" Joule");
        System.out.println("Usaha :"+kinetik.besarUsaha());
    }
    
}
