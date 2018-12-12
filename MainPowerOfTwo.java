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
import java.util.Scanner;

public class MainPowerOfTwo {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            System.out.println("Ingrese un numero: ");
            Scanner in = new Scanner(System.in);
            PowerOfTwo obj = new PowerOfTwo();
            obj.n = in.nextInt();
            obj.solve();
        }

}
   

