/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100.to.pkg200;

/**
 *
 * @author 21cse104
 */
public class To200 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
 {

 {
 int sum = 0, count = 0;
 for (int i = 101; i < 200; i++)
 {
     if (i % 8 == 0)
     {
         sum = sum + i;
         count++;
     }
 }
 System.out.println("The Sum of the number between 100 to 200 which are divisible by 8 is: "+sum);
 System.out.println("Total numbers between 100 to 200 which are divisible by 8 is: "+count);
 }
 } 
        // TODO code application logic here
    }

