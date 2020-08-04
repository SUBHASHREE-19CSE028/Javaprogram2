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
public class count {

    /**     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int count,d,tem;
        count = 0;
        System.out.println("Enter the limit:");
        int limit=obj.nextInt();
        System.out.println("the numbers from 1 to "+limit+":");
        
        for(int i=1;i<=limit;i++)
        {
            System.out.println(""+i);
            tem=i;
            while(tem!=0)
            {
             d=tem%10;
             if(d==5)
             {
                count++;
                break;  
            }
            tem=tem/10;
            }  
                
        }
        System.out.println("No of numbers which has 5 as digit:"+count);
        
    }
    }