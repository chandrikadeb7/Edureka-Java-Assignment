/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrikadeb
 */
import java.util.Scanner;
public class MultTable {
  public static void main(String args[])
  {
    int a, b, c, d;

    System.out.println("Enter range of numbers 'a' and 'b' to print their multiplication tables");
    Scanner in = new Scanner(System.in);

    a = in.nextInt();
    b = in.nextInt();

    for (c = a; c <= b; c++) {
      System.out.println("Multiplication table of "+c);

      for (d = 1; d <= 10; d++) {
        System.out.println(c+"*"+d+" = "+(c*d));
      }
    }
  }
}

