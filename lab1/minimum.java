/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.*;
/**
 *
 * @author INTEL
 */
public class minimum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter two values:");
       int a=obj.nextInt();
       int b=obj.nextInt();
       System.out.println("The minimum of two numbers:"+((a<b)?a:b));
    }
    
}
