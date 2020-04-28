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
import java.lang.*;
public class StudentID 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String fname;
        String lname;
        String date;
        System.out.println("Enter first name: ");
        fname=sc.nextLine();
        System.out.println("Enter last name: ");
        lname=sc.nextLine();
        System.out.println("Enter Date of Birth (dd/mm/yyyy): ");
        date=sc.nextLine();
        System.out.println("Student ID is: ");
        System.out.println(" " + fname.charAt(0) + lname.charAt(0) + date.charAt(0) + date.charAt(1));
    } 
}
