/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latohan44.hukum.ohm;

/**
 *
* @author Andri
 * Nama : Andri Dwi P
 * kelas: IF-1
 * NIM  : 10119014
 */
public class IF110119014Latohan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Baterai batt = new Baterai();
   Baterai batt1 = new Baterai(3,12);
   System.out.println("Kuat Arus : " + batt1.getKuatArus() +" ampere");
   System.out.println("Hambatan : " + batt1.getHambatan() + " ohm");
   System.out.println("Hasil Tegangan : " + batt1.hitungTegangan() + "volt");
    }
    
}
