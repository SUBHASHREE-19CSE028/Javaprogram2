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
public class concatenate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str,concat;
        concat="\0";
        int i;
        System.out.println("Enter the limit:");
        int n=obj.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the string "+(i+1)+":");
            str=obj.next();
            concat=concat+" "+str;
            
        }
        System.out.println("Concatenated String:"+concat);
        
    }
    
}
