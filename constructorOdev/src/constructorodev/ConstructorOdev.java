/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorodev;

/**
 *
 * @author Yelda
 */
public class ConstructorOdev {

    private static void toplama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int sayi1 = 15;
    public int sayi2 = 20;
    /**
     * @param args the command line arguments
     */
    
    //constructor tanimlamasi
    ConstructorOdev (double ikiSayi){
        ikiSayi = sayi1*sayi2;
        System.out.println("Constructor Ödevi Iki Sayi Carpma Islemi:" + ikiSayi);
    }
    
    ConstructorOdev (int toplama){ //burda int girmeye calistim. fakat almadi. neden?
        toplama += sayi1 + sayi2;
        System.out.println("Iki sayinin toplami:"+toplama);
    
    }
    void run(){
        System.out.println("Bu bir Constructor denemesi");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ConstructorOdev odev = new ConstructorOdev();
        toplama();
        ikiSayi();
    }
    
}
