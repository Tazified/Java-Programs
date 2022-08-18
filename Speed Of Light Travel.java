/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author 21cse104
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
   
   public static void main(String[] args) {
      int speed;
      long days, seconds, dist;
      speed = 186000;
      days = 365;
      seconds = days * 24 * 60 * 60;
      dist = speed * seconds;
      System.out.print("Light travels: "+dist + " miles");
   }
}
    

