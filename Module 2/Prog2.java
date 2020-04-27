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
public class Prog2 {
    public static void main(String[] args){
        int choice;
        System.out.println("Enter your card number from 1 to 10.");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Do 5 pushups.");
            break;
            case 2: System.out.println("Do 5 sit-ups.");
            break;
            case 3: System.out.println("Drink a glass of water.");
            break;
            case 4: System.out.println("Run for 5 minutes.");
            break;
            case 5: System.out.println("Relax for 10 minutes.");
            break;
            case 6: System.out.println("Speak on a random topic for 2 minutes.");
            break;
            case 7: System.out.println("Do skipping for 50 times.");
            break;
            case 8: System.out.println("Jog for 5 minutes.");
            break;
            case 9: System.out.println("Pick a card again!!");
            break;
            case 10: System.out.println("Dance for 5 minutes.");
            break;
            default: System.out.println("Choose a number between 1-10.");
        }
    }
}
