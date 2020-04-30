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
public class HashMapJava {
    public static void main(String[] args) {

        HashMap <Integer,String> map = new HashMap<Integer,String>();
         Scanner in = new Scanner(System.in);
         System.out.println("Enter 3 key-value (integer-string) pairs one by one:");
         for(int i=0;i<3;i++){

             Integer a=in.nextInt();
             String b=in.next();

             map.put(a,b);
         }

        // Get keys and values
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.println("Key: " + k + ", Value: " + v);
        }
    }
}

