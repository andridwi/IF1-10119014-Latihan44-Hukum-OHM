/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latohan44.hukum.ohm;

/**
 *
 * @author USER
 */
class Baterai {
        private float kuatArus, hambatan;
        
        public Baterai(){
            System.out.println("====Hukum ohm===");
            System.out.println("Kuat arus yang mengalir pada suatu kawan penghantar\n"
                                + "akan berbanding lurus dengan dengan beda potensial\n"
                                + "pada ujung-ujung kawat penghantar tersebut\n"
                                + "asalkan suhu kawat dijaga konstan.\n");
        }
        public Baterai(float kuatArus, float hambatan){
            this.kuatArus = kuatArus;
            this.hambatan = hambatan;
        }
        public float getKuatArus(){
            return kuatArus;
        }
        public float getHambatan(){
            return hambatan;
        }
        public float hitungTegangan(){
            return kuatArus * hambatan;
        }
}
