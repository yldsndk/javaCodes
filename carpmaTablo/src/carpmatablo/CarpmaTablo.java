/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpmatablo;

/**
 *
 * @author Yelda
 */
public class CarpmaTablo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1, y = 1, z =0, j = 2, k = 1, l =0;
        
        while(y<=10){
        z = x * y;
        y++;
        
        
        System.out.println(x + " x " + y + " = " + z);

        while(k<=10){
        l = j * k;
        k++;
        
        System.out.println(j + " x " + k + " = " + l);
        }
        //int [] sayilar ={1,2,3,4,5,6,7,8,9,10};
        //int j = 1, k = 0;
        //for(int i: sayilar)
           // System.out.println(k = i*j);
    }
    
    }
}