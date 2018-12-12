/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafios;

/**
 *
 * @author sofia
 */
public class PowerOfTwo {
        int n;
        void solve() {
            while(true) {
    //          To eleminate the odd numbers
                if((n%2)!= 0){
                    System.out.println("false");
                    break;
                }
    //  Tracing the number back till 2
                n = n/2;
    //  2/2 gives one so condition should be 1
                if(n == 1) {
                    System.out.println("true");
                    break;
                }
            }
        }
       
}
