/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrikadeb
 */
import java.util.*;
public class Ex3 
{
    public static void main(String[] args)
    {
        System.out.println("Finding letter 'A' Program: ");
        List<String> members=Arrays.asList("Abish", "Bhargavi", "Alex", "Max", "Annie");
        System.out.println("List: " +members);
        
        int count = getCount(members);
        System.out.println("Strings starting with 'A': " +count);
    }
    private static int getCount(List<String> members)
    {
       int count = 0;

      for(String string: members) {
		
         if(string.charAt(0)=='A') {
            count++;
         }
      }
      return count; 
    }  
}
