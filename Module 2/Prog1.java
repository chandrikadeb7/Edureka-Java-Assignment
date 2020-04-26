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
public class Prog1{
    public static void main(String[] args)
    {
	int michaelNum;
        int bruceNum;

//Scanner is used to read the data
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Numbers for Comparison");
    System.out.println("Michael enter your Number:");
    michaelNum = sc.nextInt();
    System.out.println("Bruce enter your Number:");
    bruceNum = sc.nextInt();

    System.out.println("The Numbers that were entered are :");
    System.out.println("Number 1 =" + michaelNum + " Number 2 =" + bruceNum);

    //comparing the inputs if first num is greater than second, first wins or second wins
    if(michaelNum > bruceNum)
    {
        System.out.println("The First number is greater than the Second. Michael Wins!");
    
    }//if numbers are equal no one wins 
    else if(michaelNum < bruceNum)
    {
        System.out.println("The Second number is greater than the First. Bruce Wins!");
    
    }
    else
    {
        System.out.println("Both Numbers are Equal. No one Wins !");
    }
}
}

