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
public class Ex2 {
    public static void main(String args[]) {
      System.out.println("Empty String Program: ");
		
      // Count empty strings
      List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
      System.out.println("List: " +strings);
      long count = getCountEmptyString(strings);
		
      System.out.println("Empty Strings: " + count);
      
      //Eliminate empty string
      List<String> filtered = deleteEmptyStrings(strings);
      System.out.println("Filtered List: " + filtered);
		
      //Eliminate empty string and join using comma.
      String mergedString = getMergedString(strings,", ");
      System.out.println("Merged String: " + mergedString);
    }

private static int getCountEmptyString(List<String> strings) {
      int count = 0;

      for(String string: strings) {
		
         if(string.isEmpty()) {
            count++;
         }
      }
      return count;
   }
	
   private static List<String> deleteEmptyStrings(List<String> strings) {
      List<String> filteredList = new ArrayList<String>();
		
      for(String string: strings) {
		
         if(!string.isEmpty()) {
             filteredList.add(string);
         }
      }
      return filteredList;
   }
	
   private static String getMergedString(List<String> strings, String separator) {
      StringBuilder stringBuilder = new StringBuilder();
		
      for(String string: strings) {
		
         if(!string.isEmpty()) {
            stringBuilder.append(string);
            stringBuilder.append(separator);
         }
      }
      String mergedString = stringBuilder.toString();
      return mergedString.substring(0, mergedString.length()-2);
   }
}
	