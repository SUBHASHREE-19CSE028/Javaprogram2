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
public class oddeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=obj.nextInt();
        int a[];
        a = new int[n];
        int i,odd=0,even=0;
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("The values in array are:");
        for(i=0;i<n;i++)
        {
            System.out.println(""+a[i]);
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even=even+a[i];
            }
            else
                odd=odd+a[i];      
        }
        System.out.println("Sum of odd integers:"+odd);
        System.out.println("Sum of even integers:"+even);
    }
    
}
