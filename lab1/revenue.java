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
public class revenue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter unit price:");
        int u=obj.nextInt();
        System.out.println("Enter quantity:");
        int q=obj.nextInt();
        float rev,disprice,aftdis,discount;
        rev=u*q;
        if (q>=100 && q<=200)
        {
            discount=10;
            disprice=discount*rev/100;
            aftdis=rev-disprice;
        }
        else if(q>120)
        { 
            discount=15;
            disprice=discount*rev/100;
            aftdis=rev-disprice;
        }
        else
        {
            discount=0;
            disprice=discount*rev/100;
            aftdis=rev-disprice;
        }
        System.out.println("The revenue from sale:"+aftdis);
        
        System.out.println("After discount:"+disprice+"("+discount+"%)");
        
            
        
        
        
        
    }
    
}
