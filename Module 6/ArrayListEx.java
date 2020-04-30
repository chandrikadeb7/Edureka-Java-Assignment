/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrikadeb
 */
import java.io.*; 
import java.util.*; 
public class ArrayListEx
{
    public static void main(String[] args) throws IOException 
    { 
        // size of ArrayList 
        int n = 5,num,del; 
  
        //declaring ArrayList with initial size n 
        ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
  
        // Appending the new element at the end of the list 
        System.out.println("Enter number of elements to add");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Enter "+num+" elements one by one:");
        for(int i=0;i<num;i++)
        {
            i=sc.nextInt();
            arrli.add(i); 
        }
        // Printing elements 
        System.out.println("After adding elements:"+arrli); 
  
        // Remove element at index 3 
        System.out.println("Enter index of element to remove:");
        del=sc.nextInt();
        arrli.remove(del); 
  
        // Displaying ArrayList after deletion 
        System.out.println("After deleting " +del+ "th element we get:" +arrli); 
  
        // Printing index  
         System.out.println(del);
    } 
} 
